import java.util.Scanner;

//do ~ while��: ��� �ѹ��� �����մϴ�.

public class javaExam14_4chapter {
//
	private static int su;//0, class variable
	private static int count;//0
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		
		do {					
			System.out.println("������ �Է��� �ּ��� : ");
			int score = sc.nextInt();// 
							
			if(score>=90) 
				System.out.println("������ 90�� �̻��̰�, A���� �Դϴ�.");			
			else if(score>=80) 
				System.out.println("������ 80�� �̻��̰�, B���� �Դϴ�.");			
			else if(score>=70) 
				System.out.println("������ 70�� �̻��̰�, C���� �Դϴ�.");						
			else if(score>=60) 
				System.out.println("������ 60�� �̻��̰�, D���� �Դϴ�.");
			else 
				System.out.println("F���� �Դϴ�.");
				
				i++;//1, 2, 3
		}while(i < 3);	// 1 < 3		
			
		//����� Ż���մϴ�.
	*/
		Scanner sc = new Scanner(System.in);
		
		int i=0, sum=0;
		
		do {					
			System.out.println("���ڸ� �Է��� �ּ��� : ");
			 su = sc.nextInt();// 
			
			 if(su % 3 == 0) {
				count++;
				sum+=su;
				System.out.println("��ȣ: " + count + " " + "���� : " + su); 
			 }
			 i++;
		}while(i < 5);
		System.out.println("3�� ����� ���� : " + count);
		System.out.println("3�� ����� �հ� : " + sum);
		
				
	} // main end

} //class end
