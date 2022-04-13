package validaciones;

public class Validaciones {

	public static boolean emailValido(String email) {
		String emailLimpio = email.strip();
		
		// santiago@192.168.1.8
		String regexEmail1 = "^[a-zA-Z0-9_.]+@[a-zA-Z0-9_]+\\.(cl|com)$";
		String regexEmail2 = "";
		
		return emailLimpio.matches(regexEmail1);
	}
	
	public static boolean telefonoValido(String telefono) {
		String telefonoLimpio = telefono.strip().replace(" ", "");
		if( telefonoLimpio.length() == 9 && telefonoLimpio.matches("[0-9]{9}")) {
			return true;
		} else {
			return false;
		}
	}	
	
}
