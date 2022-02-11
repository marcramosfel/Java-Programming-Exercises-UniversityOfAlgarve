package aula4.Cinema.src.cinema;

public class Filme {
	
	public enum Escala {MUITO_BOM, BOM, MEDIOCRE, MAU, PESSIMO};
	
	private static final int NUMERO_INICIAL_MAX_ACTORES = 10;
	private String nome;
	private int ano;
	private Actor[] cast;
	private Escala avaliacao; // 0 a 10
	private int duracaoEmMinutos;
	private int nrActores;
	
	public Filme(String nome, int ano, int duracaoEmMinutos, Escala avaliacao) {
		this.nome = nome;
		this.ano = ano;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.cast = new Actor[Filme.NUMERO_INICIAL_MAX_ACTORES];
		this.avaliacao = avaliacao;
	}
	
	public void addActor(Actor actor) {
		if(nrActores==cast.length) {
			this.increaseSize();
		}
		
		this.cast[this.nrActores++]=actor;
		actor.addFilme(this);
	}
	public void increaseSize() {
		Actor[] novoArray = new Actor[cast.length*2];
		
		System.arraycopy(this.cast, 0, novoArray, 0, this.cast.length);
		
		this.cast = novoArray;
	}
	public Actor[] getActores() {
		return this.cast;
	}
	
	@Override
	public String toString() {
		String res = this.nome + " ano: "+ this.ano + " duracao: "+ this.duracaoEmMinutos
				+" minutos. Avaliado com "+this.avaliacao +"\n";
		
		for(int i = 0; i<this.cast.length && this.cast[i]!=null;++i) 
			res+= this.cast[i]+"\n";
		
		return res;
	}
}
