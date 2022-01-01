
import java.lang.*;

@SuppressWarnings("unused")
public class JavaExam2_1chapter {

	//single thread
	public static void main(String[] args) {
		// 1chapter
		/*
		 * byte code : �ڹټҽ��� �������ϸ� ����Ʈ �ڵ带 �����մϴ�.
		 * sample> a.java => a.class
		 * 
		 * System.out.println("Hello~~~");
		 * 
		 * import : ��Ű���� �������ݴϴ�.
		 * ��κ��� import java.lang ��Ű���� ���� �̿�˴ϴ�.
		 * �׸���, ������ �����մϴ�.
		 * 
		 * public final class System extends Object
		 */
		System.out.println();//�ٹٲ��� �ǹ��� �뵵�� ���
		
		boolean result = true;		
		System.out.println(result);//true
		
		char c1 = 'h';
		char c2 = 'y';
		System.out.println(c1);//h
		System.out.println(c2);//y
		
		double d1 = 12345678.1234567;//�Ǽ��� 8����Ʈ
		System.out.println(d1);
		
		float f1 = 12345.23344f;//�Ǽ��� 4����Ʈ
		System.out.println(f1);
		
		long l1 = 32432432432L;//������ 8����Ʈ
		System.out.println(l1);
		
		System.out.println("Hello~~~");
		
		//�Ǽ���: �Ǽ����� Ȯ�����°� �ٷ� �������Դϴ�.
		//������: -, +, ����ū���̰ų� ���� �������� ǥ���� �� ����մϴ�.
	double d2 = 21313213454354354354354.3521321313243432432432432432E-9;
		System.out.println(d2);//? 2.1313213454354355E22
		double d3 = 2.1313213454354355E+22;
		System.out.println(d3);//���۾�, 21313213454354355000000.0, 2����...  
	
	double d4 = 24334324324e-20;
	System.out.println(d4);//? 0.0000000024334324324
		
		
		
	}

}
