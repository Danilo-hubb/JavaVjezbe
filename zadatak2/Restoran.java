package zadatak2;

import java.util.ArrayList;

public class Restoran {

	private String naziv;
    private String adresa;
    private String pib;
    private ArrayList<Zaposleni> zaposleni;
	public Restoran(String naziv, String adresa, String pib) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
        this.zaposleni = new ArrayList<>();

	}
	public void dodajZaposlenog(Zaposleni z) {
		zaposleni.add(z);
	}

	public void ukloniZaposlenog(int id) {
		for (int i = 0; i < zaposleni.size(); i++) {
			if (zaposleni.get(i).id == id) {
				zaposleni.remove(i);
				System.out.println("Zaposleni sa ID " + id + " je uklonjen.");
				return;
			}
		}
		System.out.println("Nije pronađen zaposleni sa tim ID-em.");
	}
	public Zaposleni pretraziPoID(int id) {
		for (int i = 0; i < zaposleni.size(); i++) {
			if (zaposleni.get(i).id == id) {
				return zaposleni.get(i);
			}
		}
		return null;
	}
	public void prikaziSveZaposlene() {
		System.out.println("Spisak zaposlenih i njihove plate:");
		for (int i = 0; i < zaposleni.size(); i++) {
			Zaposleni z = zaposleni.get(i);
			System.out.println(z.getTip() + " - " + z.ime + " " + z.prezime + 
					", plata: " + z.izracunajPlatu() + " eura");
		}
	}
	public double ukupniTrosakPlata() {
		double ukupno = 0;
		for (int i = 0; i < zaposleni.size(); i++) {
			ukupno += zaposleni.get(i).izracunajPlatu();
		}
		return ukupno;
	}
	
}
