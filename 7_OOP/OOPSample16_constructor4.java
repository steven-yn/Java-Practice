package OOP;

import java.util.Scanner;

import Array1.ArraySample1_10;

/* 문제> 2개의 숫자를 입력 받아서 합계를 구하여 출력하세요.
 * - 단, 생성자를 이용하여 데이터를 저장 합니다.
 * - 그리고, 처리와 결과는 일반 메소드를 이용합니다.
 */
public class OOPSample16_constructor4 {
	private static int n;//0 => 5
	private static int count;//0 => 3
	private static double sum;// 0.0 => 18.0
	
	public static Scanner sc = new Scanner(System.in);
	private double[] number;	 
		
	public OOPSample16_constructor4(int n, double[] number) {
		this.n = n;
		this.number = number;
	}

	public  void Drainage_process() {
				
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 3 == 0) {
				sum += number[i];
				count++;
			}			
		}		
	}
	
	public  void Drainage_output() {
		System.out.println("3의배수 합은 " + sum + "이고, 갯수는 " + count + "입니다.");		
	}
	
	public static void main(String[] args) {
		System.out.println("입력받아서 처리할 데이터의 갯수는 ?");
		 n = sc.nextInt();// 10	
		
		 double number[] = new double[n];//클래스 배열
		 
		 for (int i = 0; i < number.length; i++) {
				System.out.println("number 배열에 실수형 데이터를 입력 하시오.");
				number[i] = sc.nextDouble();
			}	
		 
		OOPSample16_constructor4 oop16_4 = new OOPSample16_constructor4(n, number);
		
		oop16_4.Drainage_process();
		oop16_4.Drainage_output();
	}
	
}
