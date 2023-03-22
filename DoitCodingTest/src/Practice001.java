
public class Practice001 {

	// 구간 합 배열 공식의 이해
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };

		int[] sum = new int[numbers.length];

		sum[0] = numbers[0];
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1] + numbers[i];
		}

		for (int i = 0; i < sum.length; i++) {
			System.out.println("sum 배열의 " + (i + 1) + "번째 값은 " + sum[i]);
		}
		int answer = sum[4 - 1] - sum[2 - 1 - 1];
		System.out.println("2번째에서 4번째까지 구간 합은 : " + answer);
	}
}
