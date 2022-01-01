package methodSample;

import java.util.Scanner;

public class methodExam2_1 {
//field area : 클래스 변수 = 멤버 변수 = static 변수 = 전역 변수

	private static double sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1번째 숫자를 입력하세요.");
		double x = sc.nextDouble();// 50.123
		System.out.println("-- 2번째 숫자를 입력하세요.");
		int y = sc.nextInt();// 5

		double sum = x + y;// 55
		return sum; // 55
	}

	public static void main(String[] args) {
		// 2.반환형O 전달인자X, if, for, main : 지역변수

		// 55
		double hapgye = sum();// arguments
		System.out.println("1.반환형O	전달인자X : " + hapgye);// 55.123

	}
	// field area

}
