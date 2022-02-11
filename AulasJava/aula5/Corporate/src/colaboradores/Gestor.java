package aula5.Corporate.src.colaboradores;


public class Gestor extends Colaborador {
	
	private static final String[] TAREFAS_GESTOR = {"Gest�o de equipa","Reuni�es" };

	public Gestor(int numEmp, String nome, double salario) {
		super(numEmp, nome, salario);
	}

	public void gerarTarefas() {
		this.gerarTarefas(TAREFAS_GESTOR);
	}
	
	@Override
	public String toString() {
		return "Gestor ==>" + super.toString();
		
	}
}
