package OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ����> ������ ���� �迭�� ���� �մϴ�.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���
 * - �̵� �迭�� �޼ҵ� �������� ���� ������ ��ü�� �̿��Ͽ� ȣ���� �ǵ��� ���α׷��� �մϴ�.
 */
public class OOPSample14 {

	private static Scanner sc = new Scanner(System.in);
	private static String grade;

	static boolean k = true;
	static int n;
	static int num = 1;
	private static double sum;// 0.0 = > ?
	private static double aver;// 0.0 = > ?	
	
	private void ArrayList1() {
		int[][] num = new int[5][5];
		int su = 0;

		for (int i = 0; i < num.length; i++) {

			for (int j = i; j >= 0; j--) {
				su++;
				num[i][j] = su;
			}
		}

		int i = 0;
		for (; i < num.length; i++) {

			for (int j = 0; j < num.length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private  void ArrayList2() {
		int[][] num = new int[5][5];
		int su = 0;
		
		for (int i = 0; i < num.length - 3; i++) { 

			for (int j = i; j <= 4 - i; j++) {				
				su++;
				num[i][j] = su;			
			}
		}
		
		for (int i = 2; i <= 4; i++) {

			for (int j = 4-i; j <= i; j++) {				
				su++;
				num[i][j] = su;					
			}
		}

		int i = 0;
		for (; i < num.length; i++) {

			for (int j = 0; j < num.length; j++) { 
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private  void ArrayList3() {
		
		while (k) {	
			System.out.println("����� �л� ���� ó���� �Ͻðڽ��ϱ�?");
			n = sc.nextInt();

			k = false;		
		}

		// double jumsu[][] = new double[n][7];// ����(3), ����, ���, ���� ���� 7�ڸ�
		double[][] jumsu = new double[n][7];// ����(3), ����, ���, ���� ���� 7�ڸ�
		// String name[] = new String[n];//�̸� �迭
		String[] name = new String[n];// �̸� �迭

		k = true;

		while (k) {

			for (int i = 0; i < jumsu.length; i++) {
				System.out.println(num + "�� �л��� ������ �Է��� �ּ���.");
				System.out.println("�̸��� �Է��� �ּ���.");
				name[i] = sc.next();

				for (int j = 0; j < 5; j++) {
					switch (j) {

					case 0:
						jumsu[i][j] = num;
						break;
					case 1:
						System.out.println("�ڹ� ������ �Է� �ϼ���.");
						jumsu[i][j] = sc.nextInt();
						break;
					case 2:
						System.out.println("JSP ������ �Է� �ϼ���.");
						jumsu[i][j] = sc.nextInt();
						break;
					case 3:
						System.out.println("������ ������ �Է� �ϼ���.");
						jumsu[i][j] = sc.nextInt();
						break;
					}
				}
				num++;
			}
			k = false;
		}

		for (int i = 0; i < jumsu.length; i++) {
			sum = jumsu[i][1] + jumsu[i][2] + jumsu[i][3];// ���� ���ϱ�
			jumsu[i][4] = sum;
			aver = jumsu[i][4] / 3.0;// ��� ���ϱ�
			jumsu[i][5] = aver;

		}

		// ���� ����ϱ�
		System.out.println("-----------------------------------------------------------");
		System.out.println("��ȣ\t�̸�\t�ڹ�\tJSP\t������\t����\t���\t����");
		System.out.println("-----------------------------------------------------------");

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print((int) jumsu[i][0] + "\t" + name[i] + "\t" + jumsu[i][1] + "\t" + jumsu[i][2] + "\t"
					+ jumsu[i][3] + "\t" + jumsu[i][4] + "\t");
			 System.out.printf("%5.2f\t", jumsu[i][5]);

			// ���� ���ϱ�
			switch ((int) jumsu[i][5] / 10) {
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
			System.out.println(grade);
		}
	}
	
	public static void main(String[] args) {
		 OOPSample14 oop14 = new OOPSample14();
		 oop14.ArrayList1();		
		 oop14.ArrayList2();
		 oop14.ArrayList3();
	}

}
