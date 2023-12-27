package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		
		ArrayList <Month> months = new ArrayList<>();
		
		Month gener = new Month("Gener");
		Month febrer = new Month("Febrer");
		Month març = new Month("Març");
		Month abril = new Month("Abril");
		Month maig = new Month("Maig");
		Month juny = new Month("Juny");
		Month juliol = new Month("Juliol");
		Month setembre = new Month("Setembre");
		Month octubre = new Month("Octubre");
		Month novembre = new Month("Novembre");
		Month desembre = new Month("Desembre");
		
		months.add(gener);
		months.add(febrer);
		months.add(març);
		months.add(abril);
		months.add(maig);
		months.add(juny);
		months.add(juliol);
		months.add(setembre);
		months.add(octubre);
		months.add(novembre);
		months.add(desembre);
		
		System.out.println("Mesos sense Agost");
		System.out.println("");
		
		ListIterator <Month> it = months.listIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
		
		System.out.println("-------------");
		
		// Creamos objeto Agosto
		Month agost = new Month("Agost");

		// Añadimos a la ArrayList en la posicion indice 7.
		months.add(7, agost);
	
		// Comprobamos que se ha añadido agosto desplanzando el indice del resto.
		System.out.println("Mesos amb Agost");
		System.out.println("");
		ListIterator <Month> it2 = months.listIterator();
		
		while (it2.hasNext()) {
			System.out.println(it2.next().getName());
		}
		
		
		// Convertimos ArrayList en HashSet pasandoselo por parametro.
		HashSet <Month> hashSetMonths = new HashSet<>(months);
		
		// Tambien podriamos ir añadiendo mediante un for.
		/* for (int i = 0; i<months.size();i++) {
			hashSetMonths.add(months.get(i));
		} */
		
		
		// Introduzco un objeto duplicado (gener) al HashSet para comprobar que no se me imprime.
		hashSetMonths.add(months.get(0));
		
		// Recorremos el HashSet
		System.out.println("-------------");
		System.out.println("Imprimimos HashSet");
		System.out.println("");
		
		for (Month s : hashSetMonths) {
			System.out.println(s.getName());
		}
	
	}

}
