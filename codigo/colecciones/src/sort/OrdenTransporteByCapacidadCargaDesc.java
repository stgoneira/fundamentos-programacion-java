package sort;

import java.util.Comparator;

import modelo.Transporte;

public class OrdenTransporteByCapacidadCargaDesc implements Comparator<Transporte> {

	@Override
	public int compare(Transporte transporte1, Transporte transporte2) {
		if( transporte1.getCapacidadCarga() > transporte2.getCapacidadCarga() ) {
			return -1;
		} else if( transporte1.getCapacidadCarga() < transporte2.getCapacidadCarga() ) {
			return 1;
		} else {
			return 0;
		}
	}

}
