package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*  
 * 문제7> N개의 이름과 전화번호를 입력하여 배열에 저장하고, 저장된 내용을 출력하는 프로그램을 작성하세요.
 * ---------------------------
 *   전체회원수: 3 명
 * ---------------------------
 * 이 름 		전 화 번 호
 * ---------------------------
 * 홍길동		010-3311-4531
 * 이길동		02-456-3771
 * 박길동		010-5678-1234
 * --------------------------- 
 */
public class ArraySample1_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 회원 수의 배열 크기를 입력해 주세요.");
		int n = sc.nextInt();// 5

		String[] name = new String[n];// 이름 배열

		String[] tel = new String[n];// 전화번호 배열

		System.out.println("===== 이름과 전화번호 데이터 입력 ======");
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "번째 이름을 입력해 주세요.");
			name[i] = sc.next();

			System.out.println((i + 1) + "번째 전화번호를 입력해 주세요.");
			tel[i] = sc.next();
		}

		System.out.println("---------------------------");
		System.out.println("  전체회원수: " + n + "명");
		System.out.println("---------------------------");
		System.out.println(" 번호\t이 름\t전 화 번 호");
		System.out.println("---------------------------");

		for (int i = 0; i < n; i++) {
			System.out.println(" " + (i + 1) + "\t" + name[i] + "\t" + tel[i]);
		}
		System.out.println("---------------------------");
	} // main method end

} // class end

