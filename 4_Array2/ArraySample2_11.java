package Array2;

import java.util.Scanner;

/* Name, Java, JSP, Spring ������ �Է� �޾Ƽ� ���� ó�� 
 * ó�� ����> 1.method()�̿� �մϴ�.
 * 
 * ����, ���, ���� ���ϱ�
 * -------------------
 * ȫ�浿���� ����ǥ
 * -------------------
 * ���� : 
 * ��� :
 * ���� :
 * -------------------
 * 
 */
public class ArraySample2_11 {

	private static String name;// null => ?
	private static double aver;//0.0 => ?
	private static int total;//0 => ?
	private static String grade;// null => ?
	
	private static Scanner sc = new Scanner(System.in);

	private static void name() {
		System.out.println("�л� �̸��� �Է��ϼ���.");
		 name = sc.next();
	}

	private static void calculator(int java, int jsp, int spring) {
		total = java + jsp + spring;
		aver = total / 3.0;
	}

	private static void hakjum() {
	
		switch ((int) aver / 10) {
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
		}
	}
	
		private static void sungjukOutput() {

			System.out.println("-------------------");
			System.out.println(name + "���� ����ǥ ");
			System.out.println("-------------------");
			System.out.println(" ���� : " + total + "��");
			System.out.println(" ��� : " + aver + "��");
			System.out.println(" ���� : " + grade);
			System.out.println("-------------------");
		}
			
		private static int input(String kwamok) {
		int jumsu;

		while (true) {
			System.out.println(kwamok + "���� �Է�");
			jumsu = sc.nextInt();// 100
			if (jumsu >= 0 && jumsu <= 100)
				break;

			System.out.println(kwamok + "���� �Է��� �߸��Ǿ����ϴ�. �ٽ� �Է��� �ּ���.");
		}
		return jumsu;// 100
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//�̸��� �Է��ϱ�
		name();		

		int java = input("�ڹ�");// 100
		int jsp = input("���̿�����");
		int spring = input("������");

		// ���� ���ϱ�
		calculator(java, jsp, spring);
		
		// ���� ���ϱ�
		 hakjum(); 
		 
		// ���� ����ϱ� 
		 sungjukOutput();
		 
	}

}
