package zadatak1;

public class Bicikl extends vozilo implements Ekonomican {
	
	

	public Bicikl(String ID, double maxBrzina) {
		super(ID, maxBrzina);
	}

	@Override
	public double potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		// TODO Auto-generated method stub
		return udaljenostKm/maxBrzina;
	}

}
