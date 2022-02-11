package aula2;

import aula2.animais.Cao;

public class DemoCao {
    public static void main(String[] args) {
        Cao bobi = new Cao();
        bobi.nome = "Bobi";
        bobi.raca = "Husky";
        bobi.idadeReal = 1;

        bobi.writeOutput();
        System.out.println(bobi);
    }
}