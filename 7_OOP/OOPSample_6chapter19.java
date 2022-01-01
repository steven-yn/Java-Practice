package OOP;

import java.util.Scanner;

class Car4 {

	private String model;//null => 
	private int speed;//0 => 10

	public Car4(String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;//10
	}
	
	
	public void run(int speed) {
		
		for(int i=10; i <= speed; i+=10) {
			this.setSpeed(i);
		System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "Km/h");	
		}
		
	}
	
}

public class OOPSample_6chapter19 {
	
	public static void main(String[] args) {
		//int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차 이름을 입력 하세요.");
		String str1 = sc.next();
		String str2 = sc.next();
		int speed = sc.nextInt(); 
		
		Car4 myCar = new Car4(str1);
		Car4 yourCar = new Car4(str2);
				
		myCar.run(speed);
		yourCar.run(speed);
	}

}
