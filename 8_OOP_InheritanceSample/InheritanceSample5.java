package OOP_InheritanceSample;

import java.util.Scanner;

/* 문제> InheritanceSample2라는 자식 클래스에서 
 * 부모 클래스들인(AdderClass, SuberClass, MultiClass, DivideClass 등) 상속받아서 
 * 가감승제산을 처리하는 프로그램을 작성하세요. 
   
 *  구현 방법은 다음과 같습니다.
 * 4)public class A implements B, C, D... { .... }
 *   A는 class이고, B, C, D는 모두 인터페이스인 경우 사용
 */

 
interface SuberInter3  {

	public abstract void suber(); 
	public abstract void multi(); 
	public abstract void divi(); 
}

	//							다중 상속의 효과라고 부릅니다.
 interface AdderClass5  extends SuberInter3 {
	 
	 public abstract void add();	
}

public class InheritanceSample5 implements AdderClass5, SuberInter3  {
	
	@Override
	public void suber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("뺄셈에 연산 x를 입력하세요.");
		int x = sc.nextInt();
		System.out.println("뺄셈에 연산 y를 입력하세요.");
		int y = sc.nextInt();
		int sum = x - y;
		System.out.println("suber() : " + sum); 
		
	}

	@Override
	public void multi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("곱셈에 연산 x를 입력하세요.");
		int x = sc.nextInt();
		System.out.println("곱셈에 연산 y를 입력하세요.");
		int y = sc.nextInt();
		int sum = x * y;
		System.out.println("multi() : " + sum); 
		
	}

	@Override
	public void divi() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("나눗에 연산 x를 입력하세요.");
			int x = sc.nextInt();
			System.out.println("나눗셈에 연산 y를 입력하세요.");
			int y = sc.nextInt();
			int sum = x / y;
			System.out.println("divi() : " + sum); 
		
	}

	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("덧셈에 연산 x를 입력하세요.");
		int x = sc.nextInt();
		System.out.println("덧셈에 연산 y를 입력하세요.");
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("ADD() : " + sum); 		
	}	
	
	public static void main(String[] args) {
		InheritanceSample5 is2 = new InheritanceSample5();
		// DivideInter di = new DivideInter();
		is2.add();
		is2.suber();
		is2.multi();
		is2.divi();
	}

}
