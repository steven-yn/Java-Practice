package OOP_InheritanceSample;

import java.util.Scanner;

/* ����> InheritanceSample2��� �ڽ� Ŭ�������� 
 * �θ� Ŭ��������(AdderClass, SuberClass, MultiClass, DivideClass ��) ��ӹ޾Ƽ� 
 * ������������ ó���ϴ� ���α׷��� �ۼ��ϼ���. 
 * 
 * -  1)public class A extends B { .... }
 */

 class DivideClass2 {

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

class MultiClass2 extends DivideClass2 {

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

class SuberClass2 extends MultiClass2 {

	public void suber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� x�� �Է��ϼ���.");
		int x = sc.nextInt();
		System.out.println("������ ���� y�� �Է��ϼ���.");
		int y = sc.nextInt();
		int sum = x - y;
		System.out.println("Suber() : " + sum); 
	}
}

//1)public class A extends B { .... }

 class AdderClass2 extends SuberClass2 {

	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� x�� �Է��ϼ���.");
		int x = sc.nextInt();
		System.out.println("������ ���� y�� �Է��ϼ���.");
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("ADD() : " + sum); 
	}
}

public class InheritanceSample2 extends AdderClass2 {

	public static void main(String[] args) {
		InheritanceSample2 is2 = new InheritanceSample2();
		is2.add();
		is2.suber();
		is2.multi();
		is2.divi();
	}

}
