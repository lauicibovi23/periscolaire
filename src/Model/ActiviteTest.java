package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ActiviteTest {

	@Test
	void initAct() {
		Encadrant e = new Encadrant(1200,"jhon","peter", "1996-05-03", 0765326,"jhon@frougle.com" );
		Activite ac = new Activite("rowboat","2022-02-03", 3, e);
		assertTrue("lee"==ac.modifierNom("lee"));
		assertTrue(165==ac.modifierNombre(165));
		assertTrue(e==ac.modifierProf(e));
	
		
	}


}