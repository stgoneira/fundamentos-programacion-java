package cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import modelo.Automovil;
import modelo.Terrestre;

public class Main {

	public static void main(String[] args) {
		// polimorfismo 
		Collection<String> lenguajes = Arrays.asList("Java", "Go", "PHP", "JS", "Ruby");
		// lenguajes.forEach( System.out::println );
		
		// LAMBDA 
		// Forma 1: parametro -> valorRetorno 
		// Forma 2: (parametro) -> valorRetorno
		// Forma 3: (param1, param2) -> valorRetorno 
		// Forma 4: param -> {expresion1; return expresion2;}
		lenguajes
			.stream()
			.filter( lenguaje -> lenguaje.startsWith("J") )
			.forEach( System.out::println )
		;
	
		// Si quiere guardar la lista de elementos filtrados en una variable 
		List<String> lenguajesComienzanJ =  lenguajes
			.stream()
			.filter( lenguaje -> lenguaje.startsWith("J") )
			.toList()
		;
		
		// esto sería lo mismo
		/* 
		lenguajesComienzanJ.clear();
		for( String lenguaje : lenguajes ) {
			if( lenguaje.startsWith("J") ) {
				lenguajesComienzanJ.add(lenguaje);
			}
		}
		*/ 
		
		// Wrapper Classes 
		// =============== 
		// Float -> float 
		// Integer -> int 
		// Double -> double
		// .... 
		
		// Las clases pertenecientes a la API Collection solo soportan objetos 
		// y no primitivos 
		List<Integer> capacidadesCarga = new ArrayList<>( Arrays.asList(10, 20, 30) );
		int acumulado = 0;
		int capacidadCargaEmpresa = capacidadesCarga
				.stream()
				.reduce(acumulado, (acum, capacidadCarga) -> acum + capacidadCarga);
		// System.out.printf("La capacida de carga de la Empresa es %d %n", capacidadCargaEmpresa);
		
		List<Terrestre> transportesTerrestres = Arrays.asList(
			new Automovil(1000),
			new Automovil(2000),
			new Automovil(1000)		
		);
		
		double capacidadCargaEmpresa2 = transportesTerrestres
			.stream()
			.mapToDouble( (auto) -> auto.getCapacidadCarga() )
			.sum()
		;
		
		System.out.printf("La capacida de carga de la Empresa es %.2f kg %n", capacidadCargaEmpresa2);
	}

}
