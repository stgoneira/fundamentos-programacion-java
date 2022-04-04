import java.util.Arrays;
import java.util.ListIterator;
import java.util.Vector;

public class Listas {

    public static void main(String[] args) {
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