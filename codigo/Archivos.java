package codigo;

import java.io.File;
import java.util.Map;
import java.util.Properties;

public class Archivos {
    public static void main(String[] args) { 
        // carpetaHome();
        //archivoOCarpeta();
        // listadoHomeDir();
        //listadoPropiedades();
    }

    private static void listadoPropiedades() {
        Properties props = System.getProperties();
        for( Map.Entry<Object,Object> prop : props.entrySet() ) {
            System.out.printf("Propiedad: %s Valor: %s %n", prop.getKey(), prop.getValue() );
        }
    }

    private static void listadoHomeDir() {
        String rutaDirectorioUsuario = System.getProperty("user.home");
        File directorioUsuario   = new File( rutaDirectorioUsuario );
        String[] listadoArchivos = directorioUsuario.list();

        for( String archivo : listadoArchivos) {
            System.out.printf("%s %n", archivo);
        }
    }

    private static void carpetaHome() {
        titulo("carpetaHome()", 20);

        String userHome = System.getProperty("user.home");
        System.out.printf("userHome: %s %n%n", userHome);
    }

    private static void titulo(String titulo, int largoSubrayado) {
        System.out.printf("%n %s %n", titulo);
        String subrayado = "=".repeat(largoSubrayado);
        System.out.printf("%s %n%n", subrayado);
    }

    private static void archivoOCarpeta() {
        titulo("archivoOCarpeta()", 20);

        File directorioActual    = new File(".");
        String[] listadoArchivos = directorioActual.list();

        for( String archivoStr : listadoArchivos) {
            File archivo = new File(archivoStr);
            if( archivo.isFile() ) {
                System.out.printf("Archivo: %s %n", archivoStr);
            }
            
            if( archivo.isDirectory() ) {
                System.out.printf("Directorio: %s %n", archivo);
            }
        }

        System.out.printf("%n%n");
    }
}
