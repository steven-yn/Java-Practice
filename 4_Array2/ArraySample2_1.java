package Array2;

import java.util.Scanner;

/* 구구단 출력하기
 * - 2단에서 9단까지를 출력 
 * int[][] gugudan = new int[8][8];// [9][9]
 * gugudan[0][0] = 2;
 * gugudan[0][1] = 4;
 * gugudan[0][2] = 6;
 *  ....
 * gugudan[0][8] = 18;
 *  ....
 * gugudan[8][0] = 9;
 * gugudan[8][1] = 18
 *   ....
 * gugudan[8][8] = 81
 */
public class ArraySample2_1 {

	public static void main(String[] args) {
		// 2차원 처리
		int[][] gugudan = new int[8][9];

		// 구구단 입력
		for (int i = 0; i < gugudan.length; i++) { // row, 0행, 1행...

			for (int j = 0; j <= gugudan.length; j++) { // column, 0열, 1열, 2열,...
				gugudan[i][j] = (i + 2) * (j + 1);
				// gugudan[0][0] = 2 * 1 = 2, gugudan[0][1]2 * 2 = 4,
				// gugudan[0][2] = 2 * 3 = 6,
			}
		}	

		// 구구단 결과 출력
		int i=0; 
		for (   ; i < gugudan.length; i++) { // row, 0행, 1행...

			for (int j = 0; j <= gugudan.length; j++) { // column, 0열, 1열, 2열,....
				System.out.println((i + 2) + "*" + (j + 1) + "=" + gugudan[i][j]); 
				}
			System.out.println("--------------------------");
		}
		System.out.println("gugudan 배열의 데이터 출력 : " + gugudan[3][4]);//25
		
		for(int k=0; k < gugudan.length; k++) {
			System.out.println("gugudan[] 배열의 행의 크기(열 갯수) : " + gugudan[k].length);//9
		}
		
		
	}

}
