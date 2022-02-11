package aula9.Bucket.src.aula7.animaisQuinta;

import aula9.Bucket.src.aula7.animais.Animal;

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
	public String toString() {
		return super.toString()+" e" + (this.temLa?" ":" n�o ")+"tem l�";
	}
}
