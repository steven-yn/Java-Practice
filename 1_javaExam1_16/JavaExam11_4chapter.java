import java.util.Scanner;

// �ݺ��� : Ư�� ������ �ݺ��մϴ�.
/*
 * for(�ʱⰪ; ���ǽ�; ������) : ���� ���� ���˴ϴ�.
 * 
 * whlie(���ǽ�) {  .... } : 2��° ���� ���
 * 
 * do {
 *   ......
 *   }while(���ǽ�)
 * 
 */
public class JavaExam11_4chapter {

	public static void main(String[] args) {
		//����> 7���� ������ �Է¹޾Ƽ�, ������ ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		// ������ ������ ��κ��� �ʱⰪ�� 0���� �մϴ�.
		// ������ �������� ��κ��� �ʱⰪ�� 1�� �մϴ�.
		
		//   �ʱⰪ   7 < 7    7
		for(int i=0; i < 7; i++) {  // ���ǽ��� ���� ��쿡�� �ݺ��ϴٰ� ������ �Ǹ� ������ �����մϴ�.
			System.out.println("������ �Է��� �ּ��� : ");
		int score = sc.nextInt();// 96, 45, 88, 34, 100, 67, 76
				
		  // 76 >= 90
		if(score>=90) 
			System.out.println("������ 90�� �̻��̰�, A���� �Դϴ�.");
		//      76 >= 80
		else if(score>=80) 
			System.out.println("������ 80�� �̻��̰�, B���� �Դϴ�.");
		//       76 >= 70
		else if(score>=70) 
			System.out.println("������ 70�� �̻��̰�, C���� �Դϴ�.");
		
		//       67 >= 60
		else if(score>=60) 
			System.out.println("������ 60�� �̻��̰�, D���� �Դϴ�.");
		else {
			System.out.println("F���� �Դϴ�.");
		}
		// ����� Ż���մϴ�.
		}
		
	//����1> 1~100������ 3�ǹ���� ���Ͽ� ������ ����� ����ϰ�, �հ赵 ����ϼ���.
	// for(       )�ذ�
		int count=0, sum=0;
		
		for(int su=3; su <=100; su+=3) {
				
				count++;
				sum+=su;
				System.out.println("��ȣ: " + count + " " + "���� : " + su); 
			
		}
		System.out.println("3�� ����� ���� : " + count);
		System.out.println("3�� ����� �հ� : " + sum);
		
		
	//����2> ������ǻ�;�ī���̶�� ���ڿ��� 5�� �ݺ��Ͽ� ����ϼ���.
	//  
		for(int i=0; i < 5; i++) {  
		String str = "������ǻ�;�ī����";
		System.out.println(str);//
		}
		
		
		
	}

}
