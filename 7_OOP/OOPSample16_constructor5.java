package OOP;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * ����3> ���� ���߱� ����
 * ��ǻ�Ͱ� ������ �߻��Ͽ� ���ڸ� �����մϴ�. 
 * - ������ ���� : 1 ~ 1000
 * ����ڰ� ���ڸ� �Է��Ͽ� ������ ������ ���ڸ� ���ߴ� ���� �Դϴ�.
 * ���� Ƚ���� ������ ����մϴ�.
 * 
 */
public class OOPSample16_constructor5 {

	private int num;//0 = > ?
	private int count;//0 => 
	private int rcount;//0 => 
	private Scanner sc = new Scanner(System.in);
	
	public OOPSample16_constructor5(int num) {
		this.num = num;
	}

	private void suFit() {
		do {
			count++;
			
			System.out.println("����� �����͸� �Է��� �ּ���.");
			int userInput = sc.nextInt();

			System.out.println("��ǻ�Ͱ� �߻��� ���� ������ : " + num);
			if (userInput == num) {
				System.out.println("������ϴ�.^^");
				System.out.println("����Ƚ�� : " + ++rcount);
			} else if (userInput > num) {
				System.out.println("�Է��� ���� " + userInput + "��ǻ�� �������� Ů�ϴ�.");
				rcount++;
			} else {
				System.out.println("�Է��� ���� " + userInput + "��ǻ�� �������� �۽��ϴ�.");
				rcount++;
			}
			//if() //��ü �ݺ� Ƚ��
				//break;
		}while(count <= 9999999);
		
	} 
		
	public static void main(String[] args) {		
				
		Random rand = new Random();
		int num = rand.nextInt(1000) + 1;// 1~1000
		System.out.println("���� �߻� ������ : " + num); 		
		 
		OOPSample16_constructor5 oop16_5 = new OOPSample16_constructor5(num);
		oop16_5.suFit();
				
	}// main method end

} // class end
