package problems;

public class BiggestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int matrix[][] = 
		      { { 1, 2, 3 }, { 4, 50, 6 }, { 7, 8, 9 } };
		  
		  System.out.println(findBiggestElement(matrix,2,2));
	}

	private static int findBiggestElement(int[][] matrix, int row, int col) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=row;i++ ) {
			for(int j=0;j<=col;j++) {
				if(max<matrix[i][j]) {
					max=matrix[i][j];
				}
			}
		}
		
		return max;
	}

}
