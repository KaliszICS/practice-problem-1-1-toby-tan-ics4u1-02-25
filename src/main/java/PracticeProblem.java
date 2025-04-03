public class PracticeProblem {
		public static void main(String[] args) {
			// You can test the methods here
		}
	
		public static int sum2D(int[][] arr) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) { 
				for (int j = 0; j < arr[i].length; j++) { 
					sum += arr[i][j];
				}
			}
			return sum;
		}
	
		public static int sumRow(int[][] arr, int row) {
			int sum = 0;
			if (row >= 0 && row < arr.length) {
				for (int j = 0; j < arr[row].length; j++) {
					sum += arr[row][j];
				}
			}
			return sum;
		}
	
		public static int sumColumn(int[][] arr, int col) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if (col >= 0 && col < arr[i].length) {
					sum += arr[i][col];
				}
			}
			return sum;
		}
}
