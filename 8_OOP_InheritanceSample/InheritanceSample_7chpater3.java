package OOP_InheritanceSample;

import java.util.Scanner;

class People {

	public String name;
	String ssn; 

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}	
	
	void methodSample(){
		System.out.println("안녕하세요????");		
	}
	
	void AdderSample() {
		int sum = 500 + 300;
		System.out.println(sum);//800
	}
}

class Student extends People {

	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}	
	
	void methodSample() {
		super.methodSample();		
	}
	
	void AdderSample() {
		super.AdderSample();
	}
}

public class InheritanceSample_7chpater3  {  
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 주민번호, 학번을 입력해 주세요.");
		String name = sc.next();
		String ssn = sc.next();
		int studentNo = sc.nextInt();
		
		Student student = new Student(name, ssn, studentNo);
		
		System.out.println("name : " + student.name); 
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo); 
		
		student.methodSample();
		
		student.AdderSample();
	}

}
