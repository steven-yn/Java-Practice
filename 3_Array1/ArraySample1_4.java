package Array1;

import java.util.Scanner;

/* ����> �����͸� 5�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���
 * - �� ������ �߿��� ���� �������� �հ�� ������ ���ϰ�, ��� �������� �հ�� ������ ���Ͽ� ����մϴ�.
 */
public class ArraySample1_4 {

	public static void main(String[] args) {
		int positive=0, negative=0, count_pos=0, count_neg=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		int su = sc.nextInt();// 5

		int number[] = new int[su];	

		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� ������ �����͸� �Է� �Ͻÿ�.");
			number[i] = sc.nextInt();
		}
		
		for (int i = 0; i < number.length; i++) {
			
			if(number[i] >= 0) {
				positive+=number[i];
				count_pos++;
			}else {
				negative+=number[i];
				count_neg++;
			}						
		}
		System.out.println("number �迭�� ������ �հ� : " + negative + ", ������ : " + count_neg);
		System.out.println("number �迭�� ����� �հ� : " + positive + ", ������ : " + count_pos);
		
	}

}
