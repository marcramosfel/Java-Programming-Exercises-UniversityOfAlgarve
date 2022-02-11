package aula4.Cinema.src.cinema;

public class Cinema {
	private static final int NUMERO_INICIAL_MAX_FILMES = 10;
	private String nome;
	private Filme[] cartaz;
	private int nrDeFilmes;
	public Cinema(String nome) {
		this.nome = nome;
		this.cartaz = new Filme[Cinema.NUMERO_INICIAL_MAX_FILMES];
		
	}
	public void addFilme(Filme filme) {
		/*int i=0;
		for(;i<cartaz.length;++i)
			if(cartaz[i]==null)
				break;
		
		cartaz[i] = filme;*/
		if(nrDeFilmes==cartaz.length)
			this.increaseSize();

		cartaz[this.nrDeFilmes++]=filme;
		
	}
	private void increaseSize() {
		Filme[] novoArray = new Filme[cartaz.length*2];
		
/*		for(int i =0;i<cartaz.length;++i)
			novoArray[i] = cartaz[i];*/
		System.arraycopy(this.cartaz,0,novoArray,0,this.cartaz.length);
		
		this.cartaz = novoArray;
	}
	public void mostrarCartaz() {
		System.out.println("Cartaz: "+ nome);
		
		for(int i=0;i<cartaz.length && cartaz[i]!=null ;++i)
			System.out.println(cartaz[i]);
		
	}
}
