package OOP_InheritanceSample;

import java.util.Scanner;

/* 문제> 커피 제품번호, 커피 제품명, 커피 색상, 커피 수량, 커피 가격
 * 등을 입력하여 총 판매량(수량 * 가격)을 계산하여 출력하세요.
 * - 상속을 이용하여 처리
 * - 상속 4가지를 모두 구현 
 * 
 * -  1)public class A extends B { .... }
 */

class Coffee_unitprice {
	private int unitprice;

	public void unitprice(int pUPrice) {
		this.unitprice = pUPrice; 		
	}	
}

class Coffee_Surang {
	private int surang; 

	public void surang(int pSu) {
		this.surang = pSu;		
	}
} 

class Coffee_Serial {
	private int serial;
	private String productName;
	private String color; 

	void serial2(int serial) {		
		this.serial = serial; 
	}

	public void productName(String pName) {
		this.productName = pName;		
	}

	public void color(String pColor) {
		this.color = pColor;		
	}
}

public class Coffee_InheritanceSample1_1 {
	private static Scanner sc = new Scanner(System.in);
	static int serial;
	static String pName;
	static String pColor;
	
	static int pSu; 
	static int pUPrice; 
	static int totalSales;
	
	public static void totalsales() {
		totalSales = pSu * pUPrice;	
	}
		
	private static void ProductResult() {  
		System.out.println("---------------------------");
		System.out.println(" 제품번호(code) : " +  serial);
		System.out.println(" 제품이름(name) : " +  pName);
		System.out.println(" 제품색상(color) : " + pColor); 
		System.out.println(" 제품수량(su) : " + pSu);  
		System.out.println(" 제품가격(price) : " + pUPrice); 
		System.out.println("---------------------------");
		System.out.println(" 제품판매액 : " + totalSales  + " 원");   
		System.out.println("---------------------------"); 	
	}
	
	public static void main(String[] args) {
		System.out.println("제품 번호를 입력해 주세요.");
		serial = sc.nextInt();	
		
		Coffee_Serial cs1 = new Coffee_Serial();
		cs1.serial2(serial);
		
		System.out.println("제품 이름을 입력해 주세요.");
		 pName = sc.next();	
		cs1.productName(pName);

		System.out.println("제품 색상을 입력해 주세요.");
		 pColor = sc.next();	
		cs1.color(pColor);
		
		Coffee_Surang cs2 = new Coffee_Surang();
		System.out.println("제품 수량을 입력해 주세요.");
		pSu = sc.nextInt();	
		cs2.surang(pSu); 
		 
		Coffee_unitprice cs3 = new Coffee_unitprice();
		System.out.println("제품 단가를 입력해 주세요.");
		pUPrice = sc.nextInt();		
		cs3.unitprice(pUPrice);
		 
		totalsales(); 
		 
		ProductResult();
		
	}
	

}
