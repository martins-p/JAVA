import java.util.Random;
import java.util.Scanner;

public class GuessRandom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int random = new Random().nextInt(11);
		System.out.print("Uzmini skaitli: ");
		int guess = scan.nextInt();
		while (guess != random)
		{
			System.out.print("Nepareizi. Megini velreiz: ");
			guess = scan.nextInt();
		}
		System.out.printf("Pareizi! Skaitlis ir %d\n", random);

	}

}
