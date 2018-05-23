import java.util.Scanner;

public class Syntax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ievadi skaitli (no 0 lidz 10): ");
		int i1 = scanner.nextInt();
		
		System.out.print("Ievadi skaitli (no 10 lidz 20): ");
		int i2 = scanner.nextInt();
		scanner.close();
		
		boolean isInt = scanner.hasNextInt(); // < parbauda, vai ievade ir int
		
		boolean i1valid = false;
		boolean i2valid = false;
		
		if (i1 >= 0 && i1 <= 10) {
			System.out.println("i1 ir diapazona no 0 lidz 10");
			i1valid = true;
		} else {
			System.out.println("i1 nav diapazona no 0 lidz 10");
		}
		if (i2 >= 10 && i2 <= 20) {
			System.out.println("i2 ir diapazona no 10 lidz 20");
			i2valid = true;
		} else {
			System.out.println("i2 nav diapazona no 10 lidz 20");
		}
		
		if (i1valid && i2valid) {
			System.out.println("Abi skaitli ir derigi");
		}
		
		if (i1valid || i2valid) {
			System.out.println("Vismaz viens no skaitliem ir derigs");
		}
		if (!i1valid && !i2valid) {
			System.out.println("Abi skaitli nav derigi");
		}
		
		if (!i1valid) {
			System.out.println("Pirmais skaitlis nav derigs");
		}
		/*if (someNumber > 10) {
			System.out.println("Lielaks par 10");
			finalResult = 10;
		} else if (someNumber < -100) {
			System.out.println("Mazaks par -100");
			finalResult = -100;
		} else if (someNumber < -10) {
			System.out.println("Mazaks par -10");
			finalResult = -10;
		}

		else {
			System.out.println("Ir pareiza robeza: -10 lidz 10");
		}

		if (finalResult == someNumber) {
			System.out.println("Neko nemodificejam.");
		}*/
		//System.out.println("Beigu vertiba: " + finalResult + " Ievadita vertiba: " + someNumber);

	}

}
