package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.AnnotationTypeMismatchException;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� �Ǽ��� �Դϴ�.
 * - �ݺ��� ���
 * - ������ �߿��� 3�� ����� �Ǵ� ������ �հ�� ������ ���Ͽ� ����մϴ�.
 * - - BufferedReader class, Exception => readLine() => try ~ catch
 */
public class OOPSample12 {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int sum, count;

	private void baesu() {
		int su = 0;
		System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		try {
			su = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfee) {
			System.out.println("�ݵ�� ���ڸ� �Է��� �ּ���..");
			baesu();
		} catch (IOException e) {
			e.printStackTrace();// ���ÿ� �ִ� ���� �޽����� ����� �ִ� ����
		} 
	
		
		double number[] = new double[su];// Ŭ���� �迭

		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
			double x = 0;
			
			try {
				x = Double.parseDouble(br.readLine());
			} catch (NumberFormatException nfee) {
				System.out.println("�ݵ�� ���ڸ� �Է��� �ּ���..");
				baesu();
			} catch (IOException e) {
				e.printStackTrace();// ���ÿ� �ִ� ���� �޽����� ����� �ִ� ����
			} 
			
			number[i] = x; 
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
		OOPSample12 oop10 = new OOPSample12();
		oop10.baesu();
	}

}
