package methodSample;

import java.util.Scanner;

public class methodExam4_1 {

	private static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1번째 숫자를 입력하세요.");
		double x = sc.nextDouble();// 50.123
		System.out.println("-- 2번째 숫자를 입력하세요.");
		float y = sc.nextFloat();// 5.0

		double sum = x + y;// 55.123 
		System.out.println("4.반환형X	전달인자X : " + sum);// 55.123
	}

	public static void main(String[] args) {
		// 4.반환형X 전달인자X, if, for, main : 지역변수

		sum();
	}

}
