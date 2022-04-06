package cli;

import java.util.HashSet;
import java.util.Set;

import modelo.Automovil;
import modelo.Moto;
import modelo.Transporte;

public class MainDuplicados {

	public static void main(String[] args) {
		Profesor profesor1 = new Profesor(1, "Juan P.");
		Profesor profesor2 = new Profesor(2, "Ramon P.");
		Profesor profesor3 = new Profesor(3, "Jorge P.");
		
		Alumno alumno1 = new Alumno(1, "Raquel A.");
		Alumno alumno2 = new Alumno(2, "Carolina A.");
		Alumno alumno3 = new Alumno(3, "Simona A.");
		
		System.out.printf("profesor1 hashCode() = %d %n", profesor1.hashCode());
		System.out.printf("alumno1 hashCode() = %d %n", alumno1.hashCode());
		System.out.printf("profesor1 es igual a alumno1 = %b %n", profesor1.equals(alumno1)); 
		System.out.println();
		System.out.printf("profesor2 hashCode() = %d %n", profesor2.hashCode());
		System.out.printf("alumno2 hashCode() = %d %n", alumno2.hashCode());
		System.out.printf("profesor2 es igual a alumno2 = %b %n", profesor2.equals(alumno2));
		
		Set<Persona> personas = new HashSet<>();
		personas.add(profesor1);
		personas.add(profesor2);
		personas.add(profesor3);
		
		personas.add(alumno1);
		personas.add(alumno2);
		personas.add(alumno3);
		
		System.out.println();
		personas.forEach(p -> System.out.printf("ID: %d Nombre: %s %n", p.getId(),p.getNombre()));
	}
	
	public static void duplicadoActivos() {
		Automovil auto1 = new Automovil(1000, 5000000, "XRZA98");
		Automovil auto2 = new Automovil(1300, 3000000, "RRAA10");
		Automovil auto3 = new Automovil(1000, 5000000, "jjkk36");
		Automovil auto4 = new Automovil(1500, 9000000, "xrza98");
		
		Moto moto1 = new Moto(500, 3000000, "RKA11");
		Moto moto2 = new Moto(400, 2500000, "zsj45");
		Moto moto3 = new Moto(550, 2000000, "ZSJ45");
		Moto moto4 = new Moto(430, 1900000, "ABC99");
		
		Set<Transporte> activos = new HashSet<>();
		activos.add(auto1);
		activos.add(auto2);
		activos.add(auto3);
		activos.add(auto4);

		activos.add(moto1);
		activos.add(moto2);
		activos.add(moto3);
		activos.add(moto4);
		
		activos.forEach( System.out::println );
	}

}

class Persona {
	protected int id;
	protected String nombre;
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {return id;}
	public String getNombre() {return nombre;}

	@Override
	public int hashCode() {		
		return Integer.valueOf(id).hashCode();
	}	
}

class Alumno extends Persona {
	public Alumno(int id, String nombre) {
		super(id, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof Alumno)) return false;
		Alumno otroAlumno = (Alumno) obj;
		return this.id == otroAlumno.getId();
	}
}

class Profesor extends Persona {
	public Profesor(int id, String nombre) {
		super(id, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof Profesor)) return false;
		Profesor otroProfesor = (Profesor) obj;
		return this.id == otroProfesor.getId();
	}
}
