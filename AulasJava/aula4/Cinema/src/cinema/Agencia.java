package aula4.Cinema.src.cinema;

public class Agencia {
	private static final int NUMERO_MAX_INICIAL_ACTORES=10;
	private String nome;
	private Actor[] carteira;
	private int nrActores;
	
	
	public Agencia(String nome) {
		this.nome = nome;
		this.carteira = new Actor[Agencia.NUMERO_MAX_INICIAL_ACTORES];
	}
	public void addActor(Actor actor) {
		if(nrActores==carteira.length) {
			this.increaseSize();
		}
		
		this.carteira[this.nrActores++]=actor;
	}
	public void increaseSize() {
		Actor[] novoArray = new Actor[this.carteira.length*2];
		
		System.arraycopy(this.carteira, 0, novoArray, 0, this.carteira.length);
		
		this.carteira = novoArray;
	}
	public Actor[] getActores() {
		return this.carteira;
	}
	public void mostrarCarteira() {
		System.out.println("Agencia: "+this.nome);
		
		for(int i = 0;i<this.carteira.length&&this.carteira[i]!=null;++i) {
			System.out.println(this.carteira[i]);
			for(int j=0;j<this.carteira[i].getFilmes().length&&this.carteira[i].getFilmes()[j]!=null;++j){
				System.out.println(this.carteira[i].getFilmes()[j]);
			}
			System.out.println();
		}
		
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
