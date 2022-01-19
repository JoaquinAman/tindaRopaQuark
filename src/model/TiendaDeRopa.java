package model;

import java.util.ArrayList;

public class TiendaDeRopa {
	private String nombre;
	private String direccion;

	private ArrayList<Camisa> camisasParaVender;
	private ArrayList<Pantalon> pantalonesParaVender;

	public TiendaDeRopa() {
	}

	public TiendaDeRopa(String nombre, String direccion, ArrayList<Camisa> camisasParaVender,
			ArrayList<Pantalon> pantalonesParaVender) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.camisasParaVender = camisasParaVender;
		this.pantalonesParaVender = pantalonesParaVender;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Camisa> getCamisasParaVender() {
		return camisasParaVender;
	}

	public void setCamisasParaVender(ArrayList<Camisa> camisasParaVender) {
		this.camisasParaVender = camisasParaVender;
	}

	public ArrayList<Pantalon> getPantalonesParaVender() {
		return pantalonesParaVender;
	}

	public void setPantalonesParaVender(ArrayList<Pantalon> pantalonesParaVender) {
		this.pantalonesParaVender = pantalonesParaVender;
	}

}
