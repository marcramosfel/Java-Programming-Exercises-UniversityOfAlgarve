package aula8.Excecoes.src;

import aula8.Excecoes.src.excecoes.DividoPorZeroException;

public class CestoDeOvosv3 {
	public static int ovosPorCesto(int nrDeOvos, int nrDeCestos) throws DividoPorZeroException{
		int res = nrDeOvos/nrDeCestos;

			if(nrDeCestos == 0) throw new DividoPorZeroException(nrDeOvos);

			System.out.println();
		
		return res;
	}
	
	public static void main(String[] args) {
		int nrDeOvos = 9;
		int nrDeCestos = 5;
		
		int ovosPorCesto =0;
		
		System.out.println("Numero de ovos: "+nrDeOvos+" n�mero de cestos: "+nrDeCestos);
		
		try {			
			ovosPorCesto = ovosPorCesto(nrDeOvos,nrDeCestos);
			System.out.println("Ovos por cesto: "+ ovosPorCesto);
		}
		catch(DividoPorZeroException e) {
			System.out.println(e.getMessage());
			System.out.println("N�o foi possivel distribuir "+ e.getNrOvos()+" ovos!");
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro desconhecido!");
			e.printStackTrace();
		}
		finally {
			System.out.println("Sobram "+ (nrDeOvos - nrDeCestos*ovosPorCesto) + " ovos");
		}
		
		System.out.println("***********FIM DO PROGRAMA*****************");
	}
}
