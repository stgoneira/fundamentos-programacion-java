import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListaVinculada {
    
    public static void main(String[] args) {
        Set<String> lenguajes1 = new LinkedHashSet<>();
        lenguajes1.add("Java");
        lenguajes1.add("JS");
        lenguajes1.add("Java"); // retorna => false 
        lenguajes1.add( null ); // permite NULOS 
        lenguajes1.add("Ruby"); 

        // LinkedHashSet mantiene el orden de inserción
        // [Java, JS, null, Ruby]
        System.out.print("set1 = ");
        System.out.println( lenguajes1 );


        // IMPLEMENTACION HASHSET
        Set<String> lenguajes2 = new HashSet<>();
        lenguajes2.add("Java");
        lenguajes2.add("JS");
        lenguajes2.add("Java"); // retorna => false 
        lenguajes2.add( null ); // permite NULOS 
        lenguajes2.add("Ruby"); 
        // HashSet no asegura el mismo orden de inserción 
        // [null, Java, JS, Ruby] 
        System.out.print("set2 = ");
        System.out.println( lenguajes2 );
        System.out.printf("set1 == set2 => %s %n", lenguajes1.equals(lenguajes2));
        System.out.printf("set2 == set1 => %s %n", lenguajes2.equals(lenguajes1));
    }

}
