package cli;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MainColaLifo {

	public static void main(String[] args) {
		// EJEMPLO: LIFO 
		// LAST IN FIRST OUT
		// EL ULTIMO QUE INGRESA ES EL PRIMERO QUE SALE 
		
		// Interface Deque 
		// Double Ended Queue
		Deque<String> productos = new LinkedList<>();
		productos.addAll( 
				Arrays.asList("maquina1", "maquina2", "maquina3", "maquina4") 
		);
		
		// maquina4
		System.out.println(productos);
		String maquina = productos.pollLast();
		System.out.printf("Sacando la %s para el cliente...%n", maquina);
		System.out.println(productos);
		
		System.out.println();
		
		// maquina3 (pero seguirá presente)
		System.out.println(productos);
		maquina = productos.peekLast();
		System.out.printf("Sacando la %s para el cliente...%n", maquina);
		System.out.println(productos);
				
		System.out.println();
		
		System.out.println(productos);
		maquina = productos.pollLast();
		System.out.printf("Sacando la %s para el cliente...%n", maquina);
		System.out.println(productos);
	}

}
