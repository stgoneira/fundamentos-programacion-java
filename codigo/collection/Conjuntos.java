import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Conjuntos {
    
    public static void main(String[] args) {
        Collection<Integer> conjunto1       = new HashSet<>( Arrays.asList(1, 2, 3, 4, 5) );
        Collection<Integer> conjunto2       = new HashSet<>( Arrays.asList(6, 7, 8, 9, 10) );
        Collection<Integer> conjuntoImpares = new HashSet<>( Arrays.asList(1, 3, 5, 7, 9) );
    
        //conjunto1.addAll( conjunto2 );
        //System.out.printf("conjunto1 UNION conjunto2 = %s %n", conjunto1);

        //conjunto2.retainAll( conjuntoImpares );
        //System.out.printf("conjunto2 INTERSECCION conjuntoImpares = %s %n", conjunto2);

        //conjunto1.removeAll( conjuntoImpares );
        //System.out.printf("conjunto1 DIFERENCIA conjuntoImpares = %s %n", conjunto1);
    }

    

}
