package Array2;

import java.util.Scanner;

/* �迭 ó�� : int[][] num = new int[4][4];
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
 * - Ư¡ : i�� j ���� 3�̸� ���� �޶����� ����	
 * - �� ����, �� ����
 */
public class ArraySample2_3 {

	public static void main(String[] args) {
		// 2���� ó��
		int[][] num = new int[4][4];//[0][0] ~ [3][3]

		// ������ �Է�
		for (int i = 0; i < num.length; i++) { // row, 0��, 1��...

			for (int j = 0; j < num.length; j++) { // column, 0��, 1��, 2��,...

					if(i+j == 3)
						num[i][j] = (4-i) * 5;//20, 15, 10, 5
					else
						num[i][j] = 2;
			}
		}	

		// ������ ���
		int i=0; 
		for (   ; i < num.length; i++) { // row, 0��, 1��...

			for (int j = 0; j < num.length; j++) { // column, 0��, 1��, 2��,....
				System.out.print(num[i][j] + " "); 
				}
			System.out.println();
		}
		
	}

}
