package OOP;

import java.util.Scanner;

public class OOPSample_6chapter4 {
	//정적 초기화 블럭 = 값의 변화가 없을 때 사용(고정적인 값 유지)
	static String company = "현대자동차";
	static String model = "그랜저";
	static String color = "검정색";
	static int maxSpeed = 350;
	static int speed; 		
	
	public static void main(String[] args) {
				
		System.out.println("제작회사 : " + company);//현대자동차
		System.out.println("모델명 : " + model);//그랜저
		System.out.println("색상 : " + color);//검정색
		System.out.println("최고속도 : " + maxSpeed);//350
		System.out.println("현재속도 : " + speed);//0
	}

}
