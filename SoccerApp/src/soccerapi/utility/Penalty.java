package soccerapi.utility;

import java.awt.*;
import java.util.ArrayList;

public class Penalty extends Event{

    private String description;

    private final Color color = new Color(51, 122, 49);

    static final int PROBABILITY = 900;

    private final static int GOAL_PROBABILITY = 50;



    public Penalty(int homeTeamsGoals, int awayTeamsGoals, String homeTeam, String awayTeam,
                   ArrayList<ArrayList<String>> homeTeamPlayers, ArrayList<ArrayList<String>> awayTeamPlayers, int numberOfPlayers) {
        super(homeTeamsGoals, awayTeamsGoals);
        generateDescription(homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
    }

    public void generateDescription(String homeTeam, String awayTeam, ArrayList<ArrayList<String>> homeTeamPlayers,
                                ArrayList<ArrayList<String>> awayTeamPlayers, int numberOfPlayers) {
        int teamProbability = Event.generateTicketNumber(0,9);
        int goalProbability = generateTicketNumber(0,99);
        int numberPlayerSuferred = Event.generateTicketNumber(0, numberOfPlayers - 1);
        int numberPlayerFault = Event.generateTicketNumber(0, numberOfPlayers - 1);

        if (teamProbability < 5){

            String playerSuffered = homeTeamPlayers.get(0).get(numberPlayerSuferred);
            String playerFault = awayTeamPlayers.get(0).get(numberPlayerFault);

            if(goalProbability < Penalty.GOAL_PROBABILITY){
                this.description = playerFault + " of the " + awayTeam +
                        "made a penalty in " + playerSuffered + " of the " + homeTeam + ".\n" + playerSuffered + " score the penalty for the" + homeTeam;
                setHomeTeamsGoals(1);
            }else{
                this.description = playerFault + " of the " + awayTeam +
                        "made a penalty in " + playerSuffered + " of the " + homeTeam + ". \n" + playerSuffered + " did'nt score the penalty for the" + homeTeam;
            }

        }else {

            String playerSuffered = awayTeamPlayers.get(0).get(numberPlayerSuferred);
            String playerFault = homeTeamPlayers.get(0).get(numberPlayerFault);

            if(goalProbability< Penalty.GOAL_PROBABILITY){
                this.description = playerFault + " of the " + homeTeam +
                        "made a penalty in " + playerSuffered + " of the " + awayTeam + "\n" + playerSuffered + " score the penalty for the" + awayTeam;
                setAwayTeamsGoals(1);
            }else{
                this.description = playerFault + " of the " + homeTeam +
                        "made a penalty in " + playerSuffered + " of the " + awayTeam + "\n" + playerSuffered + " did'nt score the penalty for the" + awayTeam;
            }
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
