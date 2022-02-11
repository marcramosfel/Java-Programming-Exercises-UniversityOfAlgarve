package aula1;

public class MainCamepeonatos {
    public static void main(String[] args) {
        Campeonatos a = new Campeonatos (34) ;
        Campeonatos b = a;
        Campeonatos c = b;

        a. numeroCampeonatos ++;
        b. numeroCampeonatos ++;
        c. numeroCampeonatos ++;

        System.out.println (" Numero de Campeonatos = " +
                b. numeroCampeonatos ) ;
        System.out.println (" Numero de Campeonatos = " +
                c. numeroCampeonatos ) ;
        try {
            int [] A = new int [10];
            A [0] = 1;
            A [10] = 10;
            System.out.println (A[0] + A [10]) ;
        } catch ( IndexOutOfBoundsException e) {
            System.out.println (" Erro de índices ") ;
            }

    }

}

