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
		System.out.println(tareas.size() + " xd");
		for(int i=0;i<tareas.size();i++) {
			if(tareas.get(i).getEsfuerzo().size() >= dia)
				esfuerzo = esfuerzo + tareas.get(i).getEsfuerzo().get(dia-1);
		}
		return esfuerzo;
	}
	
	public int maximoDia() {
		int maximo = tareas.get(0).getEsfuerzo().size();
		for(int i=1;i < tareas.size();i++) {
			if(tareas.get(i).getEsfuerzo().size() > maximo) {
				maximo = tareas.get(i).getEsfuerzo().size();
			}
		}
		return maximo;
	}
}
