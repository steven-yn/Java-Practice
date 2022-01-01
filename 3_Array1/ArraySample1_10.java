package Array1;

import java.util.Scanner;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 실수형 입니다.
 * - 반복문 사용, method()적용: 기준, X X, method는 여러개 사용 => 컴파일시에는 문제가 없으나, 런타임시에는 실행을 하지 않습니다.
 * - 데이터 중에서 3의 배수가 되면서 짝수인 데이터의 합계와 갯수를 구하여 출력합니다.
 */
public class ArraySample1_10 {
	public static int n;//0 => 10
	public static int count;//0 => 1
	public static double sum;// 0.0 => 72.0
	public static double number[] = new double[n];//클래스 배열
	public static Scanner sc = new Scanner(System.in);	
	
	public  void Drainage_input() {
		
		System.out.println("입력받아서 처리할 데이터의 갯수는 ?");
		 n = sc.nextInt();// 10			
	}
	
	public  void Drainage_input2() {
		for (int i = 0; i < number.length; i++) {
			System.out.println("number 배열에 실수형 데이터를 입력 하시오.");
			number[i] = sc.nextDouble();
		}		
	}
	
	public  void Drainage_process() {
				
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 3 == 0 && number[i] % 2 == 0) {
				sum += number[i];
				count++;
			}			
		}		
	}
	
	public  void Drainage_output() {
		System.out.println("3의배수 합은 " + sum + "이고, 갯수는 " + count + "입니다.");		
	}
	
	public static void main(String[] args) {
		ArraySample1_10 as10 = new ArraySample1_10();
		
		as10.Drainage_input();//전달인자 값이 없음
		as10.Drainage_input2();
		as10.Drainage_process();
		as10.Drainage_output();
	}

	

}




