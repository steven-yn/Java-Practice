package OOP;

public class Car {
	static String companys = "현대자동차";
	static String model = "그랜져";
	static String color = "노랑색";
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
