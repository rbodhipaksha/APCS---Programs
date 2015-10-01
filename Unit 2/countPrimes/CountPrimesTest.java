package countPrimes;

import java.util.Scanner;

public class CountPrimesTest
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your desired integer(positive integers recommended): ");
		int input = scan.nextInt();
		boolean isPrime = false; 
		int primeCount = 0;
		
		for(int i = 1; i <= input; i++)
		{
			isPrime = true;
			for (int j = 1; j < i-1; j++)
			{
				if (i%j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime = true)
			{
				
			}
		}
		
		System.out.println("There are " + primeCount + " prime numbers less than or equal to " + input);
		scan.close();
	}

}
