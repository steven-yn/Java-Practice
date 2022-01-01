package OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 문제> 다음과 같은 배열이 존재 합니다.
 * - 데이터는 정수형 입니다.
 * - 반복문 사용
 * - 이들 배열을 메소드 형식으로 만든 다음에 객체를 이용하여 호출이 되도록 프로그래밍 합니다.
 */
public class OOPSample14 {

	private static Scanner sc = new Scanner(System.in);
	private static String grade;

	static boolean k = true;
	static int n;
	static int num = 1;
	private static double sum;// 0.0 = > ?
	private static double aver;// 0.0 = > ?	
	
	private void ArrayList1() {
		int[][] num = new int[5][5];
		int su = 0;

		for (int i = 0; i < num.length; i++) {

			for (int j = i; j >= 0; j--) {
				su++;
				num[i][j] = su;
			}
		}

		int i = 0;
		for (; i < num.length; i++) {

			for (int j = 0; j < num.length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private  void ArrayList2() {
		int[][] num = new int[5][5];
		int su = 0;
		
		for (int i = 0; i < num.length - 3; i++) { 

			for (int j = i; j <= 4 - i; j++) {				
				su++;
				num[i][j] = su;			
			}
		}
		
		for (int i = 2; i <= 4; i++) {

			for (int j = 4-i; j <= i; j++) {				
				su++;
				num[i][j] = su;					
			}
		}

		int i = 0;
		for (; i < num.length; i++) {

			for (int j = 0; j < num.length; j++) { 
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private  void ArrayList3() {
		
		while (k) {	
			System.out.println("몇명의 학생 성적 처리를 하시겠습니까?");
			n = sc.nextInt();

			k = false;		
		}

		// double jumsu[][] = new double[n][7];// 과목(3), 총점, 평균, 학점 포함 7자리
		double[][] jumsu = new double[n][7];// 과목(3), 총점, 평균, 학점 포함 7자리
		// String name[] = new String[n];//이름 배열
		String[] name = new String[n];// 이름 배열

		k = true;

		while (k) {

			for (int i = 0; i < jumsu.length; i++) {
				System.out.println(num + "번 학생의 성적을 입력해 주세요.");
				System.out.println("이름을 입력해 주세요.");
				name[i] = sc.next();

				for (int j = 0; j < 5; j++) {
					switch (j) {

					case 0:
						jumsu[i][j] = num;
						break;
					case 1:
						System.out.println("자바 점수를 입력 하세요.");
						jumsu[i][j] = sc.nextInt();
						break;
					case 2:
						System.out.println("JSP 점수를 입력 하세요.");
						jumsu[i][j] = sc.nextInt();
						break;
					case 3:
						System.out.println("스프링 점수를 입력 하세요.");
						jumsu[i][j] = sc.nextInt();
						break;
					}
				}
				num++;
			}
			k = false;
		}

		for (int i = 0; i < jumsu.length; i++) {
			sum = jumsu[i][1] + jumsu[i][2] + jumsu[i][3];// 총점 구하기
			jumsu[i][4] = sum;
			aver = jumsu[i][4] / 3.0;// 평균 구하기
			jumsu[i][5] = aver;

		}

		// 성적 출력하기
		System.out.println("-----------------------------------------------------------");
		System.out.println("번호\t이름\t자바\tJSP\t스프링\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------------------");

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print((int) jumsu[i][0] + "\t" + name[i] + "\t" + jumsu[i][1] + "\t" + jumsu[i][2] + "\t"
					+ jumsu[i][3] + "\t" + jumsu[i][4] + "\t");
			 System.out.printf("%5.2f\t", jumsu[i][5]);

			// 학점 구하기
			switch ((int) jumsu[i][5] / 10) {
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
			}
			System.out.println(grade);
		}
	}
	
	public static void main(String[] args) {
		 OOPSample14 oop14 = new OOPSample14();
		 oop14.ArrayList1();		
		 oop14.ArrayList2();
		 oop14.ArrayList3();
	}

}
