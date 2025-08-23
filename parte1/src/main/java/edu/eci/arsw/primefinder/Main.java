package edu.eci.arsw.primefinder;

public class Main {

	public static void main(String[] args) {
		
		PrimeFinderThread pft1=new PrimeFinderThread(0,21000000);
		
		pft1.start();

		/*PrimeFinderThread pft2=new PrimeFinderThread(7000000,14000000);
		pft2.start();

		PrimeFinderThread pft3=new PrimeFinderThread(14000000,21000001);
		pft3.start();*/
		
		
	}
	
}
