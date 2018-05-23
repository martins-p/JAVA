import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ludzu, ievadi savu vardu: ");
		String name = scanner.next();
		System.out.print("Ludzu, ievadi pirmo veselo skaitli (a): ");
		int a = scanner.nextInt();
		System.out.print("Ludzu, ievadi veselo skaitli (b): ");
		int b = scanner.nextInt();
		if (a>b)
		{
			System.out.printf("%d ir lielaks neka %d.\n", a, b);
		}
		else if (a<b) 
		{
			System.out.printf("%d ir lielaks neka %d.\n", b, a);
		}
		else System.out.printf("Abi ievaditie skaitli ir vienadi.\n", a, b);
		int lengthName = name.length();
		if (a+b > lengthName)
		{
			System.out.printf("Skaitlu %d un %d summa ir %d, kas ir vairak neka burtu tava varda.\n", a, b, a+b);
		}
		else if (a+b < lengthName)
		{
			System.out.printf("Skaitlu %d un %d summa ir %d, kas ir mazak neka burtu tava varda.\n", a, b, a+b);
		}
		else System.out.printf("Skaitlu %d un %d summa ir %d, kas ir tikpat, cik burtu tava varda (%d).\n", a, b, a+b, lengthName);
	}

}
