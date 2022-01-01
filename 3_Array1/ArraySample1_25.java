package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * 문제4> 구구단 출력하기
 * 원하는 단을 입력하여 출력하세요.
 *  
 */
public class ArraySample1_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int[] gugudan = new int[9];
		
		System.out.println("사용자가 원하는 구구단을 입력해 주세요.");
		int dan = sc.nextInt();

		for(int i=0; i < gugudan.length; i++) {
			gugudan[i] = dan * (i+1);
		}
		
		for(int i=0; i < gugudan.length; i++) {
			System.out.println(dan + "*" + (i+1) + "=" + gugudan[i]);
		}		
			
	} // main method end

} // class end
