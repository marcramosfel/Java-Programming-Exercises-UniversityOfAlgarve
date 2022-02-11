package aula5.Animais.src.vermes;

import aula5.Animais.src.animais.Animal;

public class Minhoca extends Animal{

	public Minhoca() {
		super(0, "Terra", "N/A");
	}


	@Override
	public void correr() {
		System.out.print("\nEstou a correr com "+this.noDePatas+" patas");
	}
}
