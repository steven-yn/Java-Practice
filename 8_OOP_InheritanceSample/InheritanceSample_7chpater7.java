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

abstract class Animal {	
	//field
	
	//constructor
	
	//method
	public abstract void moving();//�߻� �޼ҵ� ����
}

class Ant extends Animal {

	@Override
	public void moving() {
		System.out.println("���̴� ���ٴմϴ�.");	 	
	}	
}

class Bird extends Animal {

	@Override
	public void moving() {
		System.out.println("���� ���ƴٴմϴ�.");	 			
	}	
	
}

public class InheritanceSample_7chpater7  {  
	
	public static void main(String[] args) {
		InheritanceSample_7chpater7 is7 = new InheritanceSample_7chpater7();
		
		Ant p22 = new Ant();//��ü����O
		p22.moving();// ���̴� ���ٴմϴ�.
		
		Bird b22 = new Bird();
		b22.moving();// ���� ���ƴٴմϴ�.
		
		//Animal p33 = new Animal();//��ü����X
		
		
		
	}

}
