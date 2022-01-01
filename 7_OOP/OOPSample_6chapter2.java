package OOP;

import java.util.Scanner;

 class Calculator2 {
	//						10      20
	public static int add(int i, int j) {
		int sum = i + j;
		return sum;//30
	}
	// 메소드 오버로딩
	public static double add(double x2, double y2) {
		double sum = x2 + y2;
		return sum;
	}
}

public class OOPSample_6chapter2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수형 데이터 2개 입력");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result1 = Calculator2.add(10, 20);		
		int result2 = Calculator2.add(x, y);
		
		System.out.println("실수형 데이터 2개 입력");
		double x2 = sc.nextDouble();//5.5
		double y2 = sc.nextDouble();//6.6
		double result3 = Calculator2.add(x2, y2);
		
		System.out.println("add1 : " + result1);//30
		System.out.println("add2 : " + result2);//30
		System.out.println("add3 : " + result3);//12.1
	}

}
