package n1exercici5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class App {


	public static void main(String[] args) {

		
		Persona persona = new Persona("Christian", "Amor");
	
		// SERIALIZAR
		
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ObjecteSerialitzat.ser"));
			objectOutputStream.writeObject(persona);
			objectOutputStream.close();
		} catch (IOException e) {
			e.getMessage();
		}
			
		// DESERIALIZAR
		
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ObjecteSerialitzat.ser"));
			Persona personaDeserializado = (Persona) objectInputStream.readObject();
			objectInputStream.close();
			System.out.println(personaDeserializado.getNom());
		} catch (IOException e) {
			e.getMessage();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
	}

}
