package aula1;

import java.util.*;
public class EggBasket{
	public static void main(){
		System.out.println("Numero de cestos:");
		Scanner keyboard = new Scanner(System.in);
		/*
		int numeroDeCestos = keyboard.nextInt(); // Obter do Standard output o número de cestos;
		int numeroDeOvos=6; /*Numero de ovos por cesto*/
		
		int numeroDeCestos, numeroDeOvos, numeroTotalDeOvos;
		
		numeroDeCestos= keyboard.nextInt();
		numeroDeOvos = 6;
		
		numeroTotalDeOvos = numeroDeCestos*numeroDeOvos;
		
		System.out.println("Numero de cestos: "+numeroDeCestos);
		System.out.println("Numero de ovos por cesto: "+numeroDeOvos);
		System.out.println("Numero total de ovos: "+numeroTotalDeOvos);
		
		
		/*********************************************/
		
		int intC;
		char c='C';
		
		intC=c;
		
		System.out.println("C: "+intC);//  67
		
		double doubleC = intC;
		
		System.out.println("C: "+doubleC);
		
		double zeroVirgulaCinco = 0.5;
		
		int intDouble= (int)zeroVirgulaCinco;
		
		System.out.println("int Zero virgula cinco " + intDouble);// NÃO É UM ARREDONDAMENTO
		
		double umMeio = 1.0/2;// o tipo retornado é sempre o de maior precisão.
		
		System.out.println("Um meio, em double: "+ umMeio);
		
		System.out.println(1f);
		
	}
}