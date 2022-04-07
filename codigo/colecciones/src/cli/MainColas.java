package cli;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MainColas {

	public static void main(String[] args) {
		// COLA FIFO (PRIMERO EN LLEGAR PRIMERO EN SALIR)
		Queue<String> filaSupermercado = new LinkedList<>();
		filaSupermercado.add("Pedro");
		// puedo utilizar offer() o add()
		// la diferencia es que add() lanza una Exception
		// ante cualquier problema 
		// y offer() solo retorna false ante un problema 
		filaSupermercado.offer("Juan");
		filaSupermercado.add("Sergio");
		filaSupermercado.add("Carolina");
		
		// mostrar estado antes de sacar elemento de la cola
		System.out.println( filaSupermercado );   
		String persona = filaSupermercado.poll(); // SACANDO A ALGUIEN DE LA COLA
		
		//System.out.printf("Atendiendo a %s .... %n", persona);
		System.out.println("Atendiendo a "+persona+"..."); // lo mismo que lo anterior
		
		System.out.println( filaSupermercado );
		persona = filaSupermercado.remove();
		System.out.printf("Atendiendo a %s .... %n", persona);
		System.out.println( filaSupermercado );
		
		System.out.println( filaSupermercado );
		persona = filaSupermercado.remove();
		System.out.printf("Atendiendo a %s .... %n", persona);
		System.out.println( filaSupermercado );
		
		System.out.println( filaSupermercado );
		persona = filaSupermercado.remove();
		System.out.printf("Atendiendo a %s .... %n", persona);
		System.out.println( filaSupermercado );
				
		// si me gusta escribir mi codigo 
		// usando Exceptions 
		try {
			System.out.println( filaSupermercado );
			persona = filaSupermercado.remove();
			System.out.printf("Atendiendo a %s .... %n", persona);
			System.out.println( filaSupermercado );	
		} catch (NoSuchElementException e) {
			System.out.println("Ya se atendieron a todos los clientes que estaban en la fila.");
		}
		
		// si me gusta usar estructuras condicionales		
		if( filaSupermercado.size() > 0 ) {
			System.out.println( filaSupermercado );
			persona = filaSupermercado.poll();
			System.out.printf("Atendiendo a %s .... %n", persona);
			System.out.println( filaSupermercado );	
		}
		
		// también puedo hacerlo así:
		System.out.println( filaSupermercado );
		persona = filaSupermercado.poll();
		if( persona != null ) {
			System.out.printf("Atendiendo a %s .... %n", persona);
			System.out.println( filaSupermercado );	
		}

	}

}
