package cli;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main2 {

	public static void main(String[] args) {
		List<String> lenguajes = Arrays.asList("PHP", "Java", "JS", "Ruby", "C#");
		
		Iterator<String> iteradorNormal 	= lenguajes.iterator();
				
		while( iteradorNormal.hasNext() ) {
			String lenguaje = iteradorNormal.next();
			System.out.printf("Lenguaje = %s %n", lenguaje);
		}
		
		System.out.println("=====================================");		
		
		ListIterator<String> iteradorLista 	=  lenguajes.listIterator();
		while( iteradorLista.hasNext() ) {
			String lenguajeAnterior = "";
			if( iteradorLista.hasPrevious() ) {
				lenguajeAnterior = String.format("lenguaje anterior = %s", iteradorLista.previous());
				if( iteradorLista.hasNext() ) {
					iteradorLista.next();
				}
			}
			
			String lenguaje = String.format( "Lenguaje = %s", iteradorLista.next() );
			System.out.printf("%s | %s %n", lenguaje, lenguajeAnterior);
		}
	}

}
