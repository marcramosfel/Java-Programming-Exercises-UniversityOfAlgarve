package aula5.Animais.src.animaisEstimacao;

import aula5.Animais.src.animais.Animal;

public class Cao extends Animal{
	private int noOssosEnterrados;
	private static final String COMIDA = "Racao";
	public Cao(String nome, int ossos) {
		 // numa classe base que defina um construtor com par�metros, somos sempre obrigados a chamar esse construtor
		super(4, COMIDA, nome);
		this.noOssosEnterrados=ossos;// a chamada ao construtor da classe base TEM de ser a primeira instru��o do construtor da classe derivada.
	}
	public Cao(String nome, int ossos, int noDePatas) {// Estamos a fazer Overload do construtor
		super(noDePatas,COMIDA,nome);
//		this(nome);
		this.noDePatas = noDePatas;// vari�vel protected, consegue aceder ao n�mero de patas
		this.noOssosEnterrados=ossos;
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
	@Override
	public void correr() {
		System.out.print("\nEstou a correr com "+this.noDePatas+" patas");
	}

	public static void main(String[] args) {
		Cao c1 = new Cao("cao",12);
		c1.correr();
		System.out.println("\n"+c1.getNoOssosEnterrados());
	}
}
