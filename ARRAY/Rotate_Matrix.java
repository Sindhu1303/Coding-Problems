public class Solution{
	static void rotate(int[][] matrix) {
	    int n = matrix.length;
	    // Transpose the matrix
	    for (int i = 0; i < n; i++) {
	        for (int j = i; j < n; j++) {
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i] = temp;
	        }
	    }
	    // Reverse each row of the transposed matrix
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n / 2; j++) {
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[i][n - j - 1];
	            matrix[i][n - j - 1] = temp;
	        }
	    }
	for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
	public static void main(String[] args) {
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		rotate(matrix);
	}
}
