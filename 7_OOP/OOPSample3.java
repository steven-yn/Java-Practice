package OOP;

import java.util.Scanner;

/* ����> 2���� ���ڸ� �Է� �޾Ƽ� �հ踦 ���ϴ� ���α׷��� �ۼ��ϼ���.
 * - method()
 * - ��ü�� �����Ͽ� �޼ҵ� ȣ��
 * - X X
 * - X O
 * - O X
 * - O O
 * - 1.���������� �ڵ�
 * - 2.��ü������ �ڵ�
 */
public class OOPSample3 {
	  int divi(int x2, int y2) {
		int sum = x2 / y2;
		return sum;
	}

	  int multi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ ������ 2���� �Է��ϼ���.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x * y;
		return sum;
	}

	  void Subtract(int x, int y) {
		int sum = x - y;
		System.out.println("����: " + sum);//
	}

	void Adder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ ������ 2���� �Է��ϼ���.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("����: " + sum);//
	}

	public static void main(String[] args) {
		OOPSample3 os3 = new OOPSample3();
		
		Scanner sc = new Scanner(System.in);
				
		os3.Adder();// X X, ��ü��.�޼ҵ��
		
		System.out.println("������ ������ ������ 2���� �Է��ϼ���.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		os3.Subtract(x, y);// X O
		
		int sum = os3.multi();// O X		
		System.out.println("����: " + sum);//
		
		System.out.println("�������� ������ ������ 2���� �Է��ϼ���.");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int sum2 = os3.divi(x2, y2);// O O
		System.out.println("������: " + sum2); 
	}

}
