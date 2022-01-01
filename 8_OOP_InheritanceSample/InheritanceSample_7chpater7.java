package OOP_InheritanceSample;

import java.util.Scanner;

/* 추상(abstract) :  실체간에 공통되는 특성을 추출한 것
 * 새, 곤충, 물고기  : 동물
 * 삼성, 현대, LG : 회사
 * 
 * class Parent22 : (일반)실체 클래스
 * public abstract class Parent33 : 추상 클래스
 * 추상 클래스는 객체를 생성하지 못합니다.
 * 그러므로 추상 클래스의 추상 메소드는 일반 클래스에서 상속을 받아서
 * 추상 메소드 오버라이딩을 통하여 메소드를 실행합니다.
 * 
 * 추상 클래스의 용도>
 * 1.실체 클래스들의 공통적인 필드와 메소드의 이름을 통일할 목적
 * 2.실체 클래스 작성 할 때 시간을 절약할 수 있다.
 * 
 */

abstract class Animal {	
	//field
	
	//constructor
	
	//method
	public abstract void moving();//추상 메소드 선언
}

class Ant extends Animal {

	@Override
	public void moving() {
		System.out.println("개미는 기어다닙니다.");	 	
	}	
}

class Bird extends Animal {

	@Override
	public void moving() {
		System.out.println("새는 날아다닙니다.");	 			
	}	
	
}

public class InheritanceSample_7chpater7  {  
	
	public static void main(String[] args) {
		InheritanceSample_7chpater7 is7 = new InheritanceSample_7chpater7();
		
		Ant p22 = new Ant();//객체생성O
		p22.moving();// 개미는 기어다닙니다.
		
		Bird b22 = new Bird();
		b22.moving();// 새는 날아다닙니다.
		
		//Animal p33 = new Animal();//객체생성X
		
		
		
	}

}
