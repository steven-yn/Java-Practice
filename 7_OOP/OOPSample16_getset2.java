package OOP;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/* 
 * ����> ������ ���� ������ ������ �����մϴ�.
 * �й�(University), �̸�(name), �ڹ�(java), JSP(jsp), ������(spring), 
 * ����(total), ���(average)�� ���Ͽ� ����ϼ���.
 * setter()��� �޼ҵ带 �̿��Ͽ� �����͸� �����ϰ�,
 * getter()��� �޼ҵ带 �̿��Ͽ� �����͸� ����ϼ���.
 * ---------------------------
 *  �й�(University) : 
 *  �̸�(name) : 
 *  �ڹ�(java) : 
 *  JSP(jsp) : 
 *  ������(spring) :   
 * ---------------------------
 *  ����(total) :    
 *  ���(average) :    
 * --------------------------- 
 */
public class OOPSample16_getset2 {
//filed area : �Ӽ� = Ŭ���� ����
	
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
		System.out.println(" �й�(University) : " +  oop16_gs2.getUniversity());
		System.out.println(" �̸�(name) : " +  oop16_gs2.getName());
		System.out.println(" �ڹ�(java) : " + oop16_gs2.getJava()); 
		System.out.println(" JSP(jsp) : " + oop16_gs2.getJsp());  
		System.out.println(" ������(spring) : " + oop16_gs2.getSpring()); 
		System.out.println("---------------------------");
		System.out.println(" ����(total) : " + total  + " ��"); 
		System.out.println(" ���(average) : " + average + " ��");
		System.out.println("---------------------------"); 		
	}

	public static void main(String[] args) {
		String stop;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("�й�(University)�� �Է��� �ּ���.");
		String University = sc.next();//
		System.out.println("�̸�(name)�� �Է��� �ּ���.");
		String name = sc.next();//
		System.out.println("�ڹ�(java)�� �Է��� �ּ���.");
		int java = sc.nextInt();//
		System.out.println("JSP(jsp)�� �Է��� �ּ���.");
		int jsp = sc.nextInt();//
		System.out.println("Spring(spring)�� �Է��� �ּ���.");
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

		System.out.println("���ڸ� �Է��� �ּ���. �������� exit�� �Է�");
		 stop = sc.next();
		}while(!stop.equals("exit"));
	} // main method end

	

} // class end
