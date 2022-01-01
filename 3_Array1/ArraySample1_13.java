package Array1;

import java.util.Scanner;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 실수형 입니다.
 * - 반복문 사용, method()적용: 기준, O X, method는 하나만 사용. 
 * - 데이터 중에서 3의 배수가 되면서 짝수인 데이터의 합계와 갯수를 구하여 출력합니다.
 */
public class ArraySample1_13 {
	private static double sum;//0.0 => 12.0 + 24.0 =>36.0 + 72.0 => 108.0
	
	private static int Drainage_process() {
		
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받아서 처리할 데이터의 갯수는 ?");
		int n = sc.nextInt();// 10

		double number[] = new double[n];

		for (int i = 0; i < number.length; i++) {
			System.out.println("number 배열에 실수형 데이터를 입력 하시오.");
			number[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 3 == 0 && number[i] % 2 == 0) {
				sum += number[i];
				count++;
			}
			//
		}
		return count;
	}

	public static void main(String[] args) {

		int cnt = Drainage_process();
		System.out.println("3의배수 합은 " + sum + "이고, 갯수는 " + cnt + "입니다.");
	}

}
