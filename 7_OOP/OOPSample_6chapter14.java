package OOP;

import java.util.Scanner;

//매개변수에 대한 처리
public class OOPSample_6chapter14 {
			
	
	private static double divide(int su1, int su2) {
		int sum = su1 + su2;
		return sum;
	}
	
	private static double divide2(int su3, int su4) {
		int sum = su3 + su4;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 데이터를 입력 하세요.");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		double su3 = sc.nextDouble();
		double su4 = sc.nextDouble();
		
		double result = divide(su1, su2); 	
		System.out.println("정수 + 정수  : "  + result); 
		System.out.println("------------");
		
		double result2 = divide2((int)su3, (int)su4); 	
		System.out.println("실수 + 실수  : "  + result2); 
		System.out.println("------------");
	}

	

	

	

	

}
