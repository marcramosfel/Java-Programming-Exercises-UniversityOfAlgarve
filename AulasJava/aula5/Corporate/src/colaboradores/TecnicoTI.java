package aula5.Corporate.src.colaboradores;


public class TecnicoTI extends Colaborador{
	private static final String[] TAREFAS_TEC = {"An�lise Incidentes","Programar","Esclarecimentos"};
	
	public TecnicoTI(int numEmp, String nome, double salario) {
		super(numEmp, nome, salario);
	}

	public void gerarTarefas() {
		this.gerarTarefas(TAREFAS_TEC);
	}
	
	@Override
	public String toString() {
		return "Tecnico TI ==>" + super.toString();
		
	}
}
