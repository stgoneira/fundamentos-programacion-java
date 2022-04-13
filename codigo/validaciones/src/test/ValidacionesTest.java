package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import validaciones.Validaciones;

class ValidacionesTest {

	@Test
	void testTelefonoValido() {
		assertTrue( Validaciones.telefonoValido("   9 5422 44 66      ") );
		assertFalse( Validaciones.telefonoValido("   9 54aa 44 66      ") );
		assertFalse( Validaciones.telefonoValido("8855 4444") );
	}
	
	@Test
	void testEmailValido() {
		assertTrue( Validaciones.emailValido("abc@123.cl") );
		assertTrue( Validaciones.emailValido("juanperez@terra.cl") );
		assertTrue( Validaciones.emailValido("juan.perez@terra.cl") );
		assertTrue( Validaciones.emailValido("llalala@aiep.com") );
		
		assertFalse( Validaciones.emailValido("juan soto@google.com asdfasdf") );
		assertFalse( Validaciones.emailValido("juan soto@google.com") );
		assertFalse( Validaciones.emailValido("llalalaaiep.com") );
		assertFalse( Validaciones.emailValido("llal@alaaiep") );
		
	}

}
