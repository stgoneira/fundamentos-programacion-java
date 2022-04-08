package cli;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainColaPrioritaria {

	public static void main(String[] args) {
		Producto leche1 = new Producto("Leche 1lt", LocalDate.of(2023, 11, 1));
		Producto leche2 = new Producto("Leche 1lt", LocalDate.of(2022, 4, 20));
		Producto leche3 = new Producto("Leche 1lt", LocalDate.of(2022, 12, 10));
		Producto leche4 = new Producto("Leche 1lt", LocalDate.of(2022, 5, 18));
		Producto leche5 = new Producto("Leche 1lt", LocalDate.of(2022, 7, 27));  
		
		Queue<Producto> inventario = new PriorityQueue<>( Comparator.comparing(Producto::getVencimiento) );
		inventario.addAll( Arrays.asList(leche1, leche2, leche3, leche4, leche5) );
		
		mostrarLechesEnInventario(inventario);		
		// devuelve la más proxima a vencer 
		Producto leche = inventario.remove();

		// si la leche que sacamos del estante está vencida
		// debería sacar una nueva 
		LocalDate fechaActual = LocalDate.now();
		if( leche.getVencimiento().isBefore( fechaActual ) ) {
			// leche vencida, saco una nueva 
			leche = inventario.remove();
		}
		System.out.printf("Sacando del estante la leche que vence %s", leche.getVencimiento());
		mostrarLechesEnInventario(inventario);
		
		// el uso de los métodos de la cola
		// son los mismos que los otros ejemplos 
		
	}

	private static void mostrarLechesEnInventario(Queue<Producto> inventario) {
		System.out.println();
		inventario.forEach(leche -> System.out.printf(
				"%s Vence: %s %n"
				, leche.getNombre()
				, leche.getVencimiento()
			)
		);
	}
}

class Producto {	
	protected String nombre;
	protected LocalDate vencimiento;	
	public Producto(String nombre, LocalDate vencimiento) {	
		this.nombre = nombre;
		this.vencimiento = vencimiento;
	}
	public String getNombre() {return nombre;}
	public LocalDate getVencimiento() {return vencimiento;}
}
