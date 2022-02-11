package aula11.Loja.src.loja;
import java.util.LinkedList;
import java.util.List;

import aula11.Loja.src.exceptions.OutOfStockException;
import aula11.Loja.src.output.IReciept;
import aula11.Loja.src.produtos.Produto;
public class Loja {
	private List<Produto> produtos;
	private IReciept output;
	
	public Loja(IReciept output) {
		this.output = output;
		this.produtos = new LinkedList<>();
	}
	public void addProduto(Produto produto) {
		
		for(Produto p: produtos) {
			if(p.getDescricao().equals(produto.getDescricao())) {
				p.incStock(produto.getStock());
				return;
			}
		}
		produtos.add(produto);
	}
	
	public void inventario() {
		this.output.mostrarInventario(produtos);
	}
	
	public void venda(String[] items) throws OutOfStockException {
		
		OutOfStockException exception = null;
		StringBuilder builder = new StringBuilder(100);
		double total = 0;
		for(String item: items) {
			for(Produto p: produtos) {
				if(!item.equals(p.getDescricao())) continue;
				
				try {
					p.decStock();
					builder.append(p.getDescricaoCompleta()).append("---").append(p.getPreco()).append('\n');
					
					total+= p.getPreco();
				} catch (OutOfStockException e) {
					exception = e;
				}
			}
		}
		builder.append("Total:").append(total);
		output.mostrarVenda(builder.toString());
		
		if(exception != null) throw exception;
	}
}
