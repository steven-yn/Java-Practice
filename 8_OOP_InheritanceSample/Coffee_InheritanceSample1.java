package OOP_InheritanceSample;

import java.util.Scanner;

/* ����> Ŀ�� ��ǰ��ȣ, Ŀ�� ��ǰ��, Ŀ�� ����, Ŀ�� ����, Ŀ�� ����
 * ���� �Է��Ͽ� �� �Ǹŷ�(���� * ����)�� ����Ͽ� ����ϼ���.
 * - ����� �̿��Ͽ� ó��
 * - ��� 4������ ��� ���� 
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
		System.out.println("��ǰ �ܰ��� �Է��� �ּ���.");
		pUPrice = sc.nextInt();			
	}

	private void surang() {
		System.out.println("��ǰ ������ �Է��� �ּ���.");
		pSu = sc.nextInt();		
	}

	private void color() {
		System.out.println("��ǰ ������ �Է��� �ּ���.");
		 pColor = sc.next();			
	}

	private void productName() {
		System.out.println("��ǰ �̸��� �Է��� �ּ���.");
		 pName = sc.next();			
	}
	
	private  void serial2() {		
		System.out.println("��ǰ ��ȣ�� �Է��� �ּ���.");
		serial = sc.nextInt();				
	}
	
	private void ProductResult() {  //getter
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
		Coffee_InheritanceSample1 cis1 = new Coffee_InheritanceSample1();
		
		cis1.productName();
		cis1.color();
		cis1.surang();
		cis1.unitprice();
		cis1.totalsales(); 
		cis1.ProductResult();				
	}

}
