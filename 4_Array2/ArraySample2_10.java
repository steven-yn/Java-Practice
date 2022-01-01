package Array2;

import java.util.Scanner;

/* Name, Java, JSP, Spring 점수를 입력 받아서 성적 처리 
 *  
 * 총점, 평균, 학점 구하기
 * -------------------
 * 홍길동님의 성적표
 * -------------------
 * 총점 : 
 * 평균 :
 * 학점 :
 * -------------------
 * 
 */
public class ArraySample2_10 {

	private static Scanner sc = new Scanner(System.in);

	private static int input(String kwamok) {
		int jumsu;
		
		while(true) {
			System.out.println(kwamok + "점수 입력");
			jumsu = sc.nextInt();
			if(jumsu >=0 && jumsu <=100) break;
			
			System.out.println(kwamok + "점수 입력이 잘못되었습니다. 다시 입력해 주세요.");
		}
		return jumsu;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("학생 이름을 입력하세요.");
		String name = sc.next();

		int java = input("자바");
		int jsp = input("제이에스피");
		int spring = input("스프링");

		int total = java + jsp + spring;
		double aver= total /3.0;
		String grade;
		
		switch((int)aver / 10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F"; 		
		}
		
		System.out.println("-------------------");
		System.out.println(name + "님의 성적표 ");
		System.out.println("-------------------");
		System.out.println(" 총점 : " + total + "점");
		System.out.println(" 평균 : " + aver + "점");
		System.out.println(" 학점 : " + grade);
		System.out.println("-------------------");
		
	}

	

}
