import java.util.Comparator;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Orden {
    public static void main(String[] args) {
        // seteo el locale para Chile
        // para que el separador de miles sea un punto 
        Locale.setDefault(new Locale("es", "CL"));

        //Exception in thread "main" java.lang.ClassCastException: class Persona cannot be cast to class java.lang.Comparable
        //SortedSet<Persona> personas = new TreeSet<>( );

        // Forma corta para definir un orden 
        //SortedSet<Persona> personas = new TreeSet<>( Comparator.comparing(Persona::getNombre) );
        SortedSet<Persona> personas = new TreeSet<>( Comparator.comparing(Persona::getRut) );        
        // si tuviera nulos puedo hacer: Comparator.nullsFirst(Comparator.comparing(String::length))
        
        Persona arnaldo  = new Persona(9855322, '9', "Arnaldo Torres");
        Persona carolina = new Persona(13345987, '1', "Carolina Vargas");

        personas.add( new Persona(12345678, '5', "Juan Perez") );
        personas.add( new Persona(8765432, 'k', "Ramon Soto") );
        personas.add( carolina );
        personas.add( new Persona(5498712, '2', "Julieta Becerra") );
        personas.add( arnaldo );
        // ignorada si el Comparator es por el RUT 
        personas.add( new Persona(5498712, '2', "Juana Perez") );
        personas.add( new Persona(20322666, '1', "Jorge Luna") );

        System.out.printf("%n%nTreeSet<Persona> ordenadoPorRUT %n%s%n%n", "=".repeat(35));
        personas.forEach( System.out::println );

        NavigableSet<Persona> personasOrdenDesc = ((NavigableSet) personas).descendingSet();
        System.out.printf("%n%nNavigableSet<Persona> ordenadoPorRUTDesc %n%s%n%n", "=".repeat(35));
        personasOrdenDesc.forEach( System.out::println );
        
        // headSet()
        System.out.printf("%n%nheadSet()%n%s%n%n", "=".repeat(15));
        personas.headSet(arnaldo).forEach(System.out::println);

        // subSet()
        System.out.printf("%n%nsubSet() %n%s%n%n", "=".repeat(15));
        personas.subSet(arnaldo, carolina).forEach(System.out::println);

        // tailSet()
        System.out.printf("%n%ntailSet() %n%s%n%n", "=".repeat(15));
        personas.tailSet(arnaldo).forEach(System.out::println);

        System.out.printf("%n%n");
    }
}

class Persona {
    protected int rut;
    protected char dv;
    protected String nombre;

    public Persona(int rut, char dv, String nombre) {
        this.rut    = rut;
        this.dv     = dv;
        this.nombre = nombre;
    }
    
    public int getRut(){return rut;}
    public char getDv(){return dv;}
    public String getNombre(){return nombre;}

    @Override
    public String toString() {
        //%,d - separador de miles 
        return String.format("%,d-%s %s", rut, dv, nombre);
    }
}
