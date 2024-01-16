package n2exercici1;

import java.io.Serializable;

public class Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String nom;
	private String cognom;
	
	public Persona(String nom, String cognom) {
		this.nom = nom;
		this.cognom = cognom;
	}
	
	
	
}
