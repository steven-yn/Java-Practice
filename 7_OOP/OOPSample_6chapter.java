package OOP;

import java.util.Scanner;

public class OOPSample_6chapter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result1 = Calculator.add(10, 20);		
		int result2 = Calculator.add(x, y);
		
		double x2 = sc.nextDouble();//5.5
		double y2 = sc.nextDouble();//6.6
		double result3 = Calculator.add(x2, y2);
		
		System.out.println("add1 : " + result1);//30
		System.out.println("add2 : " + result2);//30
		System.out.println("add3 : " + result3);//12.1
	}

}
