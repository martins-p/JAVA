import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SortArray2D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Ievadi masivu skaitu(10-20): ");
		int length = scan.nextInt();
		while (length < 10 || length > 20) {
			scan.nextLine();
			System.out.print("Napareiza ievade. Ievadi skaitu no 10 lidz 20: ");
			length = scan.nextInt();
		}
		scan.close();

		int[][] twoDArr = new int[length][];

		for (int i = 0; i < twoDArr.length; i++) {
			twoDArr[i] = new int[rand.nextInt(41) + 10];
			for (int j = 0; j < twoDArr[i].length; j++) {
				twoDArr[i][j] = rand.nextInt(900) + 100;
			}
		}
		System.out.println("Originalais masivs: ");
		for (int i = 0; i < twoDArr.length; i++) { // Izvada masivu
			for (int j = 0; j < twoDArr[i].length; j++) {
				System.out.printf("%d", twoDArr[i][j]);
				if (j != twoDArr[i].length - 1) {
					System.out.printf(" ");
				}

			}
			System.out.println();
		}
		System.out.println();

		// for (int i = 0; i < twoDArr.length; i++) {
		// boolean swap = true; // Bubble sort metode - parvieto mazakas vertibas uz
		// beigam
		// int c = 0;
		// int temp; // Integer mainigais vertibu samainisanai
		// while (swap) {
		// swap = false; // Boolean, lai parbauditu, vai masivs jau nav sakartots
		// c++; // Skaititajs, lai katru reizi cikls neiet cauri pilnigi visam masivam,
		// jo
		// // beigas jau bus sakartotas
		// for (int j = 0; j < twoDArr[i].length - c; j++) { // Itere cauri masiva
		// elementiem
		// if (twoDArr[i][j] < twoDArr[i][j + 1]) { // Salidzina elementus un vajadzibas
		// gadijuma samaina
		// temp = twoDArr[i][j];
		// twoDArr[i][j] = twoDArr[i][j + 1];
		// twoDArr[i][j + 1] = temp;
		// swap = true; // Skaitli tika samainiti = vajag parbaudit masivu velreiz
		// (iziet FOR ciklu no
		// // sakuma).
		// }
		// }
		// }
		// }
		for (int i = 0; i < twoDArr.length; i++) {
			twoDArr[i] = bubble(twoDArr[i]);
		}

		System.out.println("Sakartoti 1D masivi: ");
		for (int i = 0; i < twoDArr.length; i++) { // Izvada masivu
			for (int j = 0; j < twoDArr[i].length; j++) {
				System.out.printf("%d", twoDArr[i][j]);
				if (j != twoDArr[i].length - 1) {
					System.out.printf(" ");
				}

			}
			System.out.println();
		}
		System.out.println();
		int[] meanArr = Mean(twoDArr);
		System.out.println("Katra 1D masiva ID un videja vertiba: ");
		for (int i = 0; i < meanArr.length; i++) { // Izvada masivu ar videjam vertibam

			System.out.printf("ID: %s   Videja vertiba: %d\n", twoDArr[i], meanArr[i]);
		}
		System.out.println();

		boolean swap = true;
		int c = 0;
		while (swap) {
			swap = false;
			c++;

			for (int i = 0; i < twoDArr.length - c; i++) {

				if (Mean(twoDArr[i]) > Mean(twoDArr[i + 1])) {
					int[] tmp = twoDArr[i];
					twoDArr[i] = twoDArr[i + 1];
					twoDArr[i + 1] = tmp;
					swap = true;
				}
			}
		}

		System.out.println("Sakartots masivs pec 1D masivu videjam vertibam: ");
		for (int i = 0; i < twoDArr.length; i++) { // Izvada masivu
			System.out.printf("ID: %s  ", twoDArr[i] );
			for (int j = 0; j < twoDArr[i].length; j++) {
				System.out.printf("%d", twoDArr[i][j]);
				if (j != twoDArr[i].length - 1) {
					System.out.printf(" ");
				}

			}
			System.out.println();
		}

//		int[] meanArr = new int[twoDArr.length];
//
//		for (int i = 0; i < twoDArr.length; i++) {
//			meanArr[i] = Mean(twoDArr[i]);
//		}
		int max = 0;
		int value = 0;
		for (int i = 0; i < meanArr.length - 1; i++) { //Cikls noskaidro lielako vertibu videjo vertibu masiva
			value = Math.max(meanArr[i], meanArr[i + 1]);
			if (value > max) {
				max = value;
			}
		}
		for (int i = 0; i < twoDArr.length; i++) { //Izvada masivu ar lielako videjo vertibu
			if (Mean(twoDArr[i]) == max) {
				System.out.println("Masivs ar lielako videjo vertibu: " + twoDArr[i]);
			}
		}
	}

	public static int[] Mean(int[][] arr) { // Metode 2d masiva videjo vertibu aprekinasanai

		int[] sumArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			sumArr[i] = sum / arr[i].length;
		}
		return sumArr;


	}

	public static int Mean(int[] arr) { // Metode 1d masiva videjo vertibu aprekinasanai
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		return sum / arr.length;

	}

	public static int[] bubble(int[] arr) {
		boolean swap = true; // Bubble sort metode - parvieto mazakas vertibas uz beigam
		int c = 0;
		int temp; // Integer mainigais vertibu samainisanai
		while (swap) {
			swap = false; // Boolean, lai parbauditu, vai masivs jau nav sakartots
			c++; // Skaititajs, lai katru reizi cikls neiet cauri pilnigi visam masivam, jo
					// beigas jau bus sakartotas
			for (int i = 0; i < arr.length - c; i++) { // Itere cauri masiva elementiem
				if (arr[i] < arr[i + 1]) { // Salidzina elementus un vajadzibas gadijuma samaina
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swap = true; // Skaitli tika samainiti = vajag parbaudit masivu velreiz (iziet FOR ciklu no
									// sakuma).
				}
			}
		}
		return arr;
	}
}
