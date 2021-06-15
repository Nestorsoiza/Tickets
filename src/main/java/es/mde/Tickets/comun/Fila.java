package es.mde.Tickets.comun;

import java.util.ArrayList;
import java.util.List;

public class Fila {
	private List<Butaca> butacas = new ArrayList<>();

	public Fila() {
		super();
	}

	public List<Butaca> getButacas() {
		return butacas;
	}

	public void setButacas(List<Butaca> butacas) {
		this.butacas = butacas;
	}

}
