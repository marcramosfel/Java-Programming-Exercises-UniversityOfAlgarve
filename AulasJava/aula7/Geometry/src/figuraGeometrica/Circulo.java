package aula7.Geometry.src.figuraGeometrica;
public class Circulo implements IFiguraGeometrica{
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio=raio;
	}
	@Override
	public double getArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	@Override
	public double getPerimetro() {
		return 2*Math.PI*raio;
	}
	
	public String descricao() {
		return "Circulo com "+this.raio+" de raio";
	}
}
