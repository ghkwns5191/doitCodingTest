import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test004 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] numbers = new int[n][n];

		int quizNo = sc.nextInt();
		int[] answers = new int[quizNo];
		for (int i = 0; i < answers.length; i++) {
			answers[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}

		int quiz1 = 0;
		int quiz2 = 0;
		int quiz3 = 0;
		int quiz4 = 0;

		for (int i = 0; i < quizNo; i++) {
			quiz1 = sc.nextInt() - 1;
			quiz2 = sc.nextInt() - 1;
			quiz3 = sc.nextInt() - 1;
			quiz4 = sc.nextInt() - 1;

			for (int j = quiz1; j <= quiz3; j++) {
				for (int k = quiz2; k <= quiz4; k++) {
					answers[i] += numbers[j][k];
				}
			}

		}

		for (int i = 0; i < answers.length; i++) {
			System.out.println(answers[i]);

		}

	}

}
