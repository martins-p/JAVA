import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ludzu, ievadi veselu skaitli: ");
		int a = scanner.nextInt();
		System.out.print("Ludzu, ievadi decimalskaitli (ar komatu): ");
		double b = scanner.nextDouble();
		System.out.printf("Skaitlu %d un %.2f summa ir %.2f\n", a, b,a+b);
		System.out.printf("Skaitlu %d un %.2f starpiba ir %.2f\n", a, b,a-b);
		System.out.printf("Skaitlu %d un %.2f reizinajums ir %.2f\n", a, b,a*b);
		System.out.printf("Skaitlu %d un %.2f dalijums ir %.2f\n", a, b,a/b);
		System.out.printf("Skaitlu %d un %.2f summas kvadrats ir %.2f\n", a, b,(a+b)*(a+b));

	}

}