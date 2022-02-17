package soccerapi.utility;

public class NumberPlayersException extends Exception{
    private int numberOfPlayers;

    public NumberPlayersException(int numberOfPlayers) {
        super("Numero de jogadores insuficientes, o ficheiro deve ter mais de" + numberOfPlayers);
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getMessage(){
        return "Numero de jogadores insuficientes, o ficheiro deve ter mais de " + numberOfPlayers + " Jogadores";
    }
}
