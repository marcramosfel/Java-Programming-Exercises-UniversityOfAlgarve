package aula11.Loja.src.application;

import aula11.Loja.src.exceptions.OutOfStockException;
import aula11.Loja.src.loja.Loja;
import aula11.Loja.src.produtos.Brinquedo;
import aula11.Loja.src.produtos.Roupa;

public class Application {
	public static void main(String[] args) {
		Brinquedo puzzle = new Brinquedo("Puzzle", 5.99, 3,9);
		Brinquedo raquetes = new Brinquedo("Raquete", 1.99, 1,5);
		
		Roupa calcas = new Roupa("Cal�as adulto",10.00,2,"XL");
		Roupa tshirt = new Roupa("Tshirt crian�a",5.99,2,"S");
		
		Loja loja = new Loja(new ConsoleReciept());
		
		loja.addProduto(puzzle);
		loja.addProduto(puzzle);
		loja.addProduto(raquetes);
		loja.addProduto(calcas);
		loja.addProduto(tshirt);
		
		loja.inventario();
		
		String[] carrinhoDeCompras = {"Puzzle","Raquete"};
		compra(carrinhoDeCompras,loja);
		
		loja.inventario();
		
		String[] carrinhoDeCompras2 = {"Cal�as adulto","Tshirt crian�a"};
		compra(carrinhoDeCompras2, loja);
		
		String[] carrinhoDeCompras3 = {"Tshirt crian�a"};
		
		compra(carrinhoDeCompras3,loja);
		loja.inventario();		
	}
	
	private static void compra(String[] carrinho, Loja loja) {
		try {
			System.out.println();
			loja.venda(carrinho);
			System.out.println();
		} catch (OutOfStockException e) {
			e.printStackTrace();
		}
	}
}
