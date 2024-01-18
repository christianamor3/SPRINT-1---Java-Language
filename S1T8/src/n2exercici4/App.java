package n2exercici4;

import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
			
		List<Object> numsAndText = List.of("Gener",1,"Març",2,"Maig",3,
												"Juliol", 4, "Setembre",
													5, "Novembre", 6);
			
			System.out.println("Ordre Alfabetic:");
			alphabeticOrder(numsAndText);
			System.out.println("----------");
			System.out.println("Contenen E primer:");
			containsE(numsAndText);
			System.out.println("----------");
			System.out.println("Modifico a per 4");
			changingAfor4(numsAndText);
			System.out.println("----------");
			System.out.println("Nomes Numerics");
			onlyNums(numsAndText);
		}
		
		
		private static void alphabeticOrder (List<Object> numsAndText){
			numsAndText.stream().filter(o -> o instanceof String)
									.map(o -> (String) o)
										.sorted(Comparator.comparing(str -> str.toLowerCase().charAt(0)))
											.forEach(System.out::println);;
		}
		
		private static void containsE (List<Object> numsAndText){
			numsAndText.stream().filter(o -> o instanceof String)
									.map(o -> (String) o)
										.sorted(Comparator.comparing((String str) -> str.toLowerCase().contains("e")).reversed())
												.forEach(System.out::println);
	
		}
		
		private static void changingAfor4 (List<Object> numsAndText){
			numsAndText.stream().filter(o -> o instanceof String)
									.map(o -> (String) o)
										.map(o -> o.replace("a", "4"))
												.forEach(System.out::println);

		}
		
		private static void onlyNums (List<Object> numsAndText){
			numsAndText.stream().filter(o -> o instanceof Integer)
									.map(o -> (Integer) o)
										.forEach(System.out::println);

		}

	}