package OOP;

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
public class ArraySample2_12_1 {

	private static Scanner sc = new Scanner(System.in);
	private static String grade;

	static boolean k = true;
	static int n;
	static int num = 1;
	private static double sum;// 0.0 = > ?
	private static double aver;// 0.0 = > ?

	public static void sungjuk() {
		
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
		ArraySample2_12_1 as2_12_1 = new ArraySample2_12_1();
		as2_12_1.sungjuk();

	}

}

/*
 * package Array2;
 * 
 * import java.util.Scanner;
 * 
 * /* Name, Java, JSP, Spring ������ �Է� �޾Ƽ� ���� ó�� ó�� ����> 1.method()�̿� �մϴ�.
 * 
 * ����, ���, ���� ���ϱ� ------------------- ȫ�浿���� ����ǥ ------------------- ���� : ��� : ����
 * : -------------------
 * 
 */
/*
 * public class ArraySample2_12 {
 * 
 * private static Scanner sc = new Scanner(System.in);
 * 
 * 
 * static boolean k = true; static int n; static int num = 1; private static
 * double sum;// 0.0 = > ? // 0.0 = > ?
 * 
 * public static void main(String[] args) {
 * 
 * while(k) { System.out.println("����� �л� ���� ó���� �Ͻðڽ��ϱ�?"); n = sc.nextInt();
 * 
 * k = false; }
 * 
 * double jumsu[][] = new double[n][7];// ����(3), ����, ���, ���� ���� 7�ڸ� String name[]
 * = new String[n];//�̸� �迭
 * 
 * k = true;
 * 
 * while(k) {
 * 
 * for (int i = 0; i < jumsu.length; i++) { System.out.println(num +
 * "�� �л��� ������ �Է��� �ּ���."); System.out.println("�̸��� �Է��� �ּ���."); name[i] =
 * sc.next();
 * 
 * for(int j=0; j < 5; j++) { switch (j) {
 * 
 * case 0: jumsu[i][j] = num; break; case 1:
 * System.out.println("�ڹ� ������ �Է� �ϼ���."); jumsu[i][j] = sc.nextInt(); break; case
 * 2: System.out.println("JSP ������ �Է� �ϼ���."); jumsu[i][j] = sc.nextInt(); break;
 * case 3: System.out.println("������ ������ �Է� �ϼ���."); jumsu[i][j] = sc.nextInt();
 * break; } } num++; } k = false; } double[] aver = new double[jumsu.length];
 * for(int i=0; i < jumsu.length; i++) { sum = jumsu[i][1] + jumsu[i][2] +
 * jumsu[i][3];//���� ���ϱ� jumsu[i][4] = sum; aver[i] = (sum / 3);// ��� ���ϱ�
 * jumsu[i][5] = aver[i];
 * 
 * 
 * } String[] grade = new String[jumsu.length];
 * 
 * ��ó: https://ifuwanna.tistory.com/231 [IfUwanna IT] //���� ���ϱ� for(int i=0; i <
 * jumsu.length; i++) { switch ((int)jumsu[i][5] / 10) { case 10: case 9:
 * grade[i] = "A"; break; case 8: grade[i] = "B"; break; case 7: grade[i] = "C";
 * break; case 6: grade[i] = "D"; break; default: grade[i] = "F"; }}
 * 
 * // ���� ����ϱ�
 * System.out.println("-------------------------------------------------");
 * System.out.println("��ȣ\t�̸�\t�ڹ�\tJSP\t������\t����\t����\t���");
 * System.out.println("-------------------------------------------------");
 * 
 * for(int i = 0; i < jumsu.length;i++) { System.out.print(num + "\t" + name[i]
 * + "\t" + jumsu[i][1] + "\t" + jumsu[i][2] + "\t" + jumsu[i][3] + "\t" +
 * jumsu[i][4] + "\t"+grade[i]+ "\t");
 * 
 * for (int j = 1; j < jumsu[i].length; j++) { if (j == 5) {
 * 
 * System.out.print(String.format("%.2f", jumsu[i][j]) + " "); }
 * 
 * 
 * } System.out.println(); }
 * 
 * }}
 * 
 */