
public class JavaExam5_2chapter { //class block start

	public static void main(String[] args) { //main method block start
		// new ������ : ��ü�� ���� ���� = �޸� �Ҵ� ������
		JavaExam5_2chapter jec = new JavaExam5_2chapter();
		System.out.println(jec);//Object address

		//@71dac704 : 16������, 2�� 4��(2*2*2*2), 2���� 4bit�� ����
		/* 7     1    d     a     c     7     0     4
		 * 0111 0001  1110  1010  1101  0111  0000  0100 : 2������ ��ȯ
		 * ���� ü�� : 2^0 = 1, 2^1 = 2, 2^2 = 4,.......
		 *  ....... 8388608     4194304 2097152 1048576      262144  65536     16384 8192  2048     1024 512 256   4    
		 *  0111   0001    1110    1010   1101     0111  0000  0100 
		 * address = ?
		 * 
		 * 4GB �޸� = 1GB + 1Gb + 2GB => 1GB�� ����
		 * 16Gb = 8Gb + 8GB = 8GB
		 * 
		 * �޸� ũ�� = �ϵ��ũ �뷮
		 * ---------------------------
		 * bit => 8bits => byte
		 * 1024byte => 1kbyte
		 * 1024Kbyte => 1Mbyte
		 * 1024Mbyte => 1Gbyte
		 * 1024Gbyte => 1Tbyte
		 * 
		 * 
		 */
		int L1 = 0x71dac704;//16���� ǥ��
		System.out.println(L1);// 
		
		int score;//���� ����
		score = 90;//������ �����͸� ����
		System.out.println(score); 
		
		int score2 = 90;//���� ���� �� ������ ����
		System.out.println(score2); 
		
		int x = 100;//10����
		int y = 012;//8����, 2^3, 3bit   000001010 => 10
		int z = 0x23;//16����, 2^4, 4bit 00100011 => 32 + 3 = 35 
		System.out.println(x);//100
		System.out.println(y);//10
		System.out.println(z);//35
		
		int x2 = 250;
		int y2 = 055;// 101101 => 1 + 4 + 8 + 32 => 45
		int z2 = 0xabcd;// 1010101111001101 => 1 + 4 + 8 + 64 + 128 + 256 + 512 + 2048 + 8192 + 32767
		
		int sum = x2 + y2 + z2;// 250 + 45 + ?
		
		System.out.println(sum);  // 44276
		
		int x3 = 0xAC08;// 1010 1101 0000 1000
		System.out.println(x3);// ? 
		
		/* 10���� 	2����		8����		16����
		 * ---------------------------------------
		 * 0	00000000	0		0	
		 * 1	00000001	1		1
		 * 2	00000010	2		2
		 * 3	00000011	3		3
		 * 4	00000100	4		4
		 * 5	00000101	5		5
		 * 6				6		6
		 * 7				7		7
		 * 8				10		8
		 * 9				11		9
		 * 10				12		A(10)
		 * 11						B(11)
		 * 12						C(12)
		 * 13						D(13)
		 * 14						E(14)
		 * 15						F(15)
		 * 16						10
		 * 17						11 				
		 * 
		 * 10����: 0-9, 10-19, 20-29......
		 * 2����: 0,1,0,1,0,1,0,1...............
		 * 8����: 0-7, 10-17, 20-27, 30-37...........
		 * 16����: 0-9(A~F), 10-19(1A~1F), 20-29(2A~2F).......
		 * 
		 */
		
		//1> 10���� 56�� 2������ ��ȯ�Ͽ� ����Ͻÿ�.
		//2> 10���� 56�� 8������ ��ȯ�Ͽ� ����Ͻÿ�.
		//3> 10���� 56�� 16������ ��ȯ�Ͽ� ����Ͻÿ�.
		// 128 64 32 16 8 4 2 1 code
		//-----------------------------
		//  0   0  1  1 1 0 0 0
		// 070(8)
		// 38(16)
		
		int dec = 56;
		int oct = 070;
		int hex = 0x38;
		System.out.println(dec);//56
		System.out.println(oct);//56
		System.out.println(hex);//56
		
		int dec2 = 34;// 00100010
		int oct2 = 042;
		int hex2 = 0x22;
		System.out.println(dec2);//34
		System.out.println(oct2);//34
		System.out.println(hex2);//34
		
		//8byte�޸� ���� �Ҵ� ó�� => 16byte
		double x4 = 5e7;//50000000.0
		double x5 = 0.12e-5;//0.0000012
		System.out.println(x4);
		System.out.println(x5);
		
		//4byte �޸� ���� �Ҵ� ó�� => 8byte
		float y4 = (float) 5e7;
		float y5 = (float) 0.12e-5;
		System.out.println(y4);
		System.out.println(y5);
		
		char a = 'A';//2013�� 11�� �߼���, 2byte, unicode 
		char b = '��';
		System.out.println(a);
		System.out.println(b);
		
		String c = "asasasas";//���Ѵ� ���� ó�� ����
		
		String t = "\t";//������ �ǹ�(�뵵)
		String str = "�ȳ��ϼ���?~";
		String str2 = "�ݰ����ϴ�. \n";
		String str3 = "2021�� 3�� 12�� �Դϴ�.";
		System.out.println(str + str2); 
		System.out.println(str + t + str2 + str3); 
		System.out.println(str + "\t" + str2 + str3); 
		
		//unicode ����
		String s = "\u0009 \n";// \t
		System.out.println(str + s + str2 + str3);
		System.out.println(str + "\u0009 \n" + str2 + str3); 
		
		String g = "";//null value
		String g2 = null;
		
		//char : 1byte => 2byte, ' '
		//String : ���Ѵ�, " "
		
		//�� ������
		boolean b2 = true;
		boolean b3 = false;
		
		if(b2)
			System.out.println(100 + 200);//300
		else 
			System.out.println(200 + 300);//500
		
		int value = 0;//0
		int result = value + 10;
		System.out.println(result);//
		
		value = 30 + 50;
		System.out.println(value);//80
		
		value = value + 50;
		System.out.println(value);//130
		
	}//main method block end

}//class block end







