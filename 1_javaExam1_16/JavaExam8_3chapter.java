import java.util.Scanner;

// ~(��Ʈ ���� ������): ƿ�� ������, method ����
public class JavaExam8_3chapter {
//field area
		
		// 00000000000000000000000000001010
		// 11111111111111111111111111110110
		// --------------------------------
		// 00000000000000000000000000000000

		private static String toBinaryString(int v1) { //�Ű�������, 10
			String str = Integer.toBinaryString(v1); 
			
			while(str.length() < 32) {  //0 ~ 31
				str = "0" + str;
			}
			return str;
		}	
		
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;//��� => ���� ��ȯ, ~ :������� ������ +1, �������� �����ȯ: -1, -11���
		int v3 = ~v1 + 1;// -11 + 1 = -10
		System.out.println(v1);//10
		System.out.println(v2);// -11
		System.out.println(v3);// -10

		System.out.println(toBinaryString(v1)); //�������ڰ�, 10, ��ȣȭ ���밪
		System.out.println(toBinaryString(v2)); // -11, 1�� ����
		System.out.println(toBinaryString(v3)); // -10, 2�� ����
		
		//��� ������: +, -, *, /, %
		Scanner sc = new Scanner(System.in);
		System.out.println("������� 1��° ���ڸ� �Է��ϼ���.");
		double v4 = sc.nextDouble();
		System.out.println("������� 2��° ���ڸ� �Է��ϼ���.");
		double v5 = sc.nextDouble();
		
		double result1 =  v4 + v5;
		double result2 =  v4 - v5;
		int result3 = (int) (v4 * v5);//������ ����ȯ(casting)
		int result4 = (int) (v4 / v5);
		int result5 = (int) (v4 % v5);
		System.out.println("=======================");
		System.out.println("���� ����� : " + result1);
		System.out.println("���� ����� : " + result2);
		System.out.println("���� ����� : " + result3);
		System.out.println("������(��) ����� : " + result4);
		System.out.println("������(������) ����� : " + result5); 
		System.out.println("=======================");
		
		// char : A = 97, a = 122
		char c1 = 'A' + 1;// 97+1=98, B
		char c2 = 'A';// 97 = A
		char c3 = (char) (c2 + 1);// compile error, 98 = B 
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3); 
		
		//Overflow ���� �� ó��
		int x = 1000000;//�鸸
		int y = 1000000;
		
		// int : 2^32, ~2147483648 ~ + 2147483647
		int z = x * y;//overflow�߻�, �ڷ����� ������ ���� ������ ���.
		System.out.println(z);// -727379968
		
		// long : 2^64
		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2 * y2;
		System.out.println(z2);//1000000000000
		
		//NaN, Infinity: �Ǽ��� �϶� ǥ��.
		int c = 2;
		int a = 5;
		
		if(c == 0) {
			c = 3;
		}else {
			int x3 = a / c;// c => 0[X], 5 / 2
			System.out.println(x3);// ? , / by zero, 2
		}
		
		double k = 5 / 3.0;
		double m = 5 % 3.0;
		
		System.out.println(k);// Infinity
		System.out.println(m);// NaN
		
		//���� + ���� => ����
		
		String sum = "hello" + 34;
		String val = "NaN"; 
		double currentBalence = 10000.0;
		String sum2 = val + currentBalence;
		System.out.println(sum);//hello34
		System.out.println(sum2);//NaN
		
		//valueOf(), parseInt()
		
		Scanner sc2 = new Scanner(System.in);
		String x3 = sc2.next();// 555.456 => "555.456"
		String y3 = sc2.next();// 555.456 => "555.456"
		
		//�ǹ������� ���� ������ �մϴ�.  
		double xx3 = Double.valueOf(x3);
		double yy3 = Double.parseDouble(y3);
		double sum4 = xx3 + yy3;
		
		System.out.println(xx3);
		System.out.println(yy3);
		System.out.println(sum4);//
		
		String str = "JDK";
		int i = 3;
		double k2 = 3.0;
		
		String str3 = str + i + k2;// ���� + ���� = ���� + ���� = ����
		System.out.println(str3);// JDK33.0
		
		String str4 = i + k2 + str;// ���� + ���� = ���� + ���� = ����
		System.out.println(str4);// 6.0JDK
		
		char cc1 = 'A';//ascii code => 65
		char cc2 = 'B';// 66
		
		boolean cc3 = cc1 < cc2;//true
		boolean cc4 = cc1 > cc2;//false
		boolean cc5 = cc1 <= cc2;// true
		boolean cc6 = cc1 >= cc2;// false
		boolean cc7 = (cc1 == cc2);// false
		boolean cc8 = (cc1 != cc2);// true
		System.out.println(cc3);// true
		
		char cc9 = '��';
		char cc10 = '��';
		
		boolean lessthen = cc9 < cc10;//true
		boolean greaterthen = cc9 > cc10;//false
		boolean lessthenequal = cc9 <= cc10;// true
		boolean greaterthenequal = cc9 >= cc10;// false
		boolean equaltwo = (cc9 == cc10);// false
		boolean notequal = (cc9 != cc10);// true
		System.out.println(lessthen);// true
		
		
		//p.90
		/* �޸� ���� ����
		 * ----------------
		 * static area : �������� = Ŭ��������
		 * heap area : ��ü
		 * stack area : ��������, �޼ҵ��� �Ű�����
		 * 
		 * ��ü�� ������ ������ �������� �����ϴ�.
		 * new �����ڸ� ����ϸ� �������� �޶� ���ϴ�.
		 */
		String ddd = new String();
		System.out.println(ddd);//
		String strValue1 = "�ſ��";//500����
		String strValue2 = "�ſ��2";//700����
		String strValue3 = new String("�ſ��3");//1000����
		
		System.out.println(strValue1);
		System.out.println(strValue2);
		System.out.println(strValue3);
		
		//�� ��ü�� ������ ������? ���� ������?�� �Ǵ��ϴ� ���� ( == )
		if(strValue1 == strValue2) // ������ �����ϱ�???? 
			System.out.println("������ �����ϴ�.");//������ �����ϴ�.
		else {
			System.out.println("������ ���� �ʽ��ϴ�.");
		}
		
		if(strValue1 == strValue3) // ������ �����ϱ�???? 
			System.out.println("������ �����ϴ�.");
		else {
			System.out.println("������ ���� �ʽ��ϴ�.");// ������ ���� �ʽ��ϴ�.
		}
		
		// equals() : ������ ���Ͽ� ������, �ƴ��� �Ǻ�
		if(strValue1.equals(strValue2)) {
			System.out.println("������ �����ϴ�.");	//	������ �ٸ��ϴ�.
			
		}else {
			System.out.println("������ �ٸ��ϴ�.");
		}
		
		if(strValue1.equals(strValue3)) {
			System.out.println("������ �����ϴ�.");	//	������ �ٸ��ϴ�.
		}else {
			System.out.println("������ �ٸ��ϴ�.");
		}
		
		
		JavaExam8_3chapter je3 = new JavaExam8_3chapter();
		System.out.println(je3);// 75bd9247
	}
	
}
