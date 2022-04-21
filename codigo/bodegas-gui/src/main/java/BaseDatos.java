import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BaseDatos {

	public static Connection getConexion() throws SQLException {
		return DriverManager.getConnection("jdbc:hsqldb:file:mibasedatos", "SA", "");
	}
	
	public static List<Bodega> getBodegas() throws SQLException {
		try (
			Connection conexion 	= getConexion();
			Statement declaracion 	= conexion.createStatement();
		){
			String sql = "SELECT * FROM bodegas";
			ResultSet resultado = declaracion.executeQuery(sql);
			
			List<Bodega> bodegas = new ArrayList<>();
			while( resultado.next() ) {
				int id 			= resultado.getInt("id");
				String nombre 	= resultado.getString("nombre");
				boolean estado 	= resultado.getBoolean("estado");
				Bodega bodega 	= new Bodega(id, nombre, estado);
				bodegas.add(bodega);
			}
			return bodegas;
			/*
			bodegas.forEach(b -> System.out.printf("ID: %d Nombre: %s Estado: %s %n"
									, b.getId()
									, b.getNombre()
									, b.isEstado()
			));
			*/
		} catch (SQLException e) {
			throw e;
		}	
	}
	
	public static void insertarBodegas() {
		try (
			Connection conexion 	= getConexion();
			Statement declaracion 	= conexion.createStatement();
		){
			String sql = "INSERT INTO bodegas (id, nombre, estado) VALUES(1, 'A01', 1),(2, 'A02', 1),(3, 'A03', 0),(4, 'A04', 0),(5, 'B01', 1) ";
			int filasInsertadas = declaracion.executeUpdate(sql);
			System.out.printf("Se insertaron %d filas.", filasInsertadas);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public static void crearTabla() {
		try (
			Connection conexion 	= getConexion();
			Statement declaracion 	= conexion.createStatement();
		){
			String sql = "CREATE TABLE bodegas (id INTEGER, nombre CHAR(5), estado BOOLEAN)";
			declaracion.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
