package OOP_InheritanceSample;

import java.util.Scanner;

/* 
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
 * - 2) abstract class A extends B { .... } : 같은 추상클래스의 경우에
 * 
 * *** 특정 메소드안에 들어가는 배열의 선언은 inwonsu = new int[inwon]; 선언 합니다.
 * *** 공통으로 사용하는 배열의 선언은  static int inwon; 선언 합니다.
 * *** 일반적인 선언은 int[] inwon = new int[inwon]; 이렇습니다.
 */

abstract class SungjukOutput22  {
	public abstract void SungjukOutput();
}

abstract class SungjukProcess22 extends SungjukOutput22 {
	public abstract void SungjukProcess();
}

abstract class SungjukInput22 extends SungjukProcess22 {
	abstract void SungjukInput();

}

abstract class SungjukInputInwon22 extends SungjukInput22 {
	abstract void SungjukInputInwon();
}

public class Sungjuk_InheritanceSample4_Inheritance2_abstractclass extends SungjukInputInwon22 {
	static Scanner sc = new Scanner(System.in);
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

	
	@Override
	public void SungjukInputInwon() {
		
		System.out.println("성적 처리할 인원수를 입력하세요.");
		 inwon = sc.nextInt();		
	}
	
	
	@Override
	public void SungjukInput() {
		inwonsu = new int[inwon];
		bunho = new String[inwon];
		name = new String[inwon];
		java = new int[inwon];
		jsp = new int[inwon];
		spring = new int[inwon];		
		sungjuk = new int[inwon];	
		total = new int[inwon];
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

	@Override
	public void SungjukProcess() {		
				
		 for (int j = 0; j < inwonsu.length; j++) {
	         total[j] = java[j] + jsp[j] + spring[j];
	      }
		  for (int k = 0; k < inwonsu.length; k++) {
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
		      System.out.println();
		   }


	
	public void SungjukOutput() {
		System.out.println("------------------------ 성 적 출 력 -------------------------");
		System.out.println("번호\t 이름\t 자바\t JSP\t Spring\t 총점\t 평균\t 학점 ");
		System.out.println("------------------------------------------------------------");

		for(int i = 0;i<inwon;i++){
		System.out.print(bunho[i]+"\t"+name[i]+"\t"+java[i]+"\t"+jsp[i]+"\t"+spring[i]+"\t"+total[i]+"\t");
		System.out.printf("%5.2f",average[i]);System.out.println("\t"+grade[i]);
		}
		System.out.println("------------------------------------------------------------");
		}
		
	
	public static void main(String[] args) {
		Sungjuk_InheritanceSample4_Inheritance2_abstractclass si =new Sungjuk_InheritanceSample4_Inheritance2_abstractclass();
		
		
		boolean sungjukkey = true;

		while (sungjukkey) {
			System.out.println("------------성적 입력 및 처리-------------");
			System.out.println(" 1.성적 처리 인원수 입력 ");
			System.out.println(" 2.번호,이름, 자바, JSP, Spring 데이터 입력 ");
			System.out.println(" 3.성적 처리 연산(총점, 평균, 학점) ");
			System.out.println(" 4.성적 결과 출력 ");
			System.out.println(" 5.종료 ");
			System.out.println("--------------------------------------");
			int selectedMenu = sc.nextInt();

			switch (selectedMenu) {
			case 1:
				si.SungjukInputInwon();
				break;
			case 2:
				si.SungjukInput();
				break;
			case 3:
				si.SungjukProcess();				
				break;
			case 4:
				si.SungjukOutput();
				break;
			case 5:
				System.out.println("성적시스템을 종료합니다.");
				sungjukkey = false;
			}
		}
	}// end of main()

}// end of class
