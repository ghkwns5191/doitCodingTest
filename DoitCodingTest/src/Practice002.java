
public class Practice002 {

	public static void main(String[] args) {
		int[][] numbers = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}, {4, 5, 6, 7}};

		int[][] sum = new int[numbers.length][numbers.length];
		
		sum[0][0] = numbers[0][0];
		for (int i = 0; i < (2 - 1); i++) {
			for (int j = 0; j < (2 - 1); j++) {
				sum[i][j] = numbers[i - 1][j] + numbers[i][j - 1];
			}
		}
	}

}
