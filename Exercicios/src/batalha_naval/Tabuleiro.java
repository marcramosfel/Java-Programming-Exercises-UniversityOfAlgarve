package batalha_naval;

import java.util.*;

public class Tabuleiro {

    //private static Barcos aircraft_carrier = new Barcos("Aircraft Carrier", 5, "⛵  ", "⛵* ", false);
    //private static Barcos battleship = new Barcos("Battleship", 4, "⛴  ", "⛴* ", false);
    //private static Barcos submarine = new Barcos("Submarine", 3, "\uD83D\uDEA2  ", "\uD83D\uDEA2* ", false);
    //private static Barcos cruiser = new Barcos("Cruiser", 3, "\uD83C\uDFC4  ", "\uD83C\uDFC4* ", false);
    //private static Barcos destroyer = new Barcos("Destroyer", 2, "\uD83D\uDEA3  ", "\uD83D\uDEA3* ", false);
    //private static Barcos[] BARCOS =  {aircraft_carrier, battleship, submarine, cruiser, destroyer};

    private final Barco[] BARCOS =  {Barco.aircraft_carrier, Barco.battleship,
                               Barco.submarine, Barco.cruiser, Barco.destroyer};

// Este metodo desenha o tabuleiro no standard output, tendo como parametro de entrada ja o o tabuleiro com os barcos "escondidos" de cada jogador,
// e altera o proprio tabuleiro caso a posicao seja nula.
    public void desenha_tabuleiro(String[][] tabuleiro, int jogador) {
        System.out.println("\n            TABULEIRO do Jogador "+jogador+"\n");
        for (int i = 0; i < tabuleiro.length; i++) {
            if (i == 0) {
                System.out.print("    " + i);
                System.out.print("↓  ");
            } else {
                System.out.print(" " + i);
                System.out.print("↓ ");
            }
        }
        System.out.println("\n    ___________________________________________");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + "> [");
            for (int j = 0; j < tabuleiro[0].length; j++) {
                if (tabuleiro[i][j] == null) {
                    tabuleiro[i][j] = "   ";
                }
                if (j == 9) {
                    System.out.print(tabuleiro[i][j]);
                } else {
                    System.out.print(tabuleiro[i][j] + "|");
                }
            }
            System.out.print("]");
            System.out.println("\n    -------------------------------------------");
        }
    }

//    Este metodo simplesmente retorna a String V ou H conforme a escolha do utilizador e verifica, caso nao seja pedido uma orientacao/string válida.
    public String pede_orientacao(){
        while (true){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Inserir Orientacao:(H)orizontal/(V)ertical");
            String choose = keyboard.nextLine();
            choose = choose.toUpperCase(Locale.ROOT);
            if (choose.equals("H") || choose.equals("V")){
               return choose;
            }else {
               System.out.println("Opcao Invalida!");
            }
        }
    }

//    Este metodo simplesmente retorna um double a escolha do utilizador e verifica, caso a cordenada/double nao seja válida, ou seja caso o double seja maior que 10.0,
//    pois dessa forma iriamos ter cordenadas fora dos limites do nosso tabuleiro.
    public double pede_coordenadas(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserir Coordenadas:");
        double choose = keyboard.nextDouble();
        while (choose>=10.0){
            System.out.println("Coordenadas Invalidas!\nInsira Coordenadas Válidas:");
            choose = keyboard.nextDouble();
        }
        return choose;
    }

//    Este metodo "esconde" os barcos conforme a escolha da orientacao e coordenadas (separando a parte inteira da decimal), escolhidas pelo o utilizador.
//    Também é responsavel por verificar caso nao seja possivel colocar tais barcos nas cordenadas propostas devido ao seu tamanho e limites do tabuleiro.
    public String[][] coloca_barcos(int jogador) {
        String[][] tabuleiro = new String[10][10];
        for (int i = 0; i<BARCOS.length; i++) {
            desenha_tabuleiro(tabuleiro, jogador);
            System.out.println("\n--------------------------------------------");
            System.out.println("Colocar " + BARCOS[i].getNome());
            String orientacao = pede_orientacao();
            double cordenadas = pede_coordenadas();
            int tamanho = BARCOS[i].getTamanho();
            int linha = (int) cordenadas;
            int coluna = ((int) (cordenadas * 10)) - ((int) cordenadas * 10);
//            HORIZONTAL
            if (orientacao.equals("H")){
                while (coluna+tamanho>10){
                    System.out.println("Nao cabe");
                    cordenadas = pede_coordenadas();
                    tamanho = BARCOS[i].getTamanho();
                    linha = (int) cordenadas;
                    coluna = ((int) (cordenadas * 10)) - ((int) cordenadas * 10);
                }
                for (int j = 0; j < tamanho ; j++){
                    if (Objects.equals(tabuleiro[linha][coluna+j], "   ")){
                        tabuleiro[linha][coluna + j] = BARCOS[i].getCaracter();
                    }else{
                        System.out.println("Ja tem um barco nessas coordenadas");
                        for (int k = 0; k<j; k++){
                            tabuleiro[linha][coluna + k] = "   ";
                        }
                        i--;
                        break;
                    }
                }
//                VERTICAL
            }else if (orientacao.equals("V")){
                while (linha+tamanho>10){
                    System.out.println("Nao cabe");
                    cordenadas = pede_coordenadas();
                    tamanho = BARCOS[i].getTamanho();
                    linha = (int) cordenadas;
                    coluna = ((int) (cordenadas * 10)) - ((int) cordenadas * 10);
                }
                for (int j = 0; j < tamanho ; j++){
                    if (Objects.equals(tabuleiro[linha+j][coluna], "   ")){
                        tabuleiro[linha+j][coluna] = BARCOS[i].getCaracter();
                    }else{
                        System.out.println("Ja tem um barco nessas coordenadas");
                        for (int k = 0; k<j; k++){
                            tabuleiro[linha+k][coluna] = "   ";
                        }
                        i--;
                        break;
                    }
                }
            }
        }
        return tabuleiro;
    }

//    Este metodo é responsavel por colocar a string *(representando a explosào) no tabuleiro que está sendo atacado. Pode modificar o tabuleiro de duas maneiras:
//    1-colocando apenas string * caso a posicao nao tenha nenhum barco "escondido". 2-colocando a string * juntamente com a string do barco que esta escondida nessa posição.
//    O método retorna uma versão do tabuleiro que está parcialmente revelada com as strings * dependendo da escolhas do jogador que esta atacando.
    public String[][] ataca_tabuleiro(String[][] tabuleiro, String[][]tabuleiro_revelado){
        while (true){
            double cordenadas = pede_coordenadas();
            int linha = (int) cordenadas;
            int coluna = ((int) (cordenadas * 10)) - ((int) cordenadas * 10);
            if (tabuleiro[linha][coluna].equals("   ")){
                tabuleiro_revelado[linha][coluna] = " * ";
                tabuleiro[linha][coluna]=" * ";
                return tabuleiro_revelado;
            }
            for (int i = 0; i<BARCOS.length; i++) {
                if (tabuleiro[linha][coluna].equals(BARCOS[i].getCaracter())) {
                    tabuleiro_revelado[linha][coluna] = BARCOS[i].getCaracter_com_explosao();
                    tabuleiro[linha][coluna] = BARCOS[i].getCaracter_com_explosao();
                    return tabuleiro_revelado;
                } else if (tabuleiro[linha][coluna].equals(BARCOS[i].getCaracter_com_explosao())) {
                    System.out.println("Já atacou esta posicao e acertou!");
                    break;
                } else if (tabuleiro[linha][coluna].equals(" * ")) {
                    System.out.println("Já atacou esta posicao e errou!");
                    break;
                }
            }
        }
    }

//    Este metodo verifica se todos os barcos foram explodidos, ou seja se todos os barcos escondidos estão acompanhados da string *.
//    O metodo altera a string do array global de BARCOS na posicao [i][4](onde i é a representacao de todos os arrays dentro do array global),
//    passando a conter a da string "true".
    public void verifica_barcos_totalmente_explodidos(String [][] tabuleiro) {
//        VERTICAL
        System.out.println("Verificando");
        for (int i = 0; i < BARCOS.length; i++) {
            int anchor = 1;
            for (int j = 0; j < tabuleiro.length; j++){
                for (int k = 0; k < tabuleiro[0].length; k++){
                    int tamanho = BARCOS[i].getTamanho();
                    if (j+1 > 9){
                        break;
                    }
                    if (tabuleiro[j][k].equals(BARCOS[i].getCaracter_com_explosao()) &&
                            tabuleiro[j+1][k].equals(BARCOS[i].getCaracter_com_explosao())) {
                        anchor++;
                        if (anchor == tamanho) {
                            BARCOS[i].setMorto(true);
                            System.out.println("PUM! "+BARCOS[i].getNome()+" ao fundo!");
                        }
                    }
                }
            }
//            HORIZONTAL
            for (int j = 0; j < tabuleiro.length; j++){
                int anchor_dois = 1;
                for (int k = 0; k < tabuleiro[0].length; k++){
                    int tamanho = BARCOS[i].getTamanho();
                    if (k+1 > 9){
                        break;
                    }
                    if (tabuleiro[j][k].equals(BARCOS[i].getCaracter_com_explosao()) && tabuleiro[j][k+1].equals(BARCOS[i].getCaracter_com_explosao())) {
                        anchor_dois++;
                        if (anchor_dois == tamanho) {
                            BARCOS[i].setMorto(true);
                            System.out.println("PUM! "+BARCOS[i].getNome()+" ao fundo!");
                        }
                    }
                }
            }
        }
    }

//    Este metodo passa por todos os arrays dentro do array global BARCOS, e verifica se na posicao 4 de todos eles, está a string "true".
//    Caso esteja retorna um boolean true, caso contrario retorna false.
    public boolean verifica_ganhou(String[][] tabuleiro_revelado, int jogador, int jogador_dois){
        int anchor = 0;
        for (int i = 0; i<BARCOS.length; i++) {
//            System.out.println("entrando no barcoslenght");
//            System.out.println(BARCOS[i][0]);
//            System.out.println(BARCOS[i][4]);    DEBUG
//            System.out.println(anchor);
            if (BARCOS[i].getMorto() == true){
                anchor++;
                if (anchor==5){
                    System.out.println("\n#######################################################\nPARABENS!!!!\nJogador "+jogador+" afundou todos os barcos do Jogador"+jogador_dois+"!!");
                    desenha_tabuleiro(tabuleiro_revelado, jogador);
                    return true;
                }
            }
        }
        return false;
    }
}