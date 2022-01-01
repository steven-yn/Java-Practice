package OOP_InheritanceSample;

import java.util.Scanner;

/* ����> Ŀ�� ��ǰ��ȣ, Ŀ�� ��ǰ��, Ŀ�� ����, Ŀ�� ����, Ŀ�� ����
 * ���� �Է��Ͽ� �� �Ǹŷ�(���� * ����)�� ����Ͽ� ����ϼ���.
 * - ����� �̿��Ͽ� ó��
 * - ��� 4������ ��� ���� 
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
		System.out.println(" ��ǰ��ȣ(code) : " +  serial);
		System.out.println(" ��ǰ�̸�(name) : " +  pName);
		System.out.println(" ��ǰ����(color) : " + pColor); 
		System.out.println(" ��ǰ����(su) : " + pSu);  
		System.out.println(" ��ǰ����(price) : " + pUPrice); 
		System.out.println("---------------------------");
		System.out.println(" ��ǰ�Ǹž� : " + totalSales  + " ��");   
		System.out.println("---------------------------"); 	
	}
	
	public static void main(String[] args) {
		System.out.println("��ǰ ��ȣ�� �Է��� �ּ���.");
		serial = sc.nextInt();	
		
		Coffee_Serial cs1 = new Coffee_Serial();
		cs1.serial2(serial);
		
		System.out.println("��ǰ �̸��� �Է��� �ּ���.");
		 pName = sc.next();	
		cs1.productName(pName);

		System.out.println("��ǰ ������ �Է��� �ּ���.");
		 pColor = sc.next();	
		cs1.color(pColor);
		
		Coffee_Surang cs2 = new Coffee_Surang();
		System.out.println("��ǰ ������ �Է��� �ּ���.");
		pSu = sc.nextInt();	
		cs2.surang(pSu); 
		 
		Coffee_unitprice cs3 = new Coffee_unitprice();
		System.out.println("��ǰ �ܰ��� �Է��� �ּ���.");
		pUPrice = sc.nextInt();		
		cs3.unitprice(pUPrice);
		 
		totalsales(); 
		 
		ProductResult();
		
	}
	

}
