package org.zer0.micro.reniec.ServicioReniec;

public class Persona {

	private int edad;
	private String nombres;
	private String dni;
	
	public Persona(int edad, String nombres, String dni) {
		super();
		this.edad = edad;
		this.nombres = nombres;
		this.dni = dni;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	
}
