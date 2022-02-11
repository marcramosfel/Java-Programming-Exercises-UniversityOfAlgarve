package aula7.Corporate.src.empresa;

import aula7.Corporate.src.colaboradores.*;

public class Empresa {
	private static final int TAMANHO_INICIAL_COLABORADORES = 5;
	
	private String nome;
	private double capitalSocial;
	private Colaborador[] colaboradores;
	
	private int counterColaboradores;
	
	public Empresa(String nome, double capitalSocial) {
		this.nome=nome;
		this.capitalSocial=capitalSocial;
		this.colaboradores= new Colaborador[TAMANHO_INICIAL_COLABORADORES];
	}
	
	public void addColaborador(Colaborador colaborador) {
		// counterColaboradores==colaboradores.length
		if(this.colaboradores[this.colaboradores.length-1]!=null) {
			Colaborador[] outroArray = new Colaborador[this.colaboradores.length*2];
			System.arraycopy(this.colaboradores, 0, outroArray, 0, this.colaboradores.length);
			this.colaboradores = outroArray;
		}
		this.colaboradores[this.counterColaboradores++] = colaborador;
		colaborador.gerarTarefas();
	}
	
	@Override
	public String toString() {
		String res = "Nome da Empresa: "+this.nome+ " com o capital social de "+this.capitalSocial+" euros\n Relat�rio de pessoal\n";
		
		for(int i=0;i<this.colaboradores.length&&this.colaboradores[i]!=null;++i)
			res+=colaboradores[i];
		
		return res;
	}
}
