package n3exercici1;
import java.util.ArrayList;

public class GestioButaques {

	protected ArrayList <Butaca> butaques;

	public GestioButaques() {
		this.butaques = new ArrayList<>();
	}

	public ArrayList<Butaca> getButaques() {
		return butaques;
	}

	
	public boolean afegirButaca(Butaca b1) {
		boolean afegir=false;
		try {
			if (cercarButaca(b1.getNumFila(),b1.getNumSeient())!=-1) {
				throw new ExcepcioButacaOcupada();
			} else {
				butaques.add(b1);
				afegir=true;
			}
		} catch (ExcepcioButacaOcupada e) {
			System.out.println(e.getMessage());
		}
		
		return afegir;
	}
	
	public int cercarButaca(int fila, int seient) {
		int posicionIndice=-1;
		for (int i=0; i<butaques.size();i++) {
			if (fila==butaques.get(i).getNumFila() && seient==butaques.get(i).getNumSeient()) {
				posicionIndice=i;
			}
		}
		return posicionIndice;
	}
	
	public void eliminarButaca(int numFila, int numSeient) {
		try {
			for (int i=0; i<butaques.size();i++) {
				if (numFila==butaques.get(i).getNumFila() && numSeient==butaques.get(i).getNumSeient()) {
					butaques.remove(i);
				} else {
					throw new ExcepcioButacaLliure();
				}
			}
		} catch (ExcepcioButacaLliure e) {
			System.out.println(e.getMessage());
		}
		
	}
}
