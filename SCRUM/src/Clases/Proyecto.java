package Clases;
import java.util.ArrayList;

public class Proyecto {
	private ArrayList<Trabajador> trabajadores=new ArrayList<Trabajador>();
	private ArrayList<Tarea> tareas=new ArrayList<Tarea>();
	private int duracion, sprint;
	private String nombre;
	
	public Proyecto(String nombre, int duracion, int sprint) {
		this.nombre=nombre;
		this.duracion=duracion;
		this.sprint=sprint;
	}
	
	
	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}
	
	public ArrayList<Tarea> getTareas() {
		return tareas;
	}
	
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getSprint() {
		return sprint;
	}
	public void setSprint(int sprint) {
		this.sprint = sprint;
	}
	
	
	
}
