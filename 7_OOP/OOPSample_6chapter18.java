package OOP;

import java.util.Scanner;

public class OOPSample_6chapter18 {
	
	public static int sum1(int[] values1) {
		int sum = 0;

		for (int i = 0; i < values1.length; i++) {
			sum += values1[i];
		}
		return sum;
	}

	public static int sum2(int... aaa) { // 가변 배열 선언
		int sum = 0;

		for (int i = 0; i < aaa.length; i++) {
			sum += aaa[i];
		}
		return sum;
	}
		
	
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("처리할 숫자 데이터의 갯수를 입력 하세요.");
		
		/*  method overloading
		PrintStream.println(), 
		PrintStream.println(boolean), 
		PrintStream.println(char), 
		PrintStream.println(char[]), 
		PrintStream.println(double), 
		PrintStream.println(float), 
		PrintStream.println(int), 
		PrintStream.println(long), 
		PrintStream.println(java.lang.Object), 
		PrintStream.println(java.lang.String)
		*/		

	}

}
