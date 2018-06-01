import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ievadi pirmskaitlu skaitu (0-100): ");
		int count = inputCheck(scan);
		while (count < 0 || count > 100) {
			System.out.print("Nepareiza ievade. Megini velreiz: ");
			count = scan.nextInt();
		}
		scan.close();
		
		int printed = 0; // Faktiski izvadito skaitlu skaits
		int number = 0; // Skaitlis, kurs tiks parbaudits, vai tas ir pirmskaitlis
		while (printed < count) { // Cikls darbojas, kamer nav izvadits lietotaja noraditais pirmskaitlu skaits
			number++; // Palielina parbaudamo skaitli par 1
			boolean prime = true;
			for (int check = 2; check < number; check++) { // Parbaudes cikls. Dala pasreizejo skaitli ar vertibam no 2
															// lidz number-1 un skatas atlikumu. Check vertiba ir 2, jo
															// skaitlus 1 un 2 nevajag parbaudit, bet dalisanas parbaudi ir jasak, dalot ar 2.
				if (number % check == 0) {
					prime = false;
				}
			}
			if (prime) {	//Ja number vertiba ir pirmskaitlis, tas tiek izvadits
				System.out.print(number);
				if (printed + 1 != count) { //Papildu nosacijums, lai aiz pedeja skaitla nebutu komats un atstarpe.
					System.out.print(", ");
				}
				printed++;
			}
		}

	}

	public static int inputCheck(Scanner scan) { // Metode, kas parbauda, vai lietotajs ievada skaitli
		boolean check = false;
		while (!check) {

			check = scan.hasNextInt();
			if (!check) {
				scan.nextLine();
				System.out.print("Nepareiza ievade. Megini velreiz: ");
				continue;
			}
		}
		return scan.nextInt();
	}
}
