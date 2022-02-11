package aula8.Excecoes.src;

public class  Recursive {
	public static int fact(int i) {
		if(i==0) return 1;
		
		return i*fact(i-1);
	}
	
	public static void main(String args[]) {
		try {
			System.out.println(fact(10));
		}
		catch(Error error) {
			System.out.println("oops");
			//N�o se devem tratar erros, porque o comportamento
			// da aplica��o vai ser inexperado
		}
		
	}
}
