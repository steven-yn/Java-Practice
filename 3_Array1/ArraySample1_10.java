package Array1;

import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� �Ǽ��� �Դϴ�.
 * - �ݺ��� ���, method()����: ����, X X, method�� ������ ��� => �����Ͻÿ��� ������ ������, ��Ÿ�ӽÿ��� ������ ���� �ʽ��ϴ�.
 * - ������ �߿��� 3�� ����� �Ǹ鼭 ¦���� �������� �հ�� ������ ���Ͽ� ����մϴ�.
 */
public class ArraySample1_10 {
	public static int n;//0 => 10
	public static int count;//0 => 1
	public static double sum;// 0.0 => 72.0
	public static double number[] = new double[n];//Ŭ���� �迭
	public static Scanner sc = new Scanner(System.in);	
	
	public  void Drainage_input() {
		
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		 n = sc.nextInt();// 10			
	}
	
	public  void Drainage_input2() {
		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
			number[i] = sc.nextDouble();
		}		
	}
	
	public  void Drainage_process() {
				
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 3 == 0 && number[i] % 2 == 0) {
				sum += number[i];
				count++;
			}			
		}		
	}
	
	public  void Drainage_output() {
		System.out.println("3�ǹ�� ���� " + sum + "�̰�, ������ " + count + "�Դϴ�.");		
	}
	
	public static void main(String[] args) {
		ArraySample1_10 as10 = new ArraySample1_10();
		
		as10.Drainage_input();//�������� ���� ����
		as10.Drainage_input2();
		as10.Drainage_process();
		as10.Drainage_output();
	}

	

}




