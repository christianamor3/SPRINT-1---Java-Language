package n1exercici1;

public class Percusion extends Instrumentos {

	public Percusion(String nombre, int precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de percusion");	}

	public static void demostracionEstatica() {
		System.out.println("Estoy cargando la clase percusion accediendo a un miembro estatico");
	}
}

