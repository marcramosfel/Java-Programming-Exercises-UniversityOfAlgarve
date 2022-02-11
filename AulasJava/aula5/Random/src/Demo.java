package aula5.Random.src;

public class Demo {
	public static void main(String[] args) {
		System.out.println(Math.random()*11);//retorna um n�mero pseudo-aleat�rio, num intervalo de [0;1[
		
		// Numero entre 0 e 10
		
		double res = (Math.random()*11);
		int rese = (int)res;
		
		System.out.println(res);
		System.out.println(rese);
	}
}
