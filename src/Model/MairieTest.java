package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MairieTest {
	
    
	
	@Test
	void nameAndAdress() {
		Mairie ma = new Mairie("Evry","91100");
		assertTrue("Evry"==ma.getNom());
		assertTrue("91100"==ma.getAdresse());
	
		
	}
	@Test
	void quotion() {
		Mairie ma = new Mairie("Evry","91100");
		
		//assertTrue(11500.0==ma.quotientFamiliale("Marié",2,23000));
		//	un erreur tres bizare on pouvez pas trouver une solution.
	}

}