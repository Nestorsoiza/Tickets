package es.mde.Tickets.comun;

public class Butaca {
	private int numeroButaca;
	private Fila fila;
	
	public Butaca() {
		super();
	}
	
	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}

	public int getNumeroButaca() {
		return numeroButaca;
	}
	public void setNumeroButaca(int numeroButaca) {
		this.numeroButaca = numeroButaca;
	}
	
}



