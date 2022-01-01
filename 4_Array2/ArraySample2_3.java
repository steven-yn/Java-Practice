package Array2;

import java.util.Scanner;

/* 배열 처리 : int[][] num = new int[4][4];
 * 2 	2 	2 	20
 * 2 	2 	15 	2
 * 2 	10 	2 	2
 * 5 	2 	2 	2
 * 
 * [0][0] = 2, [0][1] = 2, [0][2] = 2, [0][3] = 20
 * [1][0] = 2, [1][1] = 2, [1][2] = 15, [1][3] = 2
 * [2][0] = 2, [2][1] = 10, [2][2] = 2, [2][3] = 2
 * [3][0] = 5, [3][1] = 2, [3][2] = 2, [3][3] = 2
 * 
 * - 특징 : i와 j 값의 3이면 값이 달라지는 현상	
 * - 행 증가, 열 감소
 */
public class ArraySample2_3 {

	public static void main(String[] args) {
		// 2차원 처리
		int[][] num = new int[4][4];//[0][0] ~ [3][3]

		// 데이터 입력
		for (int i = 0; i < num.length; i++) { // row, 0행, 1행...

			for (int j = 0; j < num.length; j++) { // column, 0열, 1열, 2열,...

					if(i+j == 3)
						num[i][j] = (4-i) * 5;//20, 15, 10, 5
					else
						num[i][j] = 2;
			}
		}	

		// 데이터 출력
		int i=0; 
		for (   ; i < num.length; i++) { // row, 0행, 1행...

			for (int j = 0; j < num.length; j++) { // column, 0열, 1열, 2열,....
				System.out.print(num[i][j] + " "); 
				}
			System.out.println();
		}
		
	}

}
