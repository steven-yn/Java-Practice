package Array1;

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
public class ArraySample1_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0, rcount=0;
		
		Random rand = new Random();
		int num = rand.nextInt(1000) + 1;// 1~1000
		System.out.println("���� �߻� ������ : " + num); 
		
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
			if(count == 9999999) //��ü �ݺ� Ƚ��
				break;
		}while(true);
	} // main method end

} // class end
