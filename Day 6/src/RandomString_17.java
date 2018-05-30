import java.util.ArrayList;
import java.util.Random;

public class RandomString_17 {

	public static void main(String[] args) {

		char[] ch = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		ArrayList<String> randomList = new ArrayList<String>();
		for (int j = 0; j < 8; j++) { //Cikls ģenerē un pievieno ArrList random stringus
			int length = 0;
			do {
				length = new Random().nextInt(5); //Meklē jaunā String garumu, kas ir vismaz 1
			} while (length < 1);

			String randomString = "";
			for (int i = 0; i < length; i++) {
				randomString = randomString + ch[new Random().nextInt(ch.length)]; //Veido string no brīvi izvēlētiem burtiem no burtu masīva

			}
			randomList.add(randomString); //Pievieno jauno String masīvam
		}
		System.out.println("ArrayList: " + randomList);
		System.out.println(randomList.size());
		String set = "";
		for (int i = 0; i < randomList.size(); i++) { //Paņem katru saraksta elementu, pārveido par uppercase, un ieliek atpakaļ tajā pašā pozīcijā
			set = randomList.get(i); //Saglabā string no saraksta
			randomList.set(i, set.toUpperCase()); //IEliek string atpakaļ sarakstā, vispirms pārveidojot par uppercase
		}
		System.out.println("Uppercase ArrayList: " + randomList);
	}
}
