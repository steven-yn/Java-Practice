package OOP_InheritanceSample;

import java.util.Scanner;

/* 
 * 상속(Inheritance)이란?
 * 기존에 작성된 클래스(부모 클래스)를 바탕으로 자식 클래스에 기능과 속성을 물려주는 것.
 *  속성(Attribute): 클래스에서 클래스 변수에 속하는 것 들.  
 *  기능(method): 클래스에서 클래스 메소드에 속하는 것 들. 
 * - 부모클래스의 클래스 변수와 메소드는 접근 제한자가 
 *  같은 패키지의 경우에는 default 가능하나,
 *  다른 패키지라면 반드시 public을 해 주어야 상속이 됩니다.
 * - 자바는 단일 상속만 허용합니다. 다중 상속의 효과
 * - public B extends A { .... } : 같은 클래스끼리의 상속
 * - interface B extends A { .... } : 같은 인터페이스의 경우에 
 * - 다중 상속의 효과를 내는 것을 사용해야 합니다.
 * - public A extends B implements C, D, E... { ... }
 * - public A implements B, C, D ... { .... }
 * - this() : 해당 클래스의 번지를 참조 하도록 하는 것 => 클래스 변수에 접근을 허용 하는 것. 
 * - super(); 내장 API에서 제공하는 부모 클래스의 기능 호출시 사용
 * - 추상클래스나 인터페이스는 객체를 생성하지 못하므로 추상 메소드 오버라이딩이라는 방법을 이용하여
 *   데이터를 처리합니다. 추상클래스나 인터페이스를 사용하는 이유는? 
 *   추상클래스나 인터페이스는 미리 먼저 미래를 생각하여 누군가가 만들어 놓고(추상 메소드 선언) 나중에 바디(Body)를
 *   구현하는데 추상 메소드 오버라이딩이라는 형태를 빌어서 내용을 구현하게 됩니다.  
 * 
 * 입력 양식은 menu 방식이며, 숫자를 입력 합니다.
 * ---------성적 입력 및 처리--------------
 * 1.번호 및 이름 입력
 * 2.과목 입력(성적 : 자바, JSP, Spring)
 * 3.성적 처리 연산(총점, 평균, 학점)
 * 4.성적 결과 출력
 * 5.종료
 * ------------------------------------
 * 
 * ---------성 적 출 력-------------------
 * 번호 이름 자바 JSP Spring 총점 평균 학점 
 * -------------------------------------
 *  1  홍길동 100 100 100   300 100  A
 *  2  이길순  99  98  97   294  98  A
 *  
 *       ......................
 * ------------------------------------
 * - 메뉴 적용, Inheritance(interface, abstract class)  
 * - 1) public A extends B { .... } : 같은 클래스끼리의 상속
 */

class Common_Array {
	protected static Scanner sc = new Scanner(System.in);
	static int inwon; 

	static String bunho[];
	static String name[];
	static int java[];
	static int jsp[];
	static int spring[];
	static int total[];
	static int[] sungjuk;
	static double[] average;
	static String grade[];
	static int[] inwonsu;
}

class SungjukOutput extends Common_Array {
	static void SungjukOutput() {
		System.out.println("------------------------ 성 적 출 력 -------------------------");
		System.out.println("번호\t 이름\t 자바\t JSP\t Spring\t 총점\t 평균\t 학점 ");
		System.out.println("------------------------------------------------------------");
		
		for (int i = 0; i < inwon; i++) {
			
			System.out.print(bunho[i] + "\t" + name[i] + "\t" + java[i] + "\t" + jsp[i] + "\t" + spring[i] + "\t"
					+ total[i] + "\t");
			System.out.printf("%5.2f", average[i]);
			System.out.println("\t" + grade[i]);
			
		}
		System.out.println("------------------------------------------------------------");
	}
}

class SungjukProcess extends SungjukOutput {
	static void SungjukProcess() {
		for (int j = 0; j < inwon; j++) {
			total[j] = java[j] + jsp[j] + spring[j];
		} 

		for (int k = 0; k < inwon; k++) {
			average[k] = total[k] / 3.0;

			switch ((int) average[k] / 10) {
			case 10:
			case 9:
				grade[k] = "A";
				break;
			case 8:
				grade[k] = "B";
				break;
			case 7:
				grade[k] = "C";
				break;
			case 6:
				grade[k] = "D";
				break;
			default:
				grade[k] = "F";
				break;

			}
		}
		
	}
}

class SungjukInput extends SungjukProcess {
	
	static void SungjukInput() {			
		inwonsu = new int[inwon]; 
		bunho = new String[inwon];
		name = new String[inwon];
		java = new int[inwon];
		jsp = new int[inwon];
		spring = new int[inwon];
		total = new int[inwon];
		sungjuk = new int[inwon];
		average = new double[inwon];
		grade = new String[inwon];
		
		for (int i = 0; i < inwon; i++) {
			System.out.println("성적 처리에 대한 데이터를 입력하세요.");
			System.out.println("번호 데이터를 입력하세요.");
			bunho[i] = sc.next();
			System.out.println("이름 데이터를 입력하세요.");
			name[i] = sc.next();
			System.out.println("자바 데이터를 입력하세요.");
			java[i] = sc.nextInt();
			System.out.println("JSP 데이터를 입력하세요.");
			jsp[i] = sc.nextInt();
			System.out.println("Spring 데이터를 입력하세요.");
			spring[i] = sc.nextInt();
		}		
	}
}
	

class SungjukInputInwon extends  SungjukInput {
	
	static void SungjukInputInwon() {
		System.out.println("성적 처리에 대한 인원수를 입력하세요.");
		inwon = sc.nextInt();  
	}
}

public class Sungjuk_InheritanceSample4_Inheritance1 extends SungjukInputInwon {

	public static void main(String[] args) {
		boolean sungjukkey = true;
		
		while(sungjukkey) {
		System.out.println("------------성적 입력 및 처리-------------");
		System.out.println(" 1.성적 처리 인원수 입력 ");
		System.out.println(" 2.번호,이름, 자바, JSP, Spring 데이터 입력 ");
		System.out.println(" 3.성적 처리 연산(총점, 평균, 학점) ");
		System.out.println(" 4.성적 결과 출력 ");
		System.out.println(" 5.종료 ");
		System.out.println("--------------------------------------");
		int selectedMenu = sc.nextInt();
				
			switch(selectedMenu) {
			case 1: SungjukInputInwon(); break;
			case 2: SungjukInput(); break;
			case 3: SungjukProcess(); break;
			case 4: SungjukOutput(); break;
			case 5: System.out.println("성적시스템을 종료합니다.");
				sungjukkey = false;
			}
		}
	}// end of main()	

}// end of class
