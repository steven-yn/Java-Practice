import java.util.Scanner;

//do ~ while문: 적어도 한번은 실행합니다.

public class javaExam14_4chapter {
//
	private static int su;//0, class variable
	private static int count;//0
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		
		do {					
			System.out.println("성적을 입력해 주세요 : ");
			int score = sc.nextInt();// 
							
			if(score>=90) 
				System.out.println("점수가 90점 이상이고, A학점 입니다.");			
			else if(score>=80) 
				System.out.println("점수가 80점 이상이고, B학점 입니다.");			
			else if(score>=70) 
				System.out.println("점수가 70점 이상이고, C학점 입니다.");						
			else if(score>=60) 
				System.out.println("점수가 60점 이상이고, D학점 입니다.");
			else 
				System.out.println("F학점 입니다.");
				
				i++;//1, 2, 3
		}while(i < 3);	// 1 < 3		
			
		//여기로 탈출합니다.
	*/
		Scanner sc = new Scanner(System.in);
		
		int i=0, sum=0;
		
		do {					
			System.out.println("숫자를 입력해 주세요 : ");
			 su = sc.nextInt();// 
			
			 if(su % 3 == 0) {
				count++;
				sum+=su;
				System.out.println("번호: " + count + " " + "숫자 : " + su); 
			 }
			 i++;
		}while(i < 5);
		System.out.println("3의 배수의 갯수 : " + count);
		System.out.println("3의 배수의 합계 : " + sum);
		
				
	} // main end

} //class end
