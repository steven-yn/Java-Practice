import java.io.IOException;
import java.util.Scanner;

// do ~ while�� ó��
public class JavaExam16_dowhile {

	public static void main(String[] args) throws IOException {
		/*
		 * int i=0;
		 * 
		 * do { String str = "������ǻ�;�ī����"; System.out.println(str);// i++;//1 => 2 => 3
		 * => 4 => 5
		 * 
		 * // 5 < 5 => false }while(i < 5);
		 * 
		 * //����� Ż��....
		 * 
		 * 
		 * 
		 * // ����> 3���� ������ �Է¹޾Ƽ�, ������ ����ϼ���. Scanner sc = new Scanner(System.in); int i2
		 * = 0;
		 * 
		 * do { System.out.println("������ �Է��� �ּ��� : "); int score = sc.nextInt();
		 * 
		 * if (score >= 90) System.out.println("������ 90�� �̻��̰�, A���� �Դϴ�."); else if (score
		 * >= 80) System.out.println("������ 80�� �̻��̰�, B���� �Դϴ�."); else if (score >= 70)
		 * System.out.println("������ 70�� �̻��̰�, C���� �Դϴ�."); else if (score >= 60)
		 * System.out.println("������ 60�� �̻��̰�, D���� �Դϴ�."); else {
		 * System.out.println("F���� �Դϴ�."); } i2++; } while (i2 < 3); // ����� Ż���մϴ�.
		 * 
		 * 
		 * //����> 1~100������ Ȧ���� �հ� ¦���� ���� ���Ͽ� �հ踦 ����ϼ���. // Ȧ���� ��: 2500, ¦���� ��: 2550, �հ� :
		 * 5050 int even=0, odd=0; int i4=1;
		 * 
		 * do { if(i4 % 2 == 0) //¦���̸� even+=i4; else odd+=i4;//Ȧ���̸�
		 * 
		 * i4++; }while(i4 <= 100);
		 * 
		 * System.out.println("¦��: " + even); System.out.println("Ȧ��: " + odd);
		 * System.out.println("���հ� : " + (even + odd));
		 * 
		 * Scanner sc = new Scanner(System.in); int i2=0;
		 * 
		 * do { System.out.println("ù��° ���ڸ� �Է��ϼ���."); int value1 = sc.nextInt();// 100
		 * System.out.println("�ι�° ���ڸ� �Է��ϼ���."); int value2 = sc.nextInt();// 50
		 * 
		 * int sum2 = value1 + value2;//���� int sum3 = value1 - value2;//���� int sum4 =
		 * value1 * value2;//���� int sum5 = value1 / value2;//������: �� ���ϱ� int sum6 =
		 * value1 % value2;//������: ������ ���ϱ�
		 * 
		 * System.out.println("�� ��(value1+value2)�� �հ�� = " + sum2);
		 * System.out.println("�� ��(value1-value2)�� �հ�� = " + sum3);
		 * System.out.println("�� ��(value1*value2)�� �հ�� = " + sum4);
		 * System.out.println("�� ��(value1/value2)�� �հ�� = " + sum5);
		 * System.out.println("�� ��(value1%value2)�� �հ�� = " + sum6);
		 * 
		 * i2++; }while(i2 < 3);
		 * 
		 * Scanner sc = new Scanner(System.in); int i=0;
		 * 
		 * do { char charUpper = sc.next().charAt(1);// �빮�� 65 = A char charLower =
		 * sc.next().charAt(2);// �ҹ��� 97 = a char charDigit = sc.next().charAt(3);// ����
		 * 0 = 48
		 * 
		 * if((charUpper >= 65) && (charUpper<=90)) { System.out.println(charUpper);
		 * System.out.println("�빮�� �̱���.~"); }
		 * 
		 * if((charLower >= 97) && (charLower<= 122)) { System.out.println(charLower);
		 * System.out.println("�ҹ��� �̱���.~"); }
		 * 
		 * if(!(charDigit < 48) && !(charDigit > 57)) { System.out.println(charDigit);
		 * System.out.println("0~9������ ���� �̱���.~"); } i++; }while(i < 3);
		 * 
		

		// switch ~ case�� �ݺ� ó��
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݺ�ó���� Ƚ���� �Է��� �ּ���.");
		int count = sc.nextInt();// 3

		int scount = 0;//ó���� Ƚ��

		do {
			int jumsu = sc.nextInt();//

			switch (jumsu / 10) {
			case 10:
			case 9:
				System.out.println("A����");
				break;
			case 8:
				System.out.println("B����");
				break;
			case 7:
				System.out.println("C����");
				break;
			case 6:
				System.out.println("D����");
				break;
			default:
				System.out.println("F����");

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
				System.out.println("1. ����");// 1 => 49
				System.out.println("2. ����");// 2 => 50
				System.out.println("3. ����");// 3 => 51
				System.out.println("-----------");
				System.out.println("selected : ");
			}

			keycode = System.in.read();

			if (keycode == 49) { // menu ��ȣ�� 1���� ����������,
				speed += 10;
				System.out.println("���� �ӵ��� : " + speed);
			} else if (keycode == 50) { // menu ��ȣ�� 2���� ����������,
				speed -= 10;
			}else if (keycode == 51){
				System.out.println("Program Ending!!!");	// menu ��ȣ�� 3���� ����������,
				//break;
				result = false;
			}			
		}while(result);
		// ����� Ż�� �κ�.
			
	
		String inputString;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("�λ縻�� �Է��� �ּ���.");
			inputString = sc.nextLine();// "�ȳ��ϼ���", column => 80
		System.out.println(inputString);//�ȳ��ϼ���
		
		}while(!inputString.equals("stop"));
		
		//���� �߻�
		while(true) {
		int num = (int) (Math.random()*6); // 0~5������ ���� �߻�
		int num2 = (int) (Math.random()*6+1);// 1~6 ������ ���� �߻� 
		
		System.out.println(num);
		System.out.println(num2); 
		
		if(num == 5 && num2 == 6) break;
		
		}
		
		
		int count = 0;
		
		while(count < 6) {
			int num2 = (int) (Math.random()*6+1);// 1~6 ������ ���� �߻� 
			
			System.out.println(num2); 				
			count++;						
			}
		
	// DBMS = DB = oracle = ��뷮 �����ͺ��̽� �ַ��
	// table : student, insa, 
	//attribute : number, name, kor, eng, mat, total....	
		
		
	// DBMS : ms-sql, mysql, AIX......
	// DB = student DB, insa DB.....
	// table : student, insa, 
	//attribute : number, name, kor, eng, mat, total....
		
	//continue ��ɹ� ����
		for(int i=0; i<=10; i++) {
			
			if(i%2 != 0) { // Ȧ���̸�
				continue;// �ǳʶپ��, SKIP
			}
			System.out.println(i);//¦���̸� ���
		}
	
		
	//����> ������ ���ڸ� �Է� �޾Ƽ�, �� ���ڰ� Ȧ���̰ų� ¦���̸� ����ϰ�, 0�̸� �ǳʶټ���.	
				
		for(int i=0; i<5; i++) {
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			
			if(number == 0) { // Ȧ���̸�
				continue;// �ǳʶپ��, SKIP
			}else if(number %2 == 0) {
			System.out.println(number + " : ¦��");//¦���̸� ���
			
			}else
				System.out.println(number + " : Ȧ��");
		}
		 */
		
	//����> 1���� 10���̿� �����߿��� 5�� ������ �ǳʶٰ�, �ƴϸ� Ȧ���� ¦���� �հ踦 ���Ͽ� ����ϼ���.
	// 1~10 : 55, 5 => 50
		int odd=0, even=0;
		
		for(int i2=1; i2<=10; i2++) {
			
			if(i2 == 5) { // Ȧ���̸�
				continue;// �ǳʶپ��, SKIP
			}else if(i2 %2 == 0) {
				even+=i2;
			System.out.println(i2 + " : ¦��");//¦���̸� ���
			
			}else {
				odd+=i2;
				System.out.println(i2 + " : Ȧ��");	
			}
		}
		
		System.out.println("������ : " + (odd+even));
				
	}

}
