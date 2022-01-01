package Array2;

import java.util.Scanner;

/* 배열 처리 : int[][] num = new int[5][5];
 * 1 	-1 	1 	-1	1
 * 0 	-1 	1 	-1	1
 * 0 	 0 	-1   1 -1
 * 0 	 0  0    1 -1
 * 0     0  0    0  1
 * 
 * [0][0] = 1, [0][1] = -1, [0][2] = 1, [0][3] = -1, [0][4] = 1
 * [1][0] = 0, [1][1] = -1, [1][2] = 1, [1][3] = -1, [1][4] = 1
 * [2][0] = 0, [2][1] =  0, [2][2] = -1, [2][3] = 1, [2][4] = -1
 * [3][0] = 0, [3][1] =  0, [3][2] = 0, [3][3] = 1, [3][4] = -1
 * [4][0] = 0, [4][1] =  0, [4][2] = 0, [4][3] = 0, [4][4] = 1
 * 
 * - 특징 : i와 j가 둘다 변경되면서 값이 변경되어집니다.	
 * - 부호가 변환
 * - 행 증가, 열 증가
 */
public class ArraySample2_4 {

	public static void main(String[] args) {
		// 2차원 처리
		int[][] num = new int[5][5];//[0][0] ~ [4][4]
		int su = 1;
		
		// 데이터 입력
		for (int i = 0; i < num.length; i++) { // row, 0행, 1행...

			for (int j = i; j < num.length; j++) { // column, 0열, 1열, 2열,...

						num[i][j] = su;
				//num[0][0]=1, num[0][1]=-1, num[0][2]=1, num[0][3]=-1, num[0][4]=1
					
						su*=(-1);//-1, 1, -1, 1 
			}
		}	

		// 데이터 출력
		int i=0; 
		for (   ; i < num.length; i++) { // row, 0행, 1행...

			for (int j = 0; j < num.length; j++) { // column, 0열, 1열, 2열,....
				System.out.print(num[i][j] + "\t"); 
				}
			System.out.println();
		}
		
	}

}
