package OOP_InheritanceSample;

import java.util.Scanner;

/* ����> Ŀ�� ��ǰ��ȣ, Ŀ�� ��ǰ��, Ŀ�� ����, Ŀ�� ����, Ŀ�� ����
 * ���� �Է��Ͽ� �� �Ǹŷ�(���� * ����)�� ����Ͽ� ����ϼ���.
 * - ����� �̿��Ͽ� ó��
 * - �迭 ���� + �߻� Ŭ���� ���� ���� 
 * 
 * 4)public class A implements B, C, D... { .... }
 *   A�� class�̰�, B, C, D�� ��� �������̽��� ��� ���
 */

 abstract class Coffee_Serial7  {
	public String[] str1(int n) {
		
		return null;
	}
}

public class Coffee_InheritanceSample5_array2_abstractclass extends Coffee_Serial7 {
	private static Scanner sc = new Scanner(System.in);
	private static String str1[] = {"��ǰ ��ȣ ", "��ǰ �̸� ", "��ǰ ���� ", "��ǰ ���� ", "��ǰ �ܰ� "};
	private static String[] str2;
	private static String[] strArray1;
	private static int unitprice;
	private static int surang;
	private static int totalSales;
	private static int scount;   
	
	@Override
	public String[] str1(int n) {
		String str2[] = new String[n];
		for(int i=0; i < str1.length; i++) {
			System.out.println(str1[i] + "������ �Է�>> "); 
			str2[i] = sc.next();
		}
		return str2; 		
	}
	
	private static void totalsales() {
		int surang = Integer.parseInt(strArray1[3]); 
		int unitprice = Integer.parseInt(strArray1[4]); 
		totalSales = surang * unitprice;
	}
	
	private static void ProductResult() {
		System.out.println("---------------------------");
		System.out.println(" ��ǰ��ȣ(code) : " + strArray1[0]);
		System.out.println(" ��ǰ�̸�(name) : " + strArray1[1]);
		System.out.println(" ��ǰ����(color) : " + strArray1[2]);
		System.out.println(" ��ǰ����(su) : " + strArray1[3]);
		System.out.println(" ��ǰ����(price) : " + strArray1[4]);
		System.out.println("---------------------------");
		System.out.println(" ��ǰ�Ǹž� : " + totalSales + " ��");
		System.out.println("---------------------------");
	}

	
	public static void main(String[] args) {
		Coffee_InheritanceSample5_array2_abstractclass cis_array = new Coffee_InheritanceSample5_array2_abstractclass();

		int n=0, count=999, socunt=0;
		boolean stop = true;
		
		while(scount <= count) {
			scount++;
		System.out.println("��ǰ ������ �Է��� ������ �Է��� �ּ���.");
		n = sc.nextInt();
		
		strArray1 = cis_array.str1(n);
		
		totalsales();
		
		ProductResult();
		System.out.println("��ǰ���� �Է� Ƚ���� : " + scount); 
		}
	}

		
}
