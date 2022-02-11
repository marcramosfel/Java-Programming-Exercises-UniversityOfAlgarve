package aula9.Bucket.src.balde;

import java.util.Iterator;

public class Balde<T> implements Iterable<T>{
	private Object[] dados;
	private int counter;
	
	public Balde(int capacidade) {
		this.dados= new Object[capacidade];
	}
	public Balde() {
		this(10);
	}
	
	@SuppressWarnings("unchecked")
	public T get(int indx) {
		if(indx<0 || indx>=counter)
			throw new IndexOutOfBoundsException("Indice n�o existe: "+indx);
		
		return (T)dados[indx];
	}
	
	public void add(T input) {
		if(counter>= this.dados.length){
			Object[] outroArray = new Object[this.dados.length*2];
			System.arraycopy(this.dados, 0, outroArray, 0, counter);
			this.dados= outroArray;
		}
		this.dados[counter++]=input;
		
	}
	// O String Builder � para se usar sempre que temos concatenena��es de Strings dentro de ciclos
	@Override
	public String toString() {
		
		StringBuilder res = new StringBuilder(100);
		res.append('[').append(' ');
		for(int i=0;i<this.counter;++i)
			res.append(this.dados[i]).append(' ');
		
		return res.append(']').toString();
	}
	@Override
	public Iterator<T> iterator() {
		System.out.println("Obter iterador!");
		return new IteradorBalde<T>();
	}
	
	private class IteradorBalde<E> implements Iterator<E>{
	
		private int index;//indice onde vamos na nossa itera��o
		@Override
		public boolean hasNext() {
			boolean res = index<counter;
			System.out.println("H� next? "+res);
			return res;
		}
	
		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			System.out.println("Pr�ximo elemento");
			return (E)dados[index++];
		}
	
	}
	
}
