package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * 문제5> 학생수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.
 * 메뉴 형식
 * -------------------------------------
 * 1.학생수 입력 메뉴
 * 2.점수 입력 메뉴
 * 3.점수 리스트 출력 메뉴
 * 4.데이터 분석(최고점수와 평균 점수 출력) 메뉴
 * 5.종료 메뉴
 * -------------------------------------
 */
public class ArraySample1_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = null;
		int stuNum = 0;

		while (true) {
			System.out.println("-------------------------------------");
			System.out.println(" 1.학생수 입력 메뉴 ");
			System.out.println(" 2.점수 입력 메뉴 ");
			System.out.println(" 3.점수 리스트 출력 메뉴 ");
			System.out.println(" 4.데이터 분석(최고점수와 평균 점수 출력) 메뉴 ");
			System.out.println(" 5.종료 메뉴 ");
			System.out.println("-------------------------------------");
			System.out.println("원하는 메뉴를 선택해 주세요.");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("학생수는? ");
				stuNum = sc.nextInt();
				score = new int[stuNum];

			} else if (menu == 2) {
				System.out.println("점수를 입력해 주세요.");
				for (int i = 0; i < score.length; i++) {
					score[i] = sc.nextInt();
				}
			} else if (menu == 3) {
				System.out.println("---배열에 들어있는 학생의 점수를 출력---");
				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + i + "] = " + score[i]);// score[5] = 90
				}
			} else if (menu == 4) {
				int max = 0, sum = 0;
				double aver = 0.0;

				for (int i = 0; i < score.length; i++) {
					max = (max < score[i] ? score[i] : max);
					sum += score[i];
				}
				aver = sum / stuNum;

				System.out.println("최고 점수는? " + max);
				System.out.println("평균 점수는? " + aver);
			} else if (menu == 5) {
				System.out.println("계속하시겠습니까?(y/n)");
				String keeping = sc.next();

				if (keeping.equals("y")) {
					continue;
				} else if (keeping.equals("n")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
		}

	} // main method end

} // class end

/*
package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


 * 문제5> 학생수를 입력받아서 점수를 입력하고, 점수 리스트를 출력하는 프로그램을 작성합니다.
 * 메뉴 형식
 * ----------------
 * 

public class ArraySample1_26 {
   private static int student;
   private static int[] score;
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean trigger = true;
      
     System.out.println("--------------------------------");
     System.out.println("1. 학생수 입력");
     System.out.println("2. 점수 입력");
     System.out.println("3. 점수 리스트 출력");
     System.out.println("4. 데이터 분석(최고점수와 평균 점수 출력");
     System.out.println("5. 종료");
     System.out.println("--------------------------------");
     
      while(trigger) {
         System.out.print("메뉴 선택 : ");
         int ch = sc.nextInt();
          if(ch == 1) {
             System.out.print("학생수 입력 : ");
             student = sc.nextInt();
             score = new int[student];
          }
          else if(ch == 2) {
             for(int i=1;i<=student;i++) {
                System.out.print(i + "번 학생 성적 : ");
                score[i-1] = sc.nextInt();  
             }
          }
          else if(ch == 3) {
             for(int i=1;i<=student;i++) {
                System.out.println(i + "번 학생 성적 : " + score[i-1]);
             }
          }
          else if(ch == 4) {
             int max = score[0];
             double aver = 0;
             for(int i=0;i<student;i++) {
              if(max <= score[i])
                 max = score[i];
              aver += score[i];
             }
             System.out.println("평균 : " + (aver/score.length) + " 최고점 : "+max);
          }
          else if(ch == 5) {
             trigger = false;
          }
      }

    
   } // main method end

} // class end
*/