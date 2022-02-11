package soccerapi.utility;

import java.awt.*;

public class RepeatEvent extends Event{

    private final String description;

    private final Color color = new Color(0,0, 0);

    public RepeatEvent(int homeTeamsGoals, int awayTeamsGoals) {
        super(homeTeamsGoals, awayTeamsGoals);
        this.description = "Repetindo evento";
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
