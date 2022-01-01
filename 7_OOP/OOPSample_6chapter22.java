package OOP;

import java.util.Scanner;

class Person {
	//field area
/*
 * final : 고정된 값을 지정하여 사용시 활용, pi = 3.14159267...
 * 상수값 : Korea, 123456-1234567, 계백장군
 * 변수  : nation, ssn,            name
 * 
 */
	String nation = "Korea";//이 데이터는 수정 불가
	final String ssn;//123456-1234567
	String name;//계백장군
	
	//private final static double pi = 3.13159267;	
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}	
		
}

public class OOPSample_6chapter22 {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "계백장군");
		
		System.out.println(p1.nation); 
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.nation = "USA";
		System.out.println(p1.nation); 
		
		//p1.ssn = "122222-1111111";
		
		p1.name = "을지문덕";
		System.out.println(p1.name); 
		
	}

}
