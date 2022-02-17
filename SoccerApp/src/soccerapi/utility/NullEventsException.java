package soccerapi.utility;

public class NullEventsException extends Exception{

    public NullEventsException() {
        super("Nao foi possivel criar eventos!");
    }

    public String getMessage(){
        return "Nao foi possivel criar eventos! Nao ha jogadores suficientes!";
    }
}
