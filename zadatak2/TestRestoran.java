package zadatak2;

public class TestRestoran {

	public static void main(String[] args) {

		Restoran r = new Restoran("Maša", "Njegošev bulevar", "1234");

		Konobar k1 = new Konobar(1, "Danilo", "Bojovic", 8, 40, 5);
		Kuvar k2 = new Kuvar(2,"Ines" , "Brkanović", 8.5, 8);
		Menadzer m1 = new Menadzer(3, "Jovan", "Terzic", 12, 5, 250);

		r.dodajZaposlenog(k1);
		r.dodajZaposlenog(k2);
		r.dodajZaposlenog(m1);

		r.prikaziSveZaposlene();

		System.out.println("Ukupan trosak plata je: " + r.ukupniTrosakPlata() + " eura");
		
	}

}
