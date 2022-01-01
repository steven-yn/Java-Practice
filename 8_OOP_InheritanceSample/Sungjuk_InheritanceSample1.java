package OOP_InheritanceSample;

import java.util.Scanner;

/* �Է� ����� menu ����̸�, ���ڸ� �Է� �մϴ�.
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
 * - ����, �ݺ���, �޼ҵ�, switch~case, Array, Inheritance(interface, abstract class)  
 * - ����, �ݺ���, �޼ҵ�, switch~case ����
 * 
 * - ����> ������ �����͸� ���Ƽ� ó�� �˴ϴ�. *****************
 */
public class Sungjuk_InheritanceSample1 {

	private static String grade;
	private static String bunho;
	private static String name;
	private static int java;
	private static int jsp;
	private static double average;
	private static int total;
	private static int spring;

	private static void sungjukOutput() {
		System.out.println("------------------------ �� �� �� �� -------------------------");
		System.out.println("��ȣ\t �̸�\t �ڹ�\t JSP\t Spring\t ����\t ���\t ���� ");
		System.out.println("------------------------------------------------------------");
		System.out.print(bunho + "\t" + name + "\t" + java + "\t" + jsp + "\t" + spring + "\t" + total + "\t");
		System.out.printf("%5.2f", average);
		System.out.println("\t" + grade);
		System.out.println("------------------------------------------------------------");
	}

	public static void main(String[] args) {
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ó���� ���� �ο����� �Է��ϼ���.");
		int inwon = sc.nextInt();

		while (count < inwon) {
			count++;

			System.out.println("���� ó���� ���� �����͸� �Է��ϼ���.");
			System.out.println("��ȣ �����͸� �Է��ϼ���.");
			 bunho = sc.next();
			System.out.println("�̸� �����͸� �Է��ϼ���.");
			 name = sc.next();
			System.out.println("�ڹ� �����͸� �Է��ϼ���.");
			 java = sc.nextInt();
			System.out.println("JSP �����͸� �Է��ϼ���.");
			 jsp = sc.nextInt();
			System.out.println("Spring �����͸� �Է��ϼ���.");
			 spring = sc.nextInt();

			 total = java + jsp + spring;

			 average = total / 3.0;

			switch ((int) average / 10) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;

			}
			// ����� Ż��

		}
		sungjukOutput();
	}// end of main()

}// end of class
