package aula7.Animais.src.vermes;

public class Tenia extends Minhoca{
 // N�o somos obrigados a definir um contrutor, porque a classe base tamb�m nao define um
 // existindo apenas o contrutor por Omiss�o Tenia()
	
	private int comprimento;
	public Tenia() {
		//Como n�o existe construtor definido na classe base com par�metros, 
		//n�o somos obrigados a chama-lo explicitamente na classe
		//derivada
		//super();// -> � como se chamassemos esta instru��o implicitamente - n�o � obrigat�rio chamar explicitamente
		//porque o construtor de Minhoca n�o tem par�metros

		this.comprimento = 5;
		this.noDePatas =1;
	}
}
