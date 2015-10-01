package mathClass;

import java.util.Scanner;

public class MathClassTest 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = (int)keyboard.nextInt(); 
		setNum(integer);
		
		System.out.println("Your number is " + getNum());
		System.out.println("The absolute value of your number is " + absNum());
		System.out.println("Your number plus one is " + incNum());
		System.out.println("Your number doubled is " + doubleNum());
		System.out.println("Your number squared is " + sqreNum());
		System.out.println("Your number cubed is " + cubeNum());
		keyboard.close();
	}
	
	private static int myNumber = 0;
	
	public static void setNum(int n)
	{
		myNumber = n;
	}
	public static int getNum()
	{
		return myNumber;
	}
	public static int absNum()
	{
		return Math.abs(myNumber);
	}
	public static int incNum()
	{
		return myNumber + 1;
	}
	public static int doubleNum()
	{
		return myNumber * 2;
	}
	public static int sqreNum()
	{
		return myNumber * myNumber;
	}
	public static int cubeNum()
	{
		return myNumber * myNumber * myNumber;
	}
	
	 
}
