package OOP_InheritanceSample;

import java.util.Scanner;

/* 입력 양식은 menu 방식이며, 숫자를 입력 합니다.
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
 * - 변수, 반복문, 메소드, switch~case, Array, Inheritance(interface, abstract class)  
 * - 변수, 반복문, 메소드, switch~case 적용
 * 
 * - 단점> 마지막 데이터만 남아서 처리 됩니다. *****************
 */
public class Sungjuk_InheritanceSample1 {

	private static String grade;
	private static String bunho;
	private static String name;
	private static int java;
	private static int jsp;
	private static double average;
	private static int total;
	private static int spring;

	private static void sungjukOutput() {
		System.out.println("------------------------ 성 적 출 력 -------------------------");
		System.out.println("번호\t 이름\t 자바\t JSP\t Spring\t 총점\t 평균\t 학점 ");
		System.out.println("------------------------------------------------------------");
		System.out.print(bunho + "\t" + name + "\t" + java + "\t" + jsp + "\t" + spring + "\t" + total + "\t");
		System.out.printf("%5.2f", average);
		System.out.println("\t" + grade);
		System.out.println("------------------------------------------------------------");
	}

	public static void main(String[] args) {
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("성적 처리에 대한 인원수를 입력하세요.");
		int inwon = sc.nextInt();

		while (count < inwon) {
			count++;

			System.out.println("성적 처리에 대한 데이터를 입력하세요.");
			System.out.println("번호 데이터를 입력하세요.");
			 bunho = sc.next();
			System.out.println("이름 데이터를 입력하세요.");
			 name = sc.next();
			System.out.println("자바 데이터를 입력하세요.");
			 java = sc.nextInt();
			System.out.println("JSP 데이터를 입력하세요.");
			 jsp = sc.nextInt();
			System.out.println("Spring 데이터를 입력하세요.");
			 spring = sc.nextInt();

			 total = java + jsp + spring;

			 average = total / 3.0;

			switch ((int) average / 10) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;

			}
			// 여기로 탈출

		}
		sungjukOutput();
	}// end of main()

}// end of class
