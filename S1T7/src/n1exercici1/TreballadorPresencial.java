package n1exercici1;

public class TreballadorPresencial extends Treballador{

	private static int benzina=100;
	
	public TreballadorPresencial(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
	}
	
	@Override
	public double calcularSou(int numHoresTreballades) {
		return ((numHoresTreballades*preuHora)+benzina);
	}
	
}
