package lekcja2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Interfejs {

	// static methods
	public static String getUserInput(Scanner scanner) {
		return scanner.nextLine();
	}

	// zmienne pomocnicze
	private static Float wagaKotaf = null;
	private static String wagaKotas;

	private static Date date = null;
	private static String dateStr;

	public static void main(String[] args) {

		Kot kot = new Kot();
		Scanner scan = new Scanner(System.in);

		System.out.println("Podaj imie kota: ");
		kot.setName(getUserInput(scan));
		System.out.println(kot.getName());

		System.out.println("Podaj imie opiekuna: ");
		kot.setOpiekun(getUserInput(scan));
		System.out.println(kot.getOpiekun());

		do {
			System.out.println("Podaj wage kota: ");
			wagaKotas = getUserInput(scan);
			try {
				wagaKotaf = Float.parseFloat(wagaKotas);
				kot.setWaga(wagaKotaf);
			} catch (NumberFormatException nfe) {
				System.out.println("Wrong string!");
			}
		} while (wagaKotaf == null);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		do {
			System.out.println("Podaj date RRRR-MM-DD: ");
			dateStr = getUserInput(scan);
			try {
				date = sdf.parse(dateStr);
				String dateFormat = sdf.format(date);
				kot.setDate(dateFormat);
			} catch (ParseException e) {
				System.out.println("Wrong string!");
			}
		} while (date == null);

		System.out.println(kot.toString());

	}

}
