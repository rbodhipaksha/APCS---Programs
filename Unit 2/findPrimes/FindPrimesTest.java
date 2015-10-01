package findPrimes;

import java.util.Scanner;

public class FindPrimesTest {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input = -1;		//initialize input variable
		
		while (input < 0)		//ask for number n to print all prime numbers from 0 to n
		{
			input = scan.nextInt();
		}
		
		boolean[] boolArr = new boolean[input+1];		//initialize boolean array
		
		for (int i = 0; i < boolArr.length; i++)		//mark all numbers as prime (true)
		{
			boolArr[i] = true;
		}
		
		for (int i = 2; i <= input; i++)		//mark non prime numbers
		{
			if (boolArr[i])
			{
				for (int j = i + i; j <= input; j = j+i)
				{
					boolArr[j] = false;
				}
			}
		}
		
		System.out.println();
		System.out.print("Prime Numbers: ");
		for (int i = 0; i < boolArr.length; i++)		//print prime numbers
		{
			if (boolArr[i] == true)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.print("Non-prime Numbers: ");
		for (int i = 0; i < boolArr.length; i++)		//print non prime numbers
		{
			if (boolArr[i] == false)
			{
				System.out.print(i+" ");
			}
		}
		
		scan.close();
	}

}
