import java.util.Scanner;

// ���ǹ�, �ݺ���
public class JavaExam10_4chapter {

	public static void main(String[] args) {
		//1.if��
		//2.if ~ else
		//3.if ~ else if
		//4.if ~ if ~ if.....
		
		/*
		if(���ǽ�) {  // �߰�ȣ ��� : ����(�߹�) : ������ ������ �������� ��쿡
			���๮;
			���๮;
			//.....
		}
		*/
		
		/*  �ܹ�
		if(���ǽ�)
			���๮;
		*/
		int score = 77;
		
		if(score>=90) 
			System.out.println("������ 90�� �̻��̰�, A���� �Դϴ�.");
		
		
		//3.if ~ else ~if else....
		
		if(score>=90) 
			System.out.println("������ 90�� �̻��̰�, A���� �Դϴ�.");
		else if(score>=80)
			System.out.println("������ 80�� �̻��̰�, B���� �Դϴ�.");
		else
			System.out.println("������ 70�� �̻��̰�, C���� �Դϴ�.");
		
		// random()
		int num = (int) (Math.random()*45);//0~44
		
		int num2 = (int) (Math.random()*45) + 1;//1~45
		
		//4.��ø if��  
		
	//5. switch ~ case : if���� ���⼺�� �ܼ�ȭ���� ����Ϸ��� �� ��(3,4�� if���� ������ ��쿡 ���)
		int jumsu = 77;
		
		switch(jumsu / 10) {
		case 10:
		case 9: System.out.println("A����"); break;
		case 8: System.out.println("B����"); break;
		case 7: System.out.println("C����"); break;
		case 6: System.out.println("D����"); break;
			default: 
				System.out.println("F����");	
		}		
		
		//����> ���� �Է� �޾Ƽ� switch ~ case�� �̿��Ͽ�  ��, ����, ����, �ܿ��� ����ϼ���.
		// ó������>
		// 1.���� �Է� �޾Ƽ� 
		// 2.switch ~ case�� �̿��Ͽ� 
		// 3. ��, ����, ����, �ܿ��� ����ϼ���.
		// 4. ����? 
		// 5. ���� ?
		// 6. ���� ?
		// ���α׷��Ӵ� ���� �������� �뵿�� �ϴ� ���� : ����
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();		
		
		switch(month) {
		case 3: System.out.println("��.....");
		case 4: System.out.println("��.....");
		case 5: System.out.println("��....."); break;
		case 6:
		case 7:
		case 8: System.out.println("����...."); break;
		case 9:
		case 10:
		case 11: System.out.println("����...."); break;
		case 12:
		case 1:
		case 2: System.out.println("�ܿ�...."); break;
		
		
		}
		
		
	}

}
