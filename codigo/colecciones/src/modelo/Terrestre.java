package modelo;

public class Terrestre extends Transporte {
	// VARIABLES DE INSTANCIA O ATRIBUTOS O PROPIEDADES 
	protected int cantRuedas;
	
	public Terrestre(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantRuedas) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros);
		this.cantRuedas = cantRuedas;
	}

	// GETTERS y SETTERS 
	public int getCantRuedas() {
		return cantRuedas;
	}

	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
		
}
