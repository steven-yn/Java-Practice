package OOP;

class Car3 {
	static String company = "�����ڵ���";
	static String model;
	static String color;
	static int maxSpeed;
	
	Car3(){
		//default constructor
	}
	
	Car3(String model){
		this(model, "����", 250);
	}
	
	Car3(String model, String color){
		this(model, color, 250);
	}
	
	Car3(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
