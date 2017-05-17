package Ejercicio3;

import junit.framework.TestCase;

import org.junit.Test;

public class FechaTest extends TestCase {
/* Escribe las pruebas para comprobar:
* - Para una fecha correcta
* - Pon dos meses que estén mal
* - Pon dos días que estén mal
* - Que el més de noviembre tiene día 31
* - Que el més de diciembre tiene día 31
* - Que el mes de febrero tiene día 30
* - Que el 29 de febrero existe para 2008 (que es bisiesto)
* - Que el 29 de febrero no existe para un año que no sea
bisiesto
* - Comprobar que el año 1900 es bisiesto
*/

	Fecha f = new Fecha(1, 1, 2000);
	Fecha fmdia1 = new Fecha(200, 1, 2000);
	Fecha fmdia2 = new Fecha(37, 1, 2000);
	Fecha fmmes1 = new Fecha(1, 27, 2000);
	Fecha fmmes2 = new Fecha(1, 185, 2000);
	Fecha noviembre = new Fecha(31, 11, 2000);
	Fecha diciembre = new Fecha(31, 12, 2000);
	Fecha febrero30 = new Fecha(30, 2, 2000);
	Fecha febrero29bien = new Fecha(29, 2, 2008);
	Fecha febrero29 = new Fecha(29, 2, 2007);
	Fecha bisiesto = new Fecha(29, 2, 1900);
	
	@Test
	public void testValida() {
	/* Para cada una de las fechas creadas anteriormente, hacer
	las comprobaciones
	* utilizando el método más adecuado para el caso
	*/
		assertTrue("Fecha correcta", f.valida());
		assertFalse("Fecha dia incorrecta 1", fmdia1.valida());
		assertFalse("Fecha dia incorrecta 2", fmdia2.valida());
		assertFalse("Fecha mes incorrecta 1", fmmes1.valida());
		assertFalse("Fecha mes incorrecta 2", fmmes2.valida());
		assertFalse("Fecha noviembre incorrecta", noviembre.valida());
		assertTrue("Fecha diciembre correcta", diciembre.valida());
		assertFalse("Fecha diciembre correcta", febrero30.valida());
		assertTrue("Fecha diciembre correcta", febrero29bien.valida());
		assertFalse("Fecha diciembre correcta", febrero29.valida());
		assertFalse("Fecha diciembre correcta", bisiesto.valida());
	}
	}