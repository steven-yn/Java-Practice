package OOP;

import java.util.Scanner;

/* ����> 2���� ���ڸ� �Է� �޾Ƽ� �հ踦 ���ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 */
public class OOPSample5 {
	
	 static double sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1��° ���ڸ� �Է��ϼ���.");
		double x = sc.nextDouble();
		System.out.println("-- 2��° ���ڸ� �Է��ϼ���.");
		int y = sc.nextInt();

		double sum = x + y;
		return sum; 
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		OOPSample5 os5 = new OOPSample5();
		double hapgye = os5.sum();
		System.out.println("1.��ȯ��O	��������X : " + hapgye);// 
	}

}
