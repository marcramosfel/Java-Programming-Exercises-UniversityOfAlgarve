package aula7.Geometry.src.agregador;
import aula7.Geometry.src.figuraGeometrica.*;
import aula7.Geometry.src.mypackage.Quadrado;
import aula7.Geometry.src.solidos.*;
public class Demo {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(3.5);
		Circulo c2 = new Circulo(8);
		
		Rectangulo r1 = new Rectangulo(3.0,9.1);
		Rectangulo r2 = new Rectangulo(4.0,5.0);
//		IFiguraGeometrica.display(r1);
		
		Cubo cb1 = new Cubo(5);
		
		IFiguraGeometrica[] figuras = {c1,c2,r1,r2,  //new IFiguraGeometrica(), //N�O PODEMOS INST�NCIAR INTERFACES
				new Quadrado(10000.0), cb1};
		
		System.out.println("AreaTotal:" + Agregador.getAreaTotal(figuras));
		System.out.println("PerimetroTotal:" + Agregador.getPerimetroTotal(figuras));
		
		
		IFiguraGeometrica fig = new Quadrado(8.0);
		
		 Quadrado qFig = (Quadrado) fig;
		
		qFig.draw();
		
		for(int i =0;i<figuras.length;++i) {
			if(figuras[i] instanceof Circulo)
				System.out.println(((Circulo)figuras[i]).descricao());
		}
		
		System.out.println("*****METODOS ESTATICOS INTERFACE*******");
		
		IFiguraGeometrica.display(qFig);
		
		System.out.println("************ SOLIDOS ************");
		
		for(int i=0;i<figuras.length;++i) {
			if(figuras[i] instanceof ISolid)
				System.out.println("Volume: "+ ((ISolid)figuras[i]).getVolume());
		}
		
//		IFiguraGeometrica figCubo = cb1;
//		Quadrado quadrado = (Quadrado) figCubo;// ClassCastException
//		quadrado.getArea();
	}
}