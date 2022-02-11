package aula10.MyArrayList.src.arrayCollection;

import java.util.Iterator;

public class MyArrayListIterator<T> implements Iterator<T>{

	private MyArrayList<T> lista;
	private int currentIndex;
	public MyArrayListIterator(MyArrayList<T> lista) {
		this.lista = lista;
	}
	@Override
	public boolean hasNext() {
		return this.currentIndex< this.lista.size();
	}

	@Override
	public T next() {
		return lista.get(this.currentIndex++);
	}

}
