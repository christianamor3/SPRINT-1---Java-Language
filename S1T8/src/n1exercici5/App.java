package n1exercici5;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		GetPiValue getPi = (n1) -> {
			return n1;
		};
		
		System.out.println(getPi.getPiValue(3.1415));
	}
	
	

}
