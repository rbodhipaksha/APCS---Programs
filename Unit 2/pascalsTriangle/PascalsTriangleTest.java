package pascalsTriangle;

import java.util.Scanner;

public class PascalsTriangleTest
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int[][] matrix = new int[m][m];
		
		matrix[0][0] = 1;
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < i; j++)
			{
				if (i == 0)
				{
					matrix[i][j] = 1;
				}
				else
				{
					if (j == 0)
					{
						matrix[i][j] = 1;
					}
					else
					{
						matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
					}
				}
			}
		}
		
		int spaces = m;
		for(int[] arr : matrix)
		{
			for (int f = 0; f < spaces; f++)
			{
				System.out.print("    ");
			}
			for(int i : arr)
			{
				if (i != 0)
				{
					System.out.print(i + "        ");
				}
				
			}
			System.out.println();
			spaces--;
		}
		
		scan.close();
	}

}
