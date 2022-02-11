package fileAndUi;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import soccerapi.utility.EventLoader;

public class StartMatchButton extends JButton{
	private Thread eventUpdater;
	public StartMatchButton(SoccerFrame caller) {
		super("Start Match");
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				final EventLoader loader=new EventLoader();
					
					try {
						caller.homeTeamName=caller.homeTeamField.getText();
						caller.awayTeamName=caller.awayTeamField.getText();
						caller.homeTeamField.setEditable(false);
						caller.awayTeamField.setEditable(false);
						loader.setUpEvents(caller.homeTeamName,caller.awayTeamName,SoccerFrame.NUMBER_OF_PLAYERS);
					} catch (Exception ex) {
						JOptionPane.showMessageDialog((Component)event.getSource(), "Erro a gerar eventos do jogo.");
						ex.printStackTrace();
					}
				
					if(eventUpdater== null || !eventUpdater.isAlive()){
						eventUpdater= new Thread(new Runnable() {
							@Override
							public void run() {
								try {
									caller.playGame(loader.getGameEvents(), caller.events,caller.teamScore);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}							
							}
						});
						
						eventUpdater.start();
					}
					else {
						JOptionPane.showMessageDialog((Component)event.getSource(), "Jogo ainda a decorrer.");
					}
			}
		});
	}
}
