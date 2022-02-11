package aula7.Corporate.src.colaboradores;


public class AssistenteExecutiva extends Colaborador{
	
	private static final String[] TAREFAS_AE = {"Apoio � fatura��o","Gest�o de agenda","Gest�o de engagement"};
	
	public AssistenteExecutiva(int numEmp, String nome, double salario) {
		super(numEmp, nome, salario);
	}
	

	public void gerarTarefas() {
		this.gerarTarefas(TAREFAS_AE);
	}
	
	@Override
	public String toString() {
		return "Assistente Executiva ==>" + super.toString();
		
	}
	
}
