package zadatak1;

public class Auto extends vozilo {
	
	

	public Auto(String ID, double maxBrzina) {
		super(ID, maxBrzina);
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		// TODO Auto-generated method stub
		return udaljenostKm/maxBrzina;
	}

}
