package fileAndUi;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class OpenFileButton extends JButton{
	public OpenFileButton() {
		super("Open File");
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JFileChooser fileChooser = new JFileChooser();
				
				if(fileChooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) return;
				
				File file =  new File(fileChooser.getSelectedFile().getAbsolutePath());
				
				try {
					FileInterface.setPlayerNames(file);
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog((Component)event.getSource(), "Erro a carregar o ficheiro.");
					e.printStackTrace();
				}
			}
		});
	}
}
