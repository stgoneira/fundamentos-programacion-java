import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Map;
import java.util.Properties;

public class TrabajoArchivos {

    public static void main(String[] args) {
        // acá invoque el método que desea ejecutar
        crearArchivoCsvDinamico();
    }

    private static void crearArchivoCsvDinamico() {
        String carpetaUsuario          = System.getProperty("user.home");
        String nombreArchivo           = "reporte-20220326.csv";
        String rutaCompletaArchivo     = carpetaUsuario + File.separator + nombreArchivo;
        String contenidoArchivoReporte = generarContenidoArchivoCSV();

        try {
            FileWriter writer = new FileWriter( rutaCompletaArchivo );
            System.out.printf("Escribiendo archivo: %s %n", rutaCompletaArchivo);
            writer.write( contenidoArchivoReporte );
            writer.close();
        } catch(IOException ioe) {
            // mensaje para el usuario
            System.out.println("Hubo un problema al escribir el reporte.");
            System.out.println("Contacte con el administrador.");

            // Por implementar: generar archivo de log
        }
    }

    private static void listarPropiedades() {
        Properties props = System.getProperties();
        for( Map.Entry<Object,Object> prop : props.entrySet() ) {
            System.out.printf("Propiedad: %s Valor: %s %n"
                , prop.getKey(), prop.getValue() );
        }
    }

    // ejemplo5
    private static void rutaDinamicaSegunSistemaOperativo() {
        // Sistemas tipo Windows
        // C:\Users\Santiago\archivo.txt - Windows

        // Sistemas Tipo UNIX
        // /home/santiago/archivo.txt - Linux
        // /Users/santiago - MacOS

        String userHome = System.getProperty("user.home");
        String archivo = userHome + File.separator  + "reportes" + File.separator + "reporte-20220326.csv";
        System.out.printf( "archivo: %s %n", archivo );
    }

    // ejemplo 4
    private static void carpetaHomeUsuarioDinamica() {
        String userHome = System.getProperty("user.home");
        System.out.printf("User Home: %s %n", userHome);
    }

    // ejemplo 3
    private static void esCarpetaOArchivo() {
        File directorioActual    = new File(".");
        String[] listadoArchivos = directorioActual.list();

        for( String archivo : listadoArchivos ) {
            File archivoActual = new File( archivo );

            if( archivoActual.isDirectory() ) {
                System.out.printf("Dir: %s %n", archivo);
            }

            if( archivoActual.isFile() ) {
                System.out.printf("File: %s %n", archivo);
            }

        }
    }

    // ejemplo 2
    private static void mostrarArchivosCarpetaUsuario() {
        // si escribimos de manera literar la ruta
        // debemos ESCAPAR el backslash (\) usando otro
        // backslash (\)
        // la ruta es: C:\Users\Santiago
        File directorioActual    = new File("C:\\Users\\Santiago");
        String[] listadoArchivos = directorioActual.list();

        for( String archivo : listadoArchivos ) {
            System.out.printf("%s %n", archivo);
        }
    }

    // ejemplo 1
    private static void crearArchivoCsv() {
        String nombreArchivo           = "reporte-20220326.csv";
        String contenidoArchivoReporte = generarContenidoArchivoCSV();

        try {
            FileWriter writer = new FileWriter( nombreArchivo );
            writer.write( contenidoArchivoReporte );
            writer.close();
        } catch(IOException ioe) {
            // mensaje para el usuario
            System.out.println("Hubo un problema al escribir el reporte.");
            System.out.println("Contacte con el administrador.");

            // Por implementar: generar archivo de log
        }
    }

    // ejemplo 1
    private static String generarContenidoArchivoCSV() {
        String cabeceraCsv      = "Bodega,Estado,Arrendatario";
        String contenidoArchivo = cabeceraCsv + "\n";
        contenidoArchivo += "bodega1,desocupada,\n";
        contenidoArchivo += "bodega2,ocupada,Juanito Perez\n";
        // abreviación de esto:
        //contenidoArchivo = contenidoArchivo + "bodega2,ocupada,Juanito Perez\n";
        contenidoArchivo += "bodega3,ocupada,Juanito Perez\n";
        return contenidoArchivo;
    }

}
