package n1exercici2;

public class App {

	public static void main(String[] args) {

	// Accedeixo als metodes static a traves de la classe
	Cotxe.frenar();
	Cotxe.returnMarca();
	Cotxe.returnModel();
	
	
	// Accedeixo als metodes no static creant un objecte de la clase cotxe
	Cotxe cotxe1 = new Cotxe(200);
	cotxe1.accelerar();
	cotxe1.returnPotencia();
	
	
		
	}

}
