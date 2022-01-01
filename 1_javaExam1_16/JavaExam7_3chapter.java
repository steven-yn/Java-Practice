
public class JavaExam7_3chapter {

	public static void main(String[] args) {
		//bitwise ����
		// ~, &, |, ^, >>, <<, >>>
		// ~ : ������ ��ȯ�� �ʿ��� ��
		// ~(100) : -101 : 100
		int a = 100;
		int b = ~(a);
		System.out.println(b);//-101
		
		int c3 = ~(b);
		System.out.println(c3);//100
		
		int aa = 10;
		int bb = ~(aa);
		System.out.println(bb);//-11
		
		byte v1 = 10; 
		int v2 = ~v1;//int
		System.out.println(v2);//-11
		
		// & : ���� ������, bitand, &&: and, ���׿�����...
		int d = 8;   //  00001000
		int z = 12;  // &00001100
					 //  00001000
		int summ = d & z;
		System.out.println(summ);// 8
		
		int d2 = 8;   //  00001000
		int z2 = 12;  // &00001100
					 //       11
		int summ2 = d2 | z2;
		System.out.println(summ2);// 12
		
		int d3 = 8;   //  00001000
		int z3 = 12;  // &00001100
					 //   00000100
		int summ3 = d3 ^ z3;
		System.out.println(summ3);// 4
		
		int d4 = 23<<3; // << : 20 X 2 = 40 X 2 = 80 X 2 = 160
		// 23 << 3
		//       00010111
		//       00101110 => 46 
		//		 01011100 => 92
		//		 10111000 => 184
		System.out.println(d4);// 184
		
		int d5 = 23>>3; // << : 20 / 2 = 10 / 2 = 5 / 2 = 2
		// 23 >> 3
		//       00010111
		//       00001011 => 3 + 8 = 11
		//		 00000101 => 5
		//		 00000010 => 2
		System.out.println(d5);// 2
		
		//���� ������ = ���� ������ = �ڵ��� ����, �������� �����ϴ�.
		// ? = (���ǽ�) ? �� : ����;
		int a2 = 25, b2 = 12;
		
		//     37 = 25 > 12  25+12
		 int summm = (a2 > b2)?   a2+b2 : a2*b2;
		System.out.println(summm);// 37
		
		int summmm = (((100 * 2) / 3) % 5);
		System.out.println(summmm);// 1
		
		int a1 = 100*2;
		int a3 = a1 / 3;
		int a4 = a3 % 5;
		System.out.println(a4);//1
		
		// a5 = b5 = c5 = 5;
		int a5 = 5;
		int b5 = 5;
		int c5 = 5;
		
		//���� ������ : +, -
		int i1 = 100;
		int i2 = -100;
		double d1 = 13.14;
		double d6 = -10.5;
		//������ : 1,2,3,4,5..........
		//�Ǽ����� ������ �߻��մϴ�.
		// 1.0, 
		// 1.00
		// 1.000
		// 1.0000   1.0 ~ 45.0 : �����߻�, �ζǺ��� : 6�ڸ� 1~45
		//  ......
		//1.1,1.2,1.3,1.4....2.0
		double ddd = d1 + d6;
		System.out.println(ddd);// +
		
		int xx = -100;
		int result1 = +xx;//  -100
		int result2 = -xx;// +100
		System.out.println(result1);
		System.out.println(result2);
		
		//����������: ++, --, ����(����)�� ����, ����(++)�� ����
		// A++, ++A, A--, --A
		// int sum = a++ + --b;
		// int a = 100;
		// int sum = a++;
		int a7 = 100;
		a7++;//101
		System.out.println(a);//101
		
		int b7 = 345;
		int sun = b7--;//344
		System.out.println(sun);//345
		System.out.println(b7);//344
		
			

	}

}
