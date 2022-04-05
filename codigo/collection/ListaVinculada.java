import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListaVinculada {
    
    public static void main(String[] args) {
        Set<String> lenguajes = new LinkedHashSet<>();
        lenguajes.add("Java");
        lenguajes.add("JS");
        lenguajes.add("Java"); // retorna => false 
        lenguajes.add( null ); // permite NULOS 
        lenguajes.add("Ruby"); 

        // LinkedHashSet mantiene el orden de inserción
        // [Java, JS, null, Ruby]
        System.out.println( lenguajes );


        // IMPLEMENTACION HASHSET
        lenguajes = new HashSet<>();
        lenguajes.add("Java");
        lenguajes.add("JS");
        lenguajes.add("Java"); // retorna => false 
        lenguajes.add( null ); // permite NULOS 
        lenguajes.add("Ruby"); 
        // HashSet no asegura el mismo orden de inserción 
        // [null, Java, JS, Ruby] 
        System.out.println( lenguajes );
    }

}
