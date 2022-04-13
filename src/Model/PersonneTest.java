package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonneTest {

	@Test
	void Cordonnes() {
		Personne pe = new Personne(19915462, "bel", "dingus", "11-02-2022");
		assertTrue("bel"==pe.getNom());
		assertTrue("dingus"==pe.getPrenom());
		assertTrue(19915462==pe.getNumero_secu());	
		
		
	}


}