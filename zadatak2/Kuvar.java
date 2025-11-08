package zadatak2;

public class Kuvar extends Zaposleni{

	public Kuvar(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
	}
	
	  public double izracunajPlatu() {
	        return 1500 + 4 * ukupanBrojSati * plataPoSatu;
	  }
	  
	  public String getTip() {
	        return "Kuvar";
	    }

	@Override
	public String toString() {
		return "Kuvar [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", plataPoSatu=" + plataPoSatu
				+ ", ukupanBrojSati=" + ukupanBrojSati + "]";
	}
	  
}
