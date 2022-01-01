package Array1;

import java.util.Arrays;
import java.util.Scanner;

/* ����> �ڹٿ��� �⺻������ �����ϴ� sort()�� �ֽ��ϴ�.
 * �����͸� 10�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���
 * - ����� ���������� ����Ǿ� ��Ÿ���ϴ�.
 */
public class ArraySample1_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		int su = sc.nextInt();// 10

		int number[] = new int[su];// index�� 0~9 : 10�� ����, �޸𸮴� 4byte X 10 = 40byte�Ҵ�

		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� ������ �����͸� �Է� �Ͻÿ�.");
			number[i] = sc.nextInt();
		}

		Arrays.sort(number);// number �迭�� ��� �ִ� �����͸� ���������϶�.

		String toQuery = Arrays.toString(number);
		System.out.println(toQuery);//

		// ����> ���������� �����Ͽ� ����ϼ���.
		// [8, 9, 12, 34, 45, 55, 56] => [56, 55, 45, 34, 12, 9, 8]

		//             10-1= 9          -1 > -1
		System.out.print("[");
		for (int k = number.length - 1; k > -1; k--) {
			System.out.print(number[k] + ", ");
			
			//k[9]=89 , k[8]=78, k[7]=34, k[6]=12, k[5]=5.......k[0]=234
		}
		System.out.println("]");
	}

	}

	