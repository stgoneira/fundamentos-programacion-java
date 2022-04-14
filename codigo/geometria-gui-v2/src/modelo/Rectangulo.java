package modelo;

public class Rectangulo {

	// ATRIBUTOS O PROPIEDADES
	double base;
	double altura;
	
	// CONSTRUCTORES 
	public Rectangulo() {}
	
	public Rectangulo(double base, double altura) {
		this.base 	= base;
		this.altura = altura;
	}

	// CALCULOS 
	public double calcularArea() {
		return base * altura;
	}
	
	public double calcularPerimetro() {
		return (base * 2) + (altura * 2);
	}
	
	// GETTERS y SETTERS
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	 
	
	
}
