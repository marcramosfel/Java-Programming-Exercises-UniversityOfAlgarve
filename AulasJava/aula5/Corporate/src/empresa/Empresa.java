package aula5.Corporate.src.empresa;

import aula5.Corporate.src.colaboradores.*;

public class Empresa {
	private static final int TAMANHO_INICIAL_COLABORADORES = 5;
	
	private String nome;
	private double capitalSocial;
	private TecnicoTI[] tecnicos;
	private AssistenteExecutiva[] assistentes;
	private Gestor[] gestores;
	
	private int counterTecnicos;
	private int counterAE;
	private int counterGestores;
	
	public Empresa(String nome, double capitalSocial) {
		this.nome=nome;
		this.capitalSocial=capitalSocial;
		this.tecnicos = new TecnicoTI[TAMANHO_INICIAL_COLABORADORES];
		this.assistentes = new AssistenteExecutiva[TAMANHO_INICIAL_COLABORADORES];
		this.gestores = new Gestor[TAMANHO_INICIAL_COLABORADORES];
	}
	
	public void addTecnicoTI(TecnicoTI tecnico) {
		// counterTecnicos==tecnicos.length
		if(this.tecnicos[this.tecnicos.length-1]!=null) {
			TecnicoTI[] outroArray = new TecnicoTI[this.tecnicos.length*2];
			System.arraycopy(this.tecnicos, 0, outroArray, 0, this.tecnicos.length);
			this.tecnicos = outroArray;
		}
		this.tecnicos[this.counterTecnicos++] = tecnico;
		tecnico.gerarTarefas();
	}
	
	public void addAE(AssistenteExecutiva assistente) {
		if(this.assistentes[this.assistentes.length-1]!=null) {
			AssistenteExecutiva[] outroArray = new AssistenteExecutiva[this.assistentes.length*2];
			System.arraycopy(this.assistentes, 0, outroArray, 0, this.assistentes.length);
			this.assistentes = outroArray;
		}
		this.assistentes[this.counterAE++] = assistente;
		assistente.gerarTarefas();
	}
	
	public void addGestor(Gestor gestor) {
		if(this.gestores[this.gestores.length-1]!=null) {
			Gestor[] outroArray = new Gestor[this.gestores.length*2];
			System.arraycopy(this.gestores, 0, outroArray, 0, this.gestores.length);
			this.gestores = outroArray;
		}
		this.gestores[this.counterGestores++] = gestor;
		gestor.gerarTarefas();
	}
	
	@Override
	public String toString() {
		String res = "Nome da Empresa: "+this.nome+ " com o capital social de "+this.capitalSocial+" euros\n Relat�rio de pessoal";
		
		for(int i=0;i<this.tecnicos.length&&this.tecnicos[i]!=null;++i)
			res+=tecnicos[i];

		for(int i=0;i<this.assistentes.length&&this.assistentes[i]!=null;++i)
			res+=assistentes[i];
		
		for(int i=0;i<this.gestores.length&&this.gestores[i]!=null;++i)
			res+=gestores[i];
		
		return res;
	}
}
