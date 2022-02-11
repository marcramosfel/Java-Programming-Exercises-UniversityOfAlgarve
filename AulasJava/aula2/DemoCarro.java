package aula2;

import aula2.veiculos.*;

public class DemoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.marca = "Lexus";
        carro1.modelo = "CT200";
        carro1.potencia = 2.2;
        carro1.nivelCombustivel = 35;
        carro1.velocidade = 50;
        carro1.matricula = "UALGBS2021";

        System.out.println(carro1);

        //carro1.acelerar(0.2);
        //carro1.acelerar(0.2);

        System.out.println(carro1);

        Carro carro2 = new Carro();

        carro2.marca = "Pegeout";
        carro2.modelo = "Txuning";
        carro2.potencia = 9.9;
        carro2.nivelCombustivel = 35;
        carro2.velocidade = 25;
        carro2.matricula = "VR88MMM";

        System.out.println(carro2);

        System.out.println(carro1 == carro2);
        System.out.println(carro1.equals(carro2));

        Carro carro3 = carro2;

        System.out.println(carro3 == carro2);
        System.out.println(carro3.equals(carro2));

        Carro carro4 = new Carro();

        carro4.marca = "Lexus";
        carro4.modelo = "CT200";
        carro4.potencia = 2.2;
        carro4.nivelCombustivel = 35;
        carro4.velocidade = 50;
        carro4.matricula = "UALGBS2021";

        System.out.println(carro1 == carro4);
        System.out.println(carro1.equals(carro4));
    }
}