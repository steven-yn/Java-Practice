package Array1;

import java.util.Scanner;

/* ����> �����͸� 5�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���
 * - �� ������ �߿��� Ȧ�� �������� �հ踦 ���ϰ�, ¦�� �������� �հ踦 ���Ͽ� ����մϴ�.
 */
public class ArraySample1_3 {

	public static void main(String[] args) {
		int even=0, odd=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		int su = sc.nextInt();// 5

		int number[] = new int[su];	

		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� ������ �����͸� �Է� �Ͻÿ�.");
			number[i] = sc.nextInt();
		}
		
		for (int i = 0; i < number.length; i++) {
			
			if(number[i]%2 == 0) {
				even+=number[i];
			}else {
				odd+=number[i];
			}						
		}
		System.out.println("number �迭�� Ȧ���� �հ� : " + odd);
		System.out.println("number �迭�� ¦���� �հ� : " + even);
		
	}

}
