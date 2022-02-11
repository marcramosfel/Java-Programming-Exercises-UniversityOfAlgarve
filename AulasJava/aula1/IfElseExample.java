package aula1;

public class IfElseExample{
	public static final int JUROS_DA_CONTA=5;
	public static final int PENALIZACAO = 2;
	public static void main(String[] args){
		int saldo = -100;

		int juros =5, penalizacao = 2;

		
		if(saldo>0){
			saldo += (saldo*JUROS_DA_CONTA/100);
			System.out.println("Tem direito a juros");
		}
		else{
			saldo += (saldo*PENALIZACAO/100);
			System.out.println("Tem penalizacao");
		}
		System.out.println("Saldo: " + saldo);
		
		/**************************/
		
		int points =120;
		int preInc = ++points;
		int posInc = points++;
		
		System.out.println("points= "+points);
		System.out.println("preInc= "+preInc);
		System.out.println("posInc="+posInc);
		
		/***********************************************/
		
		points = 1;
		if(points++>0 || points++==3){ // ! -> NOT
			System.out.println("points++>0 || points++==3");
		}
		if(points++>0 && points++==3){
			System.out.println("points++>0 && points++==3");
		}
		
		System.out.println("Points: "+ points);
	}
}