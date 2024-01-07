package n2exercici1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) {

		ClaseSerialitzadora clase = new ClaseSerialitzadora();
		
		if (clase.getClass().isAnnotationPresent(Serialitzador.class)) {
			Persona persona1 = new Persona("Christian", "Amor");
			
			Serialitzador annotation = clase.getClass().getAnnotation(Serialitzador.class);
			String directorio = annotation.directorio();
			
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(directorio);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(persona1);
				System.out.println("Archivo serializado correctamente");
				objectOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}		

}
