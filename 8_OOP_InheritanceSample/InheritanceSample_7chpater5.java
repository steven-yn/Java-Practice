package OOP_InheritanceSample;

import java.util.Scanner;

class People33 {

	public String name;
	String ssn; 

	public People33(String name, String ssn) {
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
	
	final void Sample() {  //final method() : 오버라이딩을 할 수 없음.
		System.out.println("난 알아요~~~");
	}
	
	
}

 class Student33 extends People33 {

	public int studentNo;
	
	public Student33(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}	
	
	void methodSample() {
		super.methodSample();		
	}
	
	void AdderSample() {
		super.AdderSample();
	}
	
	void Sample(){
		
	}
		
}

class Student4 extends Student33 {

	public Student4(String name, String ssn, int studentNo) {
		super(name, ssn, studentNo);		
	}	
}


public class InheritanceSample_7chpater5  {  
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 주민번호, 학번을 입력해 주세요.");
		String name = sc.next();
		String ssn = sc.next();
		int studentNo = sc.nextInt();
		
		final int peopleValue = 500;//상수값을 변경할수 없음.
		peopleValue = 1000;
		
		Student2 student = new Student2(name, ssn, studentNo);
		
		System.out.println("name : " + student.name); 
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo); 
		
		student.methodSample();
		
		student.AdderSample();
	}

}
