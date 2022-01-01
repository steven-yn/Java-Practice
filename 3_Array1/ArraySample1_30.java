package Array1;

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
 *  월 : 3
 *  일 : 29
 * ---------------------------
 *  결과 : 월요일 
 * ---------------------------
 *
 */
public class ArraySample1_30 {

	public static void main(String[] args) {
		// int[] dal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		Scanner sc = new Scanner(System.in);
		System.out.println("해당 년을 입력해 주세요.");
		int year = sc.nextInt();// 2021
		System.out.println("해당 월을 입력해 주세요.");
		int month = sc.nextInt();// 3
		System.out.println("해당 일을 입력해 주세요.");
		int day = sc.nextInt();// 29

		// 컴퓨터 제공 API 이용
		Calendar cal = Calendar.getInstance();

		// 해당 년월일에 대한 요일 구하기
		int date = cal.get(Calendar.DAY_OF_WEEK);

		// 구해야 할 년월일을 저장
		cal.set(year, month - 1, day);

		String ch_week = " ";

		// 일주일 중에서 몇번째 인지를 표시
		switch (cal.get(cal.DAY_OF_WEEK)) {
		case Calendar.SUNDAY: ch_week = "일요일"; break;
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
		System.out.println(date);// 29
		System.out.println(ch_week);// 월요일

	} // main method end

} // class end
