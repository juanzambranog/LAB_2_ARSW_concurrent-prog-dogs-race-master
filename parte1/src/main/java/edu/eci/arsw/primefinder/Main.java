package src.main.java.edu.eci.arsw.primefinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		PrimeFinderThread pft1=new PrimeFinderThread(0,210000001);
		/*PrimeFinderThread pft2=new PrimeFinderThread(70000000,140000000);
		PrimeFinderThread pft3=new PrimeFinderThread(140000000,210000001);*/

		pft1.start();		
		/*pft2.start();
		pft3.start();*/


		/*Thread.sleep(5000);

		pft1.pauseThread();
        pft2.pauseThread();
        pft3.pauseThread();

        int totalPrimes = pft1.getPrimes().size() + pft2.getPrimes().size() + pft3.getPrimes().size();
        System.out.println("==================================");
        System.out.println(">>> Se encontraron " + totalPrimes + " primos hasta ahora.");
        System.out.println(">>> Presiona ENTER para continuar...");
        System.out.println("==================================");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        pft1.resumeThread();
        pft2.resumeThread();
        pft3.resumeThread();

        pft1.join();
        pft2.join();
        pft3.join();

		int finalTotal = pft1.getPrimes().size() + pft2.getPrimes().size() + pft3.getPrimes().size();
        System.out.println(">>> Total de primos encontrados al finalizar: " + finalTotal);

		*/
		
	}
	
}
