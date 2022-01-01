package OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ����> �޼ҵ� �����ε��� �����մϴ�.
 * - �޼ҵ� �����ε� : ���� �޼ҵ��� �̸��� ������ ���� �ٸ� ������ �ϴ� ���¸� ���մϴ�
 * - ���� ����: �ڷ����̳� �������� ������ �����մϴ�.  
 * - �����ʹ� ������, �Ǽ����� ����մϴ�.
 * - �ݺ��� ���
 * - �̵� �迭�� �޼ҵ� �������� ���� ������ ��ü�� �̿��Ͽ� ȣ���� �ǵ��� ���α׷��� �մϴ�.
 */
public class OOPSample15_overloading {

	private static Scanner sc = new Scanner(System.in);

	@SuppressWarnings("unused")
	private void calcalator(String str3, int su4) {
		int x = Integer.parseInt(str3);
		int sum = x + su4; 
		System.out.println("���ڿ� ���� + ���� : " + sum); 
	}
	
	private void calcalator(String str1, String str2) {
		String sum = str1 + str2;
		System.out.println("String : " + sum);		
	}	
	
	private void calculator(int su1, int su2, int su3) {
		int sum = su1 + su2 * su3;
		System.out.println("ȥ�ս� + *: " + sum); 
	}

	@SuppressWarnings("unused")
	private void calcalator(short su1, int su2) {
		int sum = su1 % su2;
		System.out.println("divi % : " + sum);
	}

	private void calculator(double su1, int su2) {
		double sum = su1 / su2;
		System.out.println("divi / : " + sum);
	}

	private void calculator(float su1, int su2) {
		float sum = su1 * su2;
		System.out.println("mult : " + sum);
	}

	private void calculator(long su1, long su2) {
		long sum = su1 - su2;
		System.out.println("sub : " + sum);
	}

	private void calculator(int su1, int su2) {
		int sum = su1 + su2;
		System.out.println("add : " + sum);
	}

	public static void main(String[] args) {
		OOPSample15_overloading oop15 = new OOPSample15_overloading();
		System.out.println("������ ���� 3���� �Է��� �ּ���.");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		int su3 = sc.nextInt();
		System.out.println("���ڿ� 2���� �Է��� �ּ���.");
		String str1 = sc.next();//
		String str2 = sc.next();//
		
		System.out.println("���ڿ� 2���� �Է�(10���� ���·�)�� �ּ���.");
		String str3 = sc.next();//10����, 8����, 16���� ������ �Է�
		int su4 = sc.nextInt();//
		
		oop15.calculator(su1, su2);// ������2�� �������ڰ�
		oop15.calculator((long) su1, (long) su2);// longŸ���� ������ 2�� ����
		oop15.calculator((float) su1, su2);
		oop15.calculator((double) su1, su2);
		oop15.calculator((short) su1, su2);
		oop15.calculator(su1, su2, su3);
		oop15.calcalator(str1, str2); 
		oop15.calcalator(str3, su4); 
	}

}
