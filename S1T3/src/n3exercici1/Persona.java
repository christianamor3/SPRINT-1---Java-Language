package n3exercici1;

import java.util.Objects;

public class Persona implements Comparable<Persona>{

	private String nom;
	private String cognom;
	private String DNI;
	
	public Persona(String nom, String cognom, String DNI) {
		this.nom = nom;
		this.cognom = cognom;
		this.DNI = DNI;
	}
	
	
	
	public final String getNom() {
		return nom;
	}

	public final String getCognom() {
		return cognom;
	}

	public final String getDNI() {
		return DNI;
	}



	public String pasarDatosCSV() {
		return this.nom+","+this.cognom+","+this.DNI;
	}


	@Override
	public String toString() {
		return "nom=" + nom + " cognom=" + cognom + " DNI=" + DNI;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(nom, cognom, DNI);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return Objects.equals(nom, persona.nom) && Objects.equals(cognom, persona.cognom) && Objects.equals(DNI, persona.DNI);
    }
    
    @Override
    public int compareTo(Persona p1) {
        // Comparación por nombre
        int comparacionPorNombre = this.nom.compareTo(p1.nom);
        if (comparacionPorNombre != 0) {
            return comparacionPorNombre;
        }

        // Si los nombres son iguales, compara por apellidos
        int comparacionPorCognom = this.cognom.compareTo(p1.cognom);
        if (comparacionPorCognom != 0) {
            return comparacionPorCognom;
        }

        // Si los apellidos son iguales, compara por DNI
        return this.DNI.compareTo(p1.DNI);
    }
	
	
}
