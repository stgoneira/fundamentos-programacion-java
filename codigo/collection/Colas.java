import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        
    }

    public static void colaDequeFifoLifo() {
        // interface Deque (Double Ended Queue)
        // interfaz que permite FIFO y LIFO 
        Deque<String> cola = new LinkedList<>();
        cola.addAll( Arrays.asList("Pedro", "Juan", "Diego", "Ramon") );
        System.out.println( cola );
        System.out.printf("FIFO: %s %n", cola.pollFirst() );
        System.out.printf("LIFO: %s %n", cola.pollLast() );
        System.out.println( cola );

        // Beginning Java 8 - Language Features p. 557 
        // You should use the ArrayDeque
        // as a Deque implementation if you are using a Deque as a LIFO queue (or a stack). The LinkedList implementation
        // performs better if you use a Deque as a FIFO queue (or simply as a Queue
    }

    public static void colaAtiendeClientesMayorSaldo() {
        // Cola para atender a los clientes con mayor saldo 1ero 
        Queue<Persona> cola = new PriorityQueue<>( Comparator.comparing(Persona::getSaldo).reversed() );
        cola.add( new Persona("Juan", 100900) );
        cola.add( new Persona("Ramon", 900800) );
        cola.add( new Persona("Pedro", 500500) );

        System.out.println(cola);
        System.out.println(cola.remove());
        System.out.println(cola);
    }

    public static void metodosLanzanExceptionsYLosQueNO() {
        // ref: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Queue.html 
        // lanzan exception 
        // add() // insertar 
        // remove() // remover 
        // element() // examinar 

        // NO lanzan exception 
        // offer() // insert 
        // poll() // remove
        // peek() // peek 

        Queue<String> cola = new LinkedList<>();
        cola.add("Juanito");
        cola.add("Pedrito");        

        // lanza una exception 
        /*cola.remove();
        cola.remove();
        cola.remove();*/
        
        // NO lanza exception 
        cola.poll();
        cola.poll();
        cola.poll();
        cola.poll();
    }

    public static void colaSimpleFIFO() {
        Queue<String> cola = new LinkedList<>();
        cola.add("Juanito");
        cola.add("Pedrito");
        cola.add("Ramoncito");

        System.out.println( cola );
        while( cola.peek() != null ) {
            String persona = cola.poll();
            System.out.printf("Atendiendo a %s.%n", persona);
            System.out.printf("Quedan por atender: %s.%n", cola);
        }
    }
}

class Persona {
    protected String nombre;
    protected int saldo;

    public Persona(String nombre, int saldo){
        this.nombre = nombre;
        this.saldo  = saldo;
    }

    public int getSaldo(){return saldo;};
    public String getNombre(){return nombre;};

    @Override
    public String toString() {
        return String.format("Nombre: %s Saldo: %d %n", nombre, saldo);
    }
}