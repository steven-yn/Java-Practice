package Array2;

import java.util.Scanner;

/* �迭 ó�� : int[][] num = new int[4][4];
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
 * - Ư¡ : i�� j ���� 4�̻��� �Ǹ�, 1�� ����, �ƴϸ� 2�� ����
 * - �� ����, �� ����
 */
public class ArraySample2_2 {

	public static void main(String[] args) {
		// 2���� ó��
		int[][] num = new int[4][4];//[0][0] ~ [3][3]

		// ������ �Է�
		for (int i = 0; i < num.length; i++) { // row, 0��, 1��...

			for (int j = 0; j < num.length; j++) { // column, 0��, 1��, 2��,...

					if(i+j<4)
						num[i][j] = 2;
					else
						num[i][j] = 1;
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
