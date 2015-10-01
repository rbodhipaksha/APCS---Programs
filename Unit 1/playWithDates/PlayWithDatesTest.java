package playWithDates;

import java.util.Scanner;

public class PlayWithDatesTest 
{

	public static void main(String[] args) 
	{
		
		PlayWithDates calendar = new PlayWithDates(0, 0, 0);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the desired number of tests to run: ");
		int numTests = scan.nextInt();
		int date = 0;
		int month = 0;
		int year = 0;
		int day = 0;
		
		for (int i = 0;i < numTests;i++)
		{
			System.out.println("Enter the desired date: ");
			date = scan.nextInt();
			System.out.println("Enter the desired month: ");
			month = scan.nextInt();
			System.out.println("Enter the desired year: ");
			year = scan.nextInt();
			calendar.setDay(date, month, year);
			day = calendar.getDay();
			
			if (day == 1)
			{
				System.out.println("Sunday");
			}
			else if (day == 2)
			{
				System.out.println("Monday");
			}
			else if (day == 3)
			{
				System.out.println("Tuesday");
			}
			else if (day == 4)
			{
				System.out.println("Wednesday");
			}
			else if (day == 5)
			{
				System.out.println("Thursday");
			}
			else if (day == 6)
			{
				System.out.println("Friday");
			}
			else
			{
				System.out.println("Saturday");
			}
		}
		scan.close();
		
	}

}
