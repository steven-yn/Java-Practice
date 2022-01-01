package Array2;

import java.util.Scanner;

/* 배열 처리 : int[][] num = new int[4][4];
 * 2 2 2 2
 * 2 2 2 1
 * 2 2 1 1
 * 2 1 1 1
 * 
 * [0][0] = 2, [0][1] = 2, [0][2] = 2, [0][3] = 2
 * [1][0] = 2, [1][1] = 2, [1][2] = 2, [1][3] = 1
 * [2][0] = 2, [2][1] = 2, [2][2] = 1, [2][3] = 1
 * [3][0] = 2, [3][1] = 1, [3][2] = 1, [3][3] = 1
 * 
 * - 특징 : i와 j 값이 4이상이 되면, 1로 설정, 아니면 2로 설정
 * - 행 증가, 열 감소
 */
public class ArraySample2_2 {

	public static void main(String[] args) {
		// 2차원 처리
		int[][] num = new int[4][4];//[0][0] ~ [3][3]

		// 데이터 입력
		for (int i = 0; i < num.length; i++) { // row, 0행, 1행...

			for (int j = 0; j < num.length; j++) { // column, 0열, 1열, 2열,...

					if(i+j<4)
						num[i][j] = 2;
					else
						num[i][j] = 1;
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
