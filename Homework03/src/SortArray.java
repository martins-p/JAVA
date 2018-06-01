import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class SortArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		// Ievade
		System.out.print("Ievadi masīva izmēru no 20 līdz 40: ");
		
		int length = inputCheck(scan); //Parbauda vai ievade ir skaitlis
		while (length < 20 || length > 40) { //Parbauda vai ievade ir vajadzigaja diapazona
			System.out.print("Nepareiza ievade. Megini velreiz: ");
			length = scan.nextInt();
		}
		scan.close();
		
		int[] arr = new int[length]; //Izveido masivu ar ievadito garumu
		
		for (int i = 0; i < length; i++) { //Piepilda masivu ar random vertibam
			int number = 0;
			while (number < 10) { //Genere random skaitlus kas ir > 10
				number = rand.nextInt(100);
			}
			arr[i] = number;
		}
		System.out.println("Originalais masivs: " + Arrays.toString(arr));

		boolean swap = true; // Bubble sort metode - parvieto lielakas vertibas uz beigam
		int j = 0; 
		int temp; //Integer vertibu samainisanai
		while (swap) {
			swap = false; //Boolean, lai parbauditu, vai masivs jau nav sakartots
			j++; //Skaititajs, lai katru reizi cikls neiet cauri pilnigi visam masivam, jo beigas jau bus sakartotas
			for (int i = 0; i < arr.length - j; i++) { //Itere cauri masiva elementiem
				if (arr[i] > arr[i + 1]) { //Salidzina elementus un vajadzibas gadijuma samaina
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swap = true; //Skaitli tika samainiti = vajag parbaudit masivu velreiz (iziet FOR ciklu no sakuma).
				}
			}
		}
		System.out.print("Sakartots masivs: " + Arrays.toString(arr));

	}

	public static int inputCheck(Scanner scan) { //Metode, kas parbauda, vai lietotajs ievada skaitli
		boolean check = false;
		while (!check) {

			check = scan.hasNextInt();
			if (!check) {
				scan.nextLine();
				System.out.print("Nepareiza ievade. Megini velreiz: ");
				continue;
			}
		}
		return scan.nextInt();

	}

}
