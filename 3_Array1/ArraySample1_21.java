package Array1;

import java.util.Scanner;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 정수형 입니다.
 * - 반복문 사용, method()적용: 기준 선택은 마음대로...생각해서 결정합니다.
 * - 입력 데이터 중에서 가장 큰 수와 가장 작은 수를 구하여 출력하세요.
 * - 데이터> 110 20 130 40 150 260 270 380 90 100
 * - 가장 큰 수 > 380
 * - 가장 작은 수> 20
 * 
 */
public class ArraySample1_21 {
	private static int n;
	private static int dataTest[];
	private static Scanner sc = new Scanner(System.in);

	static void sortDataSuInput() {
		System.out.println("sort배열에 저장할 데이터 갯수를 입력해 주세요.");
		n = sc.nextInt();

		dataTest = new int[n];
	}

	static void sortDataInput() {
		for (int i = 0; i < dataTest.length; i++) {
			dataTest[i] = sc.nextInt();
		}
		System.out.println();
	}

	private static void dataMininum() {
		int min = dataTest[0];

		for (int i = 0; i < dataTest.length; i++) {
			if (min > dataTest[i]) {
				min = dataTest[i];
			}
		}
		System.out.println("최소값은 = " + min); 
	}

	private static void dataMaxinum() {
		int max = dataTest[0];

		for (int i = 0; i < dataTest.length; i++) {
			if (max < dataTest[i]) {
				max = dataTest[i];
			}
		}
		System.out.println("최대값은 = " + max); 
	}

	public static void main(String[] args) {
		// 데이터 수 입력
		sortDataSuInput();
		// 데이터 입력
		sortDataInput();
		// 최대값 구하기
		dataMaxinum();
		// 최소값 구하기
		dataMininum();
	}
}
