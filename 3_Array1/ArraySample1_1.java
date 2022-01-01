package Array1;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ����>
 * ��ȣ, �̸�, �ڹ�, JSP, Spring, ����, ��� ���Ͽ� ����ϼ���. 
 * int, String, double, double, double, double, double
 * 
 * try {
 * 	������ �߻��� ���� �ҽ� ����
 *  }catch(InputMismatchException e){
 *     System.out.println("���ڿ��� �ԷµǾ����ϴ�. ���ڷ� �Է��� �ּ���.");
 *  }
 * 
 * 
 */
public class ArraySample1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ó�� �ο����� �Է����ּ���.");
		int inwon = sc.nextInt();// 3

		int bunho[] = new int[inwon];// bunho[] �迭�� �����͸� ����
		String name[] = new String[inwon];
		double java[] = new double[inwon];
		double jsp[] = new double[inwon];
		double spring[] = new double[inwon];
		double total[] = new double[inwon];
		double aver[] = new double[inwon];

		for (int i = 0; i < inwon; i++) {
			System.out.println("��ȣ �迭�� ������ �����͸� �Է� �Ͻÿ�.");
			bunho[i] = sc.nextInt();// bunho[] �迭�� �����͸� ����

			System.out.println("�̸� �迭�� ���ڿ� �����͸� �Է� �Ͻÿ�.");
			name[i] = sc.next();

			try {
				for (int j = 0; j < 1; j++) {
					System.out.println("Java �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
					double javajumsu = sc.nextDouble();

					if (javajumsu >= 0 && javajumsu <= 100)
						java[i] = javajumsu;
					else {
						System.out.println("������ ������ 0�̻� 100�����Դϴ�.");
						j--;
						continue;
					}
				}
			} catch (InputMismatchException e) {
				// e.printStackTrace();//��� ������ �߻��ϴ��� üũ�Ҷ�?
				System.out.println("���ڿ��� �ԷµǾ����ϴ�. ���ڷ� �Է��� �ּ���.");
			}

			try {
				for (int k = 0; k < 1; k++) {
					System.out.println("JSP �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
					double jspjumsu = sc.nextDouble();

					if (jspjumsu >= 0 && jspjumsu <= 100)
						jsp[i] = jspjumsu;
					else {
						System.out.println("������ ������ 0�̻� 100�����Դϴ�.");
						k--;
						continue;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("���ڿ��� �ԷµǾ����ϴ�. ���ڷ� �Է��� �ּ���.");
			}

			try {
				for (int m = 0; m < 1; m++) {
					System.out.println("Spring �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
					double springjumsu = sc.nextDouble();

					if (springjumsu >= 0 && springjumsu <= 100)
						spring[i] = springjumsu;
					else {
						System.out.println("������ ������ 0�̻� 100�����Դϴ�.");
						m--;
						continue;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("���ڿ��� �ԷµǾ����ϴ�. ���ڷ� �Է��� �ּ���.");
			}

			total[i] = java[i] + jsp[i] + spring[i];
			aver[i] = total[i] / 3.0;// inwon
		}

		System.out.println("======================== �� �� ó �� =======================");
		System.out.println("��ȣ\t�̸�\tJava\tJSP\tSpring\ttotal\taver");//
		System.out.println("----------------------------------------------------------");//
		for (int i = 0; i < inwon; i++) {
			System.out.print(bunho[i] + "\t" + name[i] + "\t" + java[i] + "\t" + jsp[i] + "\t" + spring[i] + "\t");
			System.out.printf("%5.2f \t %5.2f \n", total[i], aver[i]);
		}
		System.out.println("===============================================================");
	}

}
