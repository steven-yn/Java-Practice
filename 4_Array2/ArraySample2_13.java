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
//2���� �迭�� ���� ó�� ����

public class ArraySample2_13 {

	static int num = 1, n = 0, kor = 0, eng = 0, mat = 0, sum = 0;
	static double aver = 0;
	static Scanner scanner = new Scanner(System.in);
	static boolean k = true;
	private static String grade;

	public static void main(String[] args) {
		
		while (k) {  //true
			
				System.out.println("�Է��Ͻ� �л� ���� �Է����ּ���");
				n = scanner.nextInt();
				
				k = false;			
		}

		double jumsu[][] = new double[n][8];//[7][7] => 0~6 0~6
		String name[] = new String[n];//7
		k = true;
		System.out.println();

		while (k) {
			
				for (int i = 0; i < name.length; i++) {
					System.out.println(num + "�� �л��� ������ �Է��� �ּ���");
					System.out.println("������ �Է��� �ּ���");
					name[i] = scanner.next();
					
					for (int j = 0; j < 5; j++) {
						switch (j) {
						case 0:
							jumsu[i][j] = num;//grade[0][0] = 2021001
							break;
						case 1:
							System.out.println("���������� �Է��� �ּ���");
							jumsu[i][j] = scanner.nextInt();//grade[0][1] = 100.0
							break;
						case 2:
							System.out.println("���������� �Է��� �ּ���");
							jumsu[i][j] = scanner.nextInt();//grade[0][2] = 99.0
							break;
						case 3:
							System.out.println("���������� �Է��� �ּ���");
							jumsu[i][j] = scanner.nextInt();//grade[0][3] = 100.0
							break;
						}
					}
					System.out.println();
					num++;//2021002, 2021003.....
				}
				k = false;
			} 
		

		for (int i = 0; i < jumsu.length; i++) {
			sum = (int) (jumsu[i][1] + jumsu[i][2] + jumsu[i][3]);
			jumsu[i][4] = sum;
			aver = jumsu[i][4] / 3.0;
			jumsu[i][5] = aver;//��� ����
		}

		//���� ���ϱ�
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
		
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i][6] = 1;//1�� ���� �ʱ�ȭ, [0][6]=1, [1][6]=1, [2][6]=1, [3][6]=1....[6][6]=1
		}

		//���� ���ϱ� ��ƾ
		for (int i = 0; i < jumsu.length; i++) {
			for (int j = 0; j < jumsu.length; j++) {
				if (jumsu[i][5] < jumsu[j][5]) {   // [i][5]=99 < [j][5]= 100
					jumsu[i][6]++;
				}
			}
		}

		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("                                            ��         ��         ǥ                                               ");
		System.out.println("��ȣ\t\t�̸�\t\t����\t\t����\t\t����\t\t����\t\t���\t\t����");
		System.out.println("---------------------------------------------------------------------------------------------");

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print((int) jumsu[i][0] + "\t\t" + name[i] + "\t\t");

			for (int j = 1; j < jumsu[i].length; j++) {

				if (j == 5) { //��տ� ���Ͽ� �Ҽ��� ���� �ڸ��� �� ���� ���
					System.out.print(String.format("%.2f", jumsu[i][j]) + "\t\t");
				} else {
					System.out.print((int) jumsu[i][6] + "\t\t");
					//System.out.print(grade);
				} 

			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------------------------");

	}
}
