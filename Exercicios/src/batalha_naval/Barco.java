package batalha_naval;

public class Barco{
    private String nome;
    private int tamanho;
    private String caracter;
    private String caracter_com_explosao;
    private boolean morto;

    public Barco(String nome, int tamanho, String caracter, String caracter_com_explosao, boolean morto){
        this.nome = nome;
        this.tamanho = tamanho;
        this.caracter = caracter;
        this.caracter_com_explosao = caracter_com_explosao;
        this.morto = morto;
    }

    public String getNome(){
        return this.nome;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public String getCaracter(){
        return this.caracter;
    }

    public String getCaracter_com_explosao(){
        return this.caracter_com_explosao;
    }

    public boolean getMorto(){
        return this.morto;
    }

    public void setMorto(boolean morto){
        this.morto = morto;
    }

    public static final Barco aircraft_carrier = new Barco("Aircraft Carrier", 5, "⛵  ", "⛵* ", false);
    public static final Barco battleship = new Barco("Battleship", 4, "⛴  ", "⛴* ", false);
    public static final Barco submarine = new Barco("Submarine", 3, "\uD83D\uDEA2  ", "\uD83D\uDEA2* ", false);
    public static final Barco cruiser = new Barco("Cruiser", 3, "\uD83C\uDFC4  ", "\uD83C\uDFC4* ", false);
    public static final Barco destroyer = new Barco("Destroyer", 2, "\uD83D\uDEA3  ", "\uD83D\uDEA3* ", false);

}
