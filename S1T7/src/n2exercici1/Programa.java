package n2exercici1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Programa {

	public static void programa() {

		ClaseSerialitzadora clase = new ClaseSerialitzadora();
		
		if (clase.getClass().isAnnotationPresent(Serialitzador.class)) {
			
			Persona persona1 = new Persona("Christian", "Amor");
			
			Serialitzador annotation = clase.getClass().getAnnotation(Serialitzador.class);
			String directorio = annotation.directorio();
			
			serializar(directorio, persona1);
			
		}
	}	
	
	private static void serializar(String ruta, Persona persona1) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(ruta);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(persona1);
			System.out.println("Archivo serializado correctamente");
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
