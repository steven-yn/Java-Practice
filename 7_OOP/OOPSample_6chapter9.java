package OOP;

import java.util.Scanner;

 class Car2 {
	static String company = "�����ڵ���";
	static String model;
	static String color;
	static int maxSpeed;
	
	Car2(){
		//default constructor
	}
	
	Car2(String model){
		this(model, "����", 250);
	}
	
	Car2(String model, String color){
		this(model, color, 250);
	}
	
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}

public class OOPSample_6chapter9 {
			
	public static void main(String[] args) {
		
		Car2 car1 = new Car2(); //default constructor call
		System.out.println("car1.company : " + car1.company);
		System.out.println();//�ٹٲ� �뵵 ���
		
		Car2 car2 = new Car2("�ڰ���"); 
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();//�ٹٲ� �뵵 ���
		
		Car2 car3 = new Car2("�ڰ���", "����"); 
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();//�ٹٲ� �뵵 ���
		
		Car2 car4 = new Car2("�ڰ���", "����", 200); 
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();//�ٹٲ� �뵵 ���
	}

}
