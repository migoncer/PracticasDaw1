package Ejercicio1;
import java.util.*;

public class Profesor extends Persona{
	
	private String nombre;
	private int edad;
	private List<Prestamo> prestamos;
	
	public Profesor(String numeroDeTelefono){
		super(numeroDeTelefono);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public void printInformacionPersonal(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Tel�fono: " + this.numeroDeTelefono);
	}
	
	public void printTodaLaInformacion(){
		this.printInformacionPersonal();
	for(Prestamo p: prestamos){
		System.out.println(p);
	}
	}

}
