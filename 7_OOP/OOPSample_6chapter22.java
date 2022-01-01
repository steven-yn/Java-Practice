package OOP;

import java.util.Scanner;

class Person {
	//field area
/*
 * final : ������ ���� �����Ͽ� ���� Ȱ��, pi = 3.14159267...
 * ����� : Korea, 123456-1234567, ����屺
 * ����  : nation, ssn,            name
 * 
 */
	String nation = "Korea";//�� �����ʹ� ���� �Ұ�
	final String ssn;//123456-1234567
	String name;//����屺
	
	//private final static double pi = 3.13159267;	
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}	
		
}

public class OOPSample_6chapter22 {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "����屺");
		
		System.out.println(p1.nation); 
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.nation = "USA";
		System.out.println(p1.nation); 
		
		//p1.ssn = "122222-1111111";
		
		p1.name = "��������";
		System.out.println(p1.name); 
		
	}

}
