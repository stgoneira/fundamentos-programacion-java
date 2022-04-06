package cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import modelo.Automovil;
import modelo.Moto;
import modelo.Terrestre;

public class MainOrden {

	public static void main(String[] args) {
		Automovil auto1 = new Automovil(1000, 5000000, "XRZA98");
		Automovil auto2 = new Automovil(1300, 3000000, "RRAA10");
		Automovil auto3 = new Automovil(1000, 5000000, "jjkk36");
		Automovil auto4 = new Automovil(1500, 9000000, "xrza98");
		
		Moto moto1 = new Moto(500, 3000000, "RKA11");
		Moto moto2 = new Moto(400, 2500000, "zsj45");
		Moto moto3 = new Moto(550, 2000000, "ZSJ45");
		Moto moto4 = new Moto(430, 1900000, "ABC99");

		List<Terrestre> activos = new ArrayList<>(
			Arrays.asList(auto1, auto2, auto3, auto4, moto1, moto2, moto3, moto4)
		);
		
		activos.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(activos, Comparator.comparing(Terrestre::getAvaluo));
		activos.forEach(System.out::println);
		
		System.out.println();
		Collections.sort(activos, Comparator.comparing(Terrestre::getCapacidadCarga));
		activos.forEach(System.out::println);
		
		System.out.println();
		Collections.reverse(activos);
		activos.forEach(System.out::println);
	}

}
