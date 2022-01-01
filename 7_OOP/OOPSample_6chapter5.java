package OOP;

import java.util.Scanner;

public class OOPSample_6chapter5 {

	static String company;
	static String model;
	static String color;
	static int maxSpeed;
	static int speed; 		
	
	public static void main(String[] args) {
						
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 5개 입력");
		String company  = sc.next();
		String model  = sc.next();
		String color  = sc.next();
		int maxSpeed = sc.nextInt();
		int speed = sc.nextInt();
		
		System.out.println("제작회사 : " + company);//현대자동차
		System.out.println("모델명 : " + model);//그랜저
		System.out.println("색상 : " + color);//검정색
		System.out.println("최고속도 : " + maxSpeed);//350
		System.out.println("현재속도 : " + speed);//0
	}

}
