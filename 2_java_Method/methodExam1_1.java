package methodSample;

import java.util.Scanner;

/* method�� �����ΰ�?
 * �޼ҵ�� Ư���� ������ ���ϴ� ���ǹ��̳� �ݺ����� �Լ� ���·� ���� ����ϴ� ����� ���մϴ�.
 * �޼ҵ� ���� ���� 4���� ����
 * ----------------------
 * 		��ȯ��	��������
 * ----------------------
 * 1. 	O		O
 * 2. 	O		X
 * 3. 	X		O
 * 4. 	X		X
 * ----------------------
 * ����> �� ���� Ű����κ��� �Է��� �޾Ƽ�, �հ踦 ���ϴ� ���α׷��� �ۼ��մϴ�.
 * 
 */
public class methodExam1_1 {
//field area : Ŭ���� ���� = ��� ���� = static ���� = ���� ����
	
		private static float sum(float x, int y) {  // x=50, y=5, �Ű����� = parameter
			float sum = x + y;//55
			return sum;	//55		
		} 

	public static void main(String[] args) {
		//1.��ȯ��O	��������O, if, for, main : ��������
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1��° ���ڸ� �Է��ϼ���.");
		float x = sc.nextFloat();//50.123
		System.out.println("-- 2��° ���ڸ� �Է��ϼ���.");
		int y = sc.nextInt();//5
		//   55
		float hapgye = sum(x, y);//arguments, x=50, y=5, call by value, ��ü������ ���α׷���
		System.out.println("1.��ȯ��O	��������O : " + hapgye);//55
		
		
		
		
	}
	//field area
	
	
}
