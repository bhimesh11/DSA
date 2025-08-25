package Arrays;

import java.util.HashSet;

public class SetmatrixtoZero {
	
 public static void main(String[] args) {
	int[][] matrix = {{1,1,1},
			   {1,0,1},
			{1,1,1}};
	
	int[][] convertedMatrix = findZeroIt(matrix);
	
	for(int i =0;i<convertedMatrix.length;i++)
	{
		for(int j =0;j<convertedMatrix[0].length;j++)
		{
	
			System.out.print(convertedMatrix[i][j] + "");
		}
		System.out.println(" ");
	}
}

private static int[][] findZeroIt(int[][] matrix) {

int rows = matrix.length;
int cols = matrix[0].length-1;

HashSet<Integer> hashrows = new HashSet<Integer>();
HashSet<Integer> hashcols = new HashSet<Integer>();

for(int i =0;i<rows;i++)
{
	for(int j =0;j<cols;j++)
	{
		if(matrix[i][j]==0)
		{
			hashcols.add(i);
			hashrows.add(j);
		}
	}
}
	for(int i =0;i<rows;i++)
	{
		for(int j =0;j<=cols;j++)
		{
			if(hashrows.contains(i) || hashcols.contains(j))
			{
				matrix[i][j]=0;
			}
		}
}
	return matrix;

}

}
