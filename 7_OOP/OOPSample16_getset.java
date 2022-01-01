package OOP;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/* 
 * ����> ��ǰ��ȣ(code), ��ǰ�̸�(name), ��ǰ����(color), ��ǰ����(su), ��ǰ����(price)�� �����մϴ�.
 * setter()��� �޼ҵ带 �̿��Ͽ� �����͸� �����ϰ�,
 * getter()��� �޼ҵ带 �̿��Ͽ� �����͸� ����ϼ���.
 * ---------------------------
 *  ��ǰ��ȣ(code) : 
 *  ��ǰ�̸�(name) : 
 *  ��ǰ����(color) : 
 *  ��ǰ����(su) : 
 *  ��ǰ����(price) : 
 * ---------------------------
 *  ��ǰ�Ǹž� :    ��   
 * --------------------------- 
 */
public class OOPSample16_getset {

	private String code;// null =>
	private String name;// null =>
	private String color;// null =>
	private int surang;// 0 =>
	private int price;// 0 =>
	private int productSum;//0 => 
	
	private static OOPSample16_getset oop16_gs = new OOPSample16_getset();
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSurang() {
		return surang;
	}

	public void setSurang(int surang) {
		this.surang = surang;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private void productOperation() {
		productSum = surang * price;
	}	
	
	private void ProductResult() {  //getter
		System.out.println("---------------------------");
		System.out.println(" ��ǰ��ȣ(code) : " +  oop16_gs.getCode());
		System.out.println(" ��ǰ�̸�(name) : " +  oop16_gs.getName());
		System.out.println(" ��ǰ����(color) : " + oop16_gs.getColor()); 
		System.out.println(" ��ǰ����(su) : " + oop16_gs.getSurang());  
		System.out.println(" ��ǰ����(price) : " + oop16_gs.getPrice()); 
		System.out.println("---------------------------");
		System.out.println(" ��ǰ�Ǹž� : " + productSum  + " ��");   
		System.out.println("---------------------------"); 		
	}

	public static void main(String[] args) {
		String stop;
		Scanner sc = new Scanner(System.in);
		
		do {			
		
		System.out.println("��ǰ��ȣ(code)�� �Է��� �ּ���.");
		String code = sc.next();//
		System.out.println("��ǰ�̸�(name)�� �Է��� �ּ���.");
		String name = sc.next();//
		System.out.println("��ǰ����(color)�� �Է��� �ּ���.");
		String color = sc.next();//
		System.out.println("��ǰ����(su)�� �Է��� �ּ���.");
		int surang = sc.nextInt();//
		System.out.println("��ǰ����(price)�� �Է��� �ּ���.");
		int price = sc.nextInt();//

		// DataInput(setter)
		
		oop16_gs.setCode(code);
		oop16_gs.setName(name);
		oop16_gs.setColor(color);
		oop16_gs.setSurang(surang);
		oop16_gs.setPrice(price);

		//DataProcessing
		oop16_gs.productOperation();		
		
		// DataOuput
		oop16_gs.ProductResult();
		
		System.out.println("���ڸ� �Է��� �ּ���. �������� exit�� �Է�");
		 stop = sc.next();
		}while(!stop.equals("exit"));
	} // main method end


} // class end
