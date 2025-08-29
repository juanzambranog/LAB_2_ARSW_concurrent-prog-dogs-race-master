package src.main.java.arsw.threads;

import src.main.java.arsw.threads.Carril;
import src.main.java.arsw.threads.RegistroLlegada;



/**
 * Un galgo que puede correr en un carril
 * 
 * @author rlopez
 * 
 */
public class Galgo extends Thread {
	private int paso;
	private Carril carril;
	RegistroLlegada regl;

	public Galgo(Carril carril, String name, RegistroLlegada reg) {
		super(name);
		this.carril = carril;
		paso = 0;
		this.regl=reg;
	}

	public void corra() throws InterruptedException {
		while (paso < carril.size()) {
            regl.checkPaused();
			Thread.sleep(100);
			carril.setPasoOn(paso++);
			carril.displayPasos(paso);

			if (paso == carril.size()) {
				carril.finish();
                regl.registrarLlegada(this.getName());


            }
		}
	}


	@Override
	public void run() {
		
		try {

			corra();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
