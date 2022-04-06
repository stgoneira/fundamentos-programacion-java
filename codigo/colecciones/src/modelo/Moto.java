package modelo;

public class Moto extends Terrestre {

	protected String ppu;
	
	public Moto(double capacidadCarga, int avaluo, String ppu) {
		super("gasolina", capacidadCarga, 2, 2, avaluo);
		this.ppu = ppu;
	}
	
	@Override
	public int hashCode() {
		// convierto todo a MAYUSCULAS antes de 
		// generar el hash
		return ppu.toUpperCase().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// si obj NO es una instancia de la clase Moto 
		if( ! (obj instanceof Moto) ) {
			return false;
		}
				
		// casteo (convertir) el parametro obj a Moto
		// y lo asigno a la variable otraMoto 
		Moto otraMoto = (Moto) obj;
		
		// finalmente, comparo las placas patentes 
		return this.ppu.equalsIgnoreCase( otraMoto.getPpu() );
	}

	@Override
	public String toString() {
		return String.format("Moto PPU: %s avaluado en %d, con capacida de carga de %.2f kg y con motor a %s", ppu, avaluo, capacidadCarga, tipoMotor);
	}
	
	// GETTERS Y SETTERS
	public String getPpu() {
		return ppu;
	}

	public void setPpu(String ppu) {
		this.ppu = ppu;
	}	
}
