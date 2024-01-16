package n2exercici4;

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
			
			System.out.println("Ordre Alfabetic:");
			ordreAlfabetic(numerosIText);
			System.out.println("----------");
			System.out.println("Contenen E primer:");
			contenenEPrimer(numerosIText);
			System.out.println("----------");
			System.out.println("Modifico a per 4");
			modificoaPer4(numerosIText);
			System.out.println("----------");
			System.out.println("Nomes Numerics");
			nomesNumerics(numerosIText);
		}
		
		private static void ordreAlfabetic (ArrayList<Object> numerosIText){
			numerosIText.stream().filter(o -> o instanceof String)
									.map(o -> (String) o)
										.sorted(Comparator.comparing(str -> str.toLowerCase().charAt(0)))
											.forEach(System.out::println);;
			
			
		}
		
		private static void contenenEPrimer (ArrayList<Object> numerosIText){
			numerosIText.stream().filter(o -> o instanceof String)
									.map(o -> (String) o)
										.sorted(Comparator.comparing((String str) -> str.toLowerCase().contains("e")).reversed())
												.forEach(System.out::println);
			
			
		}
		
		private static void modificoaPer4 (ArrayList<Object> numerosIText){
			numerosIText.stream().filter(o -> o instanceof String)
									.map(o -> (String) o)
										.map(o -> o.replace("a", "4"))
												.forEach(System.out::println);
			
			
		}
		
		private static void nomesNumerics (ArrayList<Object> numerosIText){
			numerosIText.stream().filter(o -> o instanceof Integer)
									.map(o -> (Integer) o)
												.forEach(System.out::println);
			
			
		}

	}