import java.util.Scanner;

public class Cikli {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*boolean isInt = false;
		while (!isInt ) {
			System.out.print("Ievadi skaitli: ");
			isInt = scan.hasNextInt(); //Pārbauda vērtību
			if (!isInt) {
				scan.nextLine(); //Attīra ievadi
				System.out.print("Tas nebija skaitlis. ");
				continue;
			}
			i = scan.nextInt();
			System.out.println("Value = " + i);		
			}*/
		System.out.print("Ievadi skaitli: ");
		for (int i = scan.nextInt(); i > 0; i--)
		{
			System.out.println(i);
		}
		}
	}

