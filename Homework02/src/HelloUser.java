import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ludzu ievadi savu vardu un uzvardu:");
		String input = scan.nextLine(); // Saglabā visu lietotāja ievadi
		scan.close();

		while (input.indexOf(' ') == 0) { // Pa vienai nodzēš vārda sākumā ievadītas atstarpes
			input = input.substring(1);
		}

		if (input.contains(" ")) { // Pārbauda, vai ir ievadīti vidmaz divi vārdi ar atstarpi starp tiem
			String name = input.substring(0, input.indexOf(' ')); // Iegūst vārdu no ievades
			String lastName = input.substring(input.indexOf(' ') + 1, input.length()); // Iegūst uzvārdu no ievades

			name = (name.toUpperCase().charAt(0)) + name.substring(1, name.length()); // Pārveido vārdu, lai sākas ar
																						// lielo burtu
			lastName = lastName.toUpperCase(); // Pārveido uzvārdu, lai viss ir ar lielajiem burtiem

			System.out.println("'" + name + "'");
			System.out.println("'" + lastName + "'");
		} else {
			System.out.println("Ievaditais vards nav atpazits.");
		}
	}

}
