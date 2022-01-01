
public class JavaExam1_default {

	public static void main(String[] args) {
		// 한 줄 주석
		/*
		 * 여러줄 주석
		 * 2021년 3월 10일 오전 10시53분 자바 수업
		 * 누가? 현대빈 강사
		 * 소스 편집 일자: 
		 * 컴파일 날짜:
		 */
		
		//1.데이터 : 문자(char), 문자열(String), 특수문자, 
		//숫자: 정수형(byte, short, int, long), 실수형 숫자(float, double)
		//자료형      변수      대입연산자  숫자(numeric)  연산자(Operator)  숫자
		//dataType  Variable
		   int       sum        =           3           +           4;
		   System.out.println("두 수(3+4)의 합계는 = " + sum);//ctrl + space 단축키
		//2.변수
		int value1 = 10;//지역변수1
		int value2 = 50;//지역변수2
		
		//산술 연산이라고 부릅니다.
		int sum2 = value1 +  value2;//덧셈
		int sum3 = value1 - value2;//뺄셈
		int sum4 = value1 * value2;//곱셈
		int sum5 = value1 / value2;//나눗셈: 몫 구하기
		int sum6 = value1 % value2;//나뭇셈: 나머지 구하기
		int sum7 = 7 / 3;
		System.out.println("두 수(value1+value2)의 합계는 = " + sum2);
		System.out.println("두 수(value1-value2)의 합계는 = " + sum3);
		System.out.println("두 수(value1*value2)의 합계는 = " + sum4);
		System.out.println("두 수(value1/value2)의 합계는 = " + sum5);
		System.out.println("두 수(value1%value2)의 합계는 = " + sum6);
		System.out.println("두 수(3/7)의 합계는 = " + sum7);
		   
		 //3.연산자(Operator) : value1 + value2 : 이항 연산
         // operand : 연산의 대상이 되는 것.
		 //1)산술 연산  
		 //2)관계(비교) 연산 : ==, !=, <, <=, >, >=
		// 0: 연산에 참여하지 않습니다. 거짓, false
		// 1: 연산에 참여합니다. 참, true
		
		/*-----------------------------
		 * A  B  and(&&)  or(||) not(!=)     exor
		 * ----------------------------
		 * 0  0   0   0   0 => 1   0
		 * 0  1   0   1   1 => 0   1
		 * 1  0   0   1            1
		 * 1  1   1   1            0
		 * ----------------------------
		 * 
		 * 임베디드, 시스템, 전기, 전자, 통신 프로그래머 : 
		 * 회로설계 => 플립플롭 회로도 작성 => 납땜 => 테스트 => 완성
		 * 
		 */
		int value3 = 123, value4 = 345;
			
		//      123   < 345
			if(value3 < value4) //1.단순조건문
				System.out.println("value2의 값이 더 큽니다.");
		
			if(value3 < value4) //2.단순조건문
				System.out.println("value2의 값이 더 큽니다.");
			else 
				System.out.println("value1이 크거나 같습니다.");
		
			//3.다중 조건문
			int jumsu = 78;
			
			if(jumsu >=90 && jumsu<=100)
				System.out.println("A 학점 입니다.");
				if(jumsu >=80 && jumsu<=89)
					System.out.println("B 학점 입니다.");
					if(jumsu >=70 && jumsu<=79)
						System.out.println("C 학점 입니다.");
						if(jumsu >=60 && jumsu<=69)
							System.out.println("D 학점 입니다.");
							else
								System.out.println("F 학점 입니다.");
			//4.다중조건문2
			if(jumsu >=90 && jumsu<=100)
				System.out.println("A 학점 입니다.");
			else if(jumsu >=80 && jumsu<=89)
				System.out.println("B 학점 입니다.");
				else if(jumsu >=70 && jumsu<=79)
					System.out.println("C 학점 입니다.");
						else if(jumsu >=60 && jumsu<=69)
								System.out.println("D 학점 입니다.");
						else
							System.out.println("F 학점 입니다.");
		//관계연산자	
			int a = 12, b=24, c=36;
			
			System.out.println(a != c);// true
			
		//3.논리 연산자	(&&, ||, !)
			//  true    false
			if(a<=b && b>=c) {
				System.out.println("b 값이 가장 큽니다.");
			}else {
				System.out.println("c 값이 가장 큽니다.");//
			}
			
			//  true    false
			if(a<=b || b>=c) {
				System.out.println("b 값이 가장 큽니다.");//
			}else {
				System.out.println("c 값이 가장 큽니다.");
			}
			
			//not : !
			// 12 < 24 => true => false
			if((a<b)) {
				System.out.println("a<b");
			}else {
				System.out.println("a>=b");//
			}
			
			
			
		 //4.조건문
		
		//5.반복문
		
		//6.배열 처리
		
		
		//7.자료구조 처리
	}

}
