package Array1;

import java.util.Scanner;

/* ����> �����͸� 5�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���
 * - �� ������ �߿��� ���� �����ʹ� skip�� �ϰ�, ��� �������� �հ�� ������ ���Ͽ� ����մϴ�.
 */
public class ArraySample1_5 {

	public static void main(String[] args) {
		int positive=0, count_pos=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		int su = sc.nextInt();// 5

		int number[] = new int[su];	

		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� ������ �����͸� �Է� �Ͻÿ�.");
			number[i] = sc.nextInt();
		}
		
		for (int i = 0; i < number.length; i++) {
			
			if(number[i] < 0) {
				continue;//skip
			}else {
				positive+=number[i];
				count_pos++;
			}						
		}
		System.out.println("number �迭�� ����� �հ� : " + positive + ", ������ : " + count_pos);
		
	}

}
