import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Listas {

    public static void main(String[] args) {
        listasConNulosTamanoFijo();
    }

    public static void listasConNulosTamanoFijo() {        
        List<String> asientos = Arrays.asList(new String[5]);
        System.out.println( asientos );
        asientos.set(3, "Roberto");        
        System.out.println( asientos );
        
        asientos.add(null);// NO permite más inserciones
        System.out.println( asientos );
    }

    public static void listasConNulos() {        
        List<String> personas = new ArrayList<>( Arrays.asList(new String[5]) );
        personas.set(1, "Juan");
        personas.add("Sergio"); // agrega un 6to elemento
        System.out.println( personas );
    }

    public static void iterador() {
        Vector<String> nombres = new Vector<>( Arrays.asList("Juan", "Pedro", "Diego", "Ramon") );
        ListIterator<String> iterador = nombres.listIterator();
                
        while( iterador.hasNext() ) {
            String outputPrevio = "";
            if( iterador.hasPrevious() ) {
                outputPrevio = String.format("| Elemento Anterior: %s", iterador.previous() );
                iterador.next();
            } 
            
            String nombre = iterador.next();
            System.out.printf("Elemento actual %s %s %n", nombre, outputPrevio);
        }
    }

}