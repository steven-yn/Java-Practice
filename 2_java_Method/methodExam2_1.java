package methodSample;

import java.util.Scanner;

public class methodExam2_1 {
//field area : Ŭ���� ���� = ��� ���� = static ���� = ���� ����

	private static double sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1��° ���ڸ� �Է��ϼ���.");
		double x = sc.nextDouble();// 50.123
		System.out.println("-- 2��° ���ڸ� �Է��ϼ���.");
		int y = sc.nextInt();// 5

		double sum = x + y;// 55
		return sum; // 55
	}

	public static void main(String[] args) {
		// 2.��ȯ��O ��������X, if, for, main : ��������

		// 55
		double hapgye = sum();// arguments
		System.out.println("1.��ȯ��O	��������X : " + hapgye);// 55.123

	}
	// field area

}
