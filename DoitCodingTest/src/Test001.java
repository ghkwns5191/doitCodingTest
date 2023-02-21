import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		for (int i = 0; i < cNum.length; i++) {
			System.out.println(cNum[i] - '0');
		}
		System.out.println("cNum 초기 값은 : " + cNum[0]);
		int sum = 0;
		for (int i = 0; i < cNum.length; i++) {
			System.out.println("cNum[i]의 값은 : " + cNum[i]);
			sum += cNum[i] - '0';
			System.out.println("sum 값 변화 " + sum);

		}

		System.out.println("sum 최종값" + sum);
	}

}
