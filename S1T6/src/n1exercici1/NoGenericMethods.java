package n1exercici1;

public class NoGenericMethods {

	String nom;
	String cognom;
	String DNI;
	
	public NoGenericMethods(String nom, String cognom, String DNI) {
		this.nom = nom;
		this.cognom = cognom;
		this.DNI = DNI;
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
	public final String getDNI() {
		return DNI;
	}
	public final void setDNI(String dNI) {
		DNI = dNI;
	}
	
	
	
	
}
