package OOP;

import java.util.Scanner;

/* ������ �޼ҵ� : Ŭ�������� ������ �����͸� �����ϱ� ���Ͽ� ����մϴ�.
 * - �����ڴ� ����� ������� �ʽ��ϴ�.
 * - �����ڴ� Ŭ���� �̸��� �ݵ�� ���ƾ� �մϴ�. = ���� �̸��� �����ϴ�.  
 * - ���������ڴ� public �̰ų� ���� �����մϴ�.
 * - �Ϲ����� �޼ҵ�ʹ� �޸� ��ȯŸ���� �����ϴ�. �׷��Ƿ� return���� �����ϴ�.
 * - �����ڸ޼ҵ�� �����ε��� �����մϴ�.
 * - ���α׷��Ӱ� ������ �޼ҵ带 �ۼ����� ������ JVM�� �ڵ����� ����� �ݴϴ�.
 * - ������ �޼ҵ尡 �ϳ��� ������ �׶� ����� �ݴϴ�.
 * - ����Ʈ ������ : public className() {  }
 * - Ŭ�������� ���ߵǴ� ���� Ŭ���� ������ �ʱ�ȭ ��ų �������� �ַ� ���˴ϴ�.
 */
public class OOPSample16_constructor1 {

	// ������ �����ε�
	public OOPSample16_constructor1(int su1, int su2, int su3) {
		System.out.println("�հ� : " + (su1+su2+su3)); 
	}
	// ������ �����ε�
	public OOPSample16_constructor1(String str1, String str2) {
		System.out.println("���ڿ��� ���� : " + (str1 + str2)); 
	}
	// ������ �����ε�
	public OOPSample16_constructor1(String str3, int su4) {
		int x = Integer.parseInt(str3);
		int sum = x + su4; 
		System.out.println("���ڿ� ���� + ���� : " + sum);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���� 3���� �Է��� �ּ���.");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		int su3 = sc.nextInt();
		OOPSample16_constructor1 oop16_1 = new OOPSample16_constructor1(su1, su2, su3); 		

		System.out.println("���ڿ� 2���� �Է��� �ּ���.");
		String str1 = sc.next();//
		String str2 = sc.next();//
		OOPSample16_constructor1 oop16_2 = new OOPSample16_constructor1(str1, str2); 
		
		System.out.println("���ڿ� 2���� �Է�(10���� ���·�)�� �ּ���.");
		String str3 = sc.next();//
		int su4 = sc.nextInt();//		
		OOPSample16_constructor1 oop16_3 = new OOPSample16_constructor1(str3, su4); 
		
	}

}
