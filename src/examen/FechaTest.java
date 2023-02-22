package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Fecha f=new Fecha();

	@Test
	void CP1() {
		boolean esperada=true;
		boolean obtenida=f.validarFecha(2002, 2, 2);
		assertEquals(esperada, obtenida);
	}

	@Test
	void CP2() {
		boolean esperada=true;
		boolean obtenida=f.validarFecha(2004, 4, 4);
		assertEquals(esperada, obtenida);
	}
	
	@Test
	void CP3() {
		boolean esperada=true;
		boolean obtenida=f.validarFecha(2007, 7, 7);
		assertEquals(esperada, obtenida);
	}
	
	@Test
	void CP4() {
		boolean esperada=false;
		boolean obtenida=f.validarFecha(2000, 95, 84);
		assertEquals(esperada, obtenida);
	}
}
