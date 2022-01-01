package OOP;

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
public class ArraySample2_12_1 {

	private static Scanner sc = new Scanner(System.in);
	private static String grade;

	static boolean k = true;
	static int n;
	static int num = 1;
	private static double sum;// 0.0 = > ?
	private static double aver;// 0.0 = > ?

	public static void sungjuk() {
		
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
		ArraySample2_12_1 as2_12_1 = new ArraySample2_12_1();
		as2_12_1.sungjuk();

	}

}

/*
 * package Array2;
 * 
 * import java.util.Scanner;
 * 
 * /* Name, Java, JSP, Spring 점수를 입력 받아서 성적 처리 처리 조건> 1.method()이용 합니다.
 * 
 * 총점, 평균, 학점 구하기 ------------------- 홍길동님의 성적표 ------------------- 총점 : 평균 : 학점
 * : -------------------
 * 
 */
/*
 * public class ArraySample2_12 {
 * 
 * private static Scanner sc = new Scanner(System.in);
 * 
 * 
 * static boolean k = true; static int n; static int num = 1; private static
 * double sum;// 0.0 = > ? // 0.0 = > ?
 * 
 * public static void main(String[] args) {
 * 
 * while(k) { System.out.println("몇명의 학생 성적 처리를 하시겠습니까?"); n = sc.nextInt();
 * 
 * k = false; }
 * 
 * double jumsu[][] = new double[n][7];// 과목(3), 총점, 평균, 학점 포함 7자리 String name[]
 * = new String[n];//이름 배열
 * 
 * k = true;
 * 
 * while(k) {
 * 
 * for (int i = 0; i < jumsu.length; i++) { System.out.println(num +
 * "번 학생의 성적을 입력해 주세요."); System.out.println("이름을 입력해 주세요."); name[i] =
 * sc.next();
 * 
 * for(int j=0; j < 5; j++) { switch (j) {
 * 
 * case 0: jumsu[i][j] = num; break; case 1:
 * System.out.println("자바 점수를 입력 하세요."); jumsu[i][j] = sc.nextInt(); break; case
 * 2: System.out.println("JSP 점수를 입력 하세요."); jumsu[i][j] = sc.nextInt(); break;
 * case 3: System.out.println("스프링 점수를 입력 하세요."); jumsu[i][j] = sc.nextInt();
 * break; } } num++; } k = false; } double[] aver = new double[jumsu.length];
 * for(int i=0; i < jumsu.length; i++) { sum = jumsu[i][1] + jumsu[i][2] +
 * jumsu[i][3];//총점 구하기 jumsu[i][4] = sum; aver[i] = (sum / 3);// 평균 구하기
 * jumsu[i][5] = aver[i];
 * 
 * 
 * } String[] grade = new String[jumsu.length];
 * 
 * 출처: https://ifuwanna.tistory.com/231 [IfUwanna IT] //학점 구하기 for(int i=0; i <
 * jumsu.length; i++) { switch ((int)jumsu[i][5] / 10) { case 10: case 9:
 * grade[i] = "A"; break; case 8: grade[i] = "B"; break; case 7: grade[i] = "C";
 * break; case 6: grade[i] = "D"; break; default: grade[i] = "F"; }}
 * 
 * // 성적 출력하기
 * System.out.println("-------------------------------------------------");
 * System.out.println("번호\t이름\t자바\tJSP\t스프링\t총점\t학점\t평균");
 * System.out.println("-------------------------------------------------");
 * 
 * for(int i = 0; i < jumsu.length;i++) { System.out.print(num + "\t" + name[i]
 * + "\t" + jumsu[i][1] + "\t" + jumsu[i][2] + "\t" + jumsu[i][3] + "\t" +
 * jumsu[i][4] + "\t"+grade[i]+ "\t");
 * 
 * for (int j = 1; j < jumsu[i].length; j++) { if (j == 5) {
 * 
 * System.out.print(String.format("%.2f", jumsu[i][j]) + " "); }
 * 
 * 
 * } System.out.println(); }
 * 
 * }}
 * 
 */