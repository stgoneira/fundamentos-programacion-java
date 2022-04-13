package validaciones;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		// validacioneEntreValoresPermitidos();
		// validacionTelefono();
		validacionFechas();
	}
	
	public static void validacionFechas() {
		// contexto: fecha ingresada por el usuario
		// suponemos que ud. limpio los Strings y 
		// los convirtió a números enteros 
		int anno = 2022;
		int mes = 2;
		int dia = 29;
		
		try {
			LocalDate fecha = LocalDate.of(anno, mes, dia);
			// procesamiento de la fecha
			// ej. guardar en BD u otra cosa 
			System.out.println("procesando la fecha....");
		} catch (Exception e) {
			System.out.println("Fecha inválida!!!!!");
		}
		
	}
	
	public static void validacionTelefono() {
		String telefonoIngresadoPorUsuario = " 9 ab44 5646 ";
		//String telefonoIngresadoPorUsuario = " 9 5544 5646 ";
		
		// también existe el método strip() para limpiar los espacios delanteros y traseros 
		String telefonoLimpioDeEspacios = telefonoIngresadoPorUsuario.strip().replace(" ", "");
		int largoTelefono = telefonoLimpioDeEspacios.length();
		
		if( largoTelefono == 9 && telefonoLimpioDeEspacios.matches("[0-9]{9}") ) {
			System.out.println("Teléfono correcto");
		} else {
			System.out.println("Teléfono incorrecto");
		}
	}
	
	public static void validacioneEntreValoresPermitidos() {
		Collection<String> valoresPermitidos = Arrays.asList("BMW", "Audi", "Mercedes");
		String valorIngresadoPorUsuario = "Toyota";
		boolean marcaPermitida = valoresPermitidos.contains( valorIngresadoPorUsuario );
		
		if( marcaPermitida ) {
			System.out.println("Hacer mantención....");
		} else {
			System.out.println("Lo lamentamos esta marca no está soportada por nuestro concesionario....");
		}
	}

}
