package soccerapi.utility;

import java.awt.*;
import java.util.ArrayList;

public class Goal extends Event {

    private String description;
    private final Color color = new Color(142, 99, 64, 255);

    public Goal(int homeTeamsGoals, int awayTeamsGoals, String homeTeam, String awayTeam,
                ArrayList<ArrayList<String>> homeTeamPlayers, ArrayList<ArrayList<String>> awayTeamPlayers, int numberOfPlayers) {
        super(homeTeamsGoals, awayTeamsGoals);
        generateGoal(homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);

    }

    public void generateGoal(String homeTeam, String awayTeam, ArrayList<ArrayList<String>> homeTeamPlayers, ArrayList<ArrayList<String>> awayTeamPlayers, int numberOfPlayers) {
        int teamProbability = Event.generateTicketNumber(0,10);
        int numberPlayer = Event.generateTicketNumber(0, numberOfPlayers - 1);

        if (teamProbability < 5){
            String player = homeTeamPlayers.get(0).get(numberPlayer);
            this.description = "Goal from " + player + " of the " + homeTeam;
            setHomeTeamsGoals(1);
        }else {
            String player = awayTeamPlayers.get(0).get(numberPlayer);
            this.description = "Goal from " + player + " of the " + awayTeam;
            setAwayTeamsGoals(1);
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
