package aula11.Loja.src.produtos;

import aula11.Loja.src.exceptions.OutOfStockException;

public abstract class Produto {
	private String descricao;
	private int stock;
	private double preco;
	
	public Produto (String descricao, double preco, int stock) {
		this.descricao=descricao;
		this.stock=stock;
		this.preco= preco;
	}
	public double getPreco() {
		return this.preco;
	}
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getStock() {
		return this.stock;
	}
	public void incStock(int stock) {
		this.stock+=stock;
	}
	public void decStock() throws OutOfStockException {
		
		if(this.stock<=0) throw new OutOfStockException(this);
		
		this.stock--;
	}
	
	public abstract String getDescricaoCompleta();
}
