package Array1;

import java.util.Scanner;

/* 문제> 데이터를 5개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 정수형 입니다.
 * - 반복문 사용
 * 
 */
public class ArraySample1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받아서 처리할 데이터의 갯수는 ?");
		int su = sc.nextInt();// 300

		int number[] = new int[su];	

		for (int i = 0; i < number.length; i++) {
			System.out.println("number 배열에 정수형 데이터를 입력 하시오.");
			number[i] = sc.nextInt();
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("number 배열에 " + (i+1) + "번째 데이터는 "  + number[i]);			
		}
		
		
	}

}
