package OOP;

import java.util.Scanner;

public class OOPSample_6chapter8 {
			
	public static void main(String[] args) {
						
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 5�� �Է�");
		String company  = sc.next();
		String model  = sc.next();
		String color  = sc.next();
		int maxSpeed = sc.nextInt();
		int speed = sc.nextInt();
	
		Car car = new Car(company, model, color, maxSpeed, speed); 
		
		// Ŭ���������� �����Ͽ� ����ϱ�
		System.out.println("����ȸ�� : " + Car.companys);//�����ڵ���
		System.out.println("�𵨸� : " + Car.model);//�׷���
		System.out.println("���� : " + Car.color);//������
		System.out.println("�ְ�ӵ� : " + Car.maxSpeed);//350
		System.out.println("����ӵ� : " + Car.speed);//0
		
		// ��ü������ �����Ͽ� ����ϱ�
		System.out.println("����ȸ�� : " + car.companys);//�����ڵ���
		System.out.println("�𵨸� : " + car.model);//�׷���
		System.out.println("���� : " + car.color);//������
		System.out.println("�ְ�ӵ� : " + car.maxSpeed);//350
		System.out.println("����ӵ� : " + car.speed);//0
	}

}
