package Array1;

import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� �Ǽ��� �Դϴ�.
 * - �ݺ��� ���, method()����: ����, O X, ������ �޼ҵ� ���� 
 * - ������ �߿��� 3�� ����� �Ǹ鼭 ¦���� �������� �հ�� ������ ���Ͽ� ����մϴ�.
 */
public class ArraySample1_14 {
	private static int n;
	private static int count;//0 => 1 => 2....
	private static double sum;//0.0 => 12.0 + 24.0 =>36.0 + 72.0 => 108.0
	private static Scanner sc = new Scanner(System.in);	
	
	private static int Drainage_input() {	
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		 n = sc.nextInt();// 10	
		 
		 return n;	//10 	
	}
		
	private static void Drainage_process() {		
				
		n = Drainage_input();// 10
		
		double number[] = new double[n];	
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
			number[i] = sc.nextDouble();			
		}
				
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 3 == 0 && number[i] % 2 == 0) {				
				sum += number[i];	
				count++;
			}
			//
		}	
	}
	
	public static void main(String[] args) {

		 Drainage_process();
				
		System.out.println("3�ǹ�� ���� " + sum + "�̰�, ������ " + count + "�Դϴ�.");
	}

}
