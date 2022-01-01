package OOP;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/* algorithm? 주어진 과제에 대한 해결을 하기 위하여 프로그래머의 생각(사고) 
 * - 1차적인 문제 해결 방법: Java API : Calendar class 이용
 *
 * 문제8> 입력되는 날짜를 처리하여 해당 날자의 요일을 알아내는 프로그램을 작성하세요.
 * ---------------------------
 *  년도 : 2021
 *  월 : 4
 *  일 : 1
 * ---------------------------
 *  결과 : 목요일 
 * ---------------------------
 *
 * 생성자 오버로딩을 이용하여 문제를 해결 하세요. 
 * 특징> 자료형이나 데이터의 갯수가 다르면 구분 기준이 됩니다.
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

		// 컴퓨터 제공 API 이용
		Calendar cal = Calendar.getInstance();

		// 구해야 할 년월일을 저장
		cal.set(year, (month - 1), day);

		String ch_week = " ";

		// 일주일 중에서 몇번째 인지를 표시
		switch (cal.get(cal.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			ch_week = "일요일";
			break;
		case Calendar.MONDAY:
			ch_week = "월요일";
			break;
		case Calendar.TUESDAY:
			ch_week = "화요일";
			break;
		case Calendar.WEDNESDAY:
			ch_week = "수요일";
			break;
		case Calendar.THURSDAY:
			ch_week = "목요일";
			break;
		case Calendar.FRIDAY:
			ch_week = "금요일";
			break;
		case Calendar.SATURDAY:
			ch_week = "토요일";
		}
		System.out.println(ch_week);// 목요일
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("해당 년을 입력해 주세요.");
		int year = sc.nextInt();// 2021
		System.out.println("해당 월을 입력해 주세요.");
		int month =  sc.nextInt();// 4
		System.out.println("해당 일을 입력해 주세요.");
		int day = sc.nextShort();// 1

		OOPSample16_constructorOverloading oop16_6 = new OOPSample16_constructorOverloading(year, day);
		OOPSample16_constructorOverloading oop16_6_1 = new OOPSample16_constructorOverloading(month);

		oop16_6_1.CalendarDay();
		
		/*
		 * 이러한 경우에는 생성자 오버로딩이 필요하지 않습니다
		 * 원인은 3개의 데이터가 하나로 동시에 처리 되어야 하므로
		 * 테스트 해보면 결과가 틀리게 나옵니다.
		 */

	} // main method end

} // class end
