package zadatak1;

public abstract class vozilo {
	
	protected String ID;
	protected double maxBrzina;
	
	public vozilo(String ID, double maxBrzina) {
		super();
		this.ID = ID;
		this.maxBrzina = maxBrzina;
	}
	
	  public void info() {
	        System.out.println("Vozilo: " + ID + ", max brzina: " + maxBrzina + " km/h");
	    }

	public abstract double izracunajVrijemeDostave(double udaljenostKm);

}
