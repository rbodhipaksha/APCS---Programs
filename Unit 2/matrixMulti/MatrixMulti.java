package matrixMulti;

import java.util.Arrays;

public class MatrixMulti
{

	public static void main(String[] args)
	{
		int[][] leftMat = new int[2][2];
		int[][] rightMat = new int[2][3];
		
		if (leftMat[0].length == rightMat.length)
		{
			for (int i = 0; i < leftMat.length; i++)
			{
				for (int j = 0; j < leftMat[0].length; j++)
				{
					leftMat[i][j] = (int)(10*Math.random());
				}
			}
			for (int i = 0; i < rightMat.length; i++)
			{
				for (int j = 0; j < rightMat[0].length; j++)
				{
					rightMat[i][j] = (int)(10*Math.random());
				}
			}
			
			int[][] finalMat = new int[leftMat.length][rightMat[0].length];
			for (int i = 0; i < leftMat.length; i++)
			{
				for (int j = 0; j < rightMat[0].length; j++)
				{
					for (int k = 0; k < rightMat.length; k++)
					{
						finalMat[i][j] += leftMat[i][k] * rightMat[k][j];
					}
				}
			}
			System.out.println(Arrays.deepToString(leftMat) + " * " + Arrays.deepToString(rightMat));
			
			System.out.println(Arrays.deepToString(finalMat));
		}
	}

}
