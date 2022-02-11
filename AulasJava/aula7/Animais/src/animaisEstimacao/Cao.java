package aula7.Animais.src.animaisEstimacao;

import aula7.Animais.src.animais.Animal;

public class Cao extends Animal{
	private int noOssosEnterrados;
	private static final String COMIDA = "Ra��o";
	public Cao(String nome) {
		 // numa classe base que defina um construtor com par�metros, somos sempre obrigados a chamar esse construtor
		super(4, COMIDA, nome); // a chamada ao construtor da classe base TEM de ser a primeira instru��o do construtor da classe derivada.
	}
	public Cao(String nome, int noDePatas) {// Estamos a fazer Overload do construtor
		//super(noDePatas,COMIDA,nome);
		this(nome);
		this.noDePatas = noDePatas;// vari�vel protected, consegue aceder ao n�mero de patas
	}
	
	
	public int getNoOssosEnterrados() {
		return noOssosEnterrados;
	}

	public void setNoOssosEnterrados(int noOssosEnterrados) {
		this.noOssosEnterrados = noOssosEnterrados;
	}
	@Override
	public String toString() {
		return super.toString() + " numero de Ossos enterrados " + this.noOssosEnterrados;
	}
}
