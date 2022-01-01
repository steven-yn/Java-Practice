package OOP;

import java.util.Scanner;

/* 문제> 2개의 숫자를 입력 받아서 합계를 구하는 프로그램을 작성하세요.
 * -  OOPSample5 클래스의 메소드를 호출하여 OOPSample6에서 출력하는 프로그래밍.  
 */
public class OOPSample8 {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 조건> 7명의 성적을 입력받아서, 학점을 출력하세요.
		OOPSample7 os8 = new OOPSample7();
		
				os8.sungjuk();//4번 선택 
				
				//문제> 3번 선택으로 문제를 해결해 봅니다.
				for (int i = 0; i < 3; i++) {
				String str2 = os8.sungjuk2();//3번 선택
				System.out.println("학점은 : " + str2);//
				}
	}

}
