package Array1;

import java.util.Arrays;
import java.util.Scanner;

/* 문제> 자바에서 기본적으로 제공하는 sort()가 있습니다.
 * 데이터를 10개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 정수형 입니다.
 * - 반복문 사용
 * - 결과는 오름차순이 적용되어 나타납니다.
 */
public class ArraySample1_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력받아서 처리할 데이터의 갯수는 ?");
		int su = sc.nextInt();// 10

		int number[] = new int[su];// index는 0~9 : 10개 생성, 메모리는 4byte X 10 = 40byte할당

		for (int i = 0; i < number.length; i++) {
			System.out.println("number 배열에 정수형 데이터를 입력 하시오.");
			number[i] = sc.nextInt();
		}

		Arrays.sort(number);// number 배열에 들어 있는 데이터를 오름차순하라.

		String toQuery = Arrays.toString(number);
		System.out.println(toQuery);//

		// 문제> 내림차순을 실행하여 출력하세요.
		// [8, 9, 12, 34, 45, 55, 56] => [56, 55, 45, 34, 12, 9, 8]

		//             10-1= 9          -1 > -1
		System.out.print("[");
		for (int k = number.length - 1; k > -1; k--) {
			System.out.print(number[k] + ", ");
			
			//k[9]=89 , k[8]=78, k[7]=34, k[6]=12, k[5]=5.......k[0]=234
		}
		System.out.println("]");
	}

	}

	