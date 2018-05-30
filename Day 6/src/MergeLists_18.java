import java.util.ArrayList;
import java.util.Random;

public class MergeLists_18 {

	public static void main(String[] args) {

		ArrayList<Integer> randomList1 = new ArrayList<Integer>(newRandomList()); //Izveido random ArrList
		ArrayList<Integer> randomList2 = new ArrayList<Integer>(newRandomList());
		System.out.println("ArrayList 1: " + randomList1);
		System.out.println("ArrayList 2: " + randomList2);
		ArrayList<Integer> sumList = new ArrayList<Integer>(); //Izveido jaunu ArrList, kurā apvienot abus pārējos
		sumList.addAll(randomList1); //Pievieno 1. random ArrList
		sumList.addAll(randomList2); //Pievieno 2. random ArrList
		System.out.println("Merged ArrayList: " + sumList);

	}

	public static ArrayList<Integer> newRandomList() {		// Metode, kas ģenerē nejauša garuma ArrList ar nejaušiem skaitļiem, kas neatkaŗtojas
		ArrayList<Integer> list = new ArrayList<Integer>(); // Izveido jaunu ArrList
		int length = 0;
		do {
			length = new Random().nextInt(10);	//Izvēlas nejaušu garumu, no 3-9
		} while (length < 3);

		for (int i = 0; i < length; i++) { //Cikls pievieno ArrList brīvi izvēlētus Integer klases objektus 
			Integer number = -1;
			do {
				number = new Random().nextInt(20); //Meklē nejaušu unikālu vērtību
			} while (list.contains(number));
			
			list.add(i, new Random().nextInt(20));  //Pievieno vērtību ArrList
		}
		return list;
	}
}
