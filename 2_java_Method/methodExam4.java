package methodSample;

import java.util.Scanner;

public class methodExam4 {

	private static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1��° ���ڸ� �Է��ϼ���.");
		int x = sc.nextInt();// 50
		System.out.println("-- 2��° ���ڸ� �Է��ϼ���.");
		int y = sc.nextInt();// 5

		int sum = x + y;// 55
		System.out.println("4.��ȯ��X	��������X : " + sum);// 55
	}

	public static void main(String[] args) {
		// 4.��ȯ��X ��������X, if, for, main : ��������

		sum();
	}

}
