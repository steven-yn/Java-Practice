package OOP_InheritanceSample;

import java.util.Scanner;

/* �߻�(abstract) :  ��ü���� ����Ǵ� Ư���� ������ ��
 * ��, ����, �����  : ����
 * �Ｚ, ����, LG : ȸ��
 * 
 * class Parent22 : (�Ϲ�)��ü Ŭ����
 * public abstract class Parent33 : �߻� Ŭ����
 * �߻� Ŭ������ ��ü�� �������� ���մϴ�.
 * �׷��Ƿ� �߻� Ŭ������ �߻� �޼ҵ�� �Ϲ� Ŭ�������� ����� �޾Ƽ�
 * �߻� �޼ҵ� �������̵��� ���Ͽ� �޼ҵ带 �����մϴ�.
 * 
 * �߻� Ŭ������ �뵵>
 * 1.��ü Ŭ�������� �������� �ʵ�� �޼ҵ��� �̸��� ������ ����
 * 2.��ü Ŭ���� �ۼ� �� �� �ð��� ������ �� �ִ�.
 * 
 */

 abstract class Phone {

	// field
	String owner; //ȫ�浿

	// constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	// method
	public void turnOn() {
		System.out.println("���� ������ �մϴ�.");		 
	}
	
	public void turnOff() {
		System.out.println("���� ������ ���ϴ�.");		
	}
	
	public void NameReslut() {
		System.out.println(owner);
	}
	
	public abstract void AAA();//�߻� �޼ҵ� ����
	
}

class SmartPhone extends Phone {

	public SmartPhone(String owner) { // �Ű�����(parameter)
		super(owner);
	}

	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
		
	}

	@Override
	public void AAA() {
		System.out.println("AAA");		
	}

}

public class InheritanceSample_7chpater8 {

	public static void main(String[] args) {
		// Phone phone = new Phone();

		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.NameReslut();// ȫ�浿
		smartPhone.turnOn();// ���� ������ �մϴ�.
		smartPhone.internetSearch();// ���ͳ� �˻��� �մϴ�.
		smartPhone.turnOff();// ���� ������ ���ϴ�.
		
		//Phone.owner;// Ŭ������.Ŭ�������� => �߻� Ŭ���� �̹Ƿ� ���� ����� �ȵ�.
				
	}

}
