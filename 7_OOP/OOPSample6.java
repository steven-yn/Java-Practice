package OOP;

import java.util.Scanner;

/* 문제> 2개의 숫자를 입력 받아서 합계를 구하는 프로그램을 작성하세요.
 * -  OOPSample5 클래스의 메소드를 호출하여 OOPSample6에서 출력하는 프로그래밍.  
 */
public class OOPSample6 {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		OOPSample5 os6 = new OOPSample5();
		double hapgye = os6.sum();
		System.out.println("1.반환형O	전달인자X : " + hapgye);// 
	}

}
