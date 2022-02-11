package aula2;

public class ConvData {

    public static final String[] MESES_DO_ANO = {"", "Janeiro", "Fevereiro", "Marco", "Abril", "Maio"
            , "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    public static final String[] MONTHS_OF_THE_YEAR = {"", "January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        System.out.println(ConvData.converter(10, 12, 2021));

        //Vamos mostrar os lengths dos meses do ano

        for (int i = 0; i < MESES_DO_ANO.length; ++i)
            System.out.println(MESES_DO_ANO[i] + " " + MESES_DO_ANO[i].length());
		
		/*for(;;);
		
		System.out.println("O for de cima é infinito"); Unreachable
		
		*/
        System.out.println(getNextInt(1));
    }

    public static String converter(int dia, int mes, int ano) {
		/*String textoMes;
		
		switch(mes){
			case 1:
				textoMes = "Janeiro";
				break;
			case 2:
				textoMes = "Fevereiro";
				break;
			case 3:
				textoMes = "Marco";
				break;
			case 4:
				textoMes = "Abril";
				break;
			case 5:
				textoMes = "Maio";
				break;
			case 6:
				textoMes = "Junho";
				break;
			case 7:
				textoMes = "Julho";
				break;
			case 8:
				textoMes = "Agosto";
				break;
			case 9:
				textoMes = "Setembro";
				break;
			case 10:
				textoMes = "Outubro";
				break;
			case 11:
				textoMes = "Novembro";
				break;
			case 12:
				textoMes = "Dezembro";
				break;
			default:
				textoMes = "ERRO";
			

		}*/

        String textoMes = MESES_DO_ANO[mes];
        //String textoMes = MONTHS_OF_THE_YEAR[mes-1];
        return dia + " de " + textoMes + " de " + ano;
    }

    public static int getNextInt(int input) {
        if (input % 2 == 0) return input + 1;
        if (input % 3 == 0) return input + 2;
        else return 0;

        //return 3; --> Unreachable
    }
}