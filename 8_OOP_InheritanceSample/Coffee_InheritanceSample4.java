package OOP_InheritanceSample;

import java.util.Scanner;

/* ����> Ŀ�� ��ǰ��ȣ, Ŀ�� ��ǰ��, Ŀ�� ����, Ŀ�� ����, Ŀ�� ����
 * ���� �Է��Ͽ� �� �Ǹŷ�(���� * ����)�� ����Ͽ� ����ϼ���.
 * - ����� �̿��Ͽ� ó��
 * - ��� 4������ ��� ���� 
 * 
 * 4)public class A implements B, C, D... { .... }
 *   A�� class�̰�, B, C, D�� ��� �������̽��� ��� ���
 */
interface Coffee_unitprice5 {
	public abstract void unitprice(int pUPrice);//�߻� �޼ҵ� ����
}

interface Coffee_Surang5  {
	 void surang(int pSu);//�߻� �޼ҵ� ����
}

interface Coffee_Serial5  {
	void serial3(int serial);
	public void productName(String pName);
	public void color(String pColor); 	
}

public class Coffee_InheritanceSample4 implements Coffee_Serial5, Coffee_Surang5, Coffee_unitprice5 {
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

	@Override  //�߻� �޼ҵ� �������̵�
	public void unitprice(int pSu) {
		this.pSu = pSu;		
	}

	@Override //�߻� �޼ҵ� �������̵�
	public void surang(int pUPrice) {
		this.pUPrice = pUPrice;		
	}
	
	@Override
	public	void serial3(int serial) {
		this.serial = serial;
	}
	
	@Override
	public void productName(String pName) {
		this.pName = pName;
	}
	
	@Override
	public void color(String pColor) {
		this.pColor = pColor;
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
		Coffee_Serial4 cis1_2 = new Coffee_Serial4();

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
