package n1exercici1;

public class Viento extends Instrumentos {

	public Viento(String nombre, int precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de viento");	}

}
