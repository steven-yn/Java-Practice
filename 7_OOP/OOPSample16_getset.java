package OOP;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/* 
 * 문제> 제품번호(code), 제품이름(name), 제품색상(color), 제품수량(su), 제품가격(price)이 존재합니다.
 * setter()라는 메소드를 이용하여 데이터를 저장하고,
 * getter()라는 메소드를 이용하여 데이터를 출력하세요.
 * ---------------------------
 *  제품번호(code) : 
 *  제품이름(name) : 
 *  제품색상(color) : 
 *  제품수량(su) : 
 *  제품가격(price) : 
 * ---------------------------
 *  제품판매액 :    원   
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
		System.out.println(" 제품번호(code) : " +  oop16_gs.getCode());
		System.out.println(" 제품이름(name) : " +  oop16_gs.getName());
		System.out.println(" 제품색상(color) : " + oop16_gs.getColor()); 
		System.out.println(" 제품수량(su) : " + oop16_gs.getSurang());  
		System.out.println(" 제품가격(price) : " + oop16_gs.getPrice()); 
		System.out.println("---------------------------");
		System.out.println(" 제품판매액 : " + productSum  + " 원");   
		System.out.println("---------------------------"); 		
	}

	public static void main(String[] args) {
		String stop;
		Scanner sc = new Scanner(System.in);
		
		do {			
		
		System.out.println("제품번호(code)를 입력해 주세요.");
		String code = sc.next();//
		System.out.println("제품이름(name)을 입력해 주세요.");
		String name = sc.next();//
		System.out.println("제품색상(color)을 입력해 주세요.");
		String color = sc.next();//
		System.out.println("제품수량(su)을 입력해 주세요.");
		int surang = sc.nextInt();//
		System.out.println("제품가격(price)을 입력해 주세요.");
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
		
		System.out.println("문자를 입력해 주세요. 끝내려면 exit를 입력");
		 stop = sc.next();
		}while(!stop.equals("exit"));
	} // main method end


} // class end
