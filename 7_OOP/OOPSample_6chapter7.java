package OOP;

import java.util.Scanner;

public class OOPSample_6chapter7 {
			
	
	public static void main(String[] args) {
		
		Car car = new Car(); 
		
		System.out.println("제작회사 : " + car.companys);//현대자동차
		System.out.println("모델명 : " + car.model);//그랜저
		System.out.println("색상 : " + car.color);//검정색
		System.out.println("최고속도 : " + car.maxSpeed);//350
		System.out.println("현재속도 : " + car.speed);//0
	}

}
