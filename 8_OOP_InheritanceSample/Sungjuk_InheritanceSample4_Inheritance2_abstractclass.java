package OOP_InheritanceSample;

import java.util.Scanner;

/* 
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
 * - 2) abstract class A extends B { .... } : ���� �߻�Ŭ������ ��쿡
 * 
 * *** Ư�� �޼ҵ�ȿ� ���� �迭�� ������ inwonsu = new int[inwon]; ���� �մϴ�.
 * *** �������� ����ϴ� �迭�� ������  static int inwon; ���� �մϴ�.
 * *** �Ϲ����� ������ int[] inwon = new int[inwon]; �̷����ϴ�.
 */

abstract class SungjukOutput22  {
	public abstract void SungjukOutput();
}

abstract class SungjukProcess22 extends SungjukOutput22 {
	public abstract void SungjukProcess();
}

abstract class SungjukInput22 extends SungjukProcess22 {
	abstract void SungjukInput();

}

abstract class SungjukInputInwon22 extends SungjukInput22 {
	abstract void SungjukInputInwon();
}

public class Sungjuk_InheritanceSample4_Inheritance2_abstractclass extends SungjukInputInwon22 {
	static Scanner sc = new Scanner(System.in);
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

	
	@Override
	public void SungjukInputInwon() {
		
		System.out.println("���� ó���� �ο����� �Է��ϼ���.");
		 inwon = sc.nextInt();		
	}
	
	
	@Override
	public void SungjukInput() {
		inwonsu = new int[inwon];
		bunho = new String[inwon];
		name = new String[inwon];
		java = new int[inwon];
		jsp = new int[inwon];
		spring = new int[inwon];		
		sungjuk = new int[inwon];	
		total = new int[inwon];
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

	@Override
	public void SungjukProcess() {		
				
		 for (int j = 0; j < inwonsu.length; j++) {
	         total[j] = java[j] + jsp[j] + spring[j];
	      }
		  for (int k = 0; k < inwonsu.length; k++) {
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
		      System.out.println();
		   }


	
	public void SungjukOutput() {
		System.out.println("------------------------ �� �� �� �� -------------------------");
		System.out.println("��ȣ\t �̸�\t �ڹ�\t JSP\t Spring\t ����\t ���\t ���� ");
		System.out.println("------------------------------------------------------------");

		for(int i = 0;i<inwon;i++){
		System.out.print(bunho[i]+"\t"+name[i]+"\t"+java[i]+"\t"+jsp[i]+"\t"+spring[i]+"\t"+total[i]+"\t");
		System.out.printf("%5.2f",average[i]);System.out.println("\t"+grade[i]);
		}
		System.out.println("------------------------------------------------------------");
		}
		
	
	public static void main(String[] args) {
		Sungjuk_InheritanceSample4_Inheritance2_abstractclass si =new Sungjuk_InheritanceSample4_Inheritance2_abstractclass();
		
		
		boolean sungjukkey = true;

		while (sungjukkey) {
			System.out.println("------------���� �Է� �� ó��-------------");
			System.out.println(" 1.���� ó�� �ο��� �Է� ");
			System.out.println(" 2.��ȣ,�̸�, �ڹ�, JSP, Spring ������ �Է� ");
			System.out.println(" 3.���� ó�� ����(����, ���, ����) ");
			System.out.println(" 4.���� ��� ��� ");
			System.out.println(" 5.���� ");
			System.out.println("--------------------------------------");
			int selectedMenu = sc.nextInt();

			switch (selectedMenu) {
			case 1:
				si.SungjukInputInwon();
				break;
			case 2:
				si.SungjukInput();
				break;
			case 3:
				si.SungjukProcess();				
				break;
			case 4:
				si.SungjukOutput();
				break;
			case 5:
				System.out.println("�����ý����� �����մϴ�.");
				sungjukkey = false;
			}
		}
	}// end of main()

}// end of class
