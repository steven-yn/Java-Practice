package Array1;

import java.util.Scanner;

/* ����> �����͸� 5�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���
 * 
 */
public class ArraySample1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		int su = sc.nextInt();// 300

		int number[] = new int[su];	

		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� ������ �����͸� �Է� �Ͻÿ�.");
			number[i] = sc.nextInt();
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� " + (i+1) + "��° �����ʹ� "  + number[i]);			
		}
		
		
	}

}
