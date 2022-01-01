package OOP;

import java.util.Scanner;

// 매개변수의 갯수를 모르는 경우
class Computer{

	public int sum1(int[] values1) {
		int sum = 0;
		
		for(int i=0; i < values1.length; i++) {
			sum+=values1[i];
		}		
		return sum;
	}

	public int sum2(int ... aaa) {  //가변 배열 선언
		int sum = 0;
		
		for(int i=0; i < aaa.length; i++) {
			sum+=aaa[i];
		}		
		return sum;
	}
	
}

public class OOPSample_6chapter15 {
			
	public static void main(String[] args) {
		Computer mycom = new Computer();
		
		int[] values1 = {10, 20, 30};
		int result1 = mycom.sum1(values1);
		System.out.println("values1[] : " + result1);//60
		
		int result2 = mycom.sum1(new int[] {10, 20, 30, 40, 50});
		System.out.println("values1[] : " + result2);//150
		System.out.println("=================");
		
		int result3 = mycom.sum2(100, 200, 300);
		System.out.println("aaa[] : " + result3);//600
		
		int result4 = mycom.sum2(100, 200, 300, 400, 500);
		System.out.println("aaa[] : " + result4);//1500
		
		
	}

	
}
