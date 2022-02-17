package soccerapi.utility;

import fileAndUi.FileInterface;
import fileAndUi.IGameEvent;
import fileAndUi.SoccerFrame;

import javax.management.AttributeNotFoundException;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class EventLoader {

	private  Event[] events;
	private int homeTeamsGoals;
	private int awayTeamsGoals;
	private ArrayList<ArrayList<String>> homeTeamPlayers;// = new ArrayList<>();
//	[[0,1,2,3,4][1,2,3]]
	private ArrayList<ArrayList<String>> awayTeamPlayers;// = new ArrayList<>();

	private int numberOfPlayers = SoccerFrame.NUMBER_OF_PLAYERS;

	public EventLoader() {
		try {
			String players = FileInterface.getPlayerNames();

			String[] array_players = players.split(","); //array com todos os jogadores do ficheiro

			if (array_players.length < (numberOfPlayers*2 + 2)) throw new NumberPlayersException(this.numberOfPlayers*2 + 2);

			this.homeTeamPlayers = new ArrayList<>();
			this.awayTeamPlayers = new ArrayList<>();

			this.homeTeamPlayers.add(new ArrayList<String>());//Titulares Home
			this.homeTeamPlayers.add(new ArrayList<String>());//Reservas Home

			this.awayTeamPlayers.add(new ArrayList<String>());//Titulares Away
			this.awayTeamPlayers.add(new ArrayList<String>());//Reservas Away

			for(int i=0; i < numberOfPlayers ; i++){
				this.homeTeamPlayers.get(0).add(array_players[i]); //Titulares Home
			}
			for(int i = numberOfPlayers; i<(int) Math.round(array_players.length / 2.0); i++){
				this.homeTeamPlayers.get(1).add(array_players[i]); //Reservas home
			}

			for(int i= (int) Math.round(array_players.length / 2.0); i < (int) Math.round(array_players.length / 2.0) + numberOfPlayers; i++){
				this.awayTeamPlayers.get(0).add(array_players[i]); //Titulares Away
			}
			for(int i = (int) Math.round(array_players.length / 2.0) + numberOfPlayers; i < array_players.length; i++){
				this.awayTeamPlayers.get(1).add(array_players[i]); //Reservas Away
			}

			System.out.println("=====================HOME TEAM===================");
			System.out.println("MAIN PLAYERS:");

			for (String namePlayer : homeTeamPlayers.get(0)) {
				System.out.println("Player - " + namePlayer);
			}
			System.out.println("RESERVE PLAYERS:");
			for (String namePlayer : homeTeamPlayers.get(1)) {
				System.out.println("Player - " + namePlayer);
			}
			System.out.println();
			System.out.println("=====================AWAY TEAM===================");
			System.out.println("MAIN PLAYERS:");

			for (String namePlayer : awayTeamPlayers.get(0)) {
				System.out.println("Player - " + namePlayer);
			}
			System.out.println("RESERVE PLAYERS:");
			for (String namePlayer : awayTeamPlayers.get(1)) {
				System.out.println("Player - " + namePlayer);
			}

		}catch (AttributeNotFoundException  e){
			e.printStackTrace();
		}catch (NumberPlayersException e){
			System.out.println(e.getMessage());
		}
	}

	public void setUpEvents(String homeTeam, String awayTeam, int numberOfPlayers) throws NumberPlayersException {
		//*****************************************************//
		//******************IMPLEMENTAR AQUI******************//
		//****************************************************//
		NumberPlayersException exception = null;
		try{
			if (this.homeTeamPlayers == null) throw new NumberPlayersException(this.numberOfPlayers*2 + 2);

			ArrayList<Event> arrayListEvents = new ArrayList<>();

			for (int i = 0; i < 90; i++){

				Event evento = Event.generateEvent(this.homeTeamsGoals, this.awayTeamsGoals,
						homeTeam, awayTeam, this.homeTeamPlayers, this.awayTeamPlayers, numberOfPlayers);

				if (i == 0 && evento instanceof DefaultEvent){
					i--;
				} else if(i != 0 && evento instanceof DefaultEvent){
					continue;

				}else{
					this.homeTeamsGoals = evento.getHomeTeamGoals();
					this.awayTeamsGoals = evento.getAwayTeamGoals();
					arrayListEvents.add(evento);
				}
			}
			this.events =  new Event[arrayListEvents.size()];
			for (int i = 0; i < arrayListEvents.size(); i++){
				this.events[i] = arrayListEvents.get(i);
			} // existe uma funcao toArray

		}catch (NumberPlayersException e){
			exception = e;
		}
		if(exception != null) throw exception;

	}

	public IGameEvent[] getGameEvents() throws NullEventsException{
		//*****************************************************//
		//******************IMPLEMENTAR AQUI******************//
		//****************************************************//

		NullEventsException exception = null;
		try{
			if (this.events == null) throw new NullEventsException();

			System.out.println();
			System.out.println("===================TODOS OS EVENTOS DO JOGO=====================");

			System.out.println(this.events.length);
			for (Event event : this.events) {
				System.out.println(event.getEventDescription());
			}
		}catch (NullEventsException e){
			exception = e;
		}
		if(exception != null) throw exception;

		return this.events;
	}
}
