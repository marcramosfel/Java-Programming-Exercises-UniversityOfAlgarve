package aula10.MyArrayList.src.arrayCollection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<T> implements Collection<T>{
	
	private static final int CAPACIDADE_INICIAL=10;
	private Object[] dados;
	private int counter=0;
	
	public MyArrayList() {
		this(CAPACIDADE_INICIAL);
	}
	public MyArrayList(int capacidadeInicial) {
		this.dados = new Object[capacidadeInicial];
	}
	@Override
	public int size() {
		return this.counter;
	}

	@Override
	public boolean isEmpty() {
		return this.counter==0;
	}

	@Override
	public boolean contains(Object inputObject) {
		
		for(Object current : this) {
			if(current==null && inputObject==null) return true;
			if(current!=null && current.equals(inputObject)) return true;
		}
		
		return false;
	}


	@Override
	public Object[] toArray() {
		Object[] res = new Object[this.counter];
		System.arraycopy(this.dados, 0, res, 0, this.counter);
		
		return res;
	}

	@Override
	public boolean add(T inputObject) {
		if(this.dados.length<=this.counter) {
			Object[] outroArray= new Object[CAPACIDADE_INICIAL];
			System.arraycopy(this.dados, 0, outroArray, 0, this.counter);
			this.dados=outroArray;
		}
		
		this.dados[this.counter++]=inputObject;
		return true;
	}

	@Override
	public boolean remove(Object inputObject) {
		boolean res= false;

		for(int i=0;i<this.counter;) {
			if(inputObject==null) {
				if(this.dados[i]!=null) {++i;continue;}
			}
			else if( !inputObject.equals(this.dados[i])) {
				++i;
				continue;
			}
			
			for(int j=i;j<this.dados.length-1;++j) {
				this.dados[j]=this.dados[j+1];
			}
			--this.counter;
			res=true;
		}
		
		
		return res;
	}

	@Override
	public boolean containsAll(Collection<?> inputCollection) {
		
		for(Object current : inputCollection)
			if(!this.contains(current)) return false;
		
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends T> inputCollection) {
		
		for(T current : inputCollection)
			this.add(current);
		
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> inputCollection) {
		boolean res = false;
		for(Object current: inputCollection)
			res|=this.remove(current);
		
		return res;
	}

	@Override
	public boolean retainAll(Collection<?> inputCollection) {
		boolean res = false;
		for(int i=0;i<this.counter;)
			if(!inputCollection.contains(this.dados[i])) 
				res|= this.remove(this.dados[i]);
			else ++i;
			
		return res;
	}

	@Override
	public void clear() {
		this.dados = new Object[CAPACIDADE_INICIAL];
		this.counter=0;
	}
	@Override
	public Iterator<T> iterator() {
		return new MyArrayListIterator<>(this);
	}
	@Override
	public <E> E[] toArray(E[] inputArray) {
		
		if(inputArray.length<this.counter) {
			inputArray = (E[]) Array.newInstance(inputArray.getClass().getComponentType(), this.counter);
		}
		
		System.arraycopy(this.dados, 0, inputArray, 0, counter);
		return inputArray;
	}
	
	@SuppressWarnings("unchecked")
	T get(int index) {
		return (T)this.dados[index];
	}
}
