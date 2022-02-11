package aula7.Corporate.src.demo;

import aula7.Corporate.src.colaboradores.*;
import aula7.Corporate.src.empresa.Empresa;

public class Demo {
	public static void main(String[] args) {
		AssistenteExecutiva ae1 = new AssistenteExecutiva(1, "AE1", 1000.0);
		AssistenteExecutiva ae2 = new AssistenteExecutiva(2, "AE2", 1000.0);
		AssistenteExecutiva ae3 = new AssistenteExecutiva(3, "AE3", 1000.0);

		TecnicoTI tec1 = new TecnicoTI(4,"TEC1",1200.0);
		TecnicoTI tec2 = new TecnicoTI(5,"TEC2",1200.0);
		
		Gestor gestor1 = new Gestor(6,"Gestor1",1500.0);
		
		Empresa vde = new Empresa("VDE Consulting",2000000.0);

		vde.addColaborador(ae1);
		vde.addColaborador(ae2);
		vde.addColaborador(ae3);
//		System.out.println(ae1.getCounterTarefas());

		vde.addColaborador(tec1);
		vde.addColaborador(tec2);
		vde.addColaborador(new Cozinheira(6,"Cozinheira1",500.0));
		
		vde.addColaborador(gestor1);
		System.out.println(vde);
	}
}
