package defineInt;

import java.util.Scanner;

public class DefineIntTest {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your desired integer(positive integers recommended): ");
		long input = scan.nextInt();
		long sum = 0;
		boolean bob = true;
		while (bob == true)
		{
			for (long i = 0; i < input + 1; i++)
			{
				sum = sum + i;
				
			}
			System.out.println(sum);
			System.out.println("Enter another integer or enter <0> to quit: ");
			input = scan.nextLong();
			if (input == 0)
			{
				bob = false;
			}
		}

		scan.close();
	}

}
