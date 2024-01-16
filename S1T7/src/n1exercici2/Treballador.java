package n1exercici2;

public class Treballador {

	protected String nom;
	protected String cognom;
	protected int preuHora;
	
	
	protected Treballador(String nom, String cognom, int preuHora) {
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}


	protected double calcularSou(int numHoresTreballades) {
		return numHoresTreballades*preuHora;
	}
	
}
