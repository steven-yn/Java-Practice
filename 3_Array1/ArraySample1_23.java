package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * ����2> ���ϴ� ������ ã��
 * ������ ���� �Է� �޾Ƽ�, ã���� �ϴ� �������� ��ġ�� ��������� ã�Ƽ� �� index���� ����ϼ���.
 * 
 */
public class ArraySample1_23 {
	private static int n;
	private static int SearchDataTest[];
	private static Scanner sc = new Scanner(System.in);

	private static void SearchDataResultIndex() {
		System.out.println("ã�� �����͸� �Է��� �ּ���.");
		int searchNumber = sc.nextInt();
		
		for(int i=0; i < SearchDataTest.length; i++) {
			if(SearchDataTest[i] == searchNumber)
				System.out.println(SearchDataTest[i] + "�� " + i);//index
		else 
			System.out.println("ã�� �����Ͱ� �ƴմϴ�.");
		}
	}

	private static void SearchDataInput() {
		for (int i = 0; i < SearchDataTest.length; i++) {
			SearchDataTest[i] = sc.nextInt();
			
		for(int k=0; k < SearchDataTest.length; k++) {
			System.out.print(SearchDataTest[k] + " ");
		}		
		System.out.println();
		}
	}
		
	private static void SearchDataSuInput() {
		System.out.println("lotto�迭�� ������ ������ ������ �Է��� �ּ���.");
		n = sc.nextInt();//6��

		SearchDataTest = new int[n];		
	}
	
	public static void main(String[] args) {
		// �˻��� �迭�� �Է��� ������ �� �Է�
		SearchDataSuInput();
		// ã�� ������ �Է�
		SearchDataInput();
		// ����� ���ǹ�ȣ �Է�
		SearchDataResultIndex(); 
		
	} // main method end

} //class end


