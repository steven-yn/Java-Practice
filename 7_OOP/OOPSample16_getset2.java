package OOP;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/* 
 * 문제> 다음과 같은 과목의 성적이 존재합니다.
 * 학번(University), 이름(name), 자바(java), JSP(jsp), 스프링(spring), 
 * 총점(total), 평균(average)을 구하여 출력하세요.
 * setter()라는 메소드를 이용하여 데이터를 저장하고,
 * getter()라는 메소드를 이용하여 데이터를 출력하세요.
 * ---------------------------
 *  학번(University) : 
 *  이름(name) : 
 *  자바(java) : 
 *  JSP(jsp) : 
 *  스프링(spring) :   
 * ---------------------------
 *  총점(total) :    
 *  평균(average) :    
 * --------------------------- 
 */
public class OOPSample16_getset2 {
//filed area : 속성 = 클래스 변수
	
	private String University;// null =>
	private String name;// null =>
	private int java;// null =>
	private int jsp;// 0 =>
	private int spring;// 0 =>
	private int total;//0 =>
	private double average;//0.0 => 
	
	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) {
		University = university;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	private static OOPSample16_getset2 oop16_gs2 = new OOPSample16_getset2();
	
	private void SungjukOperation() {
		total = java + jsp + spring;
		average = total / 3.0;
	}

	private void SungjukResult() {  //getter
		System.out.println("---------------------------");
		System.out.println(" 학번(University) : " +  oop16_gs2.getUniversity());
		System.out.println(" 이름(name) : " +  oop16_gs2.getName());
		System.out.println(" 자바(java) : " + oop16_gs2.getJava()); 
		System.out.println(" JSP(jsp) : " + oop16_gs2.getJsp());  
		System.out.println(" 스프링(spring) : " + oop16_gs2.getSpring()); 
		System.out.println("---------------------------");
		System.out.println(" 총점(total) : " + total  + " 점"); 
		System.out.println(" 평균(average) : " + average + " 점");
		System.out.println("---------------------------"); 		
	}

	public static void main(String[] args) {
		String stop;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("학번(University)을 입력해 주세요.");
		String University = sc.next();//
		System.out.println("이름(name)을 입력해 주세요.");
		String name = sc.next();//
		System.out.println("자바(java)를 입력해 주세요.");
		int java = sc.nextInt();//
		System.out.println("JSP(jsp)을 입력해 주세요.");
		int jsp = sc.nextInt();//
		System.out.println("Spring(spring)을 입력해 주세요.");
		int spring = sc.nextInt();//

		// DataInput(setter)
		
		oop16_gs2.setUniversity(University);
		oop16_gs2.setName(name);
		oop16_gs2.setJava(java);
		oop16_gs2.setJsp(jsp);
		oop16_gs2.setSpring(spring);

		//DataProcessing
		oop16_gs2.SungjukOperation();		
		
		// DataOuput
		oop16_gs2.SungjukResult();

		System.out.println("문자를 입력해 주세요. 끝내려면 exit를 입력");
		 stop = sc.next();
		}while(!stop.equals("exit"));
	} // main method end

	

} // class end
