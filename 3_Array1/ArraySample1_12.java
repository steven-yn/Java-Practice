package Array1;

import java.util.Scanner;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 실수형 입니다.
 * - 반복문 사용, method()적용: 기준, X O, method는 여러개 사용. 
 * - 데이터 중에서 3의 배수가 되면서 짝수인 데이터의 합계와 갯수를 구하여 출력합니다.
 */
public class ArraySample1_12 {
	//private static double sum;//0.0 
	//private static int count;//0
	
	//메모리상에서 클래스변수로 사용이되면....같은번지에 겹치게되어서 충돌 현상이 일어납니다.
	// 메모리 상에서 데이터가 사라집니다. 즉, 깨집니다.
	// 정리하면> private static int count;//0 
	// => 이렇게 코딩하여도 실행 됩니다.
	
	private static void Drainage_input() {
		double sum=0.0;
		int count=0;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받아서 처리할 데이터의 갯수는 ?");
		int n = sc.nextInt();// 10

		double number[] = new double[n];

		for (int i = 0; i < number.length; i++) {
			System.out.println("number 배열에 실수형 데이터를 입력 하시오.");
			number[i] = sc.nextDouble();			
		}
		Drainage_process(number, sum, count);// 전달인자 값이 없음
	}

	private static void Drainage_process(double[] number, double sum, int count) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 3 == 0 && number[i] % 2 == 0) {
				sum += number[i];
				count++;
			}
			//
		}
		System.out.println("3의배수 합은 " + sum + "이고, 갯수는 " + count + "입니다.");
	}

	public static void main(String[] args) {

		Drainage_input();

	}

}
