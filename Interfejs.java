package lekcja2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Interfejs {

	// static Scanner - dzieki temu nie potrzeba arg formalnego
	static Scanner scan = new Scanner(System.in);
	public static String getUserInput() {
		return scan.nextLine();
	}

	public static void main(String[] args) {

		Kot kot = new Kot();
		
		System.out.println("Podaj imie kota: ");
		kot.setName(getUserInput());

		System.out.println("Podaj imie opiekuna: ");
		kot.setOpiekun(getUserInput());

		// zmienne pomocnicze niepotrzebne - zapis w jednej linii, choc zlozony
		do {
			System.out.println("Podaj wage kota: ");
			try {
				kot.setWaga(Float.valueOf(getUserInput()));
			} catch (NumberFormatException nfe) {
				System.out.println("Niepoprawne dane. Format wagi: 5.5");
			}
		} while (kot.getWaga() == null);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		do {
			System.out.println("Podaj date w formacie: RRRR-MM-DD: ");
			try {
				kot.setDate(sdf.format(sdf.parse(getUserInput())));
			} catch (ParseException e) {
				System.out.println("Niepoprawne dane. Format daty: RRRR-MM-DD");
			}
		} while (kot.getDate() == null);

		System.out.println(kot.toString());

	}

}
