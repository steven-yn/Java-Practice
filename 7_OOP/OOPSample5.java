package OOP;

import java.util.Scanner;

/* 문제> 2개의 숫자를 입력 받아서 합계를 구하는 프로그램을 작성하세요.
 * 
 */
public class OOPSample5 {
	
	 static double sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1번째 숫자를 입력하세요.");
		double x = sc.nextDouble();
		System.out.println("-- 2번째 숫자를 입력하세요.");
		int y = sc.nextInt();

		double sum = x + y;
		return sum; 
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		OOPSample5 os5 = new OOPSample5();
		double hapgye = os5.sum();
		System.out.println("1.반환형O	전달인자X : " + hapgye);// 
	}

}
