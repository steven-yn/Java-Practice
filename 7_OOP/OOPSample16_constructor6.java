package OOP;

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
public class OOPSample16_constructor6 {

	private int year;//0 => 
	private int month;//0 =>
	private int day;//0 => 	
	
	public OOPSample16_constructor6(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private void CalendarDay() {
		
		// ��ǻ�� ���� API �̿�
				Calendar cal = Calendar.getInstance();

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
				System.out.println(ch_week);// �����
	}	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int year = sc.nextInt();// 2021
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int month = sc.nextInt();// 4
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int day = sc.nextInt();// 1
		
		OOPSample16_constructor6 oop16_6 = new OOPSample16_constructor6(year, month, day);
		oop16_6.CalendarDay();	

		
	} // main method end	

} // class end
