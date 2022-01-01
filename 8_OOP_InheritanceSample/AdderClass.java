package OOP_InheritanceSample;

import java.util.Scanner;

public class AdderClass {

	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("덧셈에 연산 x를 입력하세요.");
		int x = sc.nextInt();
		System.out.println("덧셈에 연산 y를 입력하세요.");
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("ADD() : " + sum); 
	}
}
