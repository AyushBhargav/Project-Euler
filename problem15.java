
public class Problem15 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long[][] matrix = new long[21][21];
		for(int i = 0; i <= 20; i++) {
			matrix[20][i] = matrix[i][20] = 1;
		}
		for(int i = 19; i >= 0; i--) {
			for(int j = 19; j >= 0; j--) {
				matrix[i][j] = matrix[i+1][j] + matrix[i][j+1];
			}
		}
		long endTime = System.nanoTime();
		long diffTime = (endTime - startTime) / 1000;
		System.out.println("Number of ways: " + matrix[0][0]);
		System.out.println("Time taken: " + diffTime + " microseconds.");
	}

}
