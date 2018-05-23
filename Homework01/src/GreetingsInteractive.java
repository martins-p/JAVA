import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ludzu, ievadi savu vardu: ");
		String name = scanner.next();
		System.out.print("Ludzu, ievadi savu vecumu: ");
		int age = scanner.nextInt();
		System.out.println(String.format("Sveiki, mani sauc %s, esmu %d gadus jauns.", name, age));
	}
}
