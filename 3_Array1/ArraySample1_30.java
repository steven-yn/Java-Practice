package Array1;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/* algorithm? �־��� ������ ���� �ذ��� �ϱ� ���Ͽ� ���α׷����� ����(���) 
 * - 1������ ���� �ذ� ���: Java API : Calendar class �̿�
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
public class ArraySample1_30 {

	public static void main(String[] args) {
		// int[] dal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		Scanner sc = new Scanner(System.in);
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int year = sc.nextInt();// 2021
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int month = sc.nextInt();// 3
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int day = sc.nextInt();// 29

		// ��ǻ�� ���� API �̿�
		Calendar cal = Calendar.getInstance();

		// �ش� ����Ͽ� ���� ���� ���ϱ�
		int date = cal.get(Calendar.DAY_OF_WEEK);

		// ���ؾ� �� ������� ����
		cal.set(year, month - 1, day);

		String ch_week = " ";

		// ������ �߿��� ���° ������ ǥ��
		switch (cal.get(cal.DAY_OF_WEEK)) {
		case Calendar.SUNDAY: ch_week = "�Ͽ���"; break;
		case Calendar.MONDAY:
			ch_week = "������";
			break;
		case Calendar.TUESDAY:
			ch_week = "ȭ����";
			break;
		case Calendar.WEDNESDAY:
			ch_week = "������";
			break;
		case Calendar.THURSDAY:
			ch_week = "�����";
			break;
		case Calendar.FRIDAY:
			ch_week = "�ݿ���";
			break;
		case Calendar.SATURDAY:
			ch_week = "�����";
		}
		System.out.println(date);// 29
		System.out.println(ch_week);// ������

	} // main method end

} // class end
