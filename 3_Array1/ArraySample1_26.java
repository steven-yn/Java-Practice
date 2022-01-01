package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * ����5> �л����� �Է¹޾Ƽ� ������ �Է��ϰ�, ���� ����Ʈ�� ����ϴ� ���α׷��� �ۼ��մϴ�.
 * �޴� ����
 * -------------------------------------
 * 1.�л��� �Է� �޴�
 * 2.���� �Է� �޴�
 * 3.���� ����Ʈ ��� �޴�
 * 4.������ �м�(�ְ������� ��� ���� ���) �޴�
 * 5.���� �޴�
 * -------------------------------------
 */
public class ArraySample1_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = null;
		int stuNum = 0;

		while (true) {
			System.out.println("-------------------------------------");
			System.out.println(" 1.�л��� �Է� �޴� ");
			System.out.println(" 2.���� �Է� �޴� ");
			System.out.println(" 3.���� ����Ʈ ��� �޴� ");
			System.out.println(" 4.������ �м�(�ְ������� ��� ���� ���) �޴� ");
			System.out.println(" 5.���� �޴� ");
			System.out.println("-------------------------------------");
			System.out.println("���ϴ� �޴��� ������ �ּ���.");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("�л�����? ");
				stuNum = sc.nextInt();
				score = new int[stuNum];

			} else if (menu == 2) {
				System.out.println("������ �Է��� �ּ���.");
				for (int i = 0; i < score.length; i++) {
					score[i] = sc.nextInt();
				}
			} else if (menu == 3) {
				System.out.println("---�迭�� ����ִ� �л��� ������ ���---");
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

				System.out.println("�ְ� ������? " + max);
				System.out.println("��� ������? " + aver);
			} else if (menu == 5) {
				System.out.println("����Ͻðڽ��ϱ�?(y/n)");
				String keeping = sc.next();

				if (keeping.equals("y")) {
					continue;
				} else if (keeping.equals("n")) {
					System.out.println("���α׷��� �����մϴ�.");
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


 * ����5> �л����� �Է¹޾Ƽ� ������ �Է��ϰ�, ���� ����Ʈ�� ����ϴ� ���α׷��� �ۼ��մϴ�.
 * �޴� ����
 * ----------------
 * 

public class ArraySample1_26 {
   private static int student;
   private static int[] score;
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean trigger = true;
      
     System.out.println("--------------------------------");
     System.out.println("1. �л��� �Է�");
     System.out.println("2. ���� �Է�");
     System.out.println("3. ���� ����Ʈ ���");
     System.out.println("4. ������ �м�(�ְ������� ��� ���� ���");
     System.out.println("5. ����");
     System.out.println("--------------------------------");
     
      while(trigger) {
         System.out.print("�޴� ���� : ");
         int ch = sc.nextInt();
          if(ch == 1) {
             System.out.print("�л��� �Է� : ");
             student = sc.nextInt();
             score = new int[student];
          }
          else if(ch == 2) {
             for(int i=1;i<=student;i++) {
                System.out.print(i + "�� �л� ���� : ");
                score[i-1] = sc.nextInt();  
             }
          }
          else if(ch == 3) {
             for(int i=1;i<=student;i++) {
                System.out.println(i + "�� �л� ���� : " + score[i-1]);
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
             System.out.println("��� : " + (aver/score.length) + " �ְ��� : "+max);
          }
          else if(ch == 5) {
             trigger = false;
          }
      }

    
   } // main method end

} // class end
*/