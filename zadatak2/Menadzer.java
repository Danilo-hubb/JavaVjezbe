package zadatak2;

public class Menadzer extends Zaposleni {
	
	  private double bonus;

	public Menadzer(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati, double bonus) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.bonus = bonus;
	}
	  
	public double izracunajPlatu() {
        return 1300 + 4 * ukupanBrojSati * plataPoSatu + bonus;
    }
	
public String getTip() {
	return "Menadzer";
}

@Override
public String toString() {
	return "Menadzer [bonus=" + bonus + ", id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", plataPoSatu="
			+ plataPoSatu + ", ukupanBrojSati=" + ukupanBrojSati + "]";
}

}
