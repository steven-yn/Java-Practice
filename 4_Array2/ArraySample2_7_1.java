package Array2;

import java.util.Scanner;

/* 배열 처리 : int[][] num = new int[5][5];
 * 21 	22 	23 	24	25
 * 16 	17 	18 	19	20
 * 11 	12 	13  14  15
 * 6     7   8   9  10
 * 1     2   3   4   5
 * 
 * [0][0] = 21, [0][1] = 22, [0][2] = 23, [0][3] = 24, [0][4] = 25
 * [1][0] = 16, [1][1] = 17, [1][2] = 18, [1][3] = 19, [1][4] = 20
 * [2][0] = 11, [2][1] = 12, [2][2] = 13, [2][3] = 14, [2][4] = 15
 * [3][0] =  6, [3][1] =  7, [3][2] =  8, [3][3] =  9, [3][4] = 10
 * [4][0] =  1, [4][1] =  2, [4][2] =  3, [4][3] =  4, [4][4] =  5
 * 
 * - 특징 : 
 * - 행 감소, 열 증가
 * - +1
 */
public class ArraySample2_7_1 {
 
	public static void Upside_down_arrangement() {  
		// 2차원 처리
		int[][] num = new int[5][5];// [0][0] ~ [4][4]
		int su = 0;

		// 데이터 입력
		for (int i = 4; i >= 0; i--) { // row, 4>=0, 3>=0, 2>=0, 1>=0, 0>=0, -1>=0(false)

			for (int j = 0; j < num.length; j++) {
				// 0<5, 1<5, 2<5, 3<5, 4<5, 5<5(false)

				su++;
				num[i][j] = su;// 1, 2, 3, 4, 5, 6........25
				// num[4][0]=1, num[4][1]=2, num[4][2]=3, num[4][3]=4, num[4][4]=5,
				// num[3][0]=6, num[3][1]=7, num[3][2]=8, num[3][3]=9, num[3][4]=10
				// num[2][0]=11, num[2][1]=12, num[2][2]=13, num[2][3]=14, num[2][4]=15,
				// num[1][0]=16, num[1][1]=17, num[1][2]=18, num[1][3]=19, num[1][4]=20,
				// num[0][0]=21, num[0][1]=22, num[0][2]=23, num[0][3]=24, num[0][5]=25
			}
		}

		// 데이터 출력
		int i = 0;
		for (; i < num.length; i++) { // row, 0행, 1행...

			for (int j = 0; j < num.length; j++) { // column, 0열, 1열, 2열,....
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ArraySample2_7_1 as2_7_1 = new ArraySample2_7_1();
		as2_7_1.Upside_down_arrangement();
	}

}
