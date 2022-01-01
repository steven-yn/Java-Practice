package methodSample;

import java.util.Scanner;

/* method란 무엇인가?
 * 메소드는 특정한 조건을 지니는 조건문이나 반복문을 함수 형태로 만들어서 사용하는 방법을 말합니다.
 * 메소드 구분 기준 4가지 형태
 * ----------------------
 * 		반환형	전달인자
 * ----------------------
 * 1. 	O		O
 * 2. 	O		X
 * 3. 	X		O
 * 4. 	X		X
 * ----------------------
 * 문제> 두 수를 키보드로부터 입력을 받아서, 합계를 구하는 프로그램을 작성합니다.
 * 
 */
public class methodExam1 {
//field area : 클래스 변수 = 멤버 변수 = static 변수 = 전역 변수
	
		private static int sum(int x, int y) {  // x=50, y=5, 매개변수 = parameter
			int sum = x + y;//55
			return sum;	//55		
		} 

	public static void main(String[] args) {
		//1.반환형O	전달인자O, if, for, main : 지역변수
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1번째 숫자를 입력하세요.");
		int x = sc.nextInt();//50
		System.out.println("-- 2번째 숫자를 입력하세요.");
		int y = sc.nextInt();//5
		//   55
		int hapgye = sum(x, y);//arguments, x=50, y=5, call by value, 비객체지향적 프로그래밍
		System.out.println("1.반환형O	전달인자O : " + hapgye);//55
		
		
		
		
	}
	//field area
	
	
}
