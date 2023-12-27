package n1exercici6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

			
			ArrayList<Object> numerosIText= new ArrayList<>();
			
			numerosIText.add("Gener");
			numerosIText.add(1);
			numerosIText.add("Març");
			numerosIText.add(2);
			numerosIText.add("Maig");
			numerosIText.add(3);
			numerosIText.add("Juliol");
			numerosIText.add(4);
			numerosIText.add("Setembre");
			numerosIText.add(5);
			numerosIText.add("Novembre");
			numerosIText.add(6);
			
			numerosIText(numerosIText);
			
		}
		
		public static void numerosIText (ArrayList<Object> numerosIText){
			numerosIText.stream().filter(o -> o instanceof String)
									.map(o -> (String) o)
										.sorted(Comparator.comparing(String::length))
											.forEach(System.out::println);;
			
			
		}

	}