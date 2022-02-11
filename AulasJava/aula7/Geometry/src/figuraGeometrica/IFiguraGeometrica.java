package aula7.Geometry.src.figuraGeometrica;

public interface IFiguraGeometrica {
	
	/*public*/static final String DESC = "Figura Geom�trica";
	
	abstract double getArea();
	abstract double getPerimetro();
	
	/*public*/static void display(IFiguraGeometrica figura) {
		System.out.println(DESC + "Area: "+ figura.getArea() 
		+" Perimetro: " +figura.getPerimetro());
	}
}
