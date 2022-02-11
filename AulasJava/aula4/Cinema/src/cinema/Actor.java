package aula4.Cinema.src.cinema;

public class Actor {
	private static final int NUMERO_MAX_INICIAL_FILMES=10;
	private String nome;
	private String cc;
	private String dataNascimento;
	private Agencia agencia;
	private Filme[] filmes;
	private int nrFilmes;
	
	public Actor(String nome, String cc, String dataNascimento) {
		this.nome = nome;
		this.cc=cc;
		this.dataNascimento = dataNascimento;
		this.filmes = new Filme[NUMERO_MAX_INICIAL_FILMES];
	}
	public void addFilme(Filme filme) {
		if(nrFilmes==filmes.length) {
			this.increaseSize();
		}
		
		this.filmes[this.nrFilmes++]=filme;
	}
	public void increaseSize() {
		Filme[] novoArray = new Filme[this.filmes.length*2];
		
		System.arraycopy(this.filmes, 0, novoArray, 0, this.filmes.length);
		
		this.filmes = novoArray;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Filme[] getFilmes() {
		return this.filmes;
	}
	
	@Override
	public String toString() {
		String res= this.nome + " Cc: "+ this.cc + " data de nascimento: "+ this.dataNascimento;
		
		if(this.agencia!= null)
			res+= "Agencia: "+ this.agencia;
		
		return res;
	}
}
