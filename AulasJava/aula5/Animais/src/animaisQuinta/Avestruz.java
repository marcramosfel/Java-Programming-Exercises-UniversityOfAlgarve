package aula5.Animais.src.animaisQuinta;

import aula5.Animais.src.animais.Animal;

public class Avestruz extends Animal{

	public Avestruz(String nome) {
		super(2, "Ra��o", nome);
	}
	@Override
	public void correr() {
		System.out.print("\nEstou a correr com "+this.noDePatas+" patas");
	}
	public void voar() {
		System.out.println("As avestruzes n�o voam.");
	}
}
