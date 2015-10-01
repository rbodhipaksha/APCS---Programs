package parenthesesString;

import java.util.Scanner;

public class ParenthesesString
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ParenthesesString express = new ParenthesesString();
		int index = 0;
		
//		0		  1			2
		//					01234567890123456789012345
		String parString = "abc(b(a)aac)(ccc(qa(b))ad)";
		System.out.println("The expression is: " + parString);
		System.out.println("Choose an index (0-25): ");
		while (index > -1 && index < 26)
		{
			index = scan.nextInt();
			if (index > -1 && index < 26)
			{
				System.out.println(express.getExpression(parString, index));
				System.out.println();
			}
		}
		
		System.out.println("Goodbye.");
		scan.close();
	}
	
	private String getExpression(String str, int n)
	{
		String output = "";
		if (str.charAt(n) != ')')
		{
			output+= str.charAt(n);
		}
		int counter = 1;
		int position = n+1;
		while(counter != 0 && position < str.length())
		{
			if(str.charAt(position) == '(')
			{
				output+= str.charAt(position);
				counter++;
			}
			else if(str.charAt(position) == ')')
			{
				if (counter-1 != 0)
				{
					output+= str.charAt(position);
				}
				counter--;
			}
			else
			{
				output+= str.charAt(position);
			}
			position++;
		}
		
		return output;
	}
}
