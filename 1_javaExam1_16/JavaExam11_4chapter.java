import java.util.Scanner;

// 반복문 : 특정 조건을 반복합니다.
/*
 * for(초기값; 조건식; 증감식) : 가장 많이 사용됩니다.
 * 
 * whlie(조건식) {  .... } : 2번째 많이 사용
 * 
 * do {
 *   ......
 *   }while(조건식)
 * 
 */
public class JavaExam11_4chapter {

	public static void main(String[] args) {
		//조건> 7명의 성적을 입력받아서, 학점을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		// 덧셈과 뺄셈은 대부분은 초기값을 0으로 합니다.
		// 곱셈과 나눗셈은 대부분은 초기값을 1로 합니다.
		
		//   초기값   7 < 7    7
		for(int i=0; i < 7; i++) {  // 조건식이 참인 경우에는 반복하다가 거짓이 되면 실행을 중지합니다.
			System.out.println("성적을 입력해 주세요 : ");
		int score = sc.nextInt();// 96, 45, 88, 34, 100, 67, 76
				
		  // 76 >= 90
		if(score>=90) 
			System.out.println("점수가 90점 이상이고, A학점 입니다.");
		//      76 >= 80
		else if(score>=80) 
			System.out.println("점수가 80점 이상이고, B학점 입니다.");
		//       76 >= 70
		else if(score>=70) 
			System.out.println("점수가 70점 이상이고, C학점 입니다.");
		
		//       67 >= 60
		else if(score>=60) 
			System.out.println("점수가 60점 이상이고, D학점 입니다.");
		else {
			System.out.println("F학점 입니다.");
		}
		// 여기로 탈출합니다.
		}
		
	//문제1> 1~100사이의 3의배수를 구하여 갯수가 몇개인지 출력하고, 합계도 출력하세요.
	// for(       )해결
		int count=0, sum=0;
		
		for(int su=3; su <=100; su+=3) {
				
				count++;
				sum+=su;
				System.out.println("번호: " + count + " " + "숫자 : " + su); 
			
		}
		System.out.println("3의 배수의 갯수 : " + count);
		System.out.println("3의 배수의 합계 : " + sum);
		
		
	//문제2> 이젠컴퓨터아카데미라는 문자열을 5번 반복하여 출력하세요.
	//  
		for(int i=0; i < 5; i++) {  
		String str = "이젠컴퓨터아카데미";
		System.out.println(str);//
		}
		
		
		
	}

}
