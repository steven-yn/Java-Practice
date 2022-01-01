package OOP;

import java.util.Scanner;

/* 문제> 2개의 숫자를 입력 받아서 합계를 구하는 프로그램을 작성하세요.
 * - method()
 * - 객체를 생성하여 메소드 호출
 * - X X
 * - X O
 * - O X
 * - O O
 * - 1.절차지향적 코드
 * - 2.객체지향적 코드
 */
public class OOPSample3 {
	  int divi(int x2, int y2) {
		int sum = x2 / y2;
		return sum;
	}

	  int multi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("곱셈에 참여할 데이터 2개를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x * y;
		return sum;
	}

	  void Subtract(int x, int y) {
		int sum = x - y;
		System.out.println("뺄셈: " + sum);//
	}

	void Adder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("덧셈에 참여할 데이터 2개를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("덧셈: " + sum);//
	}

	public static void main(String[] args) {
		OOPSample3 os3 = new OOPSample3();
		
		Scanner sc = new Scanner(System.in);
				
		os3.Adder();// X X, 객체명.메소드명
		
		System.out.println("뺄셈에 참여할 데이터 2개를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		os3.Subtract(x, y);// X O
		
		int sum = os3.multi();// O X		
		System.out.println("곱셈: " + sum);//
		
		System.out.println("나눗셈에 참여할 데이터 2개를 입력하세요.");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int sum2 = os3.divi(x2, y2);// O O
		System.out.println("나눗셈: " + sum2); 
	}

}
