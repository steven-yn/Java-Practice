package OOP_InheritanceSample;

import java.util.Scanner;

public class DivideClass {

	public void divi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� x�� �Է��ϼ���.");
		int x = sc.nextInt();
		System.out.println("�������� ���� y�� �Է��ϼ���.");
		int y = sc.nextInt();
		int sum = x / y;
		System.out.println("Divi() : " + sum); 
	}
}
