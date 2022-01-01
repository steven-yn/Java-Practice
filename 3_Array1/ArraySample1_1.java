package Array1;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 문제>
 * 번호, 이름, 자바, JSP, Spring, 총점, 평균 구하여 출력하세요. 
 * int, String, double, double, double, double, double
 * 
 * try {
 * 	문제가 발생할 만한 소스 기입
 *  }catch(InputMismatchException e){
 *     System.out.println("문자열이 입력되었습니다. 숫자로 입력해 주세요.");
 *  }
 * 
 * 
 */
public class ArraySample1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적처리 인원수를 입력해주세요.");
		int inwon = sc.nextInt();// 3

		int bunho[] = new int[inwon];// bunho[] 배열에 데이터를 저장
		String name[] = new String[inwon];
		double java[] = new double[inwon];
		double jsp[] = new double[inwon];
		double spring[] = new double[inwon];
		double total[] = new double[inwon];
		double aver[] = new double[inwon];

		for (int i = 0; i < inwon; i++) {
			System.out.println("번호 배열에 정수형 데이터를 입력 하시오.");
			bunho[i] = sc.nextInt();// bunho[] 배열에 데이터를 저장

			System.out.println("이름 배열에 문자열 데이터를 입력 하시오.");
			name[i] = sc.next();

			try {
				for (int j = 0; j < 1; j++) {
					System.out.println("Java 배열에 실수형 데이터를 입력 하시오.");
					double javajumsu = sc.nextDouble();

					if (javajumsu >= 0 && javajumsu <= 100)
						java[i] = javajumsu;
					else {
						System.out.println("점수의 범위는 0이상 100이하입니다.");
						j--;
						continue;
					}
				}
			} catch (InputMismatchException e) {
				// e.printStackTrace();//어디서 오류가 발생하는지 체크할때?
				System.out.println("문자열이 입력되었습니다. 숫자로 입력해 주세요.");
			}

			try {
				for (int k = 0; k < 1; k++) {
					System.out.println("JSP 배열에 실수형 데이터를 입력 하시오.");
					double jspjumsu = sc.nextDouble();

					if (jspjumsu >= 0 && jspjumsu <= 100)
						jsp[i] = jspjumsu;
					else {
						System.out.println("점수의 범위는 0이상 100이하입니다.");
						k--;
						continue;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("문자열이 입력되었습니다. 숫자로 입력해 주세요.");
			}

			try {
				for (int m = 0; m < 1; m++) {
					System.out.println("Spring 배열에 실수형 데이터를 입력 하시오.");
					double springjumsu = sc.nextDouble();

					if (springjumsu >= 0 && springjumsu <= 100)
						spring[i] = springjumsu;
					else {
						System.out.println("점수의 범위는 0이상 100이하입니다.");
						m--;
						continue;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("문자열이 입력되었습니다. 숫자로 입력해 주세요.");
			}

			total[i] = java[i] + jsp[i] + spring[i];
			aver[i] = total[i] / 3.0;// inwon
		}

		System.out.println("======================== 성 적 처 리 =======================");
		System.out.println("번호\t이름\tJava\tJSP\tSpring\ttotal\taver");//
		System.out.println("----------------------------------------------------------");//
		for (int i = 0; i < inwon; i++) {
			System.out.print(bunho[i] + "\t" + name[i] + "\t" + java[i] + "\t" + jsp[i] + "\t" + spring[i] + "\t");
			System.out.printf("%5.2f \t %5.2f \n", total[i], aver[i]);
		}
		System.out.println("===============================================================");
	}

}
