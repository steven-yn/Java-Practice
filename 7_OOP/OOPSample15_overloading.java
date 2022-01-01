package OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 문제> 메소드 오버로딩을 구현합니다.
 * - 메소드 오버로딩 : 같은 메소드의 이름를 가지고 서로 다른 역할을 하는 형태를 말합니다
 * - 구분 기준: 자료형이나 데이터의 갯수로 구분합니다.  
 * - 데이터는 정수형, 실수형을 사용합니다.
 * - 반복문 사용
 * - 이들 배열을 메소드 형식으로 만든 다음에 객체를 이용하여 호출이 되도록 프로그래밍 합니다.
 */
public class OOPSample15_overloading {

	private static Scanner sc = new Scanner(System.in);

	@SuppressWarnings("unused")
	private void calcalator(String str3, int su4) {
		int x = Integer.parseInt(str3);
		int sum = x + su4; 
		System.out.println("문자열 숫자 + 숫자 : " + sum); 
	}
	
	private void calcalator(String str1, String str2) {
		String sum = str1 + str2;
		System.out.println("String : " + sum);		
	}	
	
	private void calculator(int su1, int su2, int su3) {
		int sum = su1 + su2 * su3;
		System.out.println("혼합식 + *: " + sum); 
	}

	@SuppressWarnings("unused")
	private void calcalator(short su1, int su2) {
		int sum = su1 % su2;
		System.out.println("divi % : " + sum);
	}

	private void calculator(double su1, int su2) {
		double sum = su1 / su2;
		System.out.println("divi / : " + sum);
	}

	private void calculator(float su1, int su2) {
		float sum = su1 * su2;
		System.out.println("mult : " + sum);
	}

	private void calculator(long su1, long su2) {
		long sum = su1 - su2;
		System.out.println("sub : " + sum);
	}

	private void calculator(int su1, int su2) {
		int sum = su1 + su2;
		System.out.println("add : " + sum);
	}

	public static void main(String[] args) {
		OOPSample15_overloading oop15 = new OOPSample15_overloading();
		System.out.println("정수형 숫자 3개를 입력해 주세요.");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		int su3 = sc.nextInt();
		System.out.println("문자열 2개를 입력해 주세요.");
		String str1 = sc.next();//
		String str2 = sc.next();//
		
		System.out.println("문자열 2개를 입력(10진수 형태로)해 주세요.");
		String str3 = sc.next();//10진수, 8진수, 16진수 값으로 입력
		int su4 = sc.nextInt();//
		
		oop15.calculator(su1, su2);// 정수형2개 전달인자값
		oop15.calculator((long) su1, (long) su2);// long타입의 정수형 2개 전달
		oop15.calculator((float) su1, su2);
		oop15.calculator((double) su1, su2);
		oop15.calculator((short) su1, su2);
		oop15.calculator(su1, su2, su3);
		oop15.calcalator(str1, str2); 
		oop15.calcalator(str3, su4); 
	}

}
