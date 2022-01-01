package OOP_InheritanceSample;

/* ���(Inheritance) : �θ𿡰Լ� �ڽĿ��� �����ִ°�
 * �θ�Ŭ����(Parent class), �ڽ�Ŭ����(child class)
 * ������ �̿��� Ŭ��������, Ŭ���� �޼ҵ带 ��ӹ޾� ����մϴ�.
 * 
 * ����� �޴� ��� 4���� ����
 * 1)public class A extends B { .... }
 * 
 * 2)public class A extends B implements C, D, E,..... {  ..... }
 *  B class, C,D,E interface ������ ���մϴ�.
 * 
 * 3)public interface A extends B
 *   A�� B�� ��� �������̽� ������ ���մϴ�.
 *   
 * 4)public class A implements B, C, D... { .... }
 *   A�� class�̰�, B, C, D�� ��� �������̽��� ��� ���
 * 
 * ����� �����ִ� ������ ����� �����Ͽ� ����(����)�� �����մϴ�.
 * �׷��Ƿ� �θ� Ŭ�������� �� ū �ڽ� Ŭ������ �˴ϴ�.
 * 
 */


public class InheritanceSample1 {

	public static void main(String[] args) {
		AdderClass ac = new AdderClass();
		ac.add();
		
		SuberClass sc = new SuberClass();
		sc.suber();

		MultiClass mc = new MultiClass();
		mc.multi();
		
		DivideClass di = new DivideClass();
		di.divi();
	}

}
