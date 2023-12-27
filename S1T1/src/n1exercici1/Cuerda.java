package n1exercici1;

public class Cuerda extends Instrumentos {

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de cuerda");	}


}
