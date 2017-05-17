package Ejercicio1;

public class Persona {
	protected String numeroDeTelefono;
	
	public Persona(String numeroDeTelefono){
		super();
		this.numeroDeTelefono = numeroDeTelefono;
	}
	
	public String getnumeroDeTelefono(){
		return numeroDeTelefono;
	}
	
	public void setNumeroDeTelefono(String numeroDeTelefono){
		this.numeroDeTelefono = numeroDeTelefono;
	}
}
