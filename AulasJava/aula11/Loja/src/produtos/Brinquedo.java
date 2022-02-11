package aula11.Loja.src.produtos;

public class Brinquedo extends Produto{
	private int idade;
	public Brinquedo(String descricao, double preco, int stock, int idade) {
		super(descricao, preco, stock);
		this.idade = idade;
	}

	@Override
	public String getDescricaoCompleta() {
		return this.getDescricao()+ "idade: "+ this.idade;
	}

}
