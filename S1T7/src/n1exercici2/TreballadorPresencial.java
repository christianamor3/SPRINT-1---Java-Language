package n1exercici2;

public class TreballadorPresencial extends Treballador{

	private static int benzina=100;
	
	public TreballadorPresencial(String nom, String cognom, int preuHora) {
		super(nom, cognom, preuHora);
	}
	
	@Override
	public double calcularSou(int numHoresTreballades) {
		return ((numHoresTreballades*preuHora)+benzina);
	}
	
	@Deprecated
	public void decirGastoDeGasolina() {
		System.out.println("Este mes he gastado " + benzina + " € en gasolina");
	}
}
