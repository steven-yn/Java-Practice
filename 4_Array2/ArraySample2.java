package Array2;

import java.util.Scanner;

/* 2���� �迭 : ���� �߽����� ���� �����Ͽ� ����մϴ�.
 * 
 * ���� : row, --------------------------
 * ���� : column
 * 
 * int arr[] = new int[6];
 * arr[0] = 10;
 * arr[1] = 20;
 * arr[2] = 30;
 * arr[3] = 40;
 * arr[4] = 50;
 * arr[5] = 60;
 * 
 * int[][] arr2 = new int[2][3];
 * arr2[0][0] = 11;
 * arr2[0][1] = 22;
 * arr2[0][2] = 33;//0�࿡ ���� ������ �Է� �Ϸ�
 * arr2[1][0] = 44;
 * arr2[1][1] = 55;
 * arr2[1][2] = 66;//1�࿡ ���� ������ �Է� �Ϸ�
 * 
 */
public class ArraySample2 {

	public static void main(String[] args) {
		// 1���� ó��
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[6];
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("������ ������ 6���� �Է��ϼ���."); 
			arr[i] = sc.nextInt();
			System.out.println("arr �迭�� ������ ��� : " + arr[i]); 
		}

		System.out.println("arr[] �迭�� ũ�� : " + arr.length);//6 
		
		
		// 2���� ó��
		int[][] arr2 = new int[2][3];
		
		for(int i=0; i < arr2.length; i++) {  // row, 2��
			
			for(int j=0; j < 3; j++) {  // column, 3��
				System.out.println("������ ������ 6���� �Է��ϼ���."); 
				arr2[i][j] = sc.nextInt();
				System.out.println("arr �迭�� ������ ��� : " + arr2[i][j]); 
			}		
		}
		System.out.println("arr2 �迭 [1][1] : " + arr2[1][1]);//55
		
		System.out.println("arr2[] �迭�� 1���� ũ�� : " + arr2[0].length);//3 
		System.out.println("arr2[] �迭�� 2���� ũ�� : " + arr2[1].length);//3 
		
	}

}
