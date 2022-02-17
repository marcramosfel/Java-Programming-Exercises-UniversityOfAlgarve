package soccerapi.utility;

import java.awt.*;

public class DefaultEvent extends Event{

    private final String description;

    private final Color color = new Color(0,0, 0);

    public DefaultEvent(int homeTeamsGoals, int awayTeamsGoals) {
        super(homeTeamsGoals, awayTeamsGoals);
        this.description = "Evento Default";
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
