package OOP;

import java.util.Scanner;

public class OOPSample_6chapter17 {
	//정적 멤버 메소드
	public static int sum1(int[] values1) {
		int sum = 0;

		for (int i = 0; i < values1.length; i++) {
			sum += values1[i];
		}
		return sum;
	}
	//정적 멤버 메소드
	public static int sum2(int... aaa) { // 가변 배열 선언
		int sum = 0;

		for (int i = 0; i < aaa.length; i++) {
			sum += aaa[i];
		}
		return sum;
	}
		
	
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("처리할 숫자 데이터의 갯수를 입력 하세요.");
		n = sc.nextInt();
		int[] values1 = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("[values1]숫자 데이터를 입력 하세요.");
			values1[i] = sc.nextInt();
		}
		
		//			내부에서 호출
		int result1 = sum1(values1);
		System.out.println("values1[] : " + result1);// 60

		int[] aaa = new int[n];

		for (int i = 0; i < aaa.length; i++) {
			System.out.println("[aaa]숫자 데이터를 입력 하세요.");
			aaa[i] = sc.nextInt();
		}

		int result2 = sum2(aaa);
		System.out.println("aaa[] : " + result2);// 1500

	}

}
