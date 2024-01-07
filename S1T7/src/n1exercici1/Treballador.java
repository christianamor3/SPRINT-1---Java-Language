package n1exercici1;

public class Treballador {

	protected String nom;
	protected String cognom;
	protected int preuHora;
	
	
	public Treballador(String nom, String cognom, int preuHora) {
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}


	public double calcularSou(int numHoresTreballades) {
		return numHoresTreballades*preuHora;
	}
	
}
