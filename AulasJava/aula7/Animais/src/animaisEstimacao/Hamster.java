package aula7.Animais.src.animaisEstimacao;

import aula7.Animais.src.animais.Animal;

public class Hamster extends Animal{

	public Hamster(String nome) {
		super(4, "Sementes de girassol", nome);
	}
	@Override
	public void correr() {
		super.correr();
		System.out.println("na minha rodinha");
	}
}
