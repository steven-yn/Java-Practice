package Array1;

import java.util.Arrays;
import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� �Ǽ��� �Դϴ�.
 * - �ݺ��� ���
 * - ������ �߿��� 3�� ����� �Ǹ鼭 ¦���� �������� �հ�� ������ ���Ͽ� ����մϴ�.
 */
public class ArraySample1_8 {

	public static void main(String[] args) {
		int count=0;
		double sum=0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		int n = sc.nextInt();// 10

		double number[] = new double[n];// index�� 0~9 : 10�� ����, �޸𸮴� 4byte X 10 = 40byte�Ҵ�

		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
			number[i] = sc.nextDouble();			
		}

		for(int i=0; i < number.length; i++) {
			if(number[i]%3 ==0 && number[i]%2 ==0) {
				sum+=number[i];
				count++;				
			}	
			//
		}
		System.out.println("3�ǹ�� ���� " + sum + "�̰�, ������ " + count + "�Դϴ�.");		
		
		
	}

	}

	