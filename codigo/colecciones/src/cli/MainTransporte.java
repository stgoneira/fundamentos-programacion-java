package cli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import modelo.Automovil;
import modelo.Bicicleta;
import modelo.Transporte;
import sort.OrdenTransporteByCapacidadCargaDesc;

public class MainTransporte {

	public static void main(String[] args) {
		
		List<Transporte> activos = new ArrayList<>();
		activos.add( new Automovil(2000, 7900000) );
		activos.add( new Bicicleta("NA", 50, 1, 2, 150000) );
		activos.add( new Automovil(2000, 11900000) );		
		activos.add( new Bicicleta("NA", 80, 1, 2, 200000) );
		
		// Orden Artifical (Interface Comparator) 
		Collections.sort(activos, new OrdenTransporteByCapacidadCargaDesc());
		activos.forEach( System.out::println );
		
		/*
		 * Orden Natural (Interface Comparable) 
		Collections.sort( activos );		
		activos.forEach( System.out::println );
		*/
		
		/*
		 * Orden Natural automático con clase TreeSet 
		Set<Transporte> activosOrdenados = new TreeSet<>( activos );
		activosOrdenados.forEach( System.out::println );
		*/ 
		
		/*
		 * Orden Natural con inserción de uno en uno 
		Set<Transporte> activosOrdenados = new TreeSet<>( );
		for( Transporte transporte : activos ) {
			activosOrdenados.add(transporte);
		}
		activosOrdenados.forEach( System.out::println );
		*/
	}

}
