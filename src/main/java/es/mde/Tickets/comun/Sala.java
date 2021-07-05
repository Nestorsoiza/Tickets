package es.mde.Tickets.comun;

import java.util.List;

public class Sala {
	private List<Fila> filas;
	private List<Sesion> sesiones;
	private String nombreSala;
	
	public Sala() {
		super();
	}

	public List<Fila> getFilas() {
		return filas;
	}

	public void setFilas(List<Fila> filas) {
		this.filas = filas;
	}

	public List<Sesion> getSesiones() {
		return sesiones;
	}

	public void setSesiones(List<Sesion> sesiones) {
		this.sesiones = sesiones;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}
	
	
	
}
