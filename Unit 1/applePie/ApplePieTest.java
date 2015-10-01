package applePie;

import java.util.Scanner;

public class ApplePieTest 
{
	public static void main(String[] args)
	{
		
		boolean fairSlice = false;
		int p = 0;
		
		ApplePie applePie = new ApplePie();
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many slices of apple pie do you want?:");
		
		while (fairSlice == false)
		{
			p = input.nextInt();
			if (1 <= p && p <= 8)
			{
				fairSlice = true;
			}
			
			else if (p == 0)
			{
				System.out.println("You must choose a slice of pie... I insist.");
			}
			
			else
			{
				System.out.println("There are only 8 slices of pie.");
			}
		}
		input.close();
		
		System.out.println("Too bad, I'll give you " + applePie.getSlice(p) + " slices instead!");
		
	}
}
