package OOP_InheritanceSample;

import java.util.Scanner;

/* ����> Ŀ�� ��ǰ��ȣ, Ŀ�� ��ǰ��, Ŀ�� ����, Ŀ�� ����, Ŀ�� ����
 * ���� �Է��Ͽ� �� �Ǹŷ�(���� * ����)�� ����Ͽ� ����ϼ���.
 * - ����� �̿��Ͽ� ó��
 * - �߻�Ŭ���� ���� 
 * 
 * 3)public interface A extends B
 *   A�� B�� ��� �������̽� ������ ���մϴ�.
 */
abstract class Coffee_unitprice44 {
	public abstract void unitprice(int pSu);//�߻� �޼ҵ� ����
}

abstract class Coffee_Surang44 extends Coffee_unitprice44 {
	 abstract void surang(int pUPrice);//�߻� �޼ҵ� ���� 
}

class Coffee_Serial44 extends Coffee_Surang44 {
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

	@Override  //�߻� �޼ҵ� �������̵�
	public void unitprice(int pUPrice) {
		this.pUPrice = pUPrice;		
	}

	@Override //�߻� �޼ҵ� �������̵�
	public void surang(int pSu) {		
		this.pSU = pSu;		
	}
}

public class Coffee_InheritanceSample3_abstractclass  {
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
		System.out.println(" ��ǰ��ȣ(code) : " + serial);
		System.out.println(" ��ǰ�̸�(name) : " + pName);
		System.out.println(" ��ǰ����(color) : " + pColor);
		System.out.println(" ��ǰ����(su) : " + pSu);
		System.out.println(" ��ǰ����(price) : " + pUPrice);
		System.out.println("---------------------------");
		System.out.println(" ��ǰ�Ǹž� : " + totalSales + " ��");
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		Coffee_Serial44 cis1_2 = new Coffee_Serial44();

		System.out.println("��ǰ ��ȣ�� �Է��� �ּ���.");
		serial = sc.nextInt();
		cis1_2.serial2(serial);

		System.out.println("��ǰ �̸��� �Է��� �ּ���.");
		pName = sc.next();
		cis1_2.productName(pName);

		System.out.println("��ǰ ������ �Է��� �ּ���.");
		pColor = sc.next();
		cis1_2.color(pColor);

		System.out.println("��ǰ ������ �Է��� �ּ���.");
		pSu = sc.nextInt();
		cis1_2.surang(pSu);

		System.out.println("��ǰ �ܰ��� �Է��� �ּ���.");
		pUPrice = sc.nextInt();
		cis1_2.unitprice(pUPrice);

		totalsales();

		ProductResult();

	}

}
