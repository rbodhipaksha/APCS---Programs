package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] arr = {1,3,3,6,8,8,8,9,14};
		System.out.println(Arrays.toString(arr));
		
		int index = arr.length/2;
		int tempInd = index/2;
		System.out.println("index: "+index);
		int num = scan.nextInt();
		
		scan.close();
		
		while (arr[index] != num)
		{
			if (arr[index] > num)
			{
				index = index / 2;
			}
			else
			{
				index += tempInd;
			}
			tempInd = tempInd/2;
		}
		
		System.out.println(index);
	}

}
