package Array1;

import java.util.Arrays;
import java.util.Scanner;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 정수형 입니다.
 * - 반복문 사용, method()적용: 기준 선택은 마음대로...생각해서 결정합니다.
 * - Arrays.sort() 사용
 * - 변경전 데이터> 110 20 130 40 150 260 270 380 90 100
 * - 변경후 데이터 : 오름차순> 20 40 90 100 110 130 150 260 270 380
 * - 변경후 데이터 : 내림차순> 380 270 260 150 130 110 100 90 40 20
 */
public class ArraySample1_19 {
	private static int n;
	static int sortTest[];
	private static Scanner sc = new Scanner(System.in);

	static void sortDataSuInput() {
		System.out.println("sort배열에 저장할 데이터 갯수를 입력해 주세요.");
		n = sc.nextInt();
		
		sortTest = new int[n];
	}
		
	static void sortDataInput() {
		for(int i = 0; i < sortTest.length; i++) {
			sortTest[i] = sc.nextInt();
		}
		System.out.println();
	}

	static void dataAscending(int[] sortTest) {
		System.out.print("[오름차순] : ");
		
		for(int i = 0; i < sortTest.length; i++) { 			
			System.out.print(sortTest[i] + " ");
		}
		System.out.println();
	}

	static void datadescending(int[] sortTest) {
		System.out.print("[내림차순] : ");
				
		for(int i = sortTest.length - 1; i > -1; i--) { 			
			System.out.print(sortTest[i] + " ");
		}
		System.out.println();		
	}

	public static void main(String[] args) {

		// 변경전 데이터 수 입력
		sortDataSuInput();

		// 변경전 데이터 입력
		sortDataInput();

		 Arrays.sort(sortTest);
		 
		// ascending(오름차순)
		dataAscending(sortTest);

		// descending(내림차순)
		datadescending(sortTest);

	}	
}

/*import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = 0;
      int[] arr = new int[a];

      for (int i = 0; i <= arr.length - 1; i++) {
         arr[i] = sc.nextInt();
      }
      int x = 0;
      while (x < 1000) {
         for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
               b = arr[i + 1];

               arr[i + 1] = arr[i];
               arr[i] = b;
            }
            x++;
         }
      }

      for (int i = 0; i <= arr.length - 1; i++) {
         System.out.print(arr[i] + " ");
      }
System.out.println();
      for (int i = arr.length - 1; i >= 0; i--) {
         System.out.print(arr[i] + " ");
      }

   }

}
*/