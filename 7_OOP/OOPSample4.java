package OOP;

import java.util.Scanner;

/* ����> 2���� ���ڸ� �Է� �޾Ƽ� �հ踦 ���ϴ� ���α׷��� �ۼ��ϼ���.
 * - OOPSample3�� �ִ� method()�� �����ٰ�(�����Ͽ�) ȣ���ϸ� 4���� method�� ������ �� �־��ϴ�.
 */
public class OOPSample4 {
	

	public static void main(String[] args) {
		OOPSample3 os4 = new OOPSample3();
		os4.Adder();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ ������ 2���� �Է��ϼ���.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		os4.Subtract(x, y);
		
		int sum = os4.multi();
		System.out.println("����: " + sum);//
		
		System.out.println("�������� ������ ������ 2���� �Է��ϼ���.");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int sum2 = os4.divi(x2, y2);
		System.out.println("������: " + sum2); 
	}

}
