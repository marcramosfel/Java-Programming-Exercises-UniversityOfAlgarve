package aula11.Loja.src.application;
 import java.util.List;

import aula11.Loja.src.output.*;
import aula11.Loja.src.produtos.Produto;
public class ConsoleReciept implements IReciept{

	@Override
	public void mostrarInventario(List<Produto> produtos) {
		System.out.println("Invent�rio");
		
		for(Produto produto: produtos) {
			System.out.println(produto.getDescricaoCompleta()+" "+produto.getStock()+" unidades");
		}
		
	}

	@Override
	public void mostrarVenda(String s) {
		System.out.println("******************");
		System.out.println("*VENDA A DINHEIRO*");
		System.out.println("******************");
		System.out.println(s);
		System.out.println("Processado por computador.");
	}

}
