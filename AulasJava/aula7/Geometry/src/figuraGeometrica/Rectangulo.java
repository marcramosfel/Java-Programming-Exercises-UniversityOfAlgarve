package aula7.Geometry.src.figuraGeometrica;

public class Rectangulo implements IFiguraGeometrica{
	private double altura;
	private double largura;
	
	public Rectangulo(double altura,double largura) {
		this.altura=altura;
		this.largura=largura;
	}
	@Override
	public double getArea() {
		return this.altura*this.largura;
	};
	
	@Override
	public double getPerimetro() {
		return this.altura*2 + this.largura*2;
	}
	
}
