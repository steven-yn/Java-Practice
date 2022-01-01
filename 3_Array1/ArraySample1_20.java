package Array1;

import java.util.Arrays;
import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���, method()����: ���� ������ �������...�����ؼ� �����մϴ�.
 * - Arrays.sort() ���
 * - ������ ������> 110 20 130 40 150 260 270 380 90 100
 * - ������ ������ : ��������> 20 40 90 100 110 130 150 260 270 380
 * - ������ ������ : ��������> 380 270 260 150 130 110 100 90 40 20
 * 
 * ��ü������ �������� �����Ͽ� ����ϴ� ���(call by Reference)
 */
public class ArraySample1_20 {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		ArraySample1_19 as19 = new ArraySample1_19();
				
		//ArraySample1_20 as20 = new ArraySample1_20();
		
		// ������ ������ �� �Է�
		as19.sortDataSuInput();

		// ������ ������ �Է�
		as19.sortDataInput();

		/* ����������: 4���� ����
		 * public : ��� Ŭ�������� ������ ����մϴ�.
		 * ����: ����Ʈ : ���õ� Ŭ�������Ը� ������ ����մϴ�. => object(as19)
		 * private : �ڽ��� ���� Ŭ�������Ը� ������ ���˴ϴ�.
		 * protected : ���� ��Ű���� �ٸ� ��Ű���� �����Ͽ� �ڽ��� Ŭ������ ������ Ŭ��������, ��� ���迡 �ִ� Ŭ�������� ������ ����մϴ�.
		 */
		//classname.methodname(   )
		Arrays.sort(ArraySample1_19.sortTest);
		 
		// ascending(��������)
		as19.dataAscending(ArraySample1_19.sortTest);

		// descending(��������)
		as19.datadescending(ArraySample1_19.sortTest);

	}	
}

