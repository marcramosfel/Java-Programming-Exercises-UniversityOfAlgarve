package aula9.Bucket.src.aula7.animaisEstimacao;

import aula9.Bucket.src.aula7.animais.Animal;

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
