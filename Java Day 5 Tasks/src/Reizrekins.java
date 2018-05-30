import java.util.Scanner;

public class Reizrekins {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ievadi reizinamo skaitli: ");
		int skaitlis = scan.nextInt();
		for (int i = 0; i < 10; i++)
		{
			System.out.printf("%d x %d = %d\n", skaitlis, i, skaitlis *i);
		}

	}

}
