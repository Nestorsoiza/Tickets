package es.mde.Tickets.comun;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservaImpl implements Reserva{
	
	private boolean disponible;
	
	
	public ReservaImpl() {
		super();
	}
	


	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	

	
}
