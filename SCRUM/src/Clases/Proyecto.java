package Clases;
import java.util.ArrayList;

public class Proyecto {
	private ArrayList<String> trabajadores=new ArrayList<String>();
	private ArrayList<Tarea> tareas=new ArrayList<Tarea>();
	private int duracion, sprint;
	private String nombre;
	
	
	
	
	public ArrayList<String> getTrabajadores() {
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
	
	public boolean añadirTrabajador(String t) {
		if(!trabajadores.contains(t)) {
			this.trabajadores.add(t);
			return true;
		}else {
			return false;
		}
	}
	
	public int esfuerzoTotal(int dia) {
		int esfuerzo=0;
		for(int i=0;i<tareas.size();i++) {
			esfuerzo = esfuerzo + tareas.get(i).getEsfuerzo().get(dia-1);
		}
		return esfuerzo;
	}
}
