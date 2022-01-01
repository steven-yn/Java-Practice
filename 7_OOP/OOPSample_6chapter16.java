package OOP;

import java.util.Scanner;

// �Ű������� ������ �𸣴� ���
class Computer2 {

	public int sum1(int[] values1) {
		int sum = 0;

		for (int i = 0; i < values1.length; i++) {
			sum += values1[i];
		}
		return sum;
	}

	public int sum2(int... aaa) { // ���� �迭 ����
		int sum = 0;

		for (int i = 0; i < aaa.length; i++) {
			sum += aaa[i];
		}
		return sum;
	}

}

public class OOPSample_6chapter16 {
	
	public static void main(String[] args) {
		//��ü �ܺο��� ȣ��
		Computer2 mycom2 = new Computer2();

		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ó���� ���� �������� ������ �Է� �ϼ���.");
		n = sc.nextInt();
		int[] values1 = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("[values1]���� �����͸� �Է� �ϼ���.");
			values1[i] = sc.nextInt();
		}

		int result1 = mycom2.sum1(values1);
		System.out.println("values1[] : " + result1);// 60

		int[] aaa = new int[n];

		for (int i = 0; i < aaa.length; i++) {
			System.out.println("[aaa]���� �����͸� �Է� �ϼ���.");
			aaa[i] = sc.nextInt();
		}

		int result2 = mycom2.sum2(aaa);
		System.out.println("aaa[] : " + result2);// 1500

	}

}
