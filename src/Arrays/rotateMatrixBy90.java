package Arrays;

public class rotateMatrixBy90 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		System.out.println("original  Matrix:");
		 for(int[] row : matrix) 
		 {
		for (int val : row) {
		 System.out.print(val + " ");
		}
		System.out.println("");
		 }

		int[][] matrixfinal = rotateMatrixby90(matrix);

System.out.println("Rotated Matrix:");
 for(int[] row : matrixfinal) 
 {
for (int val : row) {
 System.out.print(val + " ");
}
System.out.println("");
 }

	}




	private static int[][] rotateMatrixby90(int[][] matrix) {

		int n = matrix.length;
//transpose matrix 
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		//reverse matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - 1 - j];
				matrix[i][n - 1 - j] = temp;
			}
		}
		return matrix;
	}
}
