
public class JavaExam1_default {

	public static void main(String[] args) {
		// �� �� �ּ�
		/*
		 * ������ �ּ�
		 * 2021�� 3�� 10�� ���� 10��53�� �ڹ� ����
		 * ����? ����� ����
		 * �ҽ� ���� ����: 
		 * ������ ��¥:
		 */
		
		//1.������ : ����(char), ���ڿ�(String), Ư������, 
		//����: ������(byte, short, int, long), �Ǽ��� ����(float, double)
		//�ڷ���      ����      ���Կ�����  ����(numeric)  ������(Operator)  ����
		//dataType  Variable
		   int       sum        =           3           +           4;
		   System.out.println("�� ��(3+4)�� �հ�� = " + sum);//ctrl + space ����Ű
		//2.����
		int value1 = 10;//��������1
		int value2 = 50;//��������2
		
		//��� �����̶�� �θ��ϴ�.
		int sum2 = value1 +  value2;//����
		int sum3 = value1 - value2;//����
		int sum4 = value1 * value2;//����
		int sum5 = value1 / value2;//������: �� ���ϱ�
		int sum6 = value1 % value2;//������: ������ ���ϱ�
		int sum7 = 7 / 3;
		System.out.println("�� ��(value1+value2)�� �հ�� = " + sum2);
		System.out.println("�� ��(value1-value2)�� �հ�� = " + sum3);
		System.out.println("�� ��(value1*value2)�� �հ�� = " + sum4);
		System.out.println("�� ��(value1/value2)�� �հ�� = " + sum5);
		System.out.println("�� ��(value1%value2)�� �հ�� = " + sum6);
		System.out.println("�� ��(3/7)�� �հ�� = " + sum7);
		   
		 //3.������(Operator) : value1 + value2 : ���� ����
         // operand : ������ ����� �Ǵ� ��.
		 //1)��� ����  
		 //2)����(��) ���� : ==, !=, <, <=, >, >=
		// 0: ���꿡 �������� �ʽ��ϴ�. ����, false
		// 1: ���꿡 �����մϴ�. ��, true
		
		/*-----------------------------
		 * A  B  and(&&)  or(||) not(!=)     exor
		 * ----------------------------
		 * 0  0   0   0   0 => 1   0
		 * 0  1   0   1   1 => 0   1
		 * 1  0   0   1            1
		 * 1  1   1   1            0
		 * ----------------------------
		 * 
		 * �Ӻ����, �ý���, ����, ����, ��� ���α׷��� : 
		 * ȸ�μ��� => �ø��÷� ȸ�ε� �ۼ� => ���� => �׽�Ʈ => �ϼ�
		 * 
		 */
		int value3 = 123, value4 = 345;
			
		//      123   < 345
			if(value3 < value4) //1.�ܼ����ǹ�
				System.out.println("value2�� ���� �� Ů�ϴ�.");
		
			if(value3 < value4) //2.�ܼ����ǹ�
				System.out.println("value2�� ���� �� Ů�ϴ�.");
			else 
				System.out.println("value1�� ũ�ų� �����ϴ�.");
		
			//3.���� ���ǹ�
			int jumsu = 78;
			
			if(jumsu >=90 && jumsu<=100)
				System.out.println("A ���� �Դϴ�.");
				if(jumsu >=80 && jumsu<=89)
					System.out.println("B ���� �Դϴ�.");
					if(jumsu >=70 && jumsu<=79)
						System.out.println("C ���� �Դϴ�.");
						if(jumsu >=60 && jumsu<=69)
							System.out.println("D ���� �Դϴ�.");
							else
								System.out.println("F ���� �Դϴ�.");
			//4.�������ǹ�2
			if(jumsu >=90 && jumsu<=100)
				System.out.println("A ���� �Դϴ�.");
			else if(jumsu >=80 && jumsu<=89)
				System.out.println("B ���� �Դϴ�.");
				else if(jumsu >=70 && jumsu<=79)
					System.out.println("C ���� �Դϴ�.");
						else if(jumsu >=60 && jumsu<=69)
								System.out.println("D ���� �Դϴ�.");
						else
							System.out.println("F ���� �Դϴ�.");
		//���迬����	
			int a = 12, b=24, c=36;
			
			System.out.println(a != c);// true
			
		//3.�� ������	(&&, ||, !)
			//  true    false
			if(a<=b && b>=c) {
				System.out.println("b ���� ���� Ů�ϴ�.");
			}else {
				System.out.println("c ���� ���� Ů�ϴ�.");//
			}
			
			//  true    false
			if(a<=b || b>=c) {
				System.out.println("b ���� ���� Ů�ϴ�.");//
			}else {
				System.out.println("c ���� ���� Ů�ϴ�.");
			}
			
			//not : !
			// 12 < 24 => true => false
			if((a<b)) {
				System.out.println("a<b");
			}else {
				System.out.println("a>=b");//
			}
			
			
			
		 //4.���ǹ�
		
		//5.�ݺ���
		
		//6.�迭 ó��
		
		
		//7.�ڷᱸ�� ó��
	}

}
