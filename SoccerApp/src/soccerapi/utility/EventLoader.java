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
	private int counter;
	private int homeTeamsGoals;
	private int awayTeamsGoals;
	private final ArrayList<ArrayList<String>> homeTeamPlayers = new ArrayList<>();
//	[[0,1,2,3,4][1,2,3]]
	private final ArrayList<ArrayList<String>> awayTeamPlayers = new ArrayList<>();

	public EventLoader() {
		try {
			String players = FileInterface.getPlayerNames();

			String[] array_players = players.split(","); //array com todos os jogadores do ficheiro

			this.homeTeamPlayers.add(new ArrayList<String>());//Titulares Home
			this.homeTeamPlayers.add(new ArrayList<String>());//Reservas Home

			this.awayTeamPlayers.add(new ArrayList<String>());//Titulares Away
			this.awayTeamPlayers.add(new ArrayList<String>());//Reservas Away

			for(int i=0; i < 5 ; i++){
				this.homeTeamPlayers.get(0).add(array_players[i]);
			}
			for(int i = 5; i<(int) Math.round(array_players.length / 2.0); i++){
				this.homeTeamPlayers.get(1).add(array_players[i]);
			}

			for(int i= (int) Math.round(array_players.length / 2.0); i < (int) Math.round(array_players.length / 2.0) + 5; i++){
				this.awayTeamPlayers.get(0).add(array_players[i]);
			}
			for(int i = (int) Math.round(array_players.length / 2.0) + 5; i < array_players.length; i++){
				this.awayTeamPlayers.get(1).add(array_players[i]);
			}

			System.out.println("=====================HOME TEAM===================");
			for (String namePlayer : homeTeamPlayers.get(0)) {
				System.out.println("Jogador - " + namePlayer);
		}
			System.out.println("========================================");
			for (String namePlayer : homeTeamPlayers.get(1)) {
				System.out.println("Jogador - " + namePlayer);
			}

			System.out.println("=====================AWAY TEAM===================");
			for (String namePlayer : awayTeamPlayers.get(0)) {
				System.out.println("Jogador - " + namePlayer);
			}
			System.out.println("========================================");
			for (String namePlayer : awayTeamPlayers.get(1)) {
				System.out.println("Jogador - " + namePlayer);
			}

		}catch (AttributeNotFoundException  e){
			e.printStackTrace();
		}
	}

	public void setUpEvents(String homeTeam, String awayTeam, int numberOfPlayers) throws AttributeNotFoundException {
		//*****************************************************//
		//******************IMPLEMENTAR AQUI******************//
		//****************************************************//
		ArrayList<Event> arrayListEvents = new ArrayList<>();

		for (int i = 0; i < 90; i++){

			Event evento = Event.generateEvent(this.homeTeamsGoals, this.awayTeamsGoals,
					homeTeam, awayTeam, this.homeTeamPlayers, this.awayTeamPlayers, numberOfPlayers);

			if (i == 0 && evento instanceof RepeatEvent){
					i--;
			} else if(i != 0 && evento instanceof RepeatEvent){
				continue;
//				Event last_event = this.events[counter-1];
//				this.homeTeamsGoals = evento.getHomeTeamGoals();
//				this.awayTeamsGoals = evento.getAwayTeamGoals();
//				this.events[i] = last_event;
//				this.counter++;
			}else{
				this.homeTeamsGoals = evento.getHomeTeamGoals();
				this.awayTeamsGoals = evento.getAwayTeamGoals();
				arrayListEvents.add(evento);
//			this.counter++;
			}
		}
		this.events =  new Event[arrayListEvents.size()];
		for (int i = 0; i < arrayListEvents.size(); i++){
			this.events[i] = arrayListEvents.get(i);
		}

//		throw new UnsupportedOperationException();
	}

	public IGameEvent[] getGameEvents() {
		System.out.println();
		System.out.println("===================TODOS OS EVENTOS DO JOGO=====================");

		System.out.println(this.events.length);
		for (Event event : this.events) {
			System.out.println(event);
		}
		return this.events;

		//*****************************************************//
		//******************IMPLEMENTAR AQUI******************//
		//****************************************************//
//		throw new UnsupportedOperationException();
	}
}
