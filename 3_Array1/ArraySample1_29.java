package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* algorithm? 주어진 과제에 대한 해결을 하기 위하여 프로그래머의 생각(사고) 
 * - 1차적인 문제 해결 방법: Java API
 * - 2차적인 문제 해결 방법: 인터넷(구글링), 네이버
 * - 3차적인 문제 해결 방법: 전문가의 도움
 * - 노력, 시간, 인내심....
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
public class ArraySample1_29 {

	public static void main(String[] args) {
		int[] dal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 년을 입력해 주세요.");
		int year = sc.nextInt();// 2021
		System.out.println("해당 월을 입력해 주세요.");
		int month = sc.nextInt();// 3
		System.out.println("해당 일을 입력해 주세요.");
		int day = sc.nextInt();// 29
		
		// 입력받은 년도가 윤년이라면 2월은 29일로 설정
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			dal[1] = 29;
		
		// 1년 1월 1일로 부터 입력받은 전년까지 지나온 날짜의 합을 구합니다.  
		int nal = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		// nal에 입력받은 전달까지의 지나온 날짜의 합을 구합니다.
		for(int i=0; i < month-1; i++) 
			nal += dal[i];
			
			nal += day; // nal에 오늘 날짜를 더합니다.
				
		switch(nal % 7) {
		case 0: System.out.println("일요일"); break;
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); 		
		}
	} // main method end

} // class end

