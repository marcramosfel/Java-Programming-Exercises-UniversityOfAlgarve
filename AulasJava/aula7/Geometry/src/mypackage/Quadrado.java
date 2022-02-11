package aula7.Geometry.src.mypackage;

import aula7.Geometry.src.figuraGeometrica.IFiguraGeometrica;

public class Quadrado implements IFiguraGeometrica{
	private double lado;
	
	public Quadrado(double lado) {
		this.lado=lado;
	}
	
	@Override
	public double getArea() {
		return Math.pow(lado, 2);
	}
	@Override
	public double getPerimetro() {
		return lado*4;
	}
	
	public void draw() {
		
		for(int i=0;i<lado;++i) {
			for(int j=0;j<lado;++j)
				System.out.print('*');
			System.out.println();
		}
		
	}
}
