package raisingBacteria;

import java.util.Scanner;

public class RaisingBacteria
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("How much bacteria would you like to end up with in the end?: ");
		int currAmt = 0;
		int power;
		int counter;
		
		while (currAmt >= 0)
		{
			currAmt = scan.nextInt();
			if (currAmt >= 0)
			{
				counter = 0;
				
				while(currAmt != 0)
				{
					power = 0;
					while(Math.pow(2, power) <= currAmt)
					{
						power++;
					}
					counter++;
					currAmt = currAmt - (int)Math.pow(2, power-1);
				}
				
				System.out.println("The number of bacteria you will need to add is: " + counter);
			}
		}
		
		System.out.println("Goodbye!");
		scan.close();
	}
}
