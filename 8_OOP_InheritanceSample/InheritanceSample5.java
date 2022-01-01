package OOP_InheritanceSample;

import java.util.Scanner;

/* ����> InheritanceSample2��� �ڽ� Ŭ�������� 
 * �θ� Ŭ��������(AdderClass, SuberClass, MultiClass, DivideClass ��) ��ӹ޾Ƽ� 
 * ������������ ó���ϴ� ���α׷��� �ۼ��ϼ���. 
   
 *  ���� ����� ������ �����ϴ�.
 * 4)public class A implements B, C, D... { .... }
 *   A�� class�̰�, B, C, D�� ��� �������̽��� ��� ���
 */

 
interface SuberInter3  {

	public abstract void suber(); 
	public abstract void multi(); 
	public abstract void divi(); 
}

	//							���� ����� ȿ����� �θ��ϴ�.
 interface AdderClass5  extends SuberInter3 {
	 
	 public abstract void add();	
}

public class InheritanceSample5 implements AdderClass5, SuberInter3  {
	
	@Override
	public void suber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� x�� �Է��ϼ���.");
		int x = sc.nextInt();
		System.out.println("������ ���� y�� �Է��ϼ���.");
		int y = sc.nextInt();
		int sum = x - y;
		System.out.println("suber() : " + sum); 
		
	}

	@Override
	public void multi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� x�� �Է��ϼ���.");
		int x = sc.nextInt();
		System.out.println("������ ���� y�� �Է��ϼ���.");
		int y = sc.nextInt();
		int sum = x * y;
		System.out.println("multi() : " + sum); 
		
	}

	@Override
	public void divi() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("������ ���� x�� �Է��ϼ���.");
			int x = sc.nextInt();
			System.out.println("�������� ���� y�� �Է��ϼ���.");
			int y = sc.nextInt();
			int sum = x / y;
			System.out.println("divi() : " + sum); 
		
	}

	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� x�� �Է��ϼ���.");
		int x = sc.nextInt();
		System.out.println("������ ���� y�� �Է��ϼ���.");
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("ADD() : " + sum); 		
	}	
	
	public static void main(String[] args) {
		InheritanceSample5 is2 = new InheritanceSample5();
		// DivideInter di = new DivideInter();
		is2.add();
		is2.suber();
		is2.multi();
		is2.divi();
	}

}
