package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * ����6> ������ �� N���� �Է� �޾Ƽ�, �迭�� �����ϰ�, �������� ������ �մϴ�.   
 *  ������> 100 300 400 200
 *  1ȸ�� ��� : 400 100 300 200
 *  2ȸ�� ��� : 400 300 100 200
 *  3ȸ�� ��� : 400 300 200 100
 *
 */
public class ArraySample1_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ϴ� �迭�� ũ�⸦ �Է��� �ּ���.");
		int n = sc.nextInt();// 7

		int[] sortData = new int[n];// 0~6

		System.out.println("===== ���� ������ �Է�======");
		for (int i = 0; i < sortData.length; i++) {
			System.out.println((i + 1) + "��° ������ : ");
			sortData[i] = sc.nextInt();
		}

		// �������� ����
		for (int i = 0; i < sortData.length; i++) {

			for (int j = i + 1; j < sortData.length; j++) {

				if (sortData[i] < sortData[j]) {

					int temp = sortData[i];

					sortData[i] = sortData[j];

					sortData[j] = temp;
				}
			}
			System.out.println((i + 1) + "ȸ�� ��� : ");

			for (int k : sortData) { // ���� �迭
				System.out.print(k + " ");
			}
			System.out.println();
		}
	} // main method end

} // class end

/*
package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


 * ����6> ������ ���� N���� �Է� �޾Ƽ�, �迭�� �����ϰ�, �������� ������ �մϴ�.
 * ������> 100 300 400 200
 * 1ȸ�� ��� : 400 100 300 200
 * 2ȸ�� ��� : 400 300 100 200
 * 3ȸ�� ��� : 400 300 200 100
 * 

public class ArraySample1_27 {
private static int number[];

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("�Է��� ���� ���� : ");
      int n=sc.nextInt();
      int maxnum=0;
      number = new int[n];
     for(int i=0;i<n;i++) {
        System.out.print("�Է� : ");
        number[i] = sc.nextInt(); 
     }

     for(int k=0;k<n;k++) {
        int max = number[k];
        for(int i=k;i<n;i++) {
            if(max <= number[i]) {
               max = number[i];
               maxnum = i;
            }
           }
          
        for(int i=maxnum;i>k;i--) {
           number[i] = number[i-1]; 
        }
        
        number[k] = max;
        
        for(int i=0;i<n;i++) {
           System.out.print(number[i] + " ");
        }
        System.out.println();
     }

    
   } // main method end

} // class end
*/
