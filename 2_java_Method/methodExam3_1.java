package methodSample;

import java.util.Scanner;

public class methodExam3_1 {
	
		private static void sum(byte x, int y) {  
			double sum = x + y;//55, ������ ����ȯ
			System.out.println("1.��ȯ��O	��������X : " + sum);//55.0
		} 

	public static void main(String[] args) {
		//3.��ȯ��X	��������O, if, for, main : ��������
		Scanner sc = new Scanner(System.in);
		System.out.println("-- 1��° ���ڸ� �Է��ϼ���.");
		byte x = sc.nextByte();//50
		System.out.println("-- 2��° ���ڸ� �Է��ϼ���.");
		int y = sc.nextInt();//5
				
		sum(x, y);//arguments				
	}
	//field area
	
	
}
