package zadatak1;

public class TestVozila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vozilo a = new Bicikl("Scott", 60);
		vozilo b = new Motor("Yammaha", 120);
		vozilo c = new Auto("Megane", 185);
		
		double distanca = 10;
		
		 b.info();
	        System.out.println("Vrijeme dostave: " + b.izracunajVrijemeDostave(distanca) + " h");

	        System.out.println();

	        a.info();
	        System.out.println("Vrijeme dostave: " + a.izracunajVrijemeDostave(distanca) + " h");

	        System.out.println();

	        c.info();
	        System.out.println("Vrijeme dostave: " + c.izracunajVrijemeDostave(distanca) + " h");

	        System.out.println();

	}

	

	
}
