import java.util.Scanner;

//while��
public class JavaExam13_4chapter {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		//           3 < 3   0+1=1+1=2=1=3
		for(int i=0; i < 3; i++) {
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int value1 = sc.nextInt();// 100
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int value2 = sc.nextInt();// 50
		
		int sum2 = value1 +  value2;//����
		int sum3 = value1 - value2;//����
		int sum4 = value1 * value2;//����
		int sum5 = value1 / value2;//������: �� ���ϱ�
		int sum6 = value1 % value2;//������: ������ ���ϱ�
		
		System.out.println("�� ��(value1+value2)�� �հ�� = " + sum2);
		System.out.println("�� ��(value1-value2)�� �հ�� = " + sum3);
		System.out.println("�� ��(value1*value2)�� �հ�� = " + sum4);
		System.out.println("�� ��(value1/value2)�� �հ�� = " + sum5);
		System.out.println("�� ��(value1%value2)�� �հ�� = " + sum6);
		
		}
		//����� Ż��
		
		int i2=0;
		//      3 < 3 => false
		while( i2 < 3) {
			System.out.println("ù��° ���ڸ� �Է��ϼ���.");
			int value1 = sc.nextInt();// 100
			System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
			int value2 = sc.nextInt();// 50
			
			int sum2 = value1 +  value2;//����
			int sum3 = value1 - value2;//����
			int sum4 = value1 * value2;//����
			int sum5 = value1 / value2;//������: �� ���ϱ�
			int sum6 = value1 % value2;//������: ������ ���ϱ�
			
			System.out.println("�� ��(value1+value2)�� �հ�� = " + sum2);
			System.out.println("�� ��(value1-value2)�� �հ�� = " + sum3);
			System.out.println("�� ��(value1*value2)�� �հ�� = " + sum4);
			System.out.println("�� ��(value1/value2)�� �հ�� = " + sum5);
			System.out.println("�� ��(value1%value2)�� �հ�� = " + sum6);
			
			i2++;//0+1=1+1=2+1=3
			}
			//����� Ż��
		
		
		Scanner sc = new Scanner(System.in);
		         
		for(int i=0; i < 6; i++) {
			System.out.println("ù��° ���ڸ� �Է��ϼ���.");
			int a = sc.nextInt();// 50
			System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
			int b = sc.nextInt();// 75
			System.out.println("����° ���ڸ� �Է��ϼ���.");
			int c = sc.nextInt();// 100
		
		//     false     false
		//   50>=75    50>=100
			if(a>=b && a>=c) {
				System.out.println(a + " ���� ���� Ů�ϴ�.");//
				//    true    false
				//   75>=50 75>=100
			}else if(b>=a && b>=c){
					System.out.println(b + " ���� ���� Ů�ϴ�.");//
					
				// true       true
				//   100>=50 100>=75	
			}else if(c>=a && c>=b){
				System.out.println(c + " ���� ���� Ů�ϴ�.");//100
			}
		}
		
		
		for(int i=0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			
			int age = sc.nextInt();//34
			String name = sc.next();//�����
			System.out.println("���̴� " + age + "�̰�, �̸��� " + name + "�Դϴ�.");
		}
		
		int i=0;
		
		while( i < 3) {
			Scanner sc = new Scanner(System.in);
			
			int age = sc.nextInt();//34
			String name = sc.next();//�����
			System.out.println("���̴� " + age + "�̰�, �̸��� " + name + "�Դϴ�.");
			
			i++;
		}
		
				
	// for, while�� 2����������� �����ϼ���.
		
		for(int i=0; i < 3; i++) {
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();// 56
				
		String dec2 = Integer.toBinaryString(dec);//2���� ��ȯ
		String oct = Integer.toOctalString(dec);//8����
		String hex = Integer.toHexString(dec);//16����
		
		System.out.println(dec2);//56
		System.out.println(oct);//070
		System.out.println(hex);//0x38		
		}
		
		System.out.println("--- �������� for���̰�, �Ʒ������� while�� �Դϴ�.-----------");
		int i=0;
		
		while(i < 3) {
			Scanner sc = new Scanner(System.in);
			int dec = sc.nextInt();// 56
					
			String dec2 = Integer.toBinaryString(dec);//2���� ��ȯ
			String oct = Integer.toOctalString(dec);//8����
			String hex = Integer.toHexString(dec);//16����
			
			System.out.println(dec2);//1001110
			System.out.println(oct);//070
			System.out.println(hex);//0x38	
			
			i++;
			}
		
		
	// 10������ �Է��Ͽ�, 2����, 8����, 16���� ���� �˾Ƴ½��ϴ�.
	// �ݴ��, �˾Ƴ� ������ �ٽ� 10������ ǥ���� ������.
		
		for(int i=0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			int dec = sc.nextInt();// 56
					
			String dec2 = Integer.toBinaryString(dec);//2���� ��ȯ
			String oct = Integer.toOctalString(dec);//8����
			String hex = Integer.toHexString(dec);//16����
			
			System.out.println(dec2);//56
			System.out.println(oct);//070
			System.out.println(hex);//0x38		
			
			// ���⿡���� 2����, 8����, 16���� ���� ����Ͽ� 10������ ǥ���մϴ�.
			
			int Decimal = Integer.parseInt(dec2, 2);
			int Octal = Integer.parseInt(oct, 8);
			int HexDecimal = Integer.parseInt(hex, 16);			
			
			System.out.println(Decimal);//56
			System.out.println(Octal);//56
			System.out.println(HexDecimal);//56	
			}
			
			System.out.println("--- �������� for���̰�, �Ʒ������� while�� �Դϴ�.-----------");
			int i=0;
			
			while(i < 3) {
				i++;
				
				Scanner sc = new Scanner(System.in);
				int dec = sc.nextInt();// 56
						
				String dec2 = Integer.toBinaryString(dec);//2���� ��ȯ
				String oct = Integer.toOctalString(dec);//8����
				String hex = Integer.toHexString(dec);//16����
				
				System.out.println(dec2);//1001110
				System.out.println(oct);//070
				System.out.println(hex);//0x38	
				
				int Decimal = Integer.parseInt(dec2, 2);
				int Octal = Integer.parseInt(oct, 8);
				int HexDecimal = Integer.parseInt(hex, 16);			
				
				System.out.println(Decimal);//56
				System.out.println(Octal);//56
				System.out.println(HexDecimal);//56
				}
			
		
	//--------------------------------------------------------------------
		
		for(int i=0; i < 3; i++) {
		Scanner sc = new Scanner(System.in);
		//								index, 1byte�� �о ǥ�h�� �ݴϴ�.
		char charUpper = sc.next().charAt(1);// �빮�� 65 = A
		char charLower = sc.next().charAt(2);// �ҹ��� 97 = a
		char charDigit = sc.next().charAt(3);// ���� 0 = 48
		
			if((charUpper >= 65) && (charUpper<=90)) {
				System.out.println(charUpper); 
				System.out.println("�빮�� �̱���.~");
			}
			
			if((charLower >= 97) && (charLower<= 122)) {
				System.out.println(charLower); 
				System.out.println("�ҹ��� �̱���.~");
			}

			if(!(charDigit < 48) && !(charDigit > 57)) {
				System.out.println(charDigit); 
				System.out.println("0~9������ ���� �̱���.~");
			}
			
		}
			
		
		
		//��� : � ���� 3���� �������� ��, 0�� ������ 3�� ����� �˴ϴ�.
		Scanner sc = new Scanner(System.in);
		int i = 0, count=0;
		
		while(i < 10) {
			int value = sc.nextInt();//9, 99, 777, 6, 3, 12, 15, 21, 24, 1
				
			if(value % 3 == 0) {
				count++;
				System.out.println("���ڴ� 3�� ��� �Դϴ�.");
			} else { 
				System.out.println("3�� ����� �ƴմϴ�.");
			}
			i++;
		}
			System.out.println("3�� ���  : " + count);
	
		
	//����1> ������ ���ڸ� 10�� �Է� �޾Ƽ�, �� ���ڰ� 0����, Ȧ������, ¦�������� �Ǻ��Ͽ� ����ϼ���.
	// while�� �ۼ�		
				
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݺ�ó���� Ƚ���� �Է��� �ּ���.");
		int count = sc.nextInt();// 5
		
		int scount = 0;
		
		while(scount < count) {
			int su = sc.nextInt();
		
		if(su == 0)
			System.out.println("���ڴ� 0�Դϴ�.");
		else if(su % 2 == 0)
			System.out.println("���ڴ� ¦���Դϴ�.");
		else 
			System.out.println("���ڴ� Ȧ���Դϴ�.");
		
		scount++;
		
		if(scount == count)
			break;
		}
			
		
	// ���� ���ϱ�: �ݺ� Ƚ�� 6��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݺ�ó���� Ƚ���� �Է��� �ּ���.");
		int count = sc.nextInt();// 6
		
		int scount = 0;
		
		while(scount < count) {
			int score = sc.nextInt();
				
		char grade = (score>=90)? 'A':(score>=80)? 'B':(score>=70)? 'C':(score>=60)? 'D':'F';
				System.out.println("���� ����� : " + grade);
				
				scount++;
				
				if(scount == count)
					break;					
			}
	*/
		
		// switch ~ case�� �ݺ� ó��
		int scount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݺ�ó���� Ƚ���� �Է��� �ּ���.");
		int count = sc.nextInt();// 6
		
		while(true) {
		int jumsu = sc.nextInt();// 
		
		switch(jumsu / 10) {
		case 10:
		case 9: System.out.println("A����"); break;
		case 8: System.out.println("B����"); break;
		case 7: System.out.println("C����"); break;
		case 6: System.out.println("D����"); break;
			default: 
				System.out.println("F����");	
		
				scount++;//1
				
			if(scount == count)	// 6 == 6
				break;//�ݺ����̳� ���ѷ����� Ż�� �뵵 ���
		}	
		}
		//����� Ż��
	}

}
