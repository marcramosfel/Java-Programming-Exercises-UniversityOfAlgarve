package batalha_naval;

public class Game {

    private static final Tabuleiro tabuleiro = new Tabuleiro();

    private static boolean jogador_um_ganhou = false;
    private static boolean jogador_dois_ganhou = false;

    private static final String [][] tabuleiro_vazio_um = new String[10][10];
    private static final String [][] tabuleiro_vazio_dois = new String[10][10];

    public static void main(String[] args) {
        System.out.println("_________________________________ BATALHA NAVAL _________________________________");

        System.out.println("\n#######################################################\nJogador 1 escondendo os barcos em seu tabuleiro:\n");
        String[][] tabuleiro_um_com_barcos = tabuleiro.coloca_barcos(1);


        System.out.println("\n#######################################################\nJogador 2 escondendo os barcos em seu tabuleiro:\n");
        String[][] tabuleiro_dois_com_barcos = tabuleiro.coloca_barcos(2);

        System.out.println("\n#######################################################\nPassando a Faze de Ataque (*)\n#######################################################");

        String[][] tabuleiro_revelado_do_jogador_dois;
        String[][] tabuleiro_revelado_do_jogador_um;


        while (jogador_um_ganhou==false || jogador_dois_ganhou==false) {
            System.out.println("\n#######################################################\nJogador 1 atacando os barcos do tabuleiro do Jogador 2:\n");
            tabuleiro_revelado_do_jogador_dois = tabuleiro.ataca_tabuleiro(tabuleiro_dois_com_barcos, tabuleiro_vazio_dois);
            tabuleiro.desenha_tabuleiro(tabuleiro_revelado_do_jogador_dois, 2);
            tabuleiro.verifica_barcos_totalmente_explodidos(tabuleiro_revelado_do_jogador_dois);
            jogador_um_ganhou = tabuleiro.verifica_ganhou(tabuleiro_revelado_do_jogador_dois, 2, 1);
            if (jogador_um_ganhou){
                break;
            }
    //          ##############################################################################
            System.out.println("\n#######################################################\nJogador 2 atacando os barcos do tabuleiro do Jogador 1:\n");
            tabuleiro_revelado_do_jogador_um = tabuleiro.ataca_tabuleiro(tabuleiro_um_com_barcos, tabuleiro_vazio_um);
            tabuleiro.desenha_tabuleiro(tabuleiro_revelado_do_jogador_um, 1);
            tabuleiro.verifica_barcos_totalmente_explodidos(tabuleiro_revelado_do_jogador_um);
            jogador_dois_ganhou = tabuleiro.verifica_ganhou(tabuleiro_revelado_do_jogador_um, 1, 2);
            if (jogador_dois_ganhou){
                break;
            }
        }
    }
}
