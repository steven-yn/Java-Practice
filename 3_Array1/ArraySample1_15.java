package Array1;

import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� �Ǽ��� �Դϴ�.
 * - �ݺ��� ���, method()����: ����, O O, �ϳ��� �޼ҵ� ����
 * - ������ �߿��� 3�� ����� �Ǹ鼭 ¦���� �������� �հ�� ������ ���Ͽ� ����մϴ�.
 */
public class ArraySample1_15 {
	
	private static Scanner sc = new Scanner(System.in);

	private static double Drainage_process(int n) {
		double sum=0.0;
		int count=0;
		
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
		System.out.println("ī��Ʈ : " + count); 
		return sum; 
	}
	
	public static void main(String[] args) {
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		int n = sc.nextInt();// 10
		
		double sum = Drainage_process(n);
				 
		System.out.println("3�ǹ�� ���� " + sum);
	}

	

}
