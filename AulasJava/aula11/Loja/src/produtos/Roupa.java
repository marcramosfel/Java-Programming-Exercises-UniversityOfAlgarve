package aula11.Loja.src.produtos;

public class Roupa extends Produto{
	private String tamanho;
	public Roupa(String descricao, double preco, int stock, String tamanho) {
		super(descricao, preco, stock);
		this.tamanho = tamanho;
	}

	@Override
	public String getDescricaoCompleta() {
		return this.getDescricao()+" tamanho: "+this.tamanho;
	}

}
