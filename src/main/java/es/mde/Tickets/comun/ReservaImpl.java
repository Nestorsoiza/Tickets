package es.mde.Tickets.comun;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservaImpl implements Reserva{
	private Sesion sesion;
	private Butaca butaca;
	
	
	public ReservaImpl() {
		super();
	}
	
	public Sesion getSesion() {
		return sesion;
	}
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	public Butaca getButaca() {
		return butaca;
	}

	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}

	@Override
	public LocalDateTime getFechaHoraInicio() {
		return this.sesion.getFechaHoraInicio();
	}
	@Override
	public LocalDateTime getFechaHoraFin() {
		return this.sesion.getFechaHoraFin();
	}
	@Override
	public Butaca getButacas() {
		return butaca;
	}
	
}
