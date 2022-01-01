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

	public static int sum2(int... aaa) { // ���� �迭 ����
		int sum = 0;

		for (int i = 0; i < aaa.length; i++) {
			sum += aaa[i];
		}
		return sum;
	}
		
	
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ó���� ���� �������� ������ �Է� �ϼ���.");
		
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
