package OOP_InheritanceSample;

import java.util.Scanner;

/* 문제> 커피 제품번호, 커피 제품명, 커피 색상, 커피 수량, 커피 가격
 * 등을 입력하여 총 판매량(수량 * 가격)을 계산하여 출력하세요.
 * - 상속을 이용하여 처리
 * - 상속 4가지를 모두 구현 
 * 
 * - 추상 클래스 이용 {  ..... }
 *  
 */
abstract class Coffee_unitprice33 {
	public abstract void unitprice(int pUPrice);//추상 메소드 선언
}

abstract class Coffee_Surang33 extends Coffee_unitprice33 {
	 abstract void surang(int pSu);//추상 메소드 선언
}

class Coffee_Serial33 extends Coffee_Surang33 {
	private int serial;
	private String productName;
	private String color;
	private int pSU;
	private int pUPrice; 

	void serial2(int serial) {
		this.serial = serial;
	}

	public void productName(String pName) {
		this.productName = pName;
	}

	public void color(String pColor) {
		this.color = pColor;
	}

	@Override  //추상 메소드 오버라이딩
	public void unitprice(int pSu) {
		this.pSU = pSu;
		
	}

	@Override //추상 메소드 오버라이딩
	public void surang(int pUPrice) {
		this.pUPrice = pUPrice;
		
	}
}

public class Coffee_InheritanceSample2_abstractclass  {
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
		System.out.println(" 제품번호(code) : " + serial);
		System.out.println(" 제품이름(name) : " + pName);
		System.out.println(" 제품색상(color) : " + pColor);
		System.out.println(" 제품수량(su) : " + pSu);
		System.out.println(" 제품가격(price) : " + pUPrice);
		System.out.println("---------------------------");
		System.out.println(" 제품판매액 : " + totalSales + " 원");
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		Coffee_Serial33 cis1_2 = new Coffee_Serial33();

		System.out.println("제품 번호를 입력해 주세요.");
		serial = sc.nextInt();
		cis1_2.serial2(serial);

		System.out.println("제품 이름을 입력해 주세요.");
		pName = sc.next();
		cis1_2.productName(pName);

		System.out.println("제품 색상을 입력해 주세요.");
		pColor = sc.next();
		cis1_2.color(pColor);

		System.out.println("제품 수량을 입력해 주세요.");
		pSu = sc.nextInt();
		cis1_2.surang(pSu);

		System.out.println("제품 단가를 입력해 주세요.");
		pUPrice = sc.nextInt();
		cis1_2.unitprice(pUPrice);

		totalsales();

		ProductResult();

	}

}
