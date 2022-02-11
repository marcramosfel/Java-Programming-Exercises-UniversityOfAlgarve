package aula7.Corporate.src.colaboradores;

import aula7.Corporate.src.tarefas.Tarefa;

public class Cozinheira extends Colaborador {
	private static final String DESCRICAO_TAREFA = "Cozinhar";
	public Cozinheira(int numEmp, String nome, double salario) {
		super(numEmp, nome, salario);
	}

	@Override
	public void gerarTarefas() {
		this.tarefas[0] = new Tarefa(Colaborador.TEMPO_MAXIMO_DIARIO,DESCRICAO_TAREFA);
	}
	
	@Override
	public String toString() {
		return "Cozinheira ==>" + super.toString();
	}
	

}
