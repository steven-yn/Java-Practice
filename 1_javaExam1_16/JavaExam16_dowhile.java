import java.io.IOException;
import java.util.Scanner;

// do ~ while문 처리
public class JavaExam16_dowhile {

	public static void main(String[] args) throws IOException {
		/*
		 * int i=0;
		 * 
		 * do { String str = "이젠컴퓨터아카데미"; System.out.println(str);// i++;//1 => 2 => 3
		 * => 4 => 5
		 * 
		 * // 5 < 5 => false }while(i < 5);
		 * 
		 * //여기로 탈출....
		 * 
		 * 
		 * 
		 * // 문제> 3명의 성적을 입력받아서, 학점을 출력하세요. Scanner sc = new Scanner(System.in); int i2
		 * = 0;
		 * 
		 * do { System.out.println("성적을 입력해 주세요 : "); int score = sc.nextInt();
		 * 
		 * if (score >= 90) System.out.println("점수가 90점 이상이고, A학점 입니다."); else if (score
		 * >= 80) System.out.println("점수가 80점 이상이고, B학점 입니다."); else if (score >= 70)
		 * System.out.println("점수가 70점 이상이고, C학점 입니다."); else if (score >= 60)
		 * System.out.println("점수가 60점 이상이고, D학점 입니다."); else {
		 * System.out.println("F학점 입니다."); } i2++; } while (i2 < 3); // 여기로 탈출합니다.
		 * 
		 * 
		 * //문제> 1~100사이의 홀수의 합과 짝수의 합을 구하여 합계를 출력하세요. // 홀수의 합: 2500, 짝수의 합: 2550, 합계 :
		 * 5050 int even=0, odd=0; int i4=1;
		 * 
		 * do { if(i4 % 2 == 0) //짝수이면 even+=i4; else odd+=i4;//홀수이면
		 * 
		 * i4++; }while(i4 <= 100);
		 * 
		 * System.out.println("짝수: " + even); System.out.println("홀수: " + odd);
		 * System.out.println("총합계 : " + (even + odd));
		 * 
		 * Scanner sc = new Scanner(System.in); int i2=0;
		 * 
		 * do { System.out.println("첫번째 숫자를 입력하세요."); int value1 = sc.nextInt();// 100
		 * System.out.println("두번째 숫자를 입력하세요."); int value2 = sc.nextInt();// 50
		 * 
		 * int sum2 = value1 + value2;//덧셈 int sum3 = value1 - value2;//뺄셈 int sum4 =
		 * value1 * value2;//곱셈 int sum5 = value1 / value2;//나눗셈: 몫 구하기 int sum6 =
		 * value1 % value2;//나뭇셈: 나머지 구하기
		 * 
		 * System.out.println("두 수(value1+value2)의 합계는 = " + sum2);
		 * System.out.println("두 수(value1-value2)의 합계는 = " + sum3);
		 * System.out.println("두 수(value1*value2)의 합계는 = " + sum4);
		 * System.out.println("두 수(value1/value2)의 합계는 = " + sum5);
		 * System.out.println("두 수(value1%value2)의 합계는 = " + sum6);
		 * 
		 * i2++; }while(i2 < 3);
		 * 
		 * Scanner sc = new Scanner(System.in); int i=0;
		 * 
		 * do { char charUpper = sc.next().charAt(1);// 대문자 65 = A char charLower =
		 * sc.next().charAt(2);// 소문자 97 = a char charDigit = sc.next().charAt(3);// 숫자
		 * 0 = 48
		 * 
		 * if((charUpper >= 65) && (charUpper<=90)) { System.out.println(charUpper);
		 * System.out.println("대문자 이군요.~"); }
		 * 
		 * if((charLower >= 97) && (charLower<= 122)) { System.out.println(charLower);
		 * System.out.println("소문자 이군요.~"); }
		 * 
		 * if(!(charDigit < 48) && !(charDigit > 57)) { System.out.println(charDigit);
		 * System.out.println("0~9사이의 숫자 이군요.~"); } i++; }while(i < 3);
		 * 
		

		// switch ~ case의 반복 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("반복처리할 횟수를 입력해 주세요.");
		int count = sc.nextInt();// 3

		int scount = 0;//처리된 횟수

		do {
			int jumsu = sc.nextInt();//

			switch (jumsu / 10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");

				scount++;//1+1=2+1=3
			}			
			
			//   3 < 3
		}while(scount < count);
	
		
		boolean result = true;
		int keycode = 0;
		int speed = 0;

		do {
			if (keycode != 13 && keycode != 10) {
				System.out.println("---Menu----");
				System.out.println("1. 증속");// 1 => 49
				System.out.println("2. 감속");// 2 => 50
				System.out.println("3. 중지");// 3 => 51
				System.out.println("-----------");
				System.out.println("selected : ");
			}

			keycode = System.in.read();

			if (keycode == 49) { // menu 번호가 1번을 선택했으면,
				speed += 10;
				System.out.println("현재 속도는 : " + speed);
			} else if (keycode == 50) { // menu 번호가 2번을 선택했으면,
				speed -= 10;
			}else if (keycode == 51){
				System.out.println("Program Ending!!!");	// menu 번호가 3번을 선택했으면,
				//break;
				result = false;
			}			
		}while(result);
		// 여기로 탈출 부분.
			
	
		String inputString;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("인사말을 입력해 주세요.");
			inputString = sc.nextLine();// "안녕하세요", column => 80
		System.out.println(inputString);//안녕하세요
		
		}while(!inputString.equals("stop"));
		
		//난수 발생
		while(true) {
		int num = (int) (Math.random()*6); // 0~5까지의 난수 발생
		int num2 = (int) (Math.random()*6+1);// 1~6 사이의 난수 발생 
		
		System.out.println(num);
		System.out.println(num2); 
		
		if(num == 5 && num2 == 6) break;
		
		}
		
		
		int count = 0;
		
		while(count < 6) {
			int num2 = (int) (Math.random()*6+1);// 1~6 사이의 난수 발생 
			
			System.out.println(num2); 				
			count++;						
			}
		
	// DBMS = DB = oracle = 대용량 데이터베이스 솔루션
	// table : student, insa, 
	//attribute : number, name, kor, eng, mat, total....	
		
		
	// DBMS : ms-sql, mysql, AIX......
	// DB = student DB, insa DB.....
	// table : student, insa, 
	//attribute : number, name, kor, eng, mat, total....
		
	//continue 명령문 실행
		for(int i=0; i<=10; i++) {
			
			if(i%2 != 0) { // 홀수이면
				continue;// 건너뛰어라, SKIP
			}
			System.out.println(i);//짝수이면 출력
		}
	
		
	//문제> 임의의 숫자를 입력 받아서, 그 숫자가 홀수이거나 짝수이면 출력하고, 0이면 건너뛰세요.	
				
		for(int i=0; i<5; i++) {
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			
			if(number == 0) { // 홀수이면
				continue;// 건너뛰어라, SKIP
			}else if(number %2 == 0) {
			System.out.println(number + " : 짝수");//짝수이면 출력
			
			}else
				System.out.println(number + " : 홀수");
		}
		 */
		
	//문제> 1부터 10사이에 숫자중에서 5를 만나면 건너뛰고, 아니면 홀수와 짝수는 합계를 구하여 출력하세요.
	// 1~10 : 55, 5 => 50
		int odd=0, even=0;
		
		for(int i2=1; i2<=10; i2++) {
			
			if(i2 == 5) { // 홀수이면
				continue;// 건너뛰어라, SKIP
			}else if(i2 %2 == 0) {
				even+=i2;
			System.out.println(i2 + " : 짝수");//짝수이면 출력
			
			}else {
				odd+=i2;
				System.out.println(i2 + " : 홀수");	
			}
		}
		
		System.out.println("총합은 : " + (odd+even));
				
	}

}
