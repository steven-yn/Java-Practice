package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* ����1> ����Ŭ���� �̿�
 * �ζ� ���� ���α׷��� �ۼ��մϴ�.
 * �����ʹ� 1 ~ 45���� ������ �˴ϴ�. 
 * ���� ��ǻ�Ͱ� ������ �߻��Ͽ� ���� ��ȣ�� �����մϴ�.
 * �׸��� ����ڰ� ���� ��ȣ�� �Է��մϴ�.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���
 * - ���� ��ȣ�� �ߺ� ���� �ʵ��� �մϴ�.
 * - ��ǻ�� ���� �߻� ��ȣ : 1 45 33 12 29 38
 * - ����ڰ� �Է��� ��ȣ : 45 33 12 40 8 7
 * - 1� ��÷�� �Ǹ� "���� �帳�ϴ�. 1�� 5õ�� $�� ��÷�Ǽ̽��ϴ�.
 * - ���������� "�ƽ����ϴ�. ���� ��ȸ�� ...."
 * 
 * �߰� ����>
 * 1.�ζ� 6�� ���߸� 1�� => �����Ϸ�
 * 2.�ζ� 5�� + ���ʽ� ��ȣ : 2��
 * 3.�ζ� 5�� : 3��
 * 4.�ζ� 4�� : 4��
 * 5.�ζ� 3�� : 5��
 */
public class ArraySample1_22 {
	private static int n;
	private static int lottoDataTest[];
	private static int lottoUserDataTest[];
	private static Scanner sc = new Scanner(System.in);

	static void lottoDataSuInput() {
		System.out.println("lotto�迭�� ������ ������ ������ �Է��� �ּ���.");
		n = sc.nextInt();//6��

		lottoDataTest = new int[n];
	}

	static void lottoDataInput() {
		Random rand = new Random();
		
		for (int i = 0; i < lottoDataTest.length; i++) {
			lottoDataTest[i] = rand.nextInt(45) + 1;//1~45��ȣ ����
			
			for(int j=0; j < i; j++) { //�ߺ� ���� ������ ����
				if(lottoDataTest[i] == lottoDataTest[j]) {
					i--;
				}
			}			
		}
		for(int k=0; k < lottoDataTest.length; k++) {
			System.out.print(lottoDataTest[k] + " ");
		}		
		System.out.println();
	}

	private static void lottoUserData() {
		 lottoUserDataTest = new int[n];
		
		for (int i = 0; i < lottoUserDataTest.length; i++) {
			System.out.println("lotto�迭�� ������ �����͸� �Է��� �ּ���.");
			lottoUserDataTest[i] = sc.nextInt();
			
			System.out.println("����� ������ = " + lottoUserDataTest[i] + " "); 
			}
	}
	
	private static void lottoUserDataTest() {
		Arrays.sort(lottoDataTest);//ascending sort
		Arrays.sort(lottoUserDataTest);

		//��
		boolean result = Arrays.equals(lottoDataTest, lottoUserDataTest);
		
		if(result == true) 
			System.out.println("���� �帳�ϴ�. 1�� 5õ�� $�� ��÷�Ǽ̽��ϴ�."); 
			else
				System.out.println("�ƽ����ϴ�. ���� ��ȸ�� ...."); 	
	}
	
	public static void main(String[] args) {
		// lotto �迭�� �Է��� ������ �� �Է�
		lottoDataSuInput();
		// ��ǻ�Ϳ� ���Ͽ� ���� ������ ����
		lottoDataInput();
		// ����� ���ǹ�ȣ �Է�
		lottoUserData();
		// ������ ��ġ���� Ȯ��
		lottoUserDataTest();
	} // main method end
} //class end



/*package Array;

import java.util.Scanner;

public class Main {
   Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      int[] arr = new int[6];
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i <= 5; i++) {

         arr[i] = (int) ((Math.random() * 45) + 1);
      }
      int x = 0;
      while (x < 1000) {
         for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
               if (i == j) {

               } else if (i != j) {
                  if (arr[i] == arr[j]) {
                     arr[i] = (int) ((Math.random() * 45) + 1);
                  }
               }
            }
            x++;
         }
      }
      
      int[] pick = new int[6];
      for (int i = 0; i <= arr.length - 1; i++) {
         pick[i] = sc.nextInt();
      }
      int count = 0;
      for (int i = 0; i <= arr.length - 1; i++) {
         for (int j = 0; j <= arr.length - 1; j++) {

            if (pick[i] == arr[j]) {
               count++;
            }
         }
      }System.out.print("�̹�ȸ�� ��÷ ��ȣ :  ");
      for (int i = 0; i <= arr.length - 1; i++)
         System.out.print(arr[i] + " ");

      System.out.println("���� ������ : "+count);
if(count==6) {System.out.println("��÷ �Ǽ̽��ϴ�.");}
else {System.out.println("���� ��ȸ��");}      
   }
}
*/

/*package Array;

import java.util.Scanner;

public class test {
   private static int n;
   private static int count;
   private static int number[] = new int[6];
   private static int want[] = new int[6];
   private static int index[] = new int[10];
   private static Scanner sc = new Scanner(System.in);
   
   
   private static void rotto() {
      for(int i=0;i<6;i++) {
         double r = Math.random();
         n = (int)(r*45)+1;
         for(int j=0;j<6;j++) {
            if(n == number[j]) {
               n = (int)(r*45)+1;
               number[i] = n;
               j=0;
            }
         }
         number[i] = n;
      }
   }
   
   private static void choose() {
      for(int i=0;i<6;i++) {
        System.out.print("��ȣ �Է� : ");
        want[i] = sc.nextInt();
        if(want[i] <= 0 || want[i] > 45) {
           System.out.println("1~45���̷� �Է����ּ���.");
           i--;
        }
      }
   }   
   
   private static void draw() {
      for(int i=0;i<6;i++) {
         for(int j=0;j<6;j++) {
            if(number[j] == want[i]) {
               count++;
            }
         }
      }

   }   
   
   private static void result() {
      for(int i=0;i<6;i++) {
         System.out.print(number[i] + " ");
      }
      System.out.println();
      for(int i=0;i<6;i++) {
         System.out.print(want[i] + " ");
      }
      System.out.println("\ncount : " + count);
      if(count == 6)
         System.out.println("1�� ��÷ : 2,023,170,188��(���� ����)");
      else if(count == 5)
         System.out.println("2�� ��÷ : 56,990,710��(���� ����)");
      else if(count == 4)
         System.out.println("3�� ��÷ : 1,526,921��");
      else if(count <= 3)
         System.out.println("���Դϴ�. ���� ��ȸ��....");
   }
   
   private static void search() {
      for(int i=0;i<10;i++) {
         index[i] = i+1;
      }
      System.out.print("ã�� ����? : ");
      int c = sc.nextInt();
      int i = 0;
      for(i=0;i<10;i++) {
         if(c == index[i]) {
            System.out.println((i + 1) +"��°�� ���� �ֽ��ϴ�.");    
            break;
         }
      }
      if(i == index.length)
         System.out.println("���� ã�� �� �����ϴ�.");
   }
    
   private static void game() {
      boolean trigger = true;
      int c = 0;
      System.out.println("���� ���߱� �����Դϴ�. �����Ϸ��� 0�� �Է��Ͻÿ�.");
      while(trigger) {
         for(int i=0;i<10;i++) {
            double r = Math.random();
            n = (int)(r*9)+1;
         }
         System.out.print("���� �Է� : ");
         int m = sc.nextInt();
         if(m == n) {
            System.out.println("�����Դϴ�.");
            c++;
            System.out.println("���� ���� : " + n + "\n�Է� ���� : " + m + "\n���� Ƚ�� : " + c);
         }
         else {
            System.out.println("Ʋ�Ƚ��ϴ�.");
            System.out.println("���� ���� : " + n + "\n�Է� ���� : " + m + "\n���� Ƚ�� : " + c);
         }
         if(m == 0)
            trigger = false;
      }
   }
   public static void main(String[] args) {            
      rotto();
      choose();
      draw();
      result();      
      search();      
      game();
   } 
         
}

*/