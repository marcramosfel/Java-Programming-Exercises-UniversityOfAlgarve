package aula2;

import java.util.Scanner;

public class Bebes {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numeroDeBebes;
        System.out.println("Quantos bebes tiveste?");
        numeroDeBebes = keyboard.nextInt();
		/*
		if(numeroDeBebes==1)
			System.out.println("Parabéns");
		else if(numeroDeBebes==2)
			System.out.println("Gémeos? Boas!");
		else if(numeroDeBebes==3)
			System.out.println("Uau Trigémeos");
		else if(numeroDeBebes>3)
			System.out.println("Não acredito");*/

        switch (numeroDeBebes) {
            case 1:
                System.out.println("Parabéns");
                break;
            case 2:
                System.out.println("Gémeos? Boas!");
                break;
            case 3:
                System.out.println("Uau Trigémeos");
                break;
            default:
                System.out.println("Não acredito");
                break;
        }
    }
}