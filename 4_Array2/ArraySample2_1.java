package Array2;

import java.util.Scanner;

/* ������ ����ϱ�
 * - 2�ܿ��� 9�ܱ����� ��� 
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
		// 2���� ó��
		int[][] gugudan = new int[8][9];

		// ������ �Է�
		for (int i = 0; i < gugudan.length; i++) { // row, 0��, 1��...

			for (int j = 0; j <= gugudan.length; j++) { // column, 0��, 1��, 2��,...
				gugudan[i][j] = (i + 2) * (j + 1);
				// gugudan[0][0] = 2 * 1 = 2, gugudan[0][1]2 * 2 = 4,
				// gugudan[0][2] = 2 * 3 = 6,
			}
		}	

		// ������ ��� ���
		int i=0; 
		for (   ; i < gugudan.length; i++) { // row, 0��, 1��...

			for (int j = 0; j <= gugudan.length; j++) { // column, 0��, 1��, 2��,....
				System.out.println((i + 2) + "*" + (j + 1) + "=" + gugudan[i][j]); 
				}
			System.out.println("--------------------------");
		}
		System.out.println("gugudan �迭�� ������ ��� : " + gugudan[3][4]);//25
		
		for(int k=0; k < gugudan.length; k++) {
			System.out.println("gugudan[] �迭�� ���� ũ��(�� ����) : " + gugudan[k].length);//9
		}
		
		
	}

}
