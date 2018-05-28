import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ievadi savu vārdu un uzvārdu:");
		String input = scan.nextLine(); // Saglabā visu lietotāja ievadi
		scan.close();
		char space = ' ';

		while (input.indexOf(space) == 0) { // Pa vienai nodzēš vārda sākumā ievadītas atstarpes
			input = input.substring(1);
		}
		
		if (input.contains(" ")) { // Pārbauda, vai ir ievadīti vidmaz divi vārdi ar atstarpi starp tiem
			int spaceIndex = input.indexOf(space);
			String name = input.substring(0, spaceIndex); // Iegūst vārdu no ievades
			String lastName = input.substring(spaceIndex + 1, input.length()); // Iegūst uzvārdu no ievades

			name = (name.toUpperCase().charAt(0)) + name.substring(1, name.length()); // Pārveido vārdu, lai sākas ar
																						// lielo burtu
			lastName = lastName.toUpperCase(); // Pārveido uzvārdu, lai viss ir ar lielajiem burtiem

			System.out.printf("'%s'\n", name);
			System.out.printf("'%s'\n", lastName); 
		} else {
			System.out.println("Ievadītais vārds nav atpazīts.");
		}
	}
}
