package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * ����4> ������ ����ϱ�
 * ���ϴ� ���� �Է��Ͽ� ����ϼ���.
 *  
 */
public class ArraySample1_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int[] gugudan = new int[9];
		
		System.out.println("����ڰ� ���ϴ� �������� �Է��� �ּ���.");
		int dan = sc.nextInt();

		for(int i=0; i < gugudan.length; i++) {
			gugudan[i] = dan * (i+1);
		}
		
		for(int i=0; i < gugudan.length; i++) {
			System.out.println(dan + "*" + (i+1) + "=" + gugudan[i]);
		}		
			
	} // main method end

} // class end
