package ejecicio3examen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class Ejercicio3Test {
	
	@Test
	public void testSemana(){
		assertEquals("lunes", ejercicio3.diaSemana(1));
		assertEquals("martes", ejercicio3.diaSemana(2));
		assertEquals("miercoles", ejercicio3.diaSemana(3));
		assertEquals("jueves", ejercicio3.diaSemana(4));
		assertEquals("viernes", ejercicio3.diaSemana(5));
		assertEquals("sabado", ejercicio3.diaSemana(6));
		assertEquals("domingo", ejercicio3.diaSemana(7));
	}
	
	@Test
	public void testSemanaMal() {
		assertEquals("ERROR", ejercicio3.diaSemana(0));
		assertEquals("ERROR", ejercicio3.diaSemana(9));
		assertEquals("ERROR", ejercicio3.diaSemana(-5));
	}
	
}