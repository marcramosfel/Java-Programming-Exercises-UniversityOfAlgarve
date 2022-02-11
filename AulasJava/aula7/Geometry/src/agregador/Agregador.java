package aula7.Geometry.src.agregador;

import aula7.Geometry.src.figuraGeometrica.IFiguraGeometrica;

public class Agregador {
	private Agregador() {};
	public static double getAreaTotal(IFiguraGeometrica[] figs) {
		double res=0.0;
		for(int i=0;i<figs.length;++i)
			res+=figs[i].getArea();

		return res;
	}
	
	public static double getPerimetroTotal(IFiguraGeometrica[] figs) {
		double res=0.0;
		
		for(int i=0;i<figs.length;++i)
			res+= figs[i].getPerimetro();
		
		return res;
	}
}
