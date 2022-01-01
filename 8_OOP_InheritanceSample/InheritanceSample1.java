package OOP_InheritanceSample;

/* 상속(Inheritance) : 부모에게서 자식에게 물려주는것
 * 부모클래스(Parent class), 자식클래스(child class)
 * 생성자 이외의 클래스변수, 클래스 메소드를 상속받아 사용합니다.
 * 
 * 상속을 받는 방법 4가지 형태
 * 1)public class A extends B { .... }
 * 
 * 2)public class A extends B implements C, D, E,..... {  ..... }
 *  B class, C,D,E interface 형식을 지닙니다.
 * 
 * 3)public interface A extends B
 *   A와 B가 모두 인터페이스 형식을 지닙니다.
 *   
 * 4)public class A implements B, C, D... { .... }
 *   A는 class이고, B, C, D는 모두 인터페이스인 경우 사용
 * 
 * 상속은 물려주는 측에서 기능을 보강하여 구축(구현)이 가능합니다.
 * 그러므로 부모 클래스보다 더 큰 자식 클래스가 됩니다.
 * 
 */


public class InheritanceSample1 {

	public static void main(String[] args) {
		AdderClass ac = new AdderClass();
		ac.add();
		
		SuberClass sc = new SuberClass();
		sc.suber();

		MultiClass mc = new MultiClass();
		mc.multi();
		
		DivideClass di = new DivideClass();
		di.divi();
	}

}
