package aula8.Excecoes.src;

public class CestoDeOvos {
	public static int ovosPorCesto(int nrDeOvos, int nrDeCestos) {
		int res = nrDeOvos/nrDeCestos;
		
		return res;
	}
	
	public static void main(String[] args) {
		int nrDeOvos = 101;
		int nrDeCestos = 0;
		
		int ovosPorCesto =0;
		
		System.out.println("Numero de ovos: "+nrDeOvos+" n�mero de cestos: "+nrDeCestos);
		
		try {
			if(nrDeCestos == 0) throw new Exception("N�o h� cestos!");
			
			ovosPorCesto = 	ovosPorCesto(nrDeOvos,nrDeCestos);
			System.out.println("Ovos por cesto: "+ ovosPorCesto);
			
			//String s = "Ol�";
			//System.out.println(s.charAt(-1)); 
			//n�o � boa pr�tica apanhar "s�" Exception porque n�o estamos a tratar apenas as nossas exce��es
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Sobram "+ (nrDeOvos - nrDeCestos*ovosPorCesto) + " ovos");
	}
}
