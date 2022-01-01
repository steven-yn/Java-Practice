package OOP_InheritanceSample;

import java.util.Scanner;

/* 다중 인터페이스 구현 클래스 표현 1
 * 
 */

interface sungjuk2 {
	//추상 메소드
	void adderMethod();	
}

interface sungjuk1 extends sungjuk2 {
	//상수
	String name = "홍길동";	
	public static final int java = 100;
	public int Max_Volume = 50;
	public int Min_Volume = 0;
	
	//추상 메소드
	void sungjukMethod(int java, int jsp, int spring);
		
}

public class InheritanceSample_8chapter2 implements sungjuk1 {

	@Override
	public void sungjukMethod(int java, int jsp, int spring) {
		int sum = java + jsp + spring;
		double average = sum / 3.0;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average); 
	}	

	@Override
	public void adderMethod() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("html, css, Javascript 과목의 점수를 입력해 주세요.");
		int html = sc.nextInt();
		int css = sc.nextInt();
		int Javascript = sc.nextInt();
		
		int sum = html + css + Javascript;
		double average = sum / 3.0;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average); 
	}

	public static void main(String[] args) {
		InheritanceSample_8chapter2 is8 = new InheritanceSample_8chapter2(); 
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("자바, JSP, 스프링 과목의 점수를 입력해 주세요.");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		is8.sungjukMethod(java, jsp, spring);
		System.out.println("-------------------------");
		is8.adderMethod();
	}
}
