package OOP_InheritanceSample;

import java.util.Scanner;

public class SuberClass {

	public void suber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("뺄셈에 연산 x를 입력하세요.");
		int x = sc.nextInt();
		System.out.println("뺄셈에 연산 y를 입력하세요.");
		int y = sc.nextInt();
		int sum = x - y;
		System.out.println("Suber() : " + sum); 
	}
}
