package Clases;
import java.util.ArrayList;

public class Proyecto {
	private ArrayList<Trabajador> trabajadores=new ArrayList<Trabajador>();
	private ArrayList<Tarea> tareas=new ArrayList<Tarea>();
	private int duracion, sprint;
	private String nombre;
	
	
	
	
	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}
	
	public ArrayList<Tarea> getTareas() {
		return tareas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
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
	
	public boolean añadirTarea(Tarea t) {
		if(!tareas.contains(t)) {
			this.tareas.add(t);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean añadirTrabajador(Trabajador t) {
		if(!trabajadores.contains(t)) {
			this.trabajadores.add(t);
			return true;
		}else {
			return false;
		}
	}
}
