package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
	
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		list1.add(10);
		
		// Impresion de la primera lista
		System.out.println("Impresion de la primera lista");
		System.out.println("");
		for (Integer s : list1) {
			System.out.println(s);
		}
		
		List<Integer> list2 = new ArrayList<>();
		
		// Añadimos los valores de la lista 1 a la lista 2 en orden inverso con ListIterator
		ListIterator<Integer> it = list1.listIterator(list1.size());
		while (it.hasPrevious()) {
			Integer i = it.previous();
			list2.add(i);
		}
		
		// Añadimos los valores de la lista 1 a la lista 2 en orden inverso con for
		/* for (int i=1; i<list1.size();i++) {
			list2.add(list1.get(list1.size()-i));
		}
		*/
		
		// Recorremos e imprimimos lista2
		System.out.println("");
		System.out.println("Impresion de la segunda lista");
		System.out.println("");
		for (Integer a : list2) {
			System.out.println(a);
		}
		
		
		
		
		

	}

}
