package OOP;

import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� �Ǽ��� �Դϴ�.
 * - �ݺ��� ���
 * - ������ �߿��� 3�� ����� �Ǵ� ������ �հ�� ������ ���Ͽ� ����մϴ�.
 */
public class OOPSample10 {
	
	private  Scanner sc = new Scanner(System.in);
	private int sum, count;
	
	private void baesu() {
		int n;		 
		 
		 System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		 n = sc.nextInt();// 10	
		 
		 double number[] = new double[n];//Ŭ���� �迭
	
		 for (int i = 0; i < number.length; i++) {
				System.out.println("number �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
				number[i] = sc.nextDouble();
			}
		
		 for (int i = 0; i < number.length; i++) {
				if (number[i] % 3 == 0) {
					sum += number[i];
					count++;
				}			
			}	
		 
		 System.out.println("3�ǹ�� ���� " + sum + "�̰�, ������ " + count + "�Դϴ�.");		
	}

	public static void main(String[] args) {
		OOPSample10 oop10 = new OOPSample10();
		oop10.baesu();	
		
	}

}
