package methodSample;

import java.util.Scanner;

public class methodExam2 {
//field area : 클래스 변수 = 멤버 변수 = static 변수 = 전역 변수
	
		private static int sum() {  
			Scanner sc = new Scanner(System.in);
			System.out.println("-- 1번째 숫자를 입력하세요.");
			int x = sc.nextInt();//50
			System.out.println("-- 2번째 숫자를 입력하세요.");
			int y = sc.nextInt();//5
			
			int sum = x + y;//55
			return sum;	//55		
		} 

	public static void main(String[] args) {
		//2.반환형O	전달인자X, if, for, main : 지역변수
				
		//   55
		int hapgye = sum();//arguments
		System.out.println("1.반환형O	전달인자X : " + hapgye);//55
		
		
		
		
	}
	//field area
	
	
}
