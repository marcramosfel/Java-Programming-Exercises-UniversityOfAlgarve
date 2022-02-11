package fileAndUi;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import soccerapi.utility.EventLoader;

public class SoccerFrame extends JFrame{
	private static String scoreLayout = "%s %d - %d %s";
	String homeTeamName="Home team";
	String awayTeamName="Away team";
	JTextField homeTeamField;
	JTextField awayTeamField;
	JTextField events=null;
	JTextField teamScore;
	static final int NUMBER_OF_PLAYERS=5;
	private static final int TIME_PER_FRAME=1000;
	
	public SoccerFrame() {
		this.setBounds(100, 100, 796, 201);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 780, 33);
		this.getContentPane().add(panel);
		
		JLabel homeTeamLabel = new JLabel(this.homeTeamName);		
		homeTeamField = new JTextField();
		homeTeamField.setColumns(10);
		JLabel awayTeamLabel = new JLabel(this.awayTeamName);
		awayTeamField = new JTextField();
		awayTeamField.setColumns(10);
		
		teamScore = new JTextField();
		teamScore.setEditable(false);
		teamScore.setBounds(0, 33, 196, 33);
		teamScore.setText(String.format(scoreLayout,this.homeTeamName, 0,0,this.awayTeamName));
		teamScore.setHorizontalAlignment(JTextField.CENTER);
		this.getContentPane().add(teamScore);
		
		events = new JTextField();
		events.setBackground(Color.LIGHT_GRAY);
		events.setBounds(27, 77, 743, 74);
		events.setEditable(false);

		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		
		events.setHorizontalAlignment(JTextField.CENTER);
		
		Font font = new Font("", Font.BOLD, 15);
		events.setFont(font);
		this.getContentPane().add(events);
		
		panel.add(new OpenFileButton());
		panel.add(new StartMatchButton(this));
		panel.add(homeTeamLabel);
		panel.add(homeTeamField);
		panel.add(awayTeamLabel);
		panel.add(awayTeamField);
		
	}
	
	void playGame(IGameEvent[] events, JTextField eventPane,JTextField teamScore) throws InterruptedException {
		
		for(IGameEvent event:events) {
			eventPane.setText(event.getEventDescription());
			eventPane.setBackground(event.getEventColor());
			
			teamScore.setText(
					String.format(scoreLayout,this.homeTeamName, event.getHomeTeamGoals(),event.getAwayTeamGoals(),this.awayTeamName)
					
			);
			
			Thread.sleep(TIME_PER_FRAME);
		}
		homeTeamField.setEditable(true);
		awayTeamField.setEditable(true);
		
	}
}
