package OOP;

import java.util.Scanner;

public class OOPSample_6chapter5 {

	static String company;
	static String model;
	static String color;
	static int maxSpeed;
	static int speed; 		
	
	public static void main(String[] args) {
						
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 5�� �Է�");
		String company  = sc.next();
		String model  = sc.next();
		String color  = sc.next();
		int maxSpeed = sc.nextInt();
		int speed = sc.nextInt();
		
		System.out.println("����ȸ�� : " + company);//�����ڵ���
		System.out.println("�𵨸� : " + model);//�׷���
		System.out.println("���� : " + color);//������
		System.out.println("�ְ�ӵ� : " + maxSpeed);//350
		System.out.println("����ӵ� : " + speed);//0
	}

}
