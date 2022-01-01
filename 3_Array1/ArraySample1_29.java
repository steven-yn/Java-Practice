package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* algorithm? �־��� ������ ���� �ذ��� �ϱ� ���Ͽ� ���α׷����� ����(���) 
 * - 1������ ���� �ذ� ���: Java API
 * - 2������ ���� �ذ� ���: ���ͳ�(���۸�), ���̹�
 * - 3������ ���� �ذ� ���: �������� ����
 * - ���, �ð�, �γ���....
 * 
 * ����8> �ԷµǴ� ��¥�� ó���Ͽ� �ش� ������ ������ �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
 * ---------------------------
 *  �⵵ : 2021
 *  �� : 3
 *  �� : 29
 * ---------------------------
 *  ��� : ������ 
 * ---------------------------
 *
 */
public class ArraySample1_29 {

	public static void main(String[] args) {
		int[] dal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int year = sc.nextInt();// 2021
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int month = sc.nextInt();// 3
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int day = sc.nextInt();// 29
		
		// �Է¹��� �⵵�� �����̶�� 2���� 29�Ϸ� ����
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			dal[1] = 29;
		
		// 1�� 1�� 1�Ϸ� ���� �Է¹��� ������� ������ ��¥�� ���� ���մϴ�.  
		int nal = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		// nal�� �Է¹��� ���ޱ����� ������ ��¥�� ���� ���մϴ�.
		for(int i=0; i < month-1; i++) 
			nal += dal[i];
			
			nal += day; // nal�� ���� ��¥�� ���մϴ�.
				
		switch(nal % 7) {
		case 0: System.out.println("�Ͽ���"); break;
		case 1: System.out.println("������"); break;
		case 2: System.out.println("ȭ����"); break;
		case 3: System.out.println("������"); break;
		case 4: System.out.println("�����"); break;
		case 5: System.out.println("�ݿ���"); break;
		case 6: System.out.println("�����"); 		
		}
	} // main method end

} // class end

