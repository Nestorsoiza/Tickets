package es.mde.Tickets.comun;

import java.time.LocalDateTime;
import java.util.List;

public interface Reserva {
	Sesion getSesion();
	LocalDateTime getFechaHoraInicio();
	LocalDateTime getFechaHoraFin();
	
	
}
