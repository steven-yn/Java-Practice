import java.util.Scanner;

// while �ݺ��� : ���ǽ��� ���̸� ����
public class JavaExam12_4chapter {

	public static void main(String[] args) {
		//����1> ������ǻ�;�ī���̶�� ���ڿ��� 5�� �ݺ��Ͽ� ����ϼ���.
		//  
		int i=0;//�ʱⰪ ����
		
		//        5 < 5
			while(i < 5) {  
			String str = "������ǻ�;�ī����";
			System.out.println(str);//
			i++;// 1 ����, 1, 2, 3, 4, 5
			}
			//����� Ż���մϴ�.
			
	//����2> 1~100������ 3�ǹ���� ���Ͽ� ������ ����� ����ϰ�, �հ赵 ����ϼ���.
	// while(       )�ذ�
		int su=3, count=0, sum=0;
				
		//     9 < 100
		while(su < 100) {
						
				count++;//1, 2, 3
				sum+=su;// 0+3=3, 3+6=9, 9+9=18, 
				System.out.println("��ȣ: " + count + " " + "���� : " + su); 
				su+=3;	//3+3=6, 6+3=9, 9+3=12			
		}
		System.out.println("3�� ����� ���� : " + count);//33
		System.out.println("3�� ����� �հ� : " + sum);//1683	
			
		//����3> 7���� ������ �Է¹޾Ƽ�, ������ ����ϼ���.
				Scanner sc = new Scanner(System.in);				
				int i2=0;
				
				while(i2 < 7) {  // ���ǽ��� ���� ��쿡�� �ݺ��ϴٰ� ������ �Ǹ� ������ �����մϴ�.
					System.out.println("������ �Է��� �ּ��� : ");
				int score = sc.nextInt();// 96, 45, 88, 34, 100, 67, 76
			
				if(score>=90) 
					System.out.println("������ 90�� �̻��̰�, A���� �Դϴ�.");				
				else if(score>=80) 
					System.out.println("������ 80�� �̻��̰�, B���� �Դϴ�.");				
				else if(score>=70) 
					System.out.println("������ 70�� �̻��̰�, C���� �Դϴ�.");			
				else if(score>=60) 
					System.out.println("������ 60�� �̻��̰�, D���� �Դϴ�.");
				else {
					System.out.println("F���� �Դϴ�.");
				}
				// ����� Ż���մϴ�.
				 i2++;
				
				
	//����4> for���� �̿��Ͽ� �������� ����ϼ���. ����for�� �̿�.
		
		for(int i3=2; i3<=9; i3++) {  // ��, 2~9
			System.out.println("*****" + i3 + "��" + "*****");
			for(int j=1; j <=9; j++) {
				System.out.println(i3 + "*" + j + "=" + (i3*j));//
			}
			System.out.println();//�ٹٲ�			
		}
				
	//����5> 1~100������ Ȧ���� �հ� ¦���� ���� ���Ͽ� �հ踦 ����ϼ���.
	// Ȧ���� ��: 2500
	// ¦���� ��: 2550
	// �հ� : 5050
		int even=0, odd=0;
		
		for(int i4=1; i4 <= 100; i4++) {
			
			if(i4 % 2 == 0) //¦���̸�
				even+=i4;
			else
				odd+=i4;//Ȧ���̸�			
		}
		System.out.println("¦��: " + even); 
		System.out.println("Ȧ��: " + odd); 
		System.out.println("���հ� : " + (even + odd)); 						
	}
	
	//1~5������ �հ� ���ϱ�
	int sum2=0;
	int i5=1;
	
	for(     ;  i5<=5    ;      ) {	
		sum2+=i5;
		i5++;
		System.out.println(sum2);//15
	}
	
	
	}
	
}
