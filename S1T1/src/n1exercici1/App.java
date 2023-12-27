package n1exercici1;

public class App {

	public static void main(String[] args) {

		Viento flauta = new Viento("flauta", 50);
		flauta.tocar();
		
		Cuerda guitarra = new Cuerda("Guitarra", 150);
		guitarra.tocar();
		
		Percusion.demostracionEstatica();
		
		Percusion bateria = new Percusion("Bateria", 500);
		bateria.tocar();
	}

}
