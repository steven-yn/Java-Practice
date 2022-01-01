import java.util.Scanner;

// while 반복문 : 조건식이 참이면 실행
public class JavaExam12_4chapter {

	public static void main(String[] args) {
		//문제1> 이젠컴퓨터아카데미라는 문자열을 5번 반복하여 출력하세요.
		//  
		int i=0;//초기값 설정
		
		//        5 < 5
			while(i < 5) {  
			String str = "이젠컴퓨터아카데미";
			System.out.println(str);//
			i++;// 1 증가, 1, 2, 3, 4, 5
			}
			//여기로 탈출합니다.
			
	//문제2> 1~100사이의 3의배수를 구하여 갯수가 몇개인지 출력하고, 합계도 출력하세요.
	// while(       )해결
		int su=3, count=0, sum=0;
				
		//     9 < 100
		while(su < 100) {
						
				count++;//1, 2, 3
				sum+=su;// 0+3=3, 3+6=9, 9+9=18, 
				System.out.println("번호: " + count + " " + "숫자 : " + su); 
				su+=3;	//3+3=6, 6+3=9, 9+3=12			
		}
		System.out.println("3의 배수의 갯수 : " + count);//33
		System.out.println("3의 배수의 합계 : " + sum);//1683	
			
		//문제3> 7명의 성적을 입력받아서, 학점을 출력하세요.
				Scanner sc = new Scanner(System.in);				
				int i2=0;
				
				while(i2 < 7) {  // 조건식이 참인 경우에는 반복하다가 거짓이 되면 실행을 중지합니다.
					System.out.println("성적을 입력해 주세요 : ");
				int score = sc.nextInt();// 96, 45, 88, 34, 100, 67, 76
			
				if(score>=90) 
					System.out.println("점수가 90점 이상이고, A학점 입니다.");				
				else if(score>=80) 
					System.out.println("점수가 80점 이상이고, B학점 입니다.");				
				else if(score>=70) 
					System.out.println("점수가 70점 이상이고, C학점 입니다.");			
				else if(score>=60) 
					System.out.println("점수가 60점 이상이고, D학점 입니다.");
				else {
					System.out.println("F학점 입니다.");
				}
				// 여기로 탈출합니다.
				 i2++;
				
				
	//문제4> for문을 이용하여 구구단을 출력하세요. 다중for문 이용.
		
		for(int i3=2; i3<=9; i3++) {  // 단, 2~9
			System.out.println("*****" + i3 + "단" + "*****");
			for(int j=1; j <=9; j++) {
				System.out.println(i3 + "*" + j + "=" + (i3*j));//
			}
			System.out.println();//줄바꿈			
		}
				
	//문제5> 1~100사이의 홀수의 합과 짝수의 합을 구하여 합계를 출력하세요.
	// 홀수의 합: 2500
	// 짝수의 합: 2550
	// 합계 : 5050
		int even=0, odd=0;
		
		for(int i4=1; i4 <= 100; i4++) {
			
			if(i4 % 2 == 0) //짝수이면
				even+=i4;
			else
				odd+=i4;//홀수이면			
		}
		System.out.println("짝수: " + even); 
		System.out.println("홀수: " + odd); 
		System.out.println("총합계 : " + (even + odd)); 						
	}
	
	//1~5까지의 합계 구하기
	int sum2=0;
	int i5=1;
	
	for(     ;  i5<=5    ;      ) {	
		sum2+=i5;
		i5++;
		System.out.println(sum2);//15
	}
	
	
	}
	
}
