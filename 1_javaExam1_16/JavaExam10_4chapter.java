import java.util.Scanner;

// 조건문, 반복문
public class JavaExam10_4chapter {

	public static void main(String[] args) {
		//1.if문
		//2.if ~ else
		//3.if ~ else if
		//4.if ~ if ~ if.....
		
		/*
		if(조건식) {  // 중괄호 사용 : 복문(중문) : 실행할 문장이 여러개인 경우에
			실행문;
			실행문;
			//.....
		}
		*/
		
		/*  단문
		if(조건식)
			실행문;
		*/
		int score = 77;
		
		if(score>=90) 
			System.out.println("점수가 90점 이상이고, A학점 입니다.");
		
		
		//3.if ~ else ~if else....
		
		if(score>=90) 
			System.out.println("점수가 90점 이상이고, A학점 입니다.");
		else if(score>=80)
			System.out.println("점수가 80점 이상이고, B학점 입니다.");
		else
			System.out.println("점수가 70점 이상이고, C학점 입니다.");
		
		// random()
		int num = (int) (Math.random()*45);//0~44
		
		int num2 = (int) (Math.random()*45) + 1;//1~45
		
		//4.중첩 if문  
		
	//5. switch ~ case : if문의 복잡성을 단순화시켜 사용하려고 할 때(3,4번 if문이 복잡할 경우에 사용)
		int jumsu = 77;
		
		switch(jumsu / 10) {
		case 10:
		case 9: System.out.println("A학점"); break;
		case 8: System.out.println("B학점"); break;
		case 7: System.out.println("C학점"); break;
		case 6: System.out.println("D학점"); break;
			default: 
				System.out.println("F학점");	
		}		
		
		//문제> 달을 입력 받아서 switch ~ case를 이용하여  봄, 여름, 가을, 겨울을 출력하세요.
		// 처리조건>
		// 1.달을 입력 받아서 
		// 2.switch ~ case를 이용하여 
		// 3. 봄, 여름, 가을, 겨울을 출력하세요.
		// 4. 질문? 
		// 5. 공부 ?
		// 6. 연구 ?
		// 프로그래머는 고도의 정신적인 노동을 하는 직업 : 공부
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();		
		
		switch(month) {
		case 3: System.out.println("봄.....");
		case 4: System.out.println("봄.....");
		case 5: System.out.println("봄....."); break;
		case 6:
		case 7:
		case 8: System.out.println("여름...."); break;
		case 9:
		case 10:
		case 11: System.out.println("가을...."); break;
		case 12:
		case 1:
		case 2: System.out.println("겨울...."); break;
		
		
		}
		
		
	}

}
