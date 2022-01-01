package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.AnnotationTypeMismatchException;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� �Ǽ��� �Դϴ�.
 * - �ݺ��� ���
 * - ������ �߿��� 3�� ������ ������ ��� ���Ͽ� ����մϴ�.
 * - - BufferedReader class, Exception => readLine() => try ~ catch
 */
public class OOPSample13 {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private void sungjuk() {
		int su = 0;
		System.out.println("�Է� �ο����� ?");
		try {
			su = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfee) {
			System.out.println("�ݵ�� ���ڸ� �Է��� �ּ���..");
			sungjuk();
		} catch (IOException e) {
			e.printStackTrace();// ���ÿ� �ִ� ���� �޽����� ����� �ִ� ����
		} 	
		
		int number[] = new int[su];// Ŭ���� �迭
		int java=0, jsp=0, spring=0, sum=0;
		double aver  = 0.0;
		
		int[] javaArray = new int[3];
		int[] jspArray = new int[3];
		int[] springArray = new int[3];
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("number �迭�� 3������ �����͸� �Է� �Ͻÿ�.");			
			
			try {
				 java = Integer.parseInt(br.readLine());
				 jsp = Integer.parseInt(br.readLine());
				 spring = Integer.parseInt(br.readLine());
				
			} catch (NumberFormatException nfee) {
				System.out.println("�ݵ�� ���ڸ� �Է��� �ּ���..");
				sungjuk();
			} catch (IOException e) {
				e.printStackTrace();// ���ÿ� �ִ� ���� �޽����� ����� �ִ� ����
			} 			
			
			javaArray[i] = java;
			jspArray[i] = jsp;
			springArray[i] = spring;
		}

		for (int i = 0; i < number.length; i++) {			
				sum = javaArray[i] + jspArray[i] + springArray[i];
				aver = sum / 3;
				System.out.println((i+1) + "��ǻ�� ������ ���� " + sum + "�̰�, ����� " + aver + "�Դϴ�.");
			}		
	}

	public static void main(String[] args) {
		OOPSample13 oop13 = new OOPSample13();
		oop13.sungjuk();
	}

}
