package aula8.Excecoes.src;

import aula8.Excecoes.src.excecoes.DividoPorZeroException;

public class CestoDeOvosv2 {
	public static int ovosPorCesto(int nrDeOvos, int nrDeCestos) {
		int res = nrDeOvos/nrDeCestos;
		
		return res;
	}
	
	public static void main(String[] args) {
		int nrDeOvos = 9;
		int nrDeCestos = 5;
		
		int ovosPorCesto=0;
		
		System.out.println("Numero de ovos: "+nrDeOvos+" n�mero de cestos: "+nrDeCestos);
		
		try {
			if(nrDeCestos == 0) throw new DividoPorZeroException(nrDeOvos);
			
			ovosPorCesto = ovosPorCesto(nrDeOvos,nrDeCestos);
			System.out.println("Ovos por cesto: "+ ovosPorCesto);
			
//			String s = "Ol�";
//			System.out.println(s.charAt());
//			//n�o � boa pr�tica apanhar "s�" Exception porque n�o estamos a tratar apenas as nossas exce��es
		}
		catch(DividoPorZeroException e) {
			
			//Se o meu n�mero de ovos for menor que 10, podemos assumir que temos um cesto!
//			if(e.getNrOvos()<10) {
//				nrDeCestos=1;
//				ovosPorCesto = ovosPorCesto(nrDeOvos,nrDeCestos);
//				System.out.println("Ovos por cesto: "+ ovosPorCesto);
//			}
//			else {
				System.out.println(e.getMessage());
				System.out.println("N�o foi possivel distribuir "+ e.getNrOvos()+" ovos!");
//			}
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro desconhecido!");
			e.printStackTrace();
			//throw e;
		}
		finally {
			System.out.println("Sobram "+ (nrDeOvos - nrDeCestos*ovosPorCesto) + " ovos");
		}
		
		System.out.println("***********FIM DO PROGRAMA*****************");
	}
}
