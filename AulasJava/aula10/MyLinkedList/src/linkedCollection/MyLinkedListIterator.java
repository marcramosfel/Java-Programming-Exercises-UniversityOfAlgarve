package aula10.MyLinkedList.src.linkedCollection;

import java.util.Iterator;

public class MyLinkedListIterator<E> implements Iterator<E>{
	private Node<E> current;
	public MyLinkedListIterator(Node<E> head) {
		this.current=head;
	}
	@Override
	public boolean hasNext() {
		return current!=null;
	}

	@Override
	public E next() {
		E result = current.value;
		current = current.next;
		return result;
	}

}
