package OOP;

import java.util.Scanner;

//�Ű������� ���� ó��
public class OOPSample_6chapter14 {
			
	
	private static double divide(int su1, int su2) {
		int sum = su1 + su2;
		return sum;
	}
	
	private static double divide2(int su3, int su4) {
		int sum = su3 + su4;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �����͸� �Է� �ϼ���.");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		double su3 = sc.nextDouble();
		double su4 = sc.nextDouble();
		
		double result = divide(su1, su2); 	
		System.out.println("���� + ����  : "  + result); 
		System.out.println("------------");
		
		double result2 = divide2((int)su3, (int)su4); 	
		System.out.println("�Ǽ� + �Ǽ�  : "  + result2); 
		System.out.println("------------");
	}

	

	

	

	

}
