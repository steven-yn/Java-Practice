
public class JavaExam4_2chapter {

	public static void main(String[] args) {
		//2�� ������ �ڷ���
		//������ : �޸𸮿� ����(���� ����)
		// �ڷ���   ����  ���Կ�����    ����������
		    int   sum     =         1000;// �ڷ��� = ���� = �޸�(�ּ�)
		System.out.println(sum);//1000

		int age = 34;
		String name = "�����";
		System.out.println("���̴� " + age + "�̰�, �̸��� " + name + "�Դϴ�.");
		
		// + : ����(��ȣ), ���Ῥ����(������ ����)
		
		//int 3_$x, 456_$y, 234_$z;
		
		int _$x = 500;
		
		System.out.println(_$x);  
		
		@SuppressWarnings("unused")
		int maxspeed;
		
		int maxSpeed;
		int max_speed;
		
		int MaxSpeed;
		
		int ages;
		
		//byte, short => �������� ��쿡�� �Ϲ������� int�� ����մϴ�. 
		
		// byte(1byte = 8bits) : 00000000 ~ 11111111(0 ~ 255) : -128 ~ +127
		byte b1 = 100;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);// 1byte + 1byte = 2byte, �޸� ���� ȿ��
		int b4 = b1 + b2;//�Ϲ����� ó��, 4byte + 4byte = 4byte, �޸� ����
		System.out.println(b3);
		System.out.println(b4);
		
		
		// byte< short< int< long< float< double : �⺻ �ڷ���
		//  1      2     4    8      4      8
		
		//short : 2byte �޸� ���, ������ ���� : 0 ~ 65535(-32768 ~ +32767)
		short s1 = -32000;
		short s2 = 10;
		short s3 = (short) (s1 + s2);
		int s4 = s1 + s2; 
		System.out.println(s3);
		System.out.println(s4);
		
		//���α׷� �׽�Ʈ ����: �޸� ����, ó�� �ð�
		
		
		
	}

}
