package OOP;

import java.util.Scanner;

/* 문제> 2개의 숫자를 입력 받아서 합계를 구하여 출력하세요.
 * - 단, 생성자를 이용합니다.
 */
public class OOPSample16_constructor3 {
	private static double x;//0.0 => 50.123
	private static int y;//0 => 5
	
	public OOPSample16_constructor3(double x, int y) {
		this.x = x;//50.123
		this.y = y;//5
	}

	private static double sum() {
		double sum = x + y;// 55.123
		return sum; // 55.123
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1번째 숫자를 입력하세요.");
		double x = sc.nextDouble();// 50.123
		System.out.println("-- 2번째 숫자를 입력하세요.");
		int y = sc.nextInt();// 5
		
		OOPSample16_constructor3 oop16_3 =  new OOPSample16_constructor3(x, y);

		double hapgye = oop16_3.sum();// arguments
		System.out.println("반환형O	전달인자O : " + hapgye);// 55.123

	}

	
}
