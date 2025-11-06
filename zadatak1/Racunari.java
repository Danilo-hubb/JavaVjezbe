package zadatak1;

public class Racunari extends EProizvod {
	
	private String procesor;
	private int memorija;
	
	public Racunari(String opis, String sifra, double uvoznaCijena, String procesor, int memorija) {
		super(opis, sifra, uvoznaCijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}

	public double maloprodajnaCijena() {
		double cijena = super.maloprodajnaCijena();
		return cijena * 1.05;
	}

	@Override
	public String toString() {
		return "Racunari [procesor=" + procesor + ", memorija=" + memorija + ", opis=" + opis + ", sifra=" + sifra
				+ ", uvoznaCijena=" + uvoznaCijena + "]";
	}

	
	
}
