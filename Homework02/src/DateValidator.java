import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] monthArray = { "janvāris", "februāris", "marts", "aprīlis", "maijs", "jūnijs", "jūlijs", "augusts",
				"septembris", "oktobris", "novembris", "decembris" };		//Menesu masivs
		int[] dateArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	//Datumu masivs
		System.out.print("Ludzu ievadi dienu (dd):");
		int day = scan.nextInt();
		System.out.print("Ludzu ievadi menesi (mm):");
		int month = scan.nextInt();
		System.out.print("Ludzu ievadi gadu (gggg):");
		int year = scan.nextInt();
		scan.close();

		if (year % 4 == 0) {	//Izmaina februara dienu skaitu, ja ir garais gads
			dateArray[1] = 29;
		} else {
			dateArray[1] = 28;	//Pievienots, lai butu pareiza vertiba, ja programmu parveido par ciklu un masivs tiek izmantots atkartoti
		}

		if (day < 0 || day > 31 || month > 12 || month < 1 || year < 1 || dateArray[month - 1] < day) { //Dienas, menesa un gada vertibu parbaude
			System.out.println("Datums nav pareizs.");
		} else {
			System.out.printf("%d. gada %d. %s\n", year, day, monthArray[month - 1]);
		}

	}

}
