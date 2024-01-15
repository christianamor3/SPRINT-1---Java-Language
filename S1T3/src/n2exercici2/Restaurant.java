package n2exercici2;

import java.util.Objects;

public class Restaurant implements Comparable <Restaurant>{

	private String nom;
	private int puntuacio;
	
	public Restaurant(String nom, int puntuacio) {
		super();
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	@Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Restaurant restaurant = (Restaurant) obj;
        return puntuacio == restaurant.puntuacio && Objects.equals(nom, restaurant.nom);
    }
	
    @Override
    public int compareTo(Restaurant other) {
        // Comparació per nom i després per puntuació en ordre ascendent
        int comparacioPerNom = this.nom.compareTo(other.nom);
        if (comparacioPerNom == 0) {
            return Integer.compare(this.puntuacio, other.puntuacio);
        }
        return comparacioPerNom;
    }
	
}
