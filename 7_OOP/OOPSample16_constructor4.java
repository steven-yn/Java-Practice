package OOP;

import java.util.Scanner;

import Array1.ArraySample1_10;

/* ����> 2���� ���ڸ� �Է� �޾Ƽ� �հ踦 ���Ͽ� ����ϼ���.
 * - ��, �����ڸ� �̿��Ͽ� �����͸� ���� �մϴ�.
 * - �׸���, ó���� ����� �Ϲ� �޼ҵ带 �̿��մϴ�.
 */
public class OOPSample16_constructor4 {
	private static int n;//0 => 5
	private static int count;//0 => 3
	private static double sum;// 0.0 => 18.0
	
	public static Scanner sc = new Scanner(System.in);
	private double[] number;	 
		
	public OOPSample16_constructor4(int n, double[] number) {
		this.n = n;
		this.number = number;
	}

	public  void Drainage_process() {
				
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 3 == 0) {
				sum += number[i];
				count++;
			}			
		}		
	}
	
	public  void Drainage_output() {
		System.out.println("3�ǹ�� ���� " + sum + "�̰�, ������ " + count + "�Դϴ�.");		
	}
	
	public static void main(String[] args) {
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		 n = sc.nextInt();// 10	
		
		 double number[] = new double[n];//Ŭ���� �迭
		 
		 for (int i = 0; i < number.length; i++) {
				System.out.println("number �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
				number[i] = sc.nextDouble();
			}	
		 
		OOPSample16_constructor4 oop16_4 = new OOPSample16_constructor4(n, number);
		
		oop16_4.Drainage_process();
		oop16_4.Drainage_output();
	}
	
}
