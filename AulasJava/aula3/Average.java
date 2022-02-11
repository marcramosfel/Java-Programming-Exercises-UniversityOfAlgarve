package aula3;

public class Average{
	public static void main(String[] argumentos){
		int numbers = argumentos.length;
		int acc=0;
		System.out.println("Tamanho do array de input "+ numbers);
		
		for(int i=0;i<argumentos.length;++i){
			acc+= Integer.parseInt(argumentos[i]);
		}
		
		System.out.println("Soma de tudo: "+ acc+ " media: "+ 1.0*acc/numbers);
	}
}