package src.main.java.arsw.threads;

public class RegistroLlegada {

	private int ultimaPosicionAlcanzada=1;

    private boolean paused=false;

	private String ganador= null;

    public synchronized void registrarLlegada(String nombreGalgo) {
        if (ganador == null) {
            ganador = nombreGalgo;
        }
        System.out.println("El galgo " + nombreGalgo + " llegó en la posición " + ultimaPosicionAlcanzada);
        ultimaPosicionAlcanzada++;
    }
	
	public synchronized String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

	public synchronized int getUltimaPosicionAlcanzada() {
		return ultimaPosicionAlcanzada;
	}

	public void setUltimaPosicionAlcanzada(int ultimaPosicionAlcanzada) {
		this.ultimaPosicionAlcanzada = ultimaPosicionAlcanzada;
	}

    public synchronized void pauseRace() {
        paused = true;
    }

    public synchronized void resumeRace() {
        paused = false;
        notifyAll();
    }

    public synchronized void checkPaused() {
        while (paused) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

	
	
}
