package methodSample;

import java.util.Scanner;

public class methodExam4_1 {

	private static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1��° ���ڸ� �Է��ϼ���.");
		double x = sc.nextDouble();// 50.123
		System.out.println("-- 2��° ���ڸ� �Է��ϼ���.");
		float y = sc.nextFloat();// 5.0

		double sum = x + y;// 55.123 
		System.out.println("4.��ȯ��X	��������X : " + sum);// 55.123
	}

	public static void main(String[] args) {
		// 4.��ȯ��X ��������X, if, for, main : ��������

		sum();
	}

}
