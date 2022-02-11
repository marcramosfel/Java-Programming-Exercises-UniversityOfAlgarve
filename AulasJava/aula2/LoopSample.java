package aula2;

import java.util.Scanner;

public class LoopSample {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Coloque o count");

        int count = keyboard.nextInt();

        System.out.println("***********");
        System.out.println("***WHILE***");
        System.out.println("***********");

        int iWhile = 0;

        while (iWhile < count) {
            System.out.println("Hello " + iWhile++);
//            iWhile++;
        }

        System.out.println("***********");
        System.out.println("**DOWHILE**");
        System.out.println("***********");
        iWhile = 0;
        do {
            System.out.println("Hello " + iWhile++);
        } while (iWhile < count);

        System.out.println("***********");
        System.out.println("****FOR****");
        System.out.println("***********");

        for (int i = 0; i < count; System.out.println("Hello " + i++)) ;

        System.out.println("******************");
        System.out.println("****FORDETAILS****");
        System.out.println("******************");

        int outroI = 0;

        for (System.out.println("A"); B(); System.out.println("C")) {
            System.out.println("D");
            System.out.println("******************");
            if (++outroI == count) break;
        }

//        for (int i = 0; ; ++i) {
//            System.out.println(i);
//        }
    }

    private static boolean B() {
        System.out.println("B");
        return true;
    }
}