package aula5.Corporate.src.colaboradores;

import aula5.Corporate.src.tarefas.Tarefa;

public class Colaborador {
	protected static final int TEMPO_MAXIMO_DIARIO = 8 * 60;
	private static final int NUMERO_MAXIMO_TAREFAS_DIARIAS = TEMPO_MAXIMO_DIARIO/ Tarefa.TEMPO_MINIMO;
	
	private int numeroEmpregado;
	private String nome;
	private double salario;
	private Tarefa[] tarefas; 
	private int counterTarefas;
	
	public Colaborador(int numEmp, String nome, double salario) {
		this.numeroEmpregado = numEmp;
		this.nome = nome;
		this.salario = salario;
		this.tarefas = new Tarefa[NUMERO_MAXIMO_TAREFAS_DIARIAS];
	}
	
	@Override
	public String toString() {
		String res= "Nome:"+this.nome+" NumeroEmpregado: "+this.numeroEmpregado+" sal�rio: "+this.salario+"\n";
		
		for(int i=0;i<tarefas.length&&tarefas[i]!=null;++i)
			res+=tarefas[i]+"\n";
		
		return res;
	}
	
	
	protected void gerarTarefas(String[] tarefasPossiveis) {
		// TAREFAS_AE[tarefasPossiveis.length] ---> ArrayIndexOutOfBoundsException
		String descricaoTarefa = null;
		int tempoTarefa = 0;
		int acumuladorTempo=0;
		
		while(acumuladorTempo<=Colaborador.TEMPO_MAXIMO_DIARIO) {		
			int randomIdx =(int)(Math.random()* tarefasPossiveis.length); // cast
			descricaoTarefa = tarefasPossiveis[randomIdx];
			tempoTarefa = (int)(Math.random()*(Colaborador.TEMPO_MAXIMO_DIARIO-acumuladorTempo));
			if(tempoTarefa<Tarefa.TEMPO_MINIMO) tempoTarefa=Tarefa.TEMPO_MINIMO;
			Tarefa tarefa = new Tarefa(tempoTarefa,descricaoTarefa);
			this.tarefas[counterTarefas++] = tarefa;
			acumuladorTempo+=tempoTarefa;
		}		
	}
}
