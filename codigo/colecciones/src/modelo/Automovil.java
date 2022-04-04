package modelo;

public class Automovil extends Terrestre {

	protected int puertas = 4;
	
	public Automovil(double capacidadCarga) {		
		super("gasolina", capacidadCarga, 2, 4);
	}

	public Automovil(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantRuedas, int puertas) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros, cantRuedas);
		this.puertas = puertas;
	}

	@Override
	public void trasladarse() {
		// super.trasladarse(); // print "Transporte: traslad�ndose....."
		System.out.println("Automovil: traslad�ndose ...");
	}
	
	// GETTERS Y SETTERS
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	
	
}
