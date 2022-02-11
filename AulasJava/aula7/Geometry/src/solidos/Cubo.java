package aula7.Geometry.src.solidos;

import aula7.Geometry.src.figuraGeometrica.IFiguraGeometrica;

public class Cubo implements ISolid, IFiguraGeometrica{
	public static final int NUMERO_DE_LADOS = 6;
	public static final int NUMERO_DE_ARESTAS = 12;
	private double aresta;
	
	public Cubo(double lado) {
		this.aresta=lado;
	}
	
	@Override
	public double getArea() {
		System.out.println("Estou a calcular a �rea do cubo.");
		return Math.pow(this.aresta,2)*NUMERO_DE_LADOS;
	}

	@Override
	public double getPerimetro() {
		return this.aresta*NUMERO_DE_ARESTAS;
	}

	@Override
	public double getVolume() {
		return Math.pow(this.aresta, 3);
	}

}
