package OOP;

import java.util.Scanner;

public class OOPSample_6chapter20 {
	
	
	 //���� �ʱ�ȭ �� = ���� ��ȭ�� ���� �� ���(�������� �� ����)
	static String company = "�����ڵ���";
		static String model = "�׷���";
		static String color = "������";
		static int maxSpeed = 350;
		static int speed; 		
		
		 static void method1() {			
			//
		}
		
		 static void method2() {			
				
			}
		 		 
		static {
			//String company = "�����ڵ���";	//[x]
			//void method1();//[X]
			 String model = "kia";//[O]
			 method2();//[O]
		}
		
		//���� �޼ҵ�
		static void Method3() {
			//this.company  = "xxx";//[X]
			//this.method1();[X]
			String model = "kia";//[O]
			method2();//[O]
		}
		
		
		public static void main(String[] args) {
					
			System.out.println("����ȸ�� : " + company);//�����ڵ���
			System.out.println("�𵨸� : " + model);//�׷���
			System.out.println("���� : " + color);//������
			System.out.println("�ְ�ӵ� : " + maxSpeed);//350
			System.out.println("����ӵ� : " + speed);//0
			
			method1();
			method2();
		}

}
