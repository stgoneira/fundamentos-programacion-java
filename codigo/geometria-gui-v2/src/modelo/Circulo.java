package modelo;

public class Circulo {

	// ATRIBUTOS O PROPIEDADES
	double diametro;
	
	// CONSTRUCTORES 
	public Circulo() {} 
	
	public Circulo(double diametro) {
		this.diametro = diametro;
	}

	// CALCULOS 
	public double calcularArea() {
		return Math.PI * Math.pow(getRadio(), 2);
	}
	
	public double calcularPerimetro() {
		return Math.PI * diametro;
	}

	// GETTERS Y SETTERS
	public double getRadio() {
		return diametro / 2;
	}
	
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
 
	
	
	
}
