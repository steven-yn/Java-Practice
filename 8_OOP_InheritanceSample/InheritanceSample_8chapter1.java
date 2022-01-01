package OOP_InheritanceSample;

import java.util.Scanner;

/* interface? ��ü�� ��� ����� ������ Ÿ��
 *  - ���� �ڵ�� ��ü�� ��� ���� ���� 
 *  - �������� ��ü�� ����ϹǷν� �ڵ��� ������ ���� ���� ����� ���ϰ��� �پ�ȭ �� �� �ִ� ������ ���� �մϴ�
 * 
 */

interface sungjuk {
	//���
	String name = "ȫ�浿";	
	public static final int java = 100;
	public int Max_Volume = 50;
	public int Min_Volume = 0;
	
	//�߻� �޼ҵ�
	void sungjukMethod(int java, int jsp, int spring);
	void adderMethod();
	
	//����Ʈ �޼ҵ�
	default int methodValue(int value1, int value2) {
		int sum = value1 + value2;
		return sum;
	}
	
	//���� �޼ҵ�
	static double methodValue2(double value1) {
		return value1;		
	}
}

public class InheritanceSample_8chapter1 implements sungjuk {

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
		InheritanceSample_8chapter1 is8 = new InheritanceSample_8chapter1(); 
		
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
