package soccerapi.utility;

import fileAndUi.FileInterface;
import fileAndUi.IGameEvent;

import java.awt.*;
import java.util.ArrayList;

public abstract class Event implements IGameEvent {

    private int homeTeamsGoals;
    private int awayTeamsGoals;

    public static int generateTicketNumber(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public Event(int homeTeamsGoals, int awayTeamsGoals) {
        this.homeTeamsGoals = homeTeamsGoals;
        this.awayTeamsGoals = awayTeamsGoals;

    }

    public void setHomeTeamsGoals(int homeTeamsGoals) {
        this.homeTeamsGoals += homeTeamsGoals;
    }

    public void setAwayTeamsGoals(int awayTeamsGoals) {
        this.awayTeamsGoals += awayTeamsGoals;
    }

    @Override
    public int getHomeTeamGoals() {
        return this.homeTeamsGoals;
    }

    @Override
    public int getAwayTeamGoals() {
        return this.awayTeamsGoals;
    }

    public abstract String getEventDescription();

    public abstract Color getEventColor();


    public static Event generateEvent(int homeTeamsGoals, int awayTeamsGoals, String homeTeam, String awayTeam,
                                      ArrayList<ArrayList<String>> homeTeamPlayers, ArrayList<ArrayList<String>> awayTeamPlayers, int numberOfPlayers){
        int probability = generateTicketNumber(0, 999);

        if (probability<PossessionBall.PROBABILITY) {
            return new PossessionBall(homeTeamsGoals, awayTeamsGoals, homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
        }else if (probability>PossessionBall.PROBABILITY && probability<Goal.PROBABILITY){
            return new Goal(homeTeamsGoals, awayTeamsGoals, homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
        }else if (probability>Goal.PROBABILITY && probability<Replacement.PROBABILITY){
            return new Replacement(homeTeamsGoals, awayTeamsGoals, homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
        }else if (probability>Replacement.PROBABILITY && probability<Penalty.PROBABILITY){
            return new Penalty(homeTeamsGoals, awayTeamsGoals, homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
        }else{
            return new DefaultEvent(homeTeamsGoals, awayTeamsGoals);
        }
    }
}
