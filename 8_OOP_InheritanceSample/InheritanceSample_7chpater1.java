package OOP_InheritanceSample;

class Parent1 {
	static String str1 = "æ»≥Á«œººø‰?"; 
	static int x=500;
	static int y=300; 
}

class Parent2 {
	static int a = 500; 
}

interface Parent3 {
	public abstract void adder();
}

abstract class Parent4 {
	abstract void adder();
}

public class InheritanceSample_7chpater1 extends Parent1 implements Parent3 {

	@Override
	public void adder() {
			
	}
	
	private static void adder(int x, int y) {
		int sum = x + y;
		System.out.println(sum);//800
	}
	
	public static void main(String[] args) {
		
		System.out.println(str1); //æ»≥Á«œººø‰?
		System.out.println(x + y);//800
		System.out.println(Parent2.a);//500
		
		adder(x, y);
		
		Parent1 p1 = new Parent1();
		int x = p1.x;//500
		int y = p1.y;//300
		System.out.println(x + y); //800
		
	}

	

	

}
