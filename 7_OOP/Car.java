package OOP;

public class Car {
	static String companys = "�����ڵ���";
	static String model = "�׷���";
	static String color = "�����";
	static int maxSpeed = 350;
	static int speed; 
	
	@SuppressWarnings("static-access")
	public Car(String company, String model, String color, int maxSpeed, int speed) {
		companys = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	
}
