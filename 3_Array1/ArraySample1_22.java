package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 문제1> 랜덤클래스 이용
 * 로또 복권 프로그램을 작성합니다.
 * 데이터는 1 ~ 45까지 범위가 됩니다. 
 * 먼저 컴퓨터가 난수를 발생하여 복권 번호를 생성합니다.
 * 그리고 사용자가 복권 번호를 입력합니다.
 * - 데이터는 정수형 입니다.
 * - 반복문 사용
 * - 복권 번호가 중복 되지 않도록 합니다.
 * - 컴퓨터 난수 발생 번호 : 1 45 33 12 29 38
 * - 사용자가 입력한 번호 : 45 33 12 40 8 7
 * - 1등에 당첨이 되면 "축하 드립니다. 1억 5천만 $에 당첨되셨습니다.
 * - 떨어졌으면 "아쉽습니다. 다음 기회에 ...."
 * 
 * 추가 구현>
 * 1.로또 6개 마추면 1등 => 구현완료
 * 2.로또 5개 + 보너스 번호 : 2등
 * 3.로또 5개 : 3등
 * 4.로또 4개 : 4등
 * 5.로또 3개 : 5등
 */
public class ArraySample1_22 {
	private static int n;
	private static int lottoDataTest[];
	private static int lottoUserDataTest[];
	private static Scanner sc = new Scanner(System.in);

	static void lottoDataSuInput() {
		System.out.println("lotto배열에 저장할 데이터 갯수를 입력해 주세요.");
		n = sc.nextInt();//6개

		lottoDataTest = new int[n];
	}

	static void lottoDataInput() {
		Random rand = new Random();
		
		for (int i = 0; i < lottoDataTest.length; i++) {
			lottoDataTest[i] = rand.nextInt(45) + 1;//1~45번호 생성
			
			for(int j=0; j < i; j++) { //중복 난수 데이터 제거
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
			System.out.println("lotto배열에 저장할 데이터를 입력해 주세요.");
			lottoUserDataTest[i] = sc.nextInt();
			
			System.out.println("사용자 데이터 = " + lottoUserDataTest[i] + " "); 
			}
	}
	
	private static void lottoUserDataTest() {
		Arrays.sort(lottoDataTest);//ascending sort
		Arrays.sort(lottoUserDataTest);

		//비교
		boolean result = Arrays.equals(lottoDataTest, lottoUserDataTest);
		
		if(result == true) 
			System.out.println("축하 드립니다. 1억 5천만 $에 당첨되셨습니다."); 
			else
				System.out.println("아쉽습니다. 다음 기회에 ...."); 	
	}
	
	public static void main(String[] args) {
		// lotto 배열에 입력할 데이터 수 입력
		lottoDataSuInput();
		// 컴퓨터에 의하여 난수 데이터 생성
		lottoDataInput();
		// 사용자 복권번호 입력
		lottoUserData();
		// 복권의 일치여부 확인
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
      }System.out.print("이번회차 당첨 번호 :  ");
      for (int i = 0; i <= arr.length - 1; i++)
         System.out.print(arr[i] + " ");

      System.out.println("맞춘 개수는 : "+count);
if(count==6) {System.out.println("당첨 되셨습니다.");}
else {System.out.println("다음 기회에");}      
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
        System.out.print("번호 입력 : ");
        want[i] = sc.nextInt();
        if(want[i] <= 0 || want[i] > 45) {
           System.out.println("1~45사이로 입력해주세요.");
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
         System.out.println("1등 당첨 : 2,023,170,188원(세금 포함)");
      else if(count == 5)
         System.out.println("2등 당첨 : 56,990,710원(세금 포함)");
      else if(count == 4)
         System.out.println("3등 당첨 : 1,526,921원");
      else if(count <= 3)
         System.out.println("꽝입니다. 다음 기회에....");
   }
   
   private static void search() {
      for(int i=0;i<10;i++) {
         index[i] = i+1;
      }
      System.out.print("찾을 값은? : ");
      int c = sc.nextInt();
      int i = 0;
      for(i=0;i<10;i++) {
         if(c == index[i]) {
            System.out.println((i + 1) +"번째에 값이 있습니다.");    
            break;
         }
      }
      if(i == index.length)
         System.out.println("값을 찾을 수 없습니다.");
   }
    
   private static void game() {
      boolean trigger = true;
      int c = 0;
      System.out.println("숫자 맞추기 게임입니다. 종료하려면 0을 입력하시오.");
      while(trigger) {
         for(int i=0;i<10;i++) {
            double r = Math.random();
            n = (int)(r*9)+1;
         }
         System.out.print("숫자 입력 : ");
         int m = sc.nextInt();
         if(m == n) {
            System.out.println("정답입니다.");
            c++;
            System.out.println("랜덤 숫자 : " + n + "\n입력 숫자 : " + m + "\n맞춘 횟수 : " + c);
         }
         else {
            System.out.println("틀렸습니다.");
            System.out.println("랜덤 숫자 : " + n + "\n입력 숫자 : " + m + "\n맞춘 횟수 : " + c);
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