package OOP_InheritanceSample;

import java.util.Scanner;

public class MultiClass {

	public void multi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� x�� �Է��ϼ���.");
		int x = sc.nextInt();
		System.out.println("������ ���� y�� �Է��ϼ���.");
		int y = sc.nextInt();
		int sum = x * y;
		System.out.println("Multi() : " + sum); 
	}
}
