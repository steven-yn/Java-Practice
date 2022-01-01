package methodSample;

import java.util.Scanner;

public class methodExam3 {
	
		private static void sum(int x, int y) {  
			int sum = x + y;//55
			System.out.println("1.반환형O	전달인자X : " + sum);//55
		} 

	public static void main(String[] args) {
		//3.반환형X	전달인자O, if, for, main : 지역변수
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1번째 숫자를 입력하세요.");
		int x = sc.nextInt();//50
		System.out.println("-- 2번째 숫자를 입력하세요.");
		int y = sc.nextInt();//5
				
		sum(x, y);//arguments				
	}
	//field area
	
	
}
