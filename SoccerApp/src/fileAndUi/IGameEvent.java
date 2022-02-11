package fileAndUi;

import java.awt.Color;

/**
 * 
 * @author cesasilva
 * This interface represents an event to be shown within the SoccerFrame window.
 */
public interface IGameEvent {
	/**
	 * @return the number of Goals scored by the Home Team by this event time
	 */
	abstract int getHomeTeamGoals();
	/**
	 * @return the number of Goals scored by the Away Team by this event time
	 */
	abstract int getAwayTeamGoals();
	/**
	 * @return a String with this event description
	 */
	abstract String getEventDescription();
	/**
	 * @return a Color instance to be shown in the event panel on the SoccerFrame
	 */
	abstract Color getEventColor();
}
