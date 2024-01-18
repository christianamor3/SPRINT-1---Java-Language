package n1exercici4;

import java.util.List;

public class App {

	public static void main(String[] args) {

		List<String> months = List.of("Gener","Febrer",
											"Març","Abril","Maig","Juny",
												"Juliol", "Agost", "Setembre",
													"Octubre", "Novembre", "Desembre");
		
		months.stream().forEach(System.out::println);
		
	}

}

