package soccerapi.utility;

import fileAndUi.FileInterface;
import fileAndUi.IGameEvent;

import java.awt.*;
import java.util.ArrayList;

public abstract class Event implements IGameEvent {

    private int homeTeamsGoals;
    private int awayTeamsGoals;

    private static final int PROBABILITY_POSSESSION_BALL = 600;
    private static final int PROBABILITY_GOAL = 750;
    private static final int PROBABILITY_REPLACEMENT = 850;
    private static final int[] PROBABILITY_PENALTI = {900, 50};


    public static int[] getProbabilityPenalti() {
        return PROBABILITY_PENALTI;
    }

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
        int pb = generateTicketNumber(0, 1000);
//        int pb = 870;
        if (pb<Event.PROBABILITY_POSSESSION_BALL) {
            return new PossessionBall(homeTeamsGoals, awayTeamsGoals, homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
        }else if (pb>Event.PROBABILITY_POSSESSION_BALL && pb<Event.PROBABILITY_GOAL){
            return new Goal(homeTeamsGoals, awayTeamsGoals, homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
        }else if (pb>Event.PROBABILITY_GOAL && pb<Event.PROBABILITY_REPLACEMENT){
            return new Replacement(homeTeamsGoals, awayTeamsGoals, homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
        }else if (pb>Event.PROBABILITY_REPLACEMENT && pb<Event.PROBABILITY_PENALTI[0] ){
            return new Penalty(homeTeamsGoals, awayTeamsGoals, homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
        }else{
//            return generateEvent(homeTeamsGoals, awayTeamsGoals, homeTeam, awayTeam, homeTeamPlayers, awayTeamPlayers, numberOfPlayers);
            return new RepeatEvent(homeTeamsGoals, awayTeamsGoals);
        }
    }
}
