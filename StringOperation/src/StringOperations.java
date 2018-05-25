
public class StringOperations {

	public static void main(String[] args) {
		String str = "Java Coding School";
		System.out.println("start: " + str);

		str = str.concat(" is COOL!");
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("number: " + 10);
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 11) + str.substring(18));
		System.out.println(str.substring(5, str.length() - 5));
		int length = str.length();
		System.out.println(str.contains("School"));
		System.out.println(str.toUpperCase().contains("School"));
		System.out.println(str.equals("Check")); // sadi pareizi salidzina stringus
		System.out.println("CHECK".equalsIgnoreCase("ChEck")); // sadi pareizi salidzina stringus
		
		
	}

}
