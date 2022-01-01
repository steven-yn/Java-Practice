package OOP_InheritanceSample;

import java.util.Scanner;

/* ����> InheritanceSample2��� �ڽ� Ŭ�������� 
 * �θ� Ŭ��������(AdderClass, SuberClass, MultiClass, DivideClass ��) ��ӹ޾Ƽ� 
 * ������������ ó���ϴ� ���α׷��� �ۼ��ϼ���. 
 * - �θ� Ŭ���� �߿��� AdderClass ������ class�Դϴ�.
 * - �������� �������̽� ������ �����ϴ�(SuberInter, MultiInter, DivideInter)
 * - interface��? ������� �߻� �޼ҵ�� �̷�����ϴ�.
 *  �߻� �޼ҵ�� abstract��� Ű���带 ����մϴ�.
 *  �׸���, �޼ҵ� ������ ������, body�� ���� ���� �ʴ´�.
 *  ��, {  ..... } �� �κ��� ����� �Ǿ �ٸ� Ŭ�������� �������̵��� �Ǿ ���� �˴ϴ�. 
 *  �������̽��� ��ü�� �������� ���ϴµ�, �ٸ� Ŭ������ ���� ��� �޾Ƽ� �������̵��� �ؾ� 
 *  ������ �����մϴ�. �׷���, �������̽��� ���������� ������ �Ұ��� �մϴ�.
 *  
 *  ���� ����� ������ �����ϴ�.
 *  2)public class A extends B implements C, D, E,..... {  ..... }
 *  B class, C,D,E interface ������ ���մϴ�.
 */

 interface DivideInter {

	// DivideInter di = new DivideInter();
	 
	public abstract void divi(); // �߻� �޼ҵ� �����ϰ� �ٵ� ����.
}

interface MultiInter {

	public abstract void multi(); 
}

interface SuberInter  {

	public abstract void suber(); 
}

	//							���� ����� ȿ����� �θ��ϴ�.
 class AdderClass3  implements SuberInter, MultiInter, DivideInter {

	 @Override  // �߻�޼ҵ� �������̵� 
		public void divi() {
			Scanner sc = new Scanner(System.in);
			System.out.println("������ ���� x�� �Է��ϼ���.");
			int x = sc.nextInt();
			System.out.println("�������� ���� y�� �Է��ϼ���.");
			int y = sc.nextInt();
			int sum = x / y;
			System.out.println("divi() : " + sum); 
			
		}

		@Override  // �߻�޼ҵ� �������̵� 
		public void multi() {
			Scanner sc = new Scanner(System.in);
			System.out.println("������ ���� x�� �Է��ϼ���.");
			int x = sc.nextInt();
			System.out.println("������ ���� y�� �Է��ϼ���.");
			int y = sc.nextInt();
			int sum = x * y;
			System.out.println("multi() : " + sum); 
			
		}

		@Override  // �߻�޼ҵ� �������̵� 
		public void suber() {
			Scanner sc = new Scanner(System.in);
			System.out.println("������ ���� x�� �Է��ϼ���.");
			int x = sc.nextInt();
			System.out.println("������ ���� y�� �Է��ϼ���.");
			int y = sc.nextInt();
			int sum = x - y;
			System.out.println("suber() : " + sum); 
			
		}
	 
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

public class InheritanceSample3 extends AdderClass3 {

	public static void main(String[] args) {
		InheritanceSample3 is2 = new InheritanceSample3();
		// DivideInter di = new DivideInter();
		
		is2.add();
		is2.suber();
		is2.multi();
		is2.divi();
	}

}
