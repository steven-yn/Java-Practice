package OOP;

import java.util.Scanner;

import methodSample.methodExam5_sungjuk;

/* ����> 2���� ���ڸ� �Է� �޾Ƽ� �հ踦 ���ϴ� ���α׷��� �ۼ��ϼ���.
 * -  OOPSample5 Ŭ������ �޼ҵ带 ȣ���Ͽ� OOPSample6���� ����ϴ� ���α׷���.  
 */
public class OOPSample9 {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// ����> 7���� ������ �Է¹޾Ƽ�, ������ ����ϼ���.
		methodExam5_sungjuk me5s = new methodExam5_sungjuk();
		
		me5s.sungjuk();//4�� ���� 
				
				//����> 3�� �������� ������ �ذ��� ���ϴ�.
				for (int i = 0; i < 3; i++) {
				String str2 = me5s.sungjuk2();//3�� ����
				System.out.println("������ : " + str2);//
				}
	}

}
