package OOP;

import java.util.Scanner;

/* ����> 2���� ���ڸ� �Է� �޾Ƽ� �հ踦 ���Ͽ� ����ϼ���.
 * - ��, �����ڸ� �̿��մϴ�.
 */
public class OOPSample16_constructor3 {
	private static double x;//0.0 => 50.123
	private static int y;//0 => 5
	
	public OOPSample16_constructor3(double x, int y) {
		this.x = x;//50.123
		this.y = y;//5
	}

	private static double sum() {
		double sum = x + y;// 55.123
		return sum; // 55.123
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1��° ���ڸ� �Է��ϼ���.");
		double x = sc.nextDouble();// 50.123
		System.out.println("-- 2��° ���ڸ� �Է��ϼ���.");
		int y = sc.nextInt();// 5
		
		OOPSample16_constructor3 oop16_3 =  new OOPSample16_constructor3(x, y);

		double hapgye = oop16_3.sum();// arguments
		System.out.println("��ȯ��O	��������O : " + hapgye);// 55.123

	}

	
}
