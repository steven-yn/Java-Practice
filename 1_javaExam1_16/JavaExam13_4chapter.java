import java.util.Scanner;

//while문
public class JavaExam13_4chapter {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		//           3 < 3   0+1=1+1=2=1=3
		for(int i=0; i < 3; i++) {
		System.out.println("첫번째 숫자를 입력하세요.");
		int value1 = sc.nextInt();// 100
		System.out.println("두번째 숫자를 입력하세요.");
		int value2 = sc.nextInt();// 50
		
		int sum2 = value1 +  value2;//덧셈
		int sum3 = value1 - value2;//뺄셈
		int sum4 = value1 * value2;//곱셈
		int sum5 = value1 / value2;//나눗셈: 몫 구하기
		int sum6 = value1 % value2;//나뭇셈: 나머지 구하기
		
		System.out.println("두 수(value1+value2)의 합계는 = " + sum2);
		System.out.println("두 수(value1-value2)의 합계는 = " + sum3);
		System.out.println("두 수(value1*value2)의 합계는 = " + sum4);
		System.out.println("두 수(value1/value2)의 합계는 = " + sum5);
		System.out.println("두 수(value1%value2)의 합계는 = " + sum6);
		
		}
		//여기로 탈출
		
		int i2=0;
		//      3 < 3 => false
		while( i2 < 3) {
			System.out.println("첫번째 숫자를 입력하세요.");
			int value1 = sc.nextInt();// 100
			System.out.println("두번째 숫자를 입력하세요.");
			int value2 = sc.nextInt();// 50
			
			int sum2 = value1 +  value2;//덧셈
			int sum3 = value1 - value2;//뺄셈
			int sum4 = value1 * value2;//곱셈
			int sum5 = value1 / value2;//나눗셈: 몫 구하기
			int sum6 = value1 % value2;//나뭇셈: 나머지 구하기
			
			System.out.println("두 수(value1+value2)의 합계는 = " + sum2);
			System.out.println("두 수(value1-value2)의 합계는 = " + sum3);
			System.out.println("두 수(value1*value2)의 합계는 = " + sum4);
			System.out.println("두 수(value1/value2)의 합계는 = " + sum5);
			System.out.println("두 수(value1%value2)의 합계는 = " + sum6);
			
			i2++;//0+1=1+1=2+1=3
			}
			//여기로 탈출
		
		
		Scanner sc = new Scanner(System.in);
		         
		for(int i=0; i < 6; i++) {
			System.out.println("첫번째 숫자를 입력하세요.");
			int a = sc.nextInt();// 50
			System.out.println("두번째 숫자를 입력하세요.");
			int b = sc.nextInt();// 75
			System.out.println("세번째 숫자를 입력하세요.");
			int c = sc.nextInt();// 100
		
		//     false     false
		//   50>=75    50>=100
			if(a>=b && a>=c) {
				System.out.println(a + " 값이 가장 큽니다.");//
				//    true    false
				//   75>=50 75>=100
			}else if(b>=a && b>=c){
					System.out.println(b + " 값이 가장 큽니다.");//
					
				// true       true
				//   100>=50 100>=75	
			}else if(c>=a && c>=b){
				System.out.println(c + " 값이 가장 큽니다.");//100
			}
		}
		
		
		for(int i=0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			
			int age = sc.nextInt();//34
			String name = sc.next();//현대빈
			System.out.println("나이는 " + age + "이고, 이름은 " + name + "입니다.");
		}
		
		int i=0;
		
		while( i < 3) {
			Scanner sc = new Scanner(System.in);
			
			int age = sc.nextInt();//34
			String name = sc.next();//현대빈
			System.out.println("나이는 " + age + "이고, 이름은 " + name + "입니다.");
			
			i++;
		}
		
				
	// for, while문 2가지방법으로 구현하세요.
		
		for(int i=0; i < 3; i++) {
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();// 56
				
		String dec2 = Integer.toBinaryString(dec);//2진수 변환
		String oct = Integer.toOctalString(dec);//8진수
		String hex = Integer.toHexString(dec);//16진수
		
		System.out.println(dec2);//56
		System.out.println(oct);//070
		System.out.println(hex);//0x38		
		}
		
		System.out.println("--- 위에서는 for문이고, 아래문장은 while문 입니다.-----------");
		int i=0;
		
		while(i < 3) {
			Scanner sc = new Scanner(System.in);
			int dec = sc.nextInt();// 56
					
			String dec2 = Integer.toBinaryString(dec);//2진수 변환
			String oct = Integer.toOctalString(dec);//8진수
			String hex = Integer.toHexString(dec);//16진수
			
			System.out.println(dec2);//1001110
			System.out.println(oct);//070
			System.out.println(hex);//0x38	
			
			i++;
			}
		
		
	// 10진수를 입력하여, 2진수, 8진수, 16진수 값을 알아냈습니다.
	// 반대로, 알아낸 값으로 다시 10진수를 표현해 보세요.
		
		for(int i=0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			int dec = sc.nextInt();// 56
					
			String dec2 = Integer.toBinaryString(dec);//2진수 변환
			String oct = Integer.toOctalString(dec);//8진수
			String hex = Integer.toHexString(dec);//16진수
			
			System.out.println(dec2);//56
			System.out.println(oct);//070
			System.out.println(hex);//0x38		
			
			// 여기에서는 2진수, 8진수, 16진수 값을 사용하여 10진수로 표현합니다.
			
			int Decimal = Integer.parseInt(dec2, 2);
			int Octal = Integer.parseInt(oct, 8);
			int HexDecimal = Integer.parseInt(hex, 16);			
			
			System.out.println(Decimal);//56
			System.out.println(Octal);//56
			System.out.println(HexDecimal);//56	
			}
			
			System.out.println("--- 위에서는 for문이고, 아래문장은 while문 입니다.-----------");
			int i=0;
			
			while(i < 3) {
				i++;
				
				Scanner sc = new Scanner(System.in);
				int dec = sc.nextInt();// 56
						
				String dec2 = Integer.toBinaryString(dec);//2진수 변환
				String oct = Integer.toOctalString(dec);//8진수
				String hex = Integer.toHexString(dec);//16진수
				
				System.out.println(dec2);//1001110
				System.out.println(oct);//070
				System.out.println(hex);//0x38	
				
				int Decimal = Integer.parseInt(dec2, 2);
				int Octal = Integer.parseInt(oct, 8);
				int HexDecimal = Integer.parseInt(hex, 16);			
				
				System.out.println(Decimal);//56
				System.out.println(Octal);//56
				System.out.println(HexDecimal);//56
				}
			
		
	//--------------------------------------------------------------------
		
		for(int i=0; i < 3; i++) {
		Scanner sc = new Scanner(System.in);
		//								index, 1byte를 읽어서 표햔해 줍니다.
		char charUpper = sc.next().charAt(1);// 대문자 65 = A
		char charLower = sc.next().charAt(2);// 소문자 97 = a
		char charDigit = sc.next().charAt(3);// 숫자 0 = 48
		
			if((charUpper >= 65) && (charUpper<=90)) {
				System.out.println(charUpper); 
				System.out.println("대문자 이군요.~");
			}
			
			if((charLower >= 97) && (charLower<= 122)) {
				System.out.println(charLower); 
				System.out.println("소문자 이군요.~");
			}

			if(!(charDigit < 48) && !(charDigit > 57)) {
				System.out.println(charDigit); 
				System.out.println("0~9사이의 숫자 이군요.~");
			}
			
		}
			
		
		
		//배수 : 어떤 수를 3으로 나누었을 때, 0이 나오면 3의 배수가 됩니다.
		Scanner sc = new Scanner(System.in);
		int i = 0, count=0;
		
		while(i < 10) {
			int value = sc.nextInt();//9, 99, 777, 6, 3, 12, 15, 21, 24, 1
				
			if(value % 3 == 0) {
				count++;
				System.out.println("숫자는 3의 배수 입니다.");
			} else { 
				System.out.println("3의 배수가 아닙니다.");
			}
			i++;
		}
			System.out.println("3의 배수  : " + count);
	
		
	//문제1> 임의의 숫자를 10개 입력 받아서, 그 숫자가 0인지, 홀수인지, 짝수인지를 판별하여 출력하세요.
	// while문 작성		
				
		Scanner sc = new Scanner(System.in);
		System.out.println("반복처리할 횟수를 입력해 주세요.");
		int count = sc.nextInt();// 5
		
		int scount = 0;
		
		while(scount < count) {
			int su = sc.nextInt();
		
		if(su == 0)
			System.out.println("숫자는 0입니다.");
		else if(su % 2 == 0)
			System.out.println("숫자는 짝수입니다.");
		else 
			System.out.println("숫자는 홀수입니다.");
		
		scount++;
		
		if(scount == count)
			break;
		}
			
		
	// 학점 구하기: 반복 횟수 6번
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복처리할 횟수를 입력해 주세요.");
		int count = sc.nextInt();// 6
		
		int scount = 0;
		
		while(scount < count) {
			int score = sc.nextInt();
				
		char grade = (score>=90)? 'A':(score>=80)? 'B':(score>=70)? 'C':(score>=60)? 'D':'F';
				System.out.println("학점 결과는 : " + grade);
				
				scount++;
				
				if(scount == count)
					break;					
			}
	*/
		
		// switch ~ case의 반복 처리
		int scount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복처리할 횟수를 입력해 주세요.");
		int count = sc.nextInt();// 6
		
		while(true) {
		int jumsu = sc.nextInt();// 
		
		switch(jumsu / 10) {
		case 10:
		case 9: System.out.println("A학점"); break;
		case 8: System.out.println("B학점"); break;
		case 7: System.out.println("C학점"); break;
		case 6: System.out.println("D학점"); break;
			default: 
				System.out.println("F학점");	
		
				scount++;//1
				
			if(scount == count)	// 6 == 6
				break;//반복문이나 무한루프를 탈출 용도 사용
		}	
		}
		//여기로 탈출
	}

}
