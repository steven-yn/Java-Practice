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
 *  �� : 4
 *  �� : 1
 * ---------------------------
 *  ��� : ����� 
 * ---------------------------
 *
 * ������ �����ε��� �̿��Ͽ� ������ �ذ� �ϼ���. 
 * Ư¡> �ڷ����̳� �������� ������ �ٸ��� ���� ������ �˴ϴ�.
 */
public class OOPSample16_constructorOverloading {

	private static final String oop16_6_1 = null;
	private int year;// 0 =>
	private int month;// 0 =>
	private int day;// 0 =>

	public OOPSample16_constructorOverloading(int month) {
		this.month = month;
	}

	public OOPSample16_constructorOverloading(int year, int day) {
		this.year = year;
		this.day = day;
	}

	private void CalendarDay() {

		// ��ǻ�� ���� API �̿�
		Calendar cal = Calendar.getInstance();

		// ���ؾ� �� ������� ����
		cal.set(year, (month - 1), day);

		String ch_week = " ";

		// ������ �߿��� ���° ������ ǥ��
		switch (cal.get(cal.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			ch_week = "�Ͽ���";
			break;
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
		int month =  sc.nextInt();// 4
		System.out.println("�ش� ���� �Է��� �ּ���.");
		int day = sc.nextShort();// 1

		OOPSample16_constructorOverloading oop16_6 = new OOPSample16_constructorOverloading(year, day);
		OOPSample16_constructorOverloading oop16_6_1 = new OOPSample16_constructorOverloading(month);

		oop16_6_1.CalendarDay();
		
		/*
		 * �̷��� ��쿡�� ������ �����ε��� �ʿ����� �ʽ��ϴ�
		 * ������ 3���� �����Ͱ� �ϳ��� ���ÿ� ó�� �Ǿ�� �ϹǷ�
		 * �׽�Ʈ �غ��� ����� Ʋ���� ���ɴϴ�.
		 */

	} // main method end

} // class end
