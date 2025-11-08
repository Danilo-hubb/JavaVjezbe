package zadatak2;

public class Konobar extends Zaposleni{
	
	private int prekovremeniSati;

	public Konobar(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati, int prekovremeniSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.prekovremeniSati = prekovremeniSati;
	}
	
	 public double izracunajPlatu() {
	        double redovni = 4 * ukupanBrojSati * plataPoSatu;
	        double prekovremeni = 4 * prekovremeniSati * plataPoSatu * 1.2;
	        return redovni + prekovremeni;
	    }
	 public String getTip() {
	        return "Konobar";
	 }

	@Override
	public String toString() {
		return "Konobar [prekovremeniSati=" + prekovremeniSati + ", id=" + id + ", ime=" + ime + ", prezime=" + prezime
				+ ", plataPoSatu=" + plataPoSatu + ", ukupanBrojSati=" + ukupanBrojSati + "]";
	}
	

}
