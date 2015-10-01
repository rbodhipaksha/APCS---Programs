package game24;

import java.util.Scanner;

//codeforces.com problem #468a
public class Game24Test
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if (number < 4)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
			if (number % 2 == 0)		//even
			{
				for (int i = 0; i < number - 4; i = i + 2)
				{
					System.out.println((number-i) + " - " + (number-i-1) + " = " + ((number-i) - (number-i-1)));
				}
				for (int j = 1; j < (number-4)/2; j++)
				{
					System.out.println(1 + " * " + 1 + " = " + 1);
				}
				System.out.println(1 + " * " + 4 + " = " + 4);
				System.out.println(2 + " * " + 3 + " = " + 6);
				System.out.println(4 + " * " + 6 + " = " + 24);
				System.out.println(24 + " * " + 1 + " = " + 24);
			}
			else		//odd
			{
				for (int i = 0; i < number - 5; i = i + 2)
				{
					System.out.println((number-i) + " - " + (number-i-1) + " = " + ((number-i) - (number-i-1)));
				}
				for (int j = 1; j < (number-5)/2; j++)
				{
					System.out.println(1 + " * " + 1 + " = " + 1);
				}
				System.out.println(5 + " - " + 3 + " = " + 2);
				System.out.println(4 + " * " + 2 + " = " + 8);
				System.out.println(1 + " + " + 2 + " = " + 3);
				System.out.println(8 + " * " + 3 + " = " + 24);
				System.out.println(24 + " * " + 1 + " = " + 24);
			}
		}
		
		scan.close();
	}

}
