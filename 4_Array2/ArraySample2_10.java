package Array2;

import java.util.Scanner;

/* Name, Java, JSP, Spring ������ �Է� �޾Ƽ� ���� ó�� 
 *  
 * ����, ���, ���� ���ϱ�
 * -------------------
 * ȫ�浿���� ����ǥ
 * -------------------
 * ���� : 
 * ��� :
 * ���� :
 * -------------------
 * 
 */
public class ArraySample2_10 {

	private static Scanner sc = new Scanner(System.in);

	private static int input(String kwamok) {
		int jumsu;
		
		while(true) {
			System.out.println(kwamok + "���� �Է�");
			jumsu = sc.nextInt();
			if(jumsu >=0 && jumsu <=100) break;
			
			System.out.println(kwamok + "���� �Է��� �߸��Ǿ����ϴ�. �ٽ� �Է��� �ּ���.");
		}
		return jumsu;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�л� �̸��� �Է��ϼ���.");
		String name = sc.next();

		int java = input("�ڹ�");
		int jsp = input("���̿�����");
		int spring = input("������");

		int total = java + jsp + spring;
		double aver= total /3.0;
		String grade;
		
		switch((int)aver / 10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F"; 		
		}
		
		System.out.println("-------------------");
		System.out.println(name + "���� ����ǥ ");
		System.out.println("-------------------");
		System.out.println(" ���� : " + total + "��");
		System.out.println(" ��� : " + aver + "��");
		System.out.println(" ���� : " + grade);
		System.out.println("-------------------");
		
	}

	

}
