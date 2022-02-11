package aula11.Loja.src.exceptions;

import aula11.Loja.src.produtos.Produto;

public class OutOfStockException extends Exception{

	private static final long serialVersionUID = 1L;
	private Produto produto;
	public OutOfStockException(Produto produto) {
		super(produto.getDescricao()+" com 0 unidades em armaz�m");
		this.produto= produto;
	}
	public Produto getProduto() {
		return this.produto;
	}
}
