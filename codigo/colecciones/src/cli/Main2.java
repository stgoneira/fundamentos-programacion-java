package cli;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main2 {

	public static void main(String[] args) {
		List<String> lenguajes = Arrays.asList("PHP", "Java", "JS", "Ruby", "C#");
		
		Iterator<String> iteradorNormal 	= lenguajes.iterator();
		ListIterator<String> iteradorLista 	=  lenguajes.listIterator();
		
		while( iteradorNormal.hasNext() ) {
			String lenguaje = iteradorNormal.next();
			System.out.printf("Lenguaje = %s %n", lenguaje);
		}
		
		System.out.println("=====================================");
		
		while( iteradorLista.hasNext() ) {
			String lenguaje = iteradorLista.next();
			System.out.printf("Lenguaje = %s", lenguaje);
			
			String lenguajeAnterior = iteradorLista.previous();
			System.out.printf("| Lenguaje Anterior = %s %n", lenguajeAnterior);
			
			iteradorLista.next();
		}
	}

}
