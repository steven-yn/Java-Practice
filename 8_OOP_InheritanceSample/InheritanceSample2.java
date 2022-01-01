package OOP_InheritanceSample;

import java.util.Scanner;

/* 문제> InheritanceSample2라는 자식 클래스에서 
 * 부모 클래스들인(AdderClass, SuberClass, MultiClass, DivideClass 등) 상속받아서 
 * 가감승제산을 처리하는 프로그램을 작성하세요. 
 * 
 * -  1)public class A extends B { .... }
 */

 class DivideClass2 {

	public void divi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나눗셈에 연산 x를 입력하세요.");
		int x = sc.nextInt();
		System.out.println("나눗셈에 연산 y를 입력하세요.");
		int y = sc.nextInt();
		int sum = x / y;
		System.out.println("Divi() : " + sum); 
	}
}

class MultiClass2 extends DivideClass2 {

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

class SuberClass2 extends MultiClass2 {

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

//1)public class A extends B { .... }

 class AdderClass2 extends SuberClass2 {

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

public class InheritanceSample2 extends AdderClass2 {

	public static void main(String[] args) {
		InheritanceSample2 is2 = new InheritanceSample2();
		is2.add();
		is2.suber();
		is2.multi();
		is2.divi();
	}

}
