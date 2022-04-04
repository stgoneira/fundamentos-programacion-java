package modelo;

public class Bicicleta extends Terrestre {

	public Bicicleta(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantRuedas) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros, cantRuedas);
		this.tipoMotor = "No tiene";
	}

	@Override
	public void trasladarse() {
		System.out.println("Bicicleta: voy pedaleando...");
	}
	
}
