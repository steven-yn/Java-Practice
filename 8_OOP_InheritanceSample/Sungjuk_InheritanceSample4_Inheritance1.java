package OOP_InheritanceSample;

import java.util.Scanner;

/* 
 * ���(Inheritance)�̶�?
 * ������ �ۼ��� Ŭ����(�θ� Ŭ����)�� �������� �ڽ� Ŭ������ ��ɰ� �Ӽ��� �����ִ� ��.
 *  �Ӽ�(Attribute): Ŭ�������� Ŭ���� ������ ���ϴ� �� ��.  
 *  ���(method): Ŭ�������� Ŭ���� �޼ҵ忡 ���ϴ� �� ��. 
 * - �θ�Ŭ������ Ŭ���� ������ �޼ҵ�� ���� �����ڰ� 
 *  ���� ��Ű���� ��쿡�� default �����ϳ�,
 *  �ٸ� ��Ű����� �ݵ�� public�� �� �־�� ����� �˴ϴ�.
 * - �ڹٴ� ���� ��Ӹ� ����մϴ�. ���� ����� ȿ��
 * - public B extends A { .... } : ���� Ŭ���������� ���
 * - interface B extends A { .... } : ���� �������̽��� ��쿡 
 * - ���� ����� ȿ���� ���� ���� ����ؾ� �մϴ�.
 * - public A extends B implements C, D, E... { ... }
 * - public A implements B, C, D ... { .... }
 * - this() : �ش� Ŭ������ ������ ���� �ϵ��� �ϴ� �� => Ŭ���� ������ ������ ��� �ϴ� ��. 
 * - super(); ���� API���� �����ϴ� �θ� Ŭ������ ��� ȣ��� ���
 * - �߻�Ŭ������ �������̽��� ��ü�� �������� ���ϹǷ� �߻� �޼ҵ� �������̵��̶�� ����� �̿��Ͽ�
 *   �����͸� ó���մϴ�. �߻�Ŭ������ �������̽��� ����ϴ� ������? 
 *   �߻�Ŭ������ �������̽��� �̸� ���� �̷��� �����Ͽ� �������� ����� ����(�߻� �޼ҵ� ����) ���߿� �ٵ�(Body)��
 *   �����ϴµ� �߻� �޼ҵ� �������̵��̶�� ���¸� ��� ������ �����ϰ� �˴ϴ�.  
 * 
 * �Է� ����� menu ����̸�, ���ڸ� �Է� �մϴ�.
 * ---------���� �Է� �� ó��--------------
 * 1.��ȣ �� �̸� �Է�
 * 2.���� �Է�(���� : �ڹ�, JSP, Spring)
 * 3.���� ó�� ����(����, ���, ����)
 * 4.���� ��� ���
 * 5.����
 * ------------------------------------
 * 
 * ---------�� �� �� ��-------------------
 * ��ȣ �̸� �ڹ� JSP Spring ���� ��� ���� 
 * -------------------------------------
 *  1  ȫ�浿 100 100 100   300 100  A
 *  2  �̱��  99  98  97   294  98  A
 *  
 *       ......................
 * ------------------------------------
 * - �޴� ����, Inheritance(interface, abstract class)  
 * - 1) public A extends B { .... } : ���� Ŭ���������� ���
 */

class Common_Array {
	protected static Scanner sc = new Scanner(System.in);
	static int inwon; 

	static String bunho[];
	static String name[];
	static int java[];
	static int jsp[];
	static int spring[];
	static int total[];
	static int[] sungjuk;
	static double[] average;
	static String grade[];
	static int[] inwonsu;
}

class SungjukOutput extends Common_Array {
	static void SungjukOutput() {
		System.out.println("------------------------ �� �� �� �� -------------------------");
		System.out.println("��ȣ\t �̸�\t �ڹ�\t JSP\t Spring\t ����\t ���\t ���� ");
		System.out.println("------------------------------------------------------------");
		
		for (int i = 0; i < inwon; i++) {
			
			System.out.print(bunho[i] + "\t" + name[i] + "\t" + java[i] + "\t" + jsp[i] + "\t" + spring[i] + "\t"
					+ total[i] + "\t");
			System.out.printf("%5.2f", average[i]);
			System.out.println("\t" + grade[i]);
			
		}
		System.out.println("------------------------------------------------------------");
	}
}

class SungjukProcess extends SungjukOutput {
	static void SungjukProcess() {
		for (int j = 0; j < inwon; j++) {
			total[j] = java[j] + jsp[j] + spring[j];
		} 

		for (int k = 0; k < inwon; k++) {
			average[k] = total[k] / 3.0;

			switch ((int) average[k] / 10) {
			case 10:
			case 9:
				grade[k] = "A";
				break;
			case 8:
				grade[k] = "B";
				break;
			case 7:
				grade[k] = "C";
				break;
			case 6:
				grade[k] = "D";
				break;
			default:
				grade[k] = "F";
				break;

			}
		}
		
	}
}

class SungjukInput extends SungjukProcess {
	
	static void SungjukInput() {			
		inwonsu = new int[inwon]; 
		bunho = new String[inwon];
		name = new String[inwon];
		java = new int[inwon];
		jsp = new int[inwon];
		spring = new int[inwon];
		total = new int[inwon];
		sungjuk = new int[inwon];
		average = new double[inwon];
		grade = new String[inwon];
		
		for (int i = 0; i < inwon; i++) {
			System.out.println("���� ó���� ���� �����͸� �Է��ϼ���.");
			System.out.println("��ȣ �����͸� �Է��ϼ���.");
			bunho[i] = sc.next();
			System.out.println("�̸� �����͸� �Է��ϼ���.");
			name[i] = sc.next();
			System.out.println("�ڹ� �����͸� �Է��ϼ���.");
			java[i] = sc.nextInt();
			System.out.println("JSP �����͸� �Է��ϼ���.");
			jsp[i] = sc.nextInt();
			System.out.println("Spring �����͸� �Է��ϼ���.");
			spring[i] = sc.nextInt();
		}		
	}
}
	

class SungjukInputInwon extends  SungjukInput {
	
	static void SungjukInputInwon() {
		System.out.println("���� ó���� ���� �ο����� �Է��ϼ���.");
		inwon = sc.nextInt();  
	}
}

public class Sungjuk_InheritanceSample4_Inheritance1 extends SungjukInputInwon {

	public static void main(String[] args) {
		boolean sungjukkey = true;
		
		while(sungjukkey) {
		System.out.println("------------���� �Է� �� ó��-------------");
		System.out.println(" 1.���� ó�� �ο��� �Է� ");
		System.out.println(" 2.��ȣ,�̸�, �ڹ�, JSP, Spring ������ �Է� ");
		System.out.println(" 3.���� ó�� ����(����, ���, ����) ");
		System.out.println(" 4.���� ��� ��� ");
		System.out.println(" 5.���� ");
		System.out.println("--------------------------------------");
		int selectedMenu = sc.nextInt();
				
			switch(selectedMenu) {
			case 1: SungjukInputInwon(); break;
			case 2: SungjukInput(); break;
			case 3: SungjukProcess(); break;
			case 4: SungjukOutput(); break;
			case 5: System.out.println("�����ý����� �����մϴ�.");
				sungjukkey = false;
			}
		}
	}// end of main()	

}// end of class
