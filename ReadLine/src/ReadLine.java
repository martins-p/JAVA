import java.util.Scanner;

public class ReadLine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ievadi veselu skaitli: ");
		int ievade = scanner.nextInt() + 1;
		
		System.out.println("Tava ievade +1 ir: " + ievade);
	}

}
