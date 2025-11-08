package zadatak2;

public class Zaposleni {

	    protected int id;
	    protected String ime;
	    protected String prezime;
	    protected double plataPoSatu;
	    protected int ukupanBrojSati;
	    
		public Zaposleni(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati) {
			super();
			this.id = id;
			this.ime = ime;
			this.prezime = prezime;
			this.plataPoSatu = plataPoSatu;
			this.ukupanBrojSati = ukupanBrojSati;
		}
	
	public double izracunajPlatu() {
		return 4 * ukupanBrojSati * plataPoSatu;
	}
	 public String getTip() {
	        return "Zaposleni";
	 }

	@Override
	public String toString() {
		return "Zaposleni [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", plataPoSatu=" + plataPoSatu
				+ ", ukupanBrojSati=" + ukupanBrojSati + "]";
	}
	 
	 
	 
}
