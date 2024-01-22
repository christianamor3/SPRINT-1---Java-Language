package n1exercici2;

public class Persona {

	private String nom;
	private String cognom;
	private int edat;
	
	public Persona(String nom, String cognom, int edat) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}

	public final String getCognom() {
		return cognom;
	}

	public final void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public final int getEdat() {
		return edat;
	}

	public final void setEdat(int edat) {
		this.edat = edat;
	}
	
	
	
	
}
