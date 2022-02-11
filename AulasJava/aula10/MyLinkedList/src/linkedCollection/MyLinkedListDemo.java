package aula10.MyLinkedList.src.linkedCollection;

import java.util.ArrayList;
import java.util.Collection;

public class MyLinkedListDemo {
	public static void main(String args[]) {
		Collection<Integer> lista1 = new MyLinkedList<>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(null);
		lista1.add(4);
		lista1.add(5);
		lista1.add(6);
		
		for(Integer integer: lista1)
			System.out.print(integer);
		
		System.out.println();
		System.out.println("Cont�m elemento 4? "+ lista1.contains(4));
		System.out.println("Cont�m elemento 9? "+ lista1.contains(9));
		
		System.out.println("To Array: ");
		Object[] arrayObject = lista1.toArray();
		
		for(Object current: arrayObject)
			System.out.print(current);
		System.out.println();
		//System.out.println("Remover elemento 3: "+ lista1.remove(3));
		for(Integer integer: lista1)
			System.out.print(integer);
		
		System.out.println();
		Collection<Integer> lista2 = new ArrayList<>();
		lista2.add(9);
		lista2.add(8);
		
		System.out.println("Lista 2 com 9,8 containsAll: "+lista1.containsAll(lista2));
		lista2.clear();
		lista2.add(1);
		lista2.add(6);
		System.out.println("Lista 2 com 1,6 containsAll: "+lista1.containsAll(lista2));
		
		System.out.println("Adicionar Lista2 � Lista1: "+ lista1.addAll(lista2));
		for(Integer integer: lista1)
			System.out.print(integer);
		
		System.out.println();
		
		System.out.println("Remover da Lista1 a Lista2 (com 1,6): "+ lista1.removeAll(lista2));
		for(Integer integer: lista1)
			System.out.print(integer);
		
		lista2.add(2);
		lista2.add(5);
		
		System.out.println();
		System.out.println("Retain all da lista2(1,6,2,5) na lista1: "+lista1.retainAll(lista2));
		for(Integer integer: lista1)
			System.out.print(integer);

		System.out.println();
		System.out.println("To Array gen�rico");
		
		Integer[] arr = lista1.toArray(new Integer[0]);

		for(Integer integer: arr)
			System.out.print(integer);
	}
}
