package OOP;

import java.util.Scanner;

/* ����> 2���� ���ڸ� �Է� �޾Ƽ� �հ踦 ���ϴ� ���α׷��� �ۼ��ϼ���.
 * -  OOPSample5 Ŭ������ �޼ҵ带 ȣ���Ͽ� OOPSample6���� ����ϴ� ���α׷���.  
 */
public class OOPSample8 {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// ����> 7���� ������ �Է¹޾Ƽ�, ������ ����ϼ���.
		OOPSample7 os8 = new OOPSample7();
		
				os8.sungjuk();//4�� ���� 
				
				//����> 3�� �������� ������ �ذ��� ���ϴ�.
				for (int i = 0; i < 3; i++) {
				String str2 = os8.sungjuk2();//3�� ����
				System.out.println("������ : " + str2);//
				}
	}

}
