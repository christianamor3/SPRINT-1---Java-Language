package n1exercici5;

public class App {

	public static void main(String[] args) {

		GetPiValue getPi = (n1) -> {
			return n1;
		};
		
		System.out.println(getPi.getPiValue(3.1415));
	}
	
	

}
