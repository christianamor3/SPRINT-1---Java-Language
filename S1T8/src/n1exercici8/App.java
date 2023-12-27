package n1exercici8;

public class App {

	public static void main(String[] args) {

		Reverse reverse = (String) -> {
			String palabraReves = "";
			for (int i = String.length()-1; i>=0;i--) {
				palabraReves +=String.charAt(i);
			}
			return palabraReves;
		};
		
		System.out.println(reverse.reverse("Hola Mundo"));
	}

}
