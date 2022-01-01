package Array1;

import java.util.Scanner;

/* 문제> 데이터를 5개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 정수형 입니다.
 * - 반복문 사용
 * - 이 데이터 중에서 음수 데이터는 skip을 하고, 양수 데이터의 합계와 갯수를 구하여 출력합니다.
 */
public class ArraySample1_5 {

	public static void main(String[] args) {
		int positive=0, count_pos=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받아서 처리할 데이터의 갯수는 ?");
		int su = sc.nextInt();// 5

		int number[] = new int[su];	

		for (int i = 0; i < number.length; i++) {
			System.out.println("number 배열에 정수형 데이터를 입력 하시오.");
			number[i] = sc.nextInt();
		}
		
		for (int i = 0; i < number.length; i++) {
			
			if(number[i] < 0) {
				continue;//skip
			}else {
				positive+=number[i];
				count_pos++;
			}						
		}
		System.out.println("number 배열에 양수의 합계 : " + positive + ", 갯수는 : " + count_pos);
		
	}

}
