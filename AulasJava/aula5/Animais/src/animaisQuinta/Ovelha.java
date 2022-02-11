package aula5.Animais.src.animaisQuinta;

import aula5.Animais.src.animais.Animal;

public class Ovelha extends Animal{
	private boolean temLa;

	public Ovelha(String nome) {
		super(2, "Erva", nome);
	}
	public boolean getTemLa() {
		return temLa;
	}

	public void setTemLa(boolean temLa) {
		this.temLa = temLa;
	}
	@Override
	public void correr() {
		System.out.print("\nEstou a correr com "+this.noDePatas+" patas");
	}
	@Override
	public String toString() {
		return super.toString()+" e" + (this.temLa?" ":" n�o ")+"tem l�";
	}
}
