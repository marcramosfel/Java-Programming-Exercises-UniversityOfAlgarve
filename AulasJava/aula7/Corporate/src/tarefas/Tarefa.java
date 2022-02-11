package aula7.Corporate.src.tarefas;

public class Tarefa {
	public static final int TEMPO_MINIMO=15;
	private int tempoExecucao;
	private String descricao;
	
	public Tarefa(int tempoExecucao, String descricao) {
		this.descricao=descricao;
		this.tempoExecucao = tempoExecucao;
	}
	
	@Override
	public String toString() {
		return "\t Tarefa: "+ this.descricao+" tempo: "+this.tempoExecucao+" minutos";
	}
}
