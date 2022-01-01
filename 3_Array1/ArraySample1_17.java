package Array1;

import java.util.Scanner;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 정수형 입니다.
 * - 반복문 사용, method()적용: 기준 선택은 마음대로...생각해서 결정합니다.
 * - 데이터 중에서 4번째 원소의 값을 100으로 변경하고 출력합니다.
 * - 그리고, 모든 원소의 값을 0으로 초기화 시키고 출력합니다.
 */
public class ArraySample1_17 {
	private static int n;
	private static int test[];

	private static void element1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받을 데이터 갯수를 입력해 주세요.");
		n = sc.nextInt();

		test = new int[n];

		for(int i = 0; i < test.length; i++) {
			test[i] = sc.nextInt();
			System.out.print(test[i] + " ");
		}
		System.out.println();

		test[3] = 100;
	}

	private static void element2() {
		for(int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();
	}

	private static void element3() {
		for(int i = 0; i < test.length; i++) {
			test[i] = 0;
			System.out.print(test[i] + " ");
		}
	}

	public static void main(String[] args) {
		// 데이터 입력
		element1();

		// 데이터 일부 변경
		element2();

		// 데이터 초기화
		element3();

	}
}
