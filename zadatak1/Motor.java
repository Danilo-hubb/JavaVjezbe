package zadatak1;

public class Motor extends vozilo implements Ekonomican {

	
	
	public Motor(String ID, double maxBrzina) {
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
