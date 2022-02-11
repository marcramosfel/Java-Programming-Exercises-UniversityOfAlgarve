package aula10.MyLinkedList.src.linkedCollection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList<T> implements Collection<T>{
	private int counter;
	private Node<T> head;
	private Node<T> tail;
	@Override
	public int size() {
		return this.counter;
	}
	@Override
	public boolean isEmpty() {
		return this.counter==0;
	}
	@Override
	public boolean contains(Object o) {
		if(head==null) return false;
		
		for(Node<T> current = head;current!=null;
				current=current.next) {
			if(o==null && current.value==null 
			||
			o!=null && o.equals(current.value)) return true;
			
		}
		return false;
	}
	@Override
	public Iterator<T> iterator() {
		return new MyLinkedListIterator<>(head);
	}
	@Override
	public Object[] toArray() {
		Object [] res = new Object[this.counter];
		int i =0;
		for(Node<T> current = head;current!=null;
				current=current.next)
			res[i++] = current.value;

		
		return res;
	}
	@SuppressWarnings("unchecked")
	@Override
	public <E> E[] toArray(E[] inputArray) {
		if(this.counter==0) return inputArray;
		if(inputArray.length<this.counter) {
			inputArray = (E[]) Array.newInstance(inputArray.getClass().getComponentType(), this.counter);
		}
		int i=0;
		for(Node<T> current = head;current!=null;
				current=current.next)
			inputArray[i++] = (E) current.value;
		
		return inputArray;
	}
	@Override
	public boolean add(T input) {
		if(head==null) {//lista est� vazia
			head = new Node<T>(input);
			tail = head;
		}
		else {
			tail.next = new Node<T>(input);
			tail=tail.next;
		}
		counter++;
		return true;
	}
	
	public void show() {
		for(Node<T> current=head; current!=null; 
				current=current.next)
			System.out.println(current.value);

	}
	
	@Override
	public boolean remove(Object o) {
		if(head == null) return false;
		Node<T> previous = null;
		boolean res=false;
		for(Node<T> current=head;current!=null;current=current.next) {
			if(current.value==null && o==null) {
					previous.next=current.next;
					this.counter--;
					res|=true;
				
			}
			if(current.value==null || !current.value.equals(o)) {
				previous=current;
				continue;
			}
			else if(current==head) {
					if(current.next==null) {
						head=null;
						tail=null;
						this.counter--;
						return true;
					}
				head=current.next;
				this.counter--;
				continue;
			}
			else if(current==tail) {
				tail=previous;
			}
			previous.next=current.next;
			this.counter--;
			res|=true;
		}
		
		return res;
	}
	@Override
	public boolean containsAll(Collection<?> inputCollection) {
		
		for(Object obj: inputCollection) {
			if(!this.contains(obj)) return false;
		}
		
		return true;
	}
	@Override
	public boolean addAll(Collection<? extends T> inputCollection) {
		for(T obj: inputCollection) {
			this.add(obj);
		}
		return true;
	}
	@Override
	public boolean removeAll(Collection<?> inputCollection) {
		boolean res = false;
		for(Object obj: inputCollection) {
			res|= this.remove(obj);
		}
		return res;
	}
	@Override
	public boolean retainAll(Collection<?> inputCollection) {
		boolean res= false;
		for(Object obj: this) {
			if(inputCollection.contains(obj))continue;
			res|=this.remove(obj);
		}
		return res;
	}
	@Override
	public void clear() {
		this.counter=0;
		this.head=null;
		this.tail=null;
	}
}
