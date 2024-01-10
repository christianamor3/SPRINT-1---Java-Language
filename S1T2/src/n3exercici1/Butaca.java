package n3exercici1;

public class Butaca {

	private int numFila;
	private int numSeient;
	private String persona;
	
	public Butaca(int numFila, int numSeient, String persona) {
		this.numFila = numFila;
		this.numSeient = numSeient;
		this.persona = persona;
	}

	protected int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumSeient() {
		return numSeient;
	}

	public void setNumSeient(int numSeient) {
		this.numSeient = numSeient;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}
	
	public boolean equals(Butaca b1, Butaca b2) {
		boolean resposta=false;
		if (b1.numFila==b2.numFila && b1.numSeient==b2.numSeient) {
			System.out.println("Les dues butaques son iguals");
			resposta=true;
		}
		
		return resposta;
	}

	@Override
	public String toString() {
		return "Fila" + numFila + ", Seient" + numSeient + ", persona=" + persona + ".";
	}
	
	
	
}
