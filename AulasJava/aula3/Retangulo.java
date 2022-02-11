package aula3;

public class Retangulo{
	private int altura;
	private int largura;
	private int area;
	
	public Retangulo(int altura, int largura){
		this.altura = altura;
		this.largura = largura;
		this.area = altura*largura;

	}
	public Retangulo(){
		this(0,0); // Chama o construtor definido acima.
	}
	
	public void setDimensoes(int altura, int largura){
		this.altura = altura;
		this.largura = largura;
		this.area = altura*largura;
	}
	
	public void writeOutput(){
		System.out.println("Este retangulo tem "+ this.altura+" de altura e "+this.largura + 
		" o que faz com que tenha "+this.area + " de area");
	}
	
	public void setAltura(int altura){
		this.altura = altura;
		this.area = this.altura*this.largura;
	}
	public void setLargura(int largura){
		this.largura = largura;
		this.area = this.altura*this.largura;
	}
}