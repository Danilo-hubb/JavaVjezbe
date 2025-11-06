package zadatak1;

public class Telefoni extends EProizvod {

	private String operativniSistem;
	private double velicinaEkrana;
	
	public Telefoni(String opis, String sifra, double uvoznaCijena, String operativniSistem, double velicinaEkrana) {
		super(opis, sifra, uvoznaCijena);
		this.operativniSistem = operativniSistem;
		this.velicinaEkrana = velicinaEkrana;
	}
	
	 public double maloprodajnaCijena() {
	        double cijena = super.maloprodajnaCijena();
	        if (velicinaEkrana > 6) cijena *= 1.03; 
	        return cijena;
	
}

	@Override
	public String toString() {
		return "Telefoni [operativniSistem=" + operativniSistem + ", velicinaEkrana=" + velicinaEkrana + ", opis="
				+ opis + ", sifra=" + sifra + ", uvoznaCijena=" + uvoznaCijena + "]";
	}
	 
	 
	 
}