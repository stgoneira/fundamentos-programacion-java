package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static Connection getConexion() throws SQLException {
		// debemos configurar las variables de ambiente en el Sistema Operativo
		// serían: hostdb, userdb y passworddb
		String hostBd = System.getenv("hostdb");
		String usuario = System.getenv("userdb");
		String urlBd = String.format("jdbc:postgresql://%s:5432/%s", hostBd, usuario);
		System.out.println(urlBd);
		String password = System.getenv("passworddb");
		return DriverManager.getConnection(urlBd, usuario, password);
	}
	
	public static void main(String[] args) {
		//crearTabla();
		ejemploSelect();
	}
	
	public static void crearTabla() {
		try (
			Connection conexion 	= getConexion();
			Statement declaracion 	=  conexion.createStatement();				
		){
			String sql = "CREATE TABLE prueba(id smallserial, nombre char(20))";
			declaracion.execute( sql );
			
			System.out.printf("Se creó correctamente la tabla prueba.");						
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public static void ejemploUpdate() {
		try (
			Connection conexion 			= getConexion();
			PreparedStatement declaracion 	= conexion.prepareStatement("UPDATE alumnos SET carrera = 'Java'");			
		){
			int filasActualizadas = declaracion.executeUpdate();
			
			System.out.printf("Se actualizaron correctamente %d fila(s).", filasActualizadas);						
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public static void ejemploDelete() {
		try (
			Connection conexion 			= getConexion();
			PreparedStatement declaracion 	= conexion.prepareStatement("DELETE FROM alumnos WHERE id = ?");			
		){	
			int alumnoIdABorrar = 5; 
			declaracion.setInt(1, alumnoIdABorrar);
			int filasBorradas = declaracion.executeUpdate();
			
			System.out.printf("Se borró correctamente %d fila(s).", filasBorradas);						
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public static void ejemploInsert() {
		try (
			Connection conexion 			= getConexion();
			PreparedStatement declaracion 	= conexion.prepareStatement("INSERT INTO alumnos(nombre, carrera) VALUES(?, ?)");			
		){
	
			declaracion.setString(1, "Homero Simpsons");
			declaracion.setString(2, "Seguridad Nuclear");
			int filasInsertadas = declaracion.executeUpdate();
			
			System.out.printf("Se insertó correctamente %d fila(s).", filasInsertadas);
			
			// Statement es vulnerable a SQL Injection si no lo utilizamos de buena manera
			// por eso es mejor utilizar PreparedStatement 
			/* ejemplo de inyección SQL considerando que usuario y contrasena vienen desde un formulario
			 * u otra fuente externa 
			* String usuario = "abcd";
			* String contrasena = "'; DROP table usuarios;";
			* Statement declaracion = conexion.createStatement();
			* declaracion.executeQuery( String.format("SELECT COUNT(*) FROM usuarios WHERE username = '%s' AND password = '%s'", usuario, contrasena) );
			*/
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public static void ejemploSelect() {		
		// try with resources 
		try (
			// Connection, Statement y ResultSet implementan AutoCloseable
			// por lo que puedo utilizarlas dentro de los paréntesis 
			Connection conexion 	= getConexion();
			Statement declaracion 	= conexion.createStatement();
			ResultSet rsAlumnos 	= declaracion.executeQuery("SELECT id, nombre, carrera FROM alumnos");
		){
			while( rsAlumnos.next() ) {
				int id 			= rsAlumnos.getInt("id");
				String nombre 	= rsAlumnos.getString("nombre");
				String carrera  = rsAlumnos.getString("carrera");
				
				System.out.printf("ID: %d Nombre: %s Carrera: %s %n", id, nombre, carrera);
			}
			
			// con try with resources 
			// se llama automáticamente al método close()
			// una vez finalizado el bloque 
			//conexion.close(); // <- nos evitamos esto
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
