package aula11.Loja.src.output;

import java.util.List;

import aula11.Loja.src.produtos.Produto;

public interface IReciept {
	abstract void mostrarInventario(List<Produto> produtos);
	abstract void mostrarVenda(String s);
}
