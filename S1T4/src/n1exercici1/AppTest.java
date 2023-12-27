package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void mesosAnyHauriaDeTenir12posicions() {
		App app = new App();
		ArrayList<String> mesosAny = app.getListaMesosAny();
		
		assertEquals(12, mesosAny.size());
		
	}
	
	@Test
	void mesosAnyNoEsNula() {
		App app = new App();
		ArrayList<String> mesosAny = app.getListaMesosAny();
		
		assertNotNull(mesosAny);
		
	}
	
	@Test
	void agostEnPosicio8() {
		App app = new App();
		ArrayList<String> mesosAny = app.getListaMesosAny();
		
		assertEquals("Agost", mesosAny.get(7));
		
	}


}
