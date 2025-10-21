import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String tekst = sc.nextLine().trim();
		String okrenutiTekst = new StringBuilder(tekst).reverse().toString();
		System.out.println(tekst.equalsIgnoreCase(okrenutiTekst));
		
	}

}
