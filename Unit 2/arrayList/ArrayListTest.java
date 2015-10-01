package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest
{

	public static void main(String[] args)
	{
		ArrayList<Integer> apples = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many values would you like to add?: ");
		int length = scan.nextInt();
		int value = 0;
		String suffix = "th";
		
		for (int i = 0; i < length; i++)
		{
			if ((i+1)%10 == 1)
			{
				suffix = "st";
			}
			else if ((i+1)%10 == 2)
			{
				suffix = "nd";
			}
			else if ((i+1)%10 == 3)
			{
				suffix = "rd";
			}
			else
			{
				suffix = "th";
			}
			System.out.println("Add your " + (i+1) + suffix + " value: ");
			value = scan.nextInt();
			apples.add(value);
			value = 0;
		}
		
		System.out.print(apples);
		System.out.println();
		
		for (int i = 0; i < length; i++)
		{
			apples.add(apples.get(i)*2);
		}
		
		System.out.print(apples);
		System.out.println();
		
		for (int i = 0; i < length; i++)
		{
			apples.remove(0);
		}
		
		System.out.print(apples);
		System.out.println();
		
		scan.close();
	}

}
