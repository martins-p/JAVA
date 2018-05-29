import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int izvele = 1;
		int[] ints = new int[12];
		Scanner scan = new Scanner(System.in);
		while (izvele != 0) {
			System.out.println("Mainīt vērtību =1");
			System.out.println("Iziet = 0");
			izvele = scan.nextInt();
			if (izvele == 0) {
				break;
			}
			System.out.print("Ievadi pozīciju [0-11]: ");
			int poz = scan.nextInt();
			System.out.print("Ievadi vērtību: ");
			int value = scan.nextInt();
			ints[poz] = value;
		}
		scan.close();
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] != 0) {
				System.out.printf("ints [%d] = %d\n", i, ints[i]);
			}
		}
	}
}
