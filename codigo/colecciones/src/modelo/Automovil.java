package modelo;

public class Automovil extends Terrestre {

	protected int puertas = 4;
	
	public Automovil(double capacidadCarga, int avaluo) {		
		super("gasolina", capacidadCarga, 2, 4, avaluo);
	}
	
	public Automovil(double capacidadCarga) {		
		super("gasolina", capacidadCarga, 2, 4);
	}

	public Automovil(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantRuedas, int puertas, int avaluo) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros, cantRuedas, avaluo);
		this.puertas = puertas;
	}

	@Override
	public void trasladarse() {
		// super.trasladarse(); // print "Transporte: trasladándose....."
		System.out.println("Automovil: trasladándose ...");
	}
	
	// GETTERS Y SETTERS
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return String.format("Automovil avaluado en %d, con capacida de carga de %.2f kg y con motor a %s", avaluo, capacidadCarga, tipoMotor);
	}

	
}
