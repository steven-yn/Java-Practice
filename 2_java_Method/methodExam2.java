package methodSample;

import java.util.Scanner;

public class methodExam2 {
//field area : Ŭ���� ���� = ��� ���� = static ���� = ���� ����
	
		private static int sum() {  
			Scanner sc = new Scanner(System.in);
			System.out.println("-- 1��° ���ڸ� �Է��ϼ���.");
			int x = sc.nextInt();//50
			System.out.println("-- 2��° ���ڸ� �Է��ϼ���.");
			int y = sc.nextInt();//5
			
			int sum = x + y;//55
			return sum;	//55		
		} 

	public static void main(String[] args) {
		//2.��ȯ��O	��������X, if, for, main : ��������
				
		//   55
		int hapgye = sum();//arguments
		System.out.println("1.��ȯ��O	��������X : " + hapgye);//55
		
		
		
		
	}
	//field area
	
	
}
