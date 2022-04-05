package modelo;

public class Bicicleta extends Terrestre {

	public Bicicleta(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantRuedas, int avaluo) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros, cantRuedas, avaluo);
		this.tipoMotor = "No tiene";
	}

	@Override
	public void trasladarse() {
		System.out.println("Bicicleta: voy pedaleando...");
	}

	@Override
	public String toString() {
		return String.format("Bicicleta avaluada %d con capacidad de carga de %.2f", avaluo, capacidadCarga);
	}
		
}
