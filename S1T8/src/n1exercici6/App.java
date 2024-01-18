package n1exercici6;

import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Object> numsAndText = List.of("Gener",1,"Març",2,"Maig",3,
													"Juliol", 4, "Setembre",
															5, "Novembre", 6);
			
		numsAndText.stream().filter(o -> o instanceof String)
								.map(o -> (String) o)
									.sorted(Comparator.comparing(String::length))
										.forEach(System.out::println);;
			
		}
	}