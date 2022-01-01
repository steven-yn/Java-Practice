package OOP_InheritanceSample;

import java.util.Scanner;

public class MultiClass {

	public void multi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("곱셈에 연산 x를 입력하세요.");
		int x = sc.nextInt();
		System.out.println("곱셈에 연산 y를 입력하세요.");
		int y = sc.nextInt();
		int sum = x * y;
		System.out.println("Multi() : " + sum); 
	}
}
