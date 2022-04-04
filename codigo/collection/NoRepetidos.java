import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NoRepetidos {
    
    public static void main(String[] args) {
        List<String> lenguajesLista = Arrays.asList("Java", "PHP", "Perl", "JS", "Python", "Java", "Ruby");        

        /* 
        Set<String> lenguajes = new HashSet<>( lenguajesLista );
        for( String lenguaje : lenguajes ) {
            System.out.printf("Lenguaje %s %n", lenguaje);
        }*/ 

        Set<String> lenguajes = new HashSet<>( );
        for(String lenguaje : lenguajesLista ) {
            boolean resultadoInsercion = lenguajes.add( lenguaje );
            if( resultadoInsercion ) {
                System.out.printf("Se insertó correctamente el lenguaje %s. %n", lenguaje);
            } else {
                System.out.printf("El lenguaje %s ya estaba en la lista!!!. %n", lenguaje);
            }
        }

        System.out.printf("%n%nLENGUAJES ORDENADOS%n=======================%n");
        Set<String> lenguajesOrdenados = new TreeSet<>( lenguajesLista );
        lenguajesOrdenados.forEach(System.out::println);

        System.out.printf("AUTOS%n=============%n%n");
        Set<Automovil> autos = new TreeSet<>();
        autos.add( new Automovil("XE1234", 3500900) );
        autos.add( new Automovil("XR1884", 5500900) );
        autos.add( new Automovil("ZADW54", 4800900) );
        autos.forEach( a -> System.out.println(a) );

        System.out.printf("%n%nCON COMPARATOR%n==============%n%n");
        Automovil[] autosOrdenados = autos.toArray(new Automovil[autos.size()]);
        Arrays.sort(autosOrdenados, new Comparator<Automovil>() {
            @Override
            public int compare(Automovil auto1, Automovil auto2) {
                if(auto2.getValor() > auto1.getValor()) {
                    return 1;
                } else if(auto2.getValor() < auto1.getValor()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for( Automovil a : autosOrdenados) {System.out.println(a);}
    }

}

class Automovil implements Comparable {
    private String ppu;
    private int valor;

    public Automovil(String ppu, int valor) {
        this.ppu    = ppu;
        this.valor  = valor;
    }

    public int getValor(){return this.valor; }
    public String getPpu(){return this.ppu; }

    @Override
    public String toString() {
        return String.format("PPU: %s | Valor: %d %n", ppu, valor);
    }

    @Override
    public int compareTo(Object o) {        
        if( o instanceof Automovil) {
            Automovil auto = (Automovil) o;
            if( valor >  auto.getValor() ) {
                return 1;
            } else if( valor < auto.getValor()) {
                return -1;
            } else {
                return 0;
            }
        }
        return 0;
    }    
}