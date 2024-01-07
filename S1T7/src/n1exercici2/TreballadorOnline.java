package n1exercici2;

public class TreballadorOnline extends Treballador {

	private final int internet=50;

	public TreballadorOnline(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
	}

	@Override
	public double calcularSou(int numHoresTreballades) {
		return ((numHoresTreballades*preuHora)+internet);
	}
	
	@Deprecated
	public void decirNombre() {
		System.out.println("Hola me llamo " + nom);
	}
}
