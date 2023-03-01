import java.util.Scanner;

public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int data_num = sc.nextInt();
		int cal_times = sc.nextInt();
		int[] numbers = new int[data_num];
		int[] sum = new int[data_num];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			
		}
		sum[0] = numbers[0];
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1] + numbers[i];
		}
		
		int quest1_1 = sc.nextInt();
		int quest1_2 = sc.nextInt();
		int quest2_1 = sc.nextInt();
		int quest2_2 = sc.nextInt();
		int quest3_1 = sc.nextInt();
		int quest3_2 = sc.nextInt();
		
		int sum1 = 0;
		for (int i = quest1_1 - 1; i <= quest1_2 - 1; i++) {
			sum1 += numbers[i];
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for (int i = quest2_1 - 1; i <= quest2_2 - 1; i++) {
			sum2 += numbers[i];
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for (int i = quest3_1 - 1; i <= quest3_2 - 1; i++) {
			sum3 += numbers[i];
		}
		System.out.println(sum3);
	}

}
