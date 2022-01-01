package Array1;

import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���, method()����: ���� ������ �������...�����ؼ� �����մϴ�.
 * - ������ �߿��� 4��° ������ ���� 100���� �����ϰ� ����մϴ�.
 * - �׸���, ��� ������ ���� 0���� �ʱ�ȭ ��Ű�� ����մϴ�.
 */
public class ArraySample1_17 {
	private static int n;
	private static int test[];

	private static void element1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է¹��� ������ ������ �Է��� �ּ���.");
		n = sc.nextInt();

		test = new int[n];

		for(int i = 0; i < test.length; i++) {
			test[i] = sc.nextInt();
			System.out.print(test[i] + " ");
		}
		System.out.println();

		test[3] = 100;
	}

	private static void element2() {
		for(int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();
	}

	private static void element3() {
		for(int i = 0; i < test.length; i++) {
			test[i] = 0;
			System.out.print(test[i] + " ");
		}
	}

	public static void main(String[] args) {
		// ������ �Է�
		element1();

		// ������ �Ϻ� ����
		element2();

		// ������ �ʱ�ȭ
		element3();

	}
}
