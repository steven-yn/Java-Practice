package Array1;

import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���, method()����: ���� ������ �������...�����ؼ� �����մϴ�.
 * - �Է� ������ �߿��� ���� ū ���� ���� ���� ���� ���Ͽ� ����ϼ���.
 * - ������> 110 20 130 40 150 260 270 380 90 100
 * - ���� ū �� > 380
 * - ���� ���� ��> 20
 * 
 */
public class ArraySample1_21 {
	private static int n;
	private static int dataTest[];
	private static Scanner sc = new Scanner(System.in);

	static void sortDataSuInput() {
		System.out.println("sort�迭�� ������ ������ ������ �Է��� �ּ���.");
		n = sc.nextInt();

		dataTest = new int[n];
	}

	static void sortDataInput() {
		for (int i = 0; i < dataTest.length; i++) {
			dataTest[i] = sc.nextInt();
		}
		System.out.println();
	}

	private static void dataMininum() {
		int min = dataTest[0];

		for (int i = 0; i < dataTest.length; i++) {
			if (min > dataTest[i]) {
				min = dataTest[i];
			}
		}
		System.out.println("�ּҰ��� = " + min); 
	}

	private static void dataMaxinum() {
		int max = dataTest[0];

		for (int i = 0; i < dataTest.length; i++) {
			if (max < dataTest[i]) {
				max = dataTest[i];
			}
		}
		System.out.println("�ִ밪�� = " + max); 
	}

	public static void main(String[] args) {
		// ������ �� �Է�
		sortDataSuInput();
		// ������ �Է�
		sortDataInput();
		// �ִ밪 ���ϱ�
		dataMaxinum();
		// �ּҰ� ���ϱ�
		dataMininum();
	}
}
