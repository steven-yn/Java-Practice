package OOP;

import java.util.Scanner;

/* 문제> 2개의 숫자를 입력 받아서 합계를 구하는 프로그램을 작성하세요.
 * -  OOPSample5 클래스의 메소드를 호출하여 OOPSample6에서 출력하는 프로그래밍.  
 */
public class OOPSample7 {
	
private static String str;//null	
	
	public static void sungjuk() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("성적을 입력해 주세요 : ");
			int score = sc.nextInt();

			if (score >= 90)
				System.out.println("점수가 90점 이상이고, A학점 입니다.");
			else if (score >= 80)
				System.out.println("점수가 80점 이상이고, B학점 입니다.");

			else if (score >= 70)
				System.out.println("점수가 70점 이상이고, C학점 입니다.");

			else if (score >= 60)
				System.out.println("점수가 60점 이상이고, D학점 입니다.");
			else {
				System.out.println("F학점 입니다.");
			}
			// 여기로 탈출합니다.
		}
	}	
	
	public static String sungjuk2() {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("성적을 입력해 주세요 : ");
			int score = sc.nextInt();

			if (score >= 90)
				 str = "점수가 90점 이상이고, A학점 입니다.";
			else if (score >= 80)
				str = "점수가 80점 이상이고, B학점 입니다.";

			else if (score >= 70)
				str = "점수가 70점 이상이고, C학점 입니다.";

			else if (score >= 60)
				str = "점수가 60점 이상이고, D학점 입니다.";
			else {
				str = "F학점 입니다.";				
			}
			// 여기로 탈출합니다.
			return str;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 조건> 7명의 성적을 입력받아서, 학점을 출력하세요.
		OOPSample7 os7 = new OOPSample7();
		
				os7.sungjuk();//4번 선택 
				
				//문제> 3번 선택으로 문제를 해결해 봅니다.
				for (int i = 0; i < 3; i++) {
				String str2 = os7.sungjuk2();//3번 선택
				System.out.println("학점은 : " + str2);//
				}
	}

}
