package es.mde.Tickets.comun;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservaImpl implements Reserva{
	private Sesion sesion;
	private boolean disponible;
	
	
	public ReservaImpl() {
		super();
	}
	
	public Sesion getSesion() {
		return sesion;
	}
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public LocalDateTime getFechaHoraInicio() {
		return this.sesion.getFechaHoraInicio();
	}
	@Override
	public LocalDateTime getFechaHoraFin() {
		return this.sesion.getFechaHoraFin();
	}

	
}
