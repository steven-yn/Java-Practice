package OOP;

import java.util.Scanner;

/* ����> 2���� ���ڸ� �Է� �޾Ƽ� �հ踦 ���ϴ� ���α׷��� �ۼ��ϼ���.
 * -  OOPSample5 Ŭ������ �޼ҵ带 ȣ���Ͽ� OOPSample6���� ����ϴ� ���α׷���.  
 */
public class OOPSample7 {
	
private static String str;//null	
	
	public static void sungjuk() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("������ �Է��� �ּ��� : ");
			int score = sc.nextInt();

			if (score >= 90)
				System.out.println("������ 90�� �̻��̰�, A���� �Դϴ�.");
			else if (score >= 80)
				System.out.println("������ 80�� �̻��̰�, B���� �Դϴ�.");

			else if (score >= 70)
				System.out.println("������ 70�� �̻��̰�, C���� �Դϴ�.");

			else if (score >= 60)
				System.out.println("������ 60�� �̻��̰�, D���� �Դϴ�.");
			else {
				System.out.println("F���� �Դϴ�.");
			}
			// ����� Ż���մϴ�.
		}
	}	
	
	public static String sungjuk2() {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("������ �Է��� �ּ��� : ");
			int score = sc.nextInt();

			if (score >= 90)
				 str = "������ 90�� �̻��̰�, A���� �Դϴ�.";
			else if (score >= 80)
				str = "������ 80�� �̻��̰�, B���� �Դϴ�.";

			else if (score >= 70)
				str = "������ 70�� �̻��̰�, C���� �Դϴ�.";

			else if (score >= 60)
				str = "������ 60�� �̻��̰�, D���� �Դϴ�.";
			else {
				str = "F���� �Դϴ�.";				
			}
			// ����� Ż���մϴ�.
			return str;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// ����> 7���� ������ �Է¹޾Ƽ�, ������ ����ϼ���.
		OOPSample7 os7 = new OOPSample7();
		
				os7.sungjuk();//4�� ���� 
				
				//����> 3�� �������� ������ �ذ��� ���ϴ�.
				for (int i = 0; i < 3; i++) {
				String str2 = os7.sungjuk2();//3�� ����
				System.out.println("������ : " + str2);//
				}
	}

}
