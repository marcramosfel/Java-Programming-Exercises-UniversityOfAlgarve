package soccerapi.utility;

import java.awt.*;
import java.util.ArrayList;

public class Replacement extends Event{

    private String description;

    private final Color color = new Color(10,200, 212);

    static final int PROBABILITY = 850;

    public Replacement(int homeTeamsGoals, int awayTeamsGoals, String homeTeam, String awayTeam,
                       ArrayList<ArrayList<String>> homeTeamPlayers, ArrayList<ArrayList<String>> awayTeamPlayers, int numberOfPlayers) {
        super(homeTeamsGoals, awayTeamsGoals);
        generateReplacement(homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
    }

    public void generateReplacement(String homeTeam, String awayTeam,
                                    ArrayList<ArrayList<String>> homeTeamPlayers, ArrayList<ArrayList<String>> awayTeamPlayers, int numberOfPlayers) {
        int teamProbability = Event.generateTicketNumber(0,9);
        int numberPlayerOut = Event.generateTicketNumber(0, numberOfPlayers - 1);

        if (teamProbability < 5){
            String playerOut = homeTeamPlayers.get(0).get(numberPlayerOut);

            String temp = String.copyValueOf(playerOut.toCharArray()); // esta variavel e pra ter certeza que nao havera problema com a string por esta ser tipo referencia

            int numberPlayerIn = Event.generateTicketNumber(0, homeTeamPlayers.get(1).size()-1);

            String playerIn = homeTeamPlayers.get(1).get(numberPlayerIn);

            homeTeamPlayers.get(0).set(numberPlayerOut, playerIn);
            homeTeamPlayers.get(1).set(numberPlayerIn, temp);
            this.description = "Substitution on the " + homeTeam + ": " + playerOut + " substituted by " + playerIn;
        }else {
            int numberPlayerIn = Event.generateTicketNumber(0, awayTeamPlayers.get(1).size()-1);

            String playerOut = awayTeamPlayers.get(0).get(numberPlayerOut);

            String temp = String.copyValueOf(playerOut.toCharArray());

            String playerIn = awayTeamPlayers.get(1).get(numberPlayerIn);

            awayTeamPlayers.get(0).set(numberPlayerOut, playerIn);
            awayTeamPlayers.get(1).set(numberPlayerIn, temp);
            this.description = "Substitution on the " + awayTeam + ": " + playerOut + " substituted by " + playerIn;
        }
    }

    @Override
    public String getEventDescription() {
        return this.description;
    }

    @Override
    public Color getEventColor() {
        return this.color;
    }
}
