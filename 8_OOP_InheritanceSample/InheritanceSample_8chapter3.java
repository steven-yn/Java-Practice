package OOP_InheritanceSample;

import java.util.Scanner;

/* ���� �������̽� ���� Ŭ���� ǥ�� 2
 * 
 */

interface sungjuk22 {
	//�߻� �޼ҵ�
	void adderMethod();	
}

interface sungjuk11  {
	//���
	String name = "ȫ�浿";	
	public static final int java = 100;
	public int Max_Volume = 50;
	public int Min_Volume = 0;
	
	//�߻� �޼ҵ�
	void sungjukMethod(int java, int jsp, int spring);
		
}

public class InheritanceSample_8chapter3 implements sungjuk11, sungjuk22 {

	@Override
	public void sungjukMethod(int java, int jsp, int spring) {
		int sum = java + jsp + spring;
		double average = sum / 3.0;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average); 
	}	

	@Override
	public void adderMethod() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("html, css, Javascript ������ ������ �Է��� �ּ���.");
		int html = sc.nextInt();
		int css = sc.nextInt();
		int Javascript = sc.nextInt();
		
		int sum = html + css + Javascript;
		double average = sum / 3.0;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average); 
	}

	public static void main(String[] args) {
		InheritanceSample_8chapter3 is8 = new InheritanceSample_8chapter3(); 
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("�ڹ�, JSP, ������ ������ ������ �Է��� �ּ���.");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		is8.sungjukMethod(java, jsp, spring);
		System.out.println("-------------------------");
		is8.adderMethod();
	}
}
