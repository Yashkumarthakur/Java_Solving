package google_codes;

/**
 * Given a Boolean Matrix, find k such that all elements in k'th row are 0 and
 * k'th column are 1. If no such exist then print -1. 
 * Input : mat[n][n] = {{1,0, 0, 0}, {1, 1, 1, 0}, {1, 1, 0, 0}, {1, 1, 1, 0}}
 * 
 * Output: 0 //mat[0][0] can be any value
 *
 */
public class FindKIndexBooleanMat {
	public static void main(String[] args) {

		int[][] matrix = new int[][] { { 1, 0, 0, 0 }, { 1, 1, 1, 0 }, { 1, 1, 0, 0 }, { 1, 1, 1, 0 }, };

		System.out.println("Value of K : " + findK(matrix));
	}

	public static int findK(int[][] matrix) {

		int row = matrix[0].length;
		int column = matrix.length;
		int oneCount = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrix[i][j] == 1) {
					oneCount++;
				}
			}
			if (oneCount == 1 || oneCount == 0) { // we got single 1 or all 0 in single row
				// check all colm values are one for the same Kth value
				if (checkIfKthColumnOne(row, i, matrix))
					return i;
			}

			oneCount = 0;

		}
		return -1;
	}

	private static boolean checkIfKthColumnOne(int row, int currentRow, int[][] matrix) {
		for (int k = 0; k < row; k++) {
			if (k == currentRow)
				continue;
			if (matrix[k][currentRow] == 0) {
				return false;
			}
		}
		return true;
	}

}
