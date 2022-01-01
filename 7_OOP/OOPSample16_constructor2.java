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
 * - Ŭ�������� ���޵Ǵ� ���� Ŭ���� ������ �ʱ�ȭ ��ų �������� �ַ� ���˴ϴ�.
 * - this�� Ŭ����������� �̸��� ������ ������ �����մϴ�.
 */
public class OOPSample16_constructor2 {
	private int su1;//0 => 1
	private int su2;//0 => 2
	private int su3;//0 => 3
	private String str1;//null => hello
	private String str2;//null => nice
	private String str3;//null => "120"
	private int su4;//0 => 24	
	
	// ������ �����ε�
	public OOPSample16_constructor2(int su1, int su2, int su3) {
		this.su1 = su1;// this.su1 => su1 Ŭ���� ����, su1 => �Ű����� ��
		this.su2 = su2;
		this.su3 = su3;		
	}
	// ������ �����ε�
	public OOPSample16_constructor2(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}
	// ������ �����ε�
	public OOPSample16_constructor2(String str3, int su4) {
		this.str3 = str3;
		this.su4 = su4;		
	}

	private void Adder() {
		System.out.println("�հ� : " + (this.su1 + this.su2 + this.su3)); // 6
	}
	
	private String StringCon(){
		String str3 = str1 + str2;		
		return str3;
	}
	
	private void mix() {
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
		OOPSample16_constructor2 oop16_1 = new OOPSample16_constructor2(su1, su2, su3); 		
		oop16_1.Adder();		
		
		System.out.println("���ڿ� 2���� �Է��� �ּ���.");
		String str1 = sc.next();//
		String str2 = sc.next();//
		OOPSample16_constructor2 oop16_2 = new OOPSample16_constructor2(str1, str2); 
		String str4 = oop16_2.StringCon();
		System.out.println("���ڿ��� ���� : " + str4); 
		
		System.out.println("���ڿ� 2���� �Է�(10���� ���·�)�� �ּ���.");
		String str3 = sc.next();//
		int su4 = sc.nextInt();//		
		OOPSample16_constructor2 oop16_3 = new OOPSample16_constructor2(str3, su4); 
		oop16_3.mix();
	}

}
