package aula2;

import java.util.Scanner;

public class StringEquality {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
		/*
		System.out.println("Insira dois inteiros:");
		
		int umInteiro = keyboard.nextInt();
		int outroInteiro = keyboard.nextInt();
		
		if(umInteiro == outroInteiro)
			System.out.println("São iguais");
		else
			System.out.println("São diferentes");

		System.out.println("Isto fica fora do else");
		
		System.out.println("Insira duas linhas de texto");
		*/

        String umaString = keyboard.nextLine();

        String outraString = keyboard.nextLine();

        //outraString = umaString;

        if (umaString==outraString)
            System.out.println("Sao iguais ==");
        else
            System.out.println("Sao diferentes ==");

//        if ('C' == 67)
//            System.out.println(" 'c' equivale a 67"); // têm o mesmo valor na stack

        if (umaString.equals(outraString))
            System.out.println("Sao iguais equals.");
        else
            System.out.println("Sao diferentes equals.");

        if (umaString.compareTo(outraString) < 0) {
            System.out.println(umaString + " vem antes lexologicamente de " + outraString);
        } else if (umaString.compareTo(outraString) > 0) {
            System.out.println(umaString + " vem depois lexologicamente de " + outraString);
        } else { // if(umaString.compareTo(outraString)==0)
            System.out.println(umaString + " e igual " + outraString);
        }

        String ola = "Ola";
        String ola2 = "Ola";

        if (ola == ola2)
            System.out.println("ola e igual a ola2");
        else
            System.out.println("ola e diferente a ola2");

    }
}