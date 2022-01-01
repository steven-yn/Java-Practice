package Array2;

import java.util.Scanner;

/* 2차원 배열 : 행을 중심으로 열을 구분하여 사용합니다.
 * 
 * 수평 : row, --------------------------
 * 수직 : column
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
 * arr2[0][2] = 33;//0행에 대한 데이터 입력 완료
 * arr2[1][0] = 44;
 * arr2[1][1] = 55;
 * arr2[1][2] = 66;//1행에 대한 데이터 입력 완료
 * 
 */
public class ArraySample2 {

	public static void main(String[] args) {
		// 1차원 처리
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[6];
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("정수형 데이터 6개를 입력하세요."); 
			arr[i] = sc.nextInt();
			System.out.println("arr 배열의 데이터 출력 : " + arr[i]); 
		}

		System.out.println("arr[] 배열의 크기 : " + arr.length);//6 
		
		
		// 2차원 처리
		int[][] arr2 = new int[2][3];
		
		for(int i=0; i < arr2.length; i++) {  // row, 2행
			
			for(int j=0; j < 3; j++) {  // column, 3열
				System.out.println("정수형 데이터 6개를 입력하세요."); 
				arr2[i][j] = sc.nextInt();
				System.out.println("arr 배열의 데이터 출력 : " + arr2[i][j]); 
			}		
		}
		System.out.println("arr2 배열 [1][1] : " + arr2[1][1]);//55
		
		System.out.println("arr2[] 배열의 1행의 크기 : " + arr2[0].length);//3 
		System.out.println("arr2[] 배열의 2행의 크기 : " + arr2[1].length);//3 
		
	}

}
