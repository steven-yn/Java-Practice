package OOP_InheritanceSample;

import java.util.Scanner;

/* 문제> 커피 제품번호, 커피 제품명, 커피 색상, 커피 수량, 커피 가격
 * 등을 입력하여 총 판매량(수량 * 가격)을 계산하여 출력하세요.
 * - 상속을 이용하여 처리
 * - 상속 4가지를 모두 구현 
 * 
 * 
 */

public class Coffee_InheritanceSample1 {
	private static Scanner sc = new Scanner(System.in);
	static int serial;
	static String pName;
	static String pColor;
	
	int pSu;
	int pUPrice;
	int totalSales;
	
	private void totalsales() {
		totalSales = pSu * pUPrice;	
	}

	private void unitprice() {
		System.out.println("제품 단가를 입력해 주세요.");
		pUPrice = sc.nextInt();			
	}

	private void surang() {
		System.out.println("제품 수량을 입력해 주세요.");
		pSu = sc.nextInt();		
	}

	private void color() {
		System.out.println("제품 색상을 입력해 주세요.");
		 pColor = sc.next();			
	}

	private void productName() {
		System.out.println("제품 이름을 입력해 주세요.");
		 pName = sc.next();			
	}
	
	private  void serial2() {		
		System.out.println("제품 번호를 입력해 주세요.");
		serial = sc.nextInt();				
	}
	
	private void ProductResult() {  //getter
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
		Coffee_InheritanceSample1 cis1 = new Coffee_InheritanceSample1();
		
		cis1.productName();
		cis1.color();
		cis1.surang();
		cis1.unitprice();
		cis1.totalsales(); 
		cis1.ProductResult();				
	}

}
