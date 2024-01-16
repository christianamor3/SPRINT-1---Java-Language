package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class n1ex1test {

	App app = null;
	ArrayList<String> mesosAny = null;
	
	@BeforeEach
	public void setTestUp() {
		app = new App();
		mesosAny = app.getListaMesosAny();
	}
	
	
	@Test
	void mesosAnyHauriaDeTenir12posicions() {
		assertEquals(12, mesosAny.size());
		
	}
	
	@Test
	void mesosAnyNoEsNula() {
		assertNotNull(mesosAny);
		
	}
	
	@Test
	void agostEnPosicio8() {
		assertEquals("Agost", mesosAny.get(7));
		
	}


}
