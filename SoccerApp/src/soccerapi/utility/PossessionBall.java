package soccerapi.utility;

import java.awt.*;
import java.util.ArrayList;

public class PossessionBall extends Event{
    private final Color color = new Color(255, 255, 255);
    private String description;



    public PossessionBall(int homeTeamsGoals, int awayTeamsGoals, String homeTeam, String awayTeam,
                          ArrayList<ArrayList<String>> homeTeamPlayers, ArrayList<ArrayList<String>> awayTeamPlayers, int numberOfPlayers) {
        super(homeTeamsGoals, awayTeamsGoals);
        generateDescription(homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
    }

    public void generateDescription(String homeTeam, String awayTeam,
                                    ArrayList<ArrayList<String>> homeTeamPlayers, ArrayList<ArrayList<String>> awayTeamPlayers, int numberOfPlayers){
        int teamProbability = Event.generateTicketNumber(0,10);
        int numberPlayer = Event.generateTicketNumber(0, numberOfPlayers - 1);
        if (teamProbability < 5){
            String player = homeTeamPlayers.get(0).get(numberPlayer);
            this.description = "Possesion from " + player + " of the " + homeTeam;
        }else {
            String player = awayTeamPlayers.get(0).get(numberPlayer);
            this.description = "Possesion from " + player + " of the " + awayTeam;
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
