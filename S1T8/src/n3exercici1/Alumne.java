package n3exercici1;

public class Alumne {

	private String nom;
	private int edat;
	private String curs;
	private double nota;
	
	public Alumne(String nom, int edat, String curs, double nota) {
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = nota;
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}

	public final int getEdat() {
		return edat;
	}

	public final void setEdat(int edat) {
		this.edat = edat;
	}

	public final String getCurs() {
		return curs;
	}

	public final void setCurs(String curs) {
		this.curs = curs;
	}

	public final double getNota() {
		return nota;
	}

	public final void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
}
