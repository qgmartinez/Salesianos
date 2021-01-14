package arrayList2;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("Increible gestor de colas de cine");
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		int x = (int) (Math.random() * 50);
		//System.out.println(x + " personas generadas al azar");
		int i = 0;
		while(i < x) {
			String nombre = "Persona " + (i + 1);
			Persona nuevaPersona = new Persona(nombre);
			//System.out.println(nuevaPersona.getEdad());
			//System.out.println(nuevaPersona.getPrecioEntrada());
			System.out.println(nombre + " añadida");
			listaPersonas.add(nuevaPersona);
			i++;
		}
		double recaudacion = 0.0;
		for(Persona persona: listaPersonas) {
			//System.out.println(recaudacion);
			recaudacion = recaudacion + persona.getPrecioEntrada();
		}
		System.out.println("La recaudación total ha sido de " + recaudacion + "€");
	}

}

class Persona{
	String nombre;
	int edad;
	double precioEntrada;
	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = (int) (Math.random() * 90) + 5;
		if(edad < 11) {
			this.precioEntrada = 1;
		} else if(edad < 18) {
			this.precioEntrada = 2.5;
		} else {
			this.precioEntrada = 3.5;
		}
	}
	public double getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
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
	
}
