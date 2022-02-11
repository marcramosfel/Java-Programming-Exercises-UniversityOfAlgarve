package aula5.Animais.src.animais;

// A Heran�a promove a re-usabilidade

public abstract class Animal {
	protected int noDePatas;// Vari�vel acessivel dentro do mesmo package e nas sub-classes
	private String comida;
	private String nome;
	
	public Animal(int noDePatas, String comida, String nome) {
		this.noDePatas = noDePatas;
		this.comida = comida;
		this.nome = nome;
	}

	public int getNoDePatas() {
		return noDePatas;
	}

	public void setNoDePatas(int noDePatas) {
		this.noDePatas = noDePatas;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}
	public abstract void correr();
	@Override
	public String toString() {
		return "Nome: "+this.nome + " tipo de comida: "+this.comida;
	}
}
