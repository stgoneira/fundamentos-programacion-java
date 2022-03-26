import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List; 
import java.util.ArrayList;

public class MakeIndex {
    public static void main(String[] args) {
        final String baseUrl                = "https://stgoneira.github.io/fundamentos-programacion-java/ppt/";

        File directorioActual               = new File(".");
        final String[] listadoArchivos      = directorioActual.list();
        final List<String> noInteresan      = Arrays.asList( new String[]{"sesiones", "MakeIndex.java", "README.md"} );
        List<String> ppts                   = new ArrayList<>( Arrays.asList(listadoArchivos) );
        ppts.removeAll( noInteresan );

        StringBuilder readmeBuilder = new StringBuilder();
        for(String ppt : ppts) {
            final String url = baseUrl + ppt;
            readmeBuilder.append( String.format("- [%s](%s) %n", ppt, url) );
        }
        final String readme = readmeBuilder.toString();

        try {
            FileWriter writer = new FileWriter("./README.md");
            writer.write(readme);
            writer.close();
        } catch(IOException ioe) {
            System.out.println("Falló al escribir el archivo.");
        }
    }

}