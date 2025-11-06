package zadatak1;

public class TV extends EProizvod {
	
	 private double velicinaEkrana;

	public TV(String opis, String sifra, double uvoznaCijena, double velicinaEkrana) {
		super(opis, sifra, uvoznaCijena);
		this.velicinaEkrana = velicinaEkrana;
	}
	 
	public double maloprodajnaCijena() {
        double cijena = super.maloprodajnaCijena();
        if (velicinaEkrana > 65) cijena *= 1.10; 
        return cijena;

	
}

	@Override
	public String toString() {
		return "TV [velicinaEkrana=" + velicinaEkrana + ", opis=" + opis + ", sifra=" + sifra + ", uvoznaCijena="
				+ uvoznaCijena + "]";
	}
	
	
}