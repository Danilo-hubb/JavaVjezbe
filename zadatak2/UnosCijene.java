package zadatak2;

import java.util.Scanner;

public class UnosCijene {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
        double cijena = 0;
        boolean validno = false;

		while (!validno) {
            try {
                System.out.print("Unesite cijenu proizvoda: ");
                String input = unos.nextLine();

                cijena = Double.parseDouble(input);

                if (cijena <= 0) {
                    throw new IllegalArgumentException("Cijena mora biti pozitivan broj!");
                }

                validno = true;

            } catch (NumberFormatException e) {
                System.out.println("Greška: morate unijeti broj, a ne tekst!");
            } catch (IllegalArgumentException e) {
                System.out.println("Greška: " + e.getMessage());
            }
        }

        System.out.println("Cijena uspješno unesena: " + cijena + " EUR");
        unos.close();
    
		
	}

}
