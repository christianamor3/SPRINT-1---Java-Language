package n2exercici3;

public class App {

	public static void main(String[] args) {

		Operacio suma = (a, b) -> {
			return a+b;
		};
		
		System.out.println("El resultat de la suma es " + suma.operacio(5,7));
	
		Operacio resta = (a, b) -> {
			return a-b;
		};
		
		System.out.println("El resultat de la resta es " + resta.operacio(5,7));
		
		Operacio multiplicacio= (a, b) -> {
			return a*b;
		};
		
		System.out.println("El resultat de la multiplicacio es " + multiplicacio.operacio(5,7));
		
		Operacio divisio = (a, b) -> {
			return a/b;
		};
		
		System.out.println("El resultat de la divisio es " + divisio.operacio(5,7));
	
	}
	
	

}
