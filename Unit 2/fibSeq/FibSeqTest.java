package fibSeq;

import java.util.Scanner;

public class FibSeqTest {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer from 0 to 90: ");
		long input = scan.nextInt();
		long a = 1;
		long b = 0;
		long c = 0;
		
		for (long i = 0; i < input + 1; i++)
		{
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}

		scan.close();
	}

}
