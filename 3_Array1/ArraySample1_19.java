package Array1;

import java.util.Arrays;
import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���, method()����: ���� ������ �������...�����ؼ� �����մϴ�.
 * - Arrays.sort() ���
 * - ������ ������> 110 20 130 40 150 260 270 380 90 100
 * - ������ ������ : ��������> 20 40 90 100 110 130 150 260 270 380
 * - ������ ������ : ��������> 380 270 260 150 130 110 100 90 40 20
 */
public class ArraySample1_19 {
	private static int n;
	static int sortTest[];
	private static Scanner sc = new Scanner(System.in);

	static void sortDataSuInput() {
		System.out.println("sort�迭�� ������ ������ ������ �Է��� �ּ���.");
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
		System.out.print("[��������] : ");
		
		for(int i = 0; i < sortTest.length; i++) { 			
			System.out.print(sortTest[i] + " ");
		}
		System.out.println();
	}

	static void datadescending(int[] sortTest) {
		System.out.print("[��������] : ");
				
		for(int i = sortTest.length - 1; i > -1; i--) { 			
			System.out.print(sortTest[i] + " ");
		}
		System.out.println();		
	}

	public static void main(String[] args) {

		// ������ ������ �� �Է�
		sortDataSuInput();

		// ������ ������ �Է�
		sortDataInput();

		 Arrays.sort(sortTest);
		 
		// ascending(��������)
		dataAscending(sortTest);

		// descending(��������)
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