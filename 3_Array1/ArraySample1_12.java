package Array1;

import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� �Ǽ��� �Դϴ�.
 * - �ݺ��� ���, method()����: ����, X O, method�� ������ ���. 
 * - ������ �߿��� 3�� ����� �Ǹ鼭 ¦���� �������� �հ�� ������ ���Ͽ� ����մϴ�.
 */
public class ArraySample1_12 {
	//private static double sum;//0.0 
	//private static int count;//0
	
	//�޸𸮻󿡼� Ŭ���������� ����̵Ǹ�....���������� ��ġ�ԵǾ �浹 ������ �Ͼ�ϴ�.
	// �޸� �󿡼� �����Ͱ� ������ϴ�. ��, �����ϴ�.
	// �����ϸ�> private static int count;//0 
	// => �̷��� �ڵ��Ͽ��� ���� �˴ϴ�.
	
	private static void Drainage_input() {
		double sum=0.0;
		int count=0;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		int n = sc.nextInt();// 10

		double number[] = new double[n];

		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
			number[i] = sc.nextDouble();			
		}
		Drainage_process(number, sum, count);// �������� ���� ����
	}

	private static void Drainage_process(double[] number, double sum, int count) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 3 == 0 && number[i] % 2 == 0) {
				sum += number[i];
				count++;
			}
			//
		}
		System.out.println("3�ǹ�� ���� " + sum + "�̰�, ������ " + count + "�Դϴ�.");
	}

	public static void main(String[] args) {

		Drainage_input();

	}

}
