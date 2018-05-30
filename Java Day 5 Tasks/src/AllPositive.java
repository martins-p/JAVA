
public class AllPositive {

	public static void main(String[] args) {
		for (int i=10; i<100; i++)
		{
			
			System.out.printf("%d, %d + %d = %d\n", i, (i/10), i%10, (i/10) + i%10);
		}

	}

}
