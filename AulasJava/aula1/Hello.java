package aula1;

import java.util.*;
public class Hello{
	public static void main(String[] args){
		//System.out.println("Hello World");
		
		String greetings;
		Scanner keyboard = new Scanner(System.in);
		greetings = keyboard.nextLine();
		String ola = "Ola";
		String _final = "Ola "+ greetings + " " + 123;
		
		System.out.println(_final);
		
		System.out.println( "Caracter na posição 2" + _final.charAt(2));
		
		String ola2 = new String("Ola");
		
		//int i = 123;
		// System.out.println(i.toString()); não compila porque o tipo int nao é um tipo referência
		
		System.out.println(_final.substring(0,12));
		System.out.println(_final.length());
		// System.out.println(_final.substring(0,20)); StringIndexOutOfBoundsException
		
		System.out.println(_final.indexOf(" 123"));
		
		System.out.println(_final.substring(0, _final.indexOf(" 123")));
		
		System.out.println(_final.substring(0, _final.length()));
		
		System.out.println("substring com 0,0: " + _final.substring(0,0));
		System.out.println("substring com 0,1: " + _final.substring(0,1));
		
		System.out.println("para por \"aspas\" e assim e barras e assim \\ /");
		
		
	}
}