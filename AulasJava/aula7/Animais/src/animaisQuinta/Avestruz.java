package aula7.Animais.src.animaisQuinta;

import aula7.Animais.src.animais.Animal;

public class Avestruz extends Animal{

	public Avestruz(String nome) {
		super(2, "Ra��o", nome);
	}

	public void voar() {
		System.out.println("As avestruzes n�o voam.");
	}
}
