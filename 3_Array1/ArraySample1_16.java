package Array1;

import java.util.Scanner;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 실수형 입니다.
 * - 반복문 사용, method()적용: 기준, O O, 여러개의 메소드 적용
 * - 데이터 중에서 3의 배수가 되면서 짝수인 데이터의 합계와 갯수를 구하여 출력합니다.
 */
public class ArraySample1_16 {
	private static int count;
	private static Scanner sc = new Scanner(System.in);

	private static double Drainage_process(int n) {
		double sum=0.0;
		
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
		return sum; 
	}

	private static int Drainage_output() {
		
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println("입력받아서 처리할 데이터의 갯수는 ?");
		int n = sc.nextInt();// 10
		
		double sum = Drainage_process(n);
		int count = Drainage_output(); 
		 
		System.out.println("3의배수 합은 " + sum + "이고, 갯수는 " + count + "입니다.");
	}

	

}
