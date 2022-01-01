package OOP_InheritanceSample;

import java.util.Scanner;

/* 문제> InheritanceSample2라는 자식 클래스에서 
 * 부모 클래스들인(AdderClass, SuberClass, MultiClass, DivideClass 등) 상속받아서 
 * 가감승제산을 처리하는 프로그램을 작성하세요. 
   
 *  구현 방법은 다음과 같습니다.
 *  * 3)public interface A extends B
 *   A와 B가 모두 인터페이스 형식을 지닙니다.
 */

 
interface SuberInter2  {

	public abstract void suber(); 
	public abstract void multi(); 
	public abstract void divi(); 
}

	//							다중 상속의 효과라고 부릅니다.
 interface AdderClass4  extends SuberInter2 {
	 
	 public abstract void add();	
}

public class InheritanceSample4 implements AdderClass4 {
	
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
		InheritanceSample4 is2 = new InheritanceSample4();
		// DivideInter di = new DivideInter();
		is2.add();
		is2.suber();
		is2.multi();
		is2.divi();
	}

}
