//package balde;
//
//import java.util.Iterator;
//
//public class IteradorBalde<T> implements Iterator<T>{
//
//	private Balde<T> balde;
//	private int index;//indice onde vamos na nossa iteração
//	public IteradorBalde(Balde<T> balde) {
//		this.balde=balde;
//	}
//	@Override
//	public boolean hasNext() {
//		return index<balde.counter;
//	}
//
//	@Override
//	public T next() {
//		return balde.get(index++);
//	}
//
//}
