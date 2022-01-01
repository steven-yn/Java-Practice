package Array2;

import java.util.Scanner;

/* Name, Java, JSP, Spring 점수를 입력 받아서 성적 처리 
 * 처리 조건> 1.method()이용 합니다.
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
//2차원 배열로 성적 처리 구현

public class ArraySample2_13 {

	static int num = 1, n = 0, kor = 0, eng = 0, mat = 0, sum = 0;
	static double aver = 0;
	static Scanner scanner = new Scanner(System.in);
	static boolean k = true;
	private static String grade;

	public static void main(String[] args) {
		
		while (k) {  //true
			
				System.out.println("입력하실 학생 수를 입력해주세요");
				n = scanner.nextInt();
				
				k = false;			
		}

		double jumsu[][] = new double[n][8];//[7][7] => 0~6 0~6
		String name[] = new String[n];//7
		k = true;
		System.out.println();

		while (k) {
			
				for (int i = 0; i < name.length; i++) {
					System.out.println(num + "번 학생의 정보를 입력해 주세요");
					System.out.println("성함을 입력해 주세요");
					name[i] = scanner.next();
					
					for (int j = 0; j < 5; j++) {
						switch (j) {
						case 0:
							jumsu[i][j] = num;//grade[0][0] = 2021001
							break;
						case 1:
							System.out.println("국어점수를 입력해 주세요");
							jumsu[i][j] = scanner.nextInt();//grade[0][1] = 100.0
							break;
						case 2:
							System.out.println("영어점수를 입력해 주세요");
							jumsu[i][j] = scanner.nextInt();//grade[0][2] = 99.0
							break;
						case 3:
							System.out.println("수학점수를 입력해 주세요");
							jumsu[i][j] = scanner.nextInt();//grade[0][3] = 100.0
							break;
						}
					}
					System.out.println();
					num++;//2021002, 2021003.....
				}
				k = false;
			} 
		

		for (int i = 0; i < jumsu.length; i++) {
			sum = (int) (jumsu[i][1] + jumsu[i][2] + jumsu[i][3]);
			jumsu[i][4] = sum;
			aver = jumsu[i][4] / 3.0;
			jumsu[i][5] = aver;//평균 점수
		}

		//학점 구하기
		switch ((int) aver / 10) {
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
		
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i][6] = 1;//1등 설정 초기화, [0][6]=1, [1][6]=1, [2][6]=1, [3][6]=1....[6][6]=1
		}

		//석차 구하기 루틴
		for (int i = 0; i < jumsu.length; i++) {
			for (int j = 0; j < jumsu.length; j++) {
				if (jumsu[i][5] < jumsu[j][5]) {   // [i][5]=99 < [j][5]= 100
					jumsu[i][6]++;
				}
			}
		}

		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("                                            성         적         표                                               ");
		System.out.println("번호\t\t이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t석차");
		System.out.println("---------------------------------------------------------------------------------------------");

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print((int) jumsu[i][0] + "\t\t" + name[i] + "\t\t");

			for (int j = 1; j < jumsu[i].length; j++) {

				if (j == 5) { //평균에 대하여 소숫점 이하 자릿수 에 대한 출력
					System.out.print(String.format("%.2f", jumsu[i][j]) + "\t\t");
				} else {
					System.out.print((int) jumsu[i][6] + "\t\t");
					//System.out.print(grade);
				} 

			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------------------------");

	}
}
