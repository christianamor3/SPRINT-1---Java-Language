package n1exercici3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		
		ArrayList<String> nomsMesosAny = new ArrayList<>();
		
		nomsMesosAny.add("Gener");
		nomsMesosAny.add("Febrer");
		nomsMesosAny.add("Març");
		nomsMesosAny.add("Abril");
		nomsMesosAny.add("Maig");
		nomsMesosAny.add("Juny");
		nomsMesosAny.add("Juliol");
		nomsMesosAny.add("Agost");
		nomsMesosAny.add("Setembre");
		nomsMesosAny.add("Octubre");
		nomsMesosAny.add("Novembre");
		nomsMesosAny.add("Desembre");
		
		nomsMesosAny(nomsMesosAny);
		
	}
	
	public static void nomsMesosAny (ArrayList<String> nomsMesosAny){
		nomsMesosAny.stream().forEach(str -> System.out.println(str));
		
	}

}
