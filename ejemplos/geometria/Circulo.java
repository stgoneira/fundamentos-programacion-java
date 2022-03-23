public class Circulo {

	// ATRIBUTOS
	private double diametro;
	
	// CONSTRUCTORES
	public Circulo() {
	}

	public Circulo(double diametro) {
		this.diametro = diametro;
	}
	
	// CALCULOS
	public double calcularArea() {
		double radio = this.calcularRadio();
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double calcularRadio() {
		return this.diametro / 2;
	}
	
	public double calcularPerimetro() {
		return Math.PI * this.diametro;
	}

	// GETTERS Y SETTERS
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	
	
}
