package methodSample;

import java.util.Scanner;

public class methodExam3_1 {
	
		private static void sum(byte x, int y) {  
			double sum = x + y;//55, 묵시적 형변환
			System.out.println("1.반환형O	전달인자X : " + sum);//55.0
		} 

	public static void main(String[] args) {
		//3.반환형X	전달인자O, if, for, main : 지역변수
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1번째 숫자를 입력하세요.");
		byte x = sc.nextByte();//50
		System.out.println("-- 2번째 숫자를 입력하세요.");
		int y = sc.nextInt();//5
				
		sum(x, y);//arguments				
	}
	//field area
	
	
}
