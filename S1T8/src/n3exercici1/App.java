package n3exercici1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Alumne> alumnes = new ArrayList<>();
		
		alumnes.add(new Alumne("Christian", 25, "JAVA", 7.5));
		alumnes.add(new Alumne("Claudia", 26, "PHP", 8.5));
		alumnes.add(new Alumne("Juan", 16, "JAVA", 7));
		alumnes.add(new Alumne("Pedro", 22, "JAVA", 7.2));
		alumnes.add(new Alumne("Ariadna", 25, "PHP", 4));
		alumnes.add(new Alumne("Alex", 19, "PHP", 6));
		alumnes.add(new Alumne("Bran", 25, "JAVA", 9));
		alumnes.add(new Alumne("Andreu", 18, "JAVA", 8));
		alumnes.add(new Alumne("Wendy", 23, "PHP", 8.3));
		alumnes.add(new Alumne("Aleix", 29, "PHP", 6.5));
		
		System.out.println("Llista tots els alumnes");
		nomiEdat(alumnes);
		System.out.println("----------");
		System.out.println("Començen per A");
		ArrayList<Alumne> començaPerA = començaPerA(alumnes);
		for (Alumne alm : començaPerA) {
			System.out.println(alm.getNom());
		}
		System.out.println("----------");
		System.out.println("Nota igual o superior a 5");
		notaIgualOSuperiorA5(alumnes);
		System.out.println("----------");
		System.out.println("Nota igual o superior a 5 i que no son de PHP");
		notaIgualOSuperiorA5NoSonPHP(alumnes);
		System.out.println("----------");
		System.out.println("Alumnes JAVA majors d'edat");
		alumnesJavaMajors18(alumnes);
	}
	
	private static void nomiEdat (ArrayList<Alumne> alumnes){
		alumnes.stream().forEach(alm -> System.out.println(alm.getNom() + " - " + alm.getEdat() ));;
	}
	
	private static ArrayList<Alumne> començaPerA (ArrayList<Alumne> alumnes){
		ArrayList<Alumne> començaPerA = new ArrayList<>(alumnes.stream()
													.filter(alm -> alm.getNom().startsWith("A")).collect(Collectors.toList()));
		return començaPerA;	
	}
	
	private static void notaIgualOSuperiorA5 (ArrayList<Alumne> alumnes){
		alumnes.stream().filter(alm -> alm.getNota()>=5)
									.forEach(alm -> System.out.println(alm.getNom() + " - " + alm.getNota() ));;

	}
	
	private static void notaIgualOSuperiorA5NoSonPHP (ArrayList<Alumne> alumnes){
		alumnes.stream().filter(alm -> alm.getNota()>=5)
										.filter(alm -> !alm.getCurs().equalsIgnoreCase("PHP"))
										.forEach(alm -> System.out.println(alm.getNom() + " - " + alm.getCurs() ));;
	
	}
	
	public static void alumnesJavaMajors18 (ArrayList<Alumne> alumnes){
		alumnes.stream().filter(alm -> alm.getCurs().equalsIgnoreCase("JAVA"))
								.filter(alm -> alm.getEdat()>=18)
										.forEach(alm -> System.out.println(alm.getNom() + " - " + alm.getCurs() + " - " + alm.getEdat()));;
		
	}

}
