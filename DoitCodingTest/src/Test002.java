import java.util.Scanner;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int testNum = sc.nextInt();
		int[] score = new int[testNum];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		int max = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}

		double sum = 0;
		double avr = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avr = sum * 100 / max / testNum;
		System.out.println("최대값은 " + max + " 총 합은" + sum);
		System.out.println(avr);
	}

}
