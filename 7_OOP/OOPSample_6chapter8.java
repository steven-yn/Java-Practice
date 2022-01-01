package OOP;

import java.util.Scanner;

public class OOPSample_6chapter8 {
			
	public static void main(String[] args) {
						
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 5개 입력");
		String company  = sc.next();
		String model  = sc.next();
		String color  = sc.next();
		int maxSpeed = sc.nextInt();
		int speed = sc.nextInt();
	
		Car car = new Car(company, model, color, maxSpeed, speed); 
		
		// 클래스명으로 접근하여 출력하기
		System.out.println("제작회사 : " + Car.companys);//현대자동차
		System.out.println("모델명 : " + Car.model);//그랜저
		System.out.println("색상 : " + Car.color);//검정색
		System.out.println("최고속도 : " + Car.maxSpeed);//350
		System.out.println("현재속도 : " + Car.speed);//0
		
		// 객체명으로 접근하여 출력하기
		System.out.println("제작회사 : " + car.companys);//현대자동차
		System.out.println("모델명 : " + car.model);//그랜저
		System.out.println("색상 : " + car.color);//검정색
		System.out.println("최고속도 : " + car.maxSpeed);//350
		System.out.println("현재속도 : " + car.speed);//0
	}

}
