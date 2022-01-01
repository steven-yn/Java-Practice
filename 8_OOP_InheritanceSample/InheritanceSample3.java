package OOP_InheritanceSample;

import java.util.Scanner;

/* 문제> InheritanceSample2라는 자식 클래스에서 
 * 부모 클래스들인(AdderClass, SuberClass, MultiClass, DivideClass 등) 상속받아서 
 * 가감승제산을 처리하는 프로그램을 작성하세요. 
 * - 부모 클래스 중에서 AdderClass 형식이 class입니다.
 * - 나머지는 인터페이스 형식을 가집니다(SuberInter, MultiInter, DivideInter)
 * - interface란? 상수값과 추상 메소드로 이루어집니다.
 *  추상 메소드는 abstract라는 키워드를 사용합니다.
 *  그리고, 메소드 선언은 하지만, body가 존재 하지 않는다.
 *  즉, {  ..... } 이 부분이 상속이 되어서 다른 클래스에서 오버라이딩이 되어서 구현 됩니다. 
 *  인터페이스는 객체를 생성하지 못하는데, 다른 클래스로 부터 상속 받아서 오버라이딩을 해야 
 *  구현이 가능합니다. 그래서, 인터페이스는 독립적으로 실행이 불가능 합니다.
 *  
 *  구현 방법은 다음과 같습니다.
 *  2)public class A extends B implements C, D, E,..... {  ..... }
 *  B class, C,D,E interface 형식을 지닙니다.
 */

 interface DivideInter {

	// DivideInter di = new DivideInter();
	 
	public abstract void divi(); // 추상 메소드 선언만하고 바디가 없음.
}

interface MultiInter {

	public abstract void multi(); 
}

interface SuberInter  {

	public abstract void suber(); 
}

	//							다중 상속의 효과라고 부릅니다.
 class AdderClass3  implements SuberInter, MultiInter, DivideInter {

	 @Override  // 추상메소드 오버라이딩 
		public void divi() {
			Scanner sc = new Scanner(System.in);
			System.out.println("나눗에 연산 x를 입력하세요.");
			int x = sc.nextInt();
			System.out.println("나눗셈에 연산 y를 입력하세요.");
			int y = sc.nextInt();
			int sum = x / y;
			System.out.println("divi() : " + sum); 
			
		}

		@Override  // 추상메소드 오버라이딩 
		public void multi() {
			Scanner sc = new Scanner(System.in);
			System.out.println("곱셈에 연산 x를 입력하세요.");
			int x = sc.nextInt();
			System.out.println("곱셈에 연산 y를 입력하세요.");
			int y = sc.nextInt();
			int sum = x * y;
			System.out.println("multi() : " + sum); 
			
		}

		@Override  // 추상메소드 오버라이딩 
		public void suber() {
			Scanner sc = new Scanner(System.in);
			System.out.println("뺄셈에 연산 x를 입력하세요.");
			int x = sc.nextInt();
			System.out.println("뺄셈에 연산 y를 입력하세요.");
			int y = sc.nextInt();
			int sum = x - y;
			System.out.println("suber() : " + sum); 
			
		}
	 
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

public class InheritanceSample3 extends AdderClass3 {

	public static void main(String[] args) {
		InheritanceSample3 is2 = new InheritanceSample3();
		// DivideInter di = new DivideInter();
		
		is2.add();
		is2.suber();
		is2.multi();
		is2.divi();
	}

}
