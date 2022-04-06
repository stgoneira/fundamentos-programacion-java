package cli;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainConjuntos {

	public static void main(String[] args) {
		Set<Integer> conjunto1 	= new HashSet( Arrays.asList(1,2,3,4,5) );
		Set<Integer> conjunto2 	= new HashSet( Arrays.asList(6,7,8,9,10) );
		Set<Integer> conjuntoPares = new HashSet( Arrays.asList(2,4,6,8,10) );
		
		/* 
		System.out.println( conjunto1 );
		conjunto1.addAll(conjunto2); // UNION 
		System.out.println( conjunto1 );
		*/ 
		
		/*
		System.out.println( conjunto1 );
		conjunto1.retainAll(conjuntoPares); // INTERSECCION
		System.out.println( conjunto1 );
		*/
		
		System.out.println( conjunto2 );
		conjunto2.removeAll(conjuntoPares); // DIFERENCIA 
		System.out.println( conjunto2 );
		
	}

}
