package fileAndUi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.management.AttributeNotFoundException;

public final class FileInterface {
	
	/**
	 * String of player names separated by commas
	 */
	private static String players;
	
	/**
	 * 
	 * @return String of player names separated by commas
	 * @throws AttributeNotFoundException when setPlayerNames was not called successfully
	 */
	public static String getPlayerNames() throws AttributeNotFoundException {
		if(players == null)
			throw new AttributeNotFoundException("No players were loaded yet!");
		
		return players;
	}
	
	/**
	 * Sets players name to be accessible through the getPlayerNames method
	 * @param file
	 * @throws FileNotFoundException
	 */
	static void setPlayerNames(File file) throws FileNotFoundException{
		StringBuilder sb = new StringBuilder();
		Scanner scanner=null;
		try {
			for(scanner= new Scanner(file);scanner.hasNextLine();sb.append(scanner.nextLine()));
		}
		catch(FileNotFoundException e) {
			throw e;
		}
		finally {
			if(scanner!=null) scanner.close();
		}
		FileInterface.players = sb.toString();
		
	}
	
}
