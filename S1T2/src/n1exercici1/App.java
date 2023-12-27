package n1exercici1;

public class App {

	public static void main(String[] args) {
		
		Venda venda1 = new Venda();
		Venda venda2 = new Venda();
		
		/* Llamo al metodo sin añadir ningun objeto a la lista
		para provocar la primera excepcion */
		
		venda1.calcularTotal();
		
		Producte pr1 = new Producte("Movil", 200);
		Producte pr2 = new Producte("Funda", 10);
		Producte pr3 = new Producte("Casco", 75);
		
		/* Creo objetos de tipo Producte y los añado a la ArrayList
		 , pero provocando una excepcion de IndexOutOfBounds al poner un =.
		 */
		venda1.getProductes().add(pr1);
		venda2.getProductes().add(pr2);
		venda1.getProductes().add(pr3);
		
		venda1.calcularTotal();
		venda2.calcularTotal();
		

	}

}
