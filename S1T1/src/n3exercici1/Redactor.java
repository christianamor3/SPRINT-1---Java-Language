package n3exercici1;

import java.util.ArrayList;

public class Redactor {

	protected String nom;
	protected final String DNI;
	protected int sou;
	protected ArrayList <Noticia> noticies;
	
	public Redactor(String nom, String dNI) {
		this.nom = nom;
		DNI = dNI;
		sou = 1500;
		this.noticies = new ArrayList<>();
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}

	public final String getDNI() {
		return DNI;
	}

	public final ArrayList<Noticia> getNoticies() {
		return noticies;
	}

	public final void setNoticies(ArrayList<Noticia> noticies) {
		this.noticies = noticies;
	}
	
	
	
}
