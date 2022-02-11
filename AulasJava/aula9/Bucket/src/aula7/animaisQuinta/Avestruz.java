package aula9.Bucket.src.aula7.animaisQuinta;

import aula9.Bucket.src.aula7.animais.Animal;

public class Avestruz extends Animal{

	public Avestruz(String nome) {
		super(2, "Ra��o", nome);
	}

	public void voar() {
		System.out.println("As avestruzes n�o voam.");
	}
}
