//���ǹ� : Ư�� ������ ó���Ͻÿ�.
// ������ ������ ���� �� �ֽ��ϴ�.
public class JavaExam9_3chapter {

	public static void main(String[] args) {
		int charCode = 'A';// 65, a = 97
		int charCode2 = 'a';// 97
		int charCode3 = '0';// 48
		
		//         true              true
		//     65 >= 65          65 <= 90
		if((charCode >= 65) && (charCode<=90)) {
			System.out.println("�빮�� �̱���.~");
		}
		
		//        false                true
		//�ҹ���, 65 >= 97           65 <= 122
		if((charCode2 >= 97) && (charCode2<= 122)) {
			System.out.println("�ҹ��� �̱���.~");
		}

		//����,  48 < 48           48 > 57
		if(!(charCode3 < 48) && !(charCode3 > 57)) {
			System.out.println("0~9������ ���� �̱���.~");
		}
		
		//��� : � ���� 3���� �������� ��, 0�� ������ 3�� ����� �˴ϴ�.
		int value = 9;
		
		if(value % 2 == 0)
			System.out.println("���ڴ� 2�� ��� �Դϴ�.");
		else 
			System.out.println("2�� ����� �ƴմϴ�.");

		//2�ǹ�� �Ǵ� 3�� ���
		if(value % 2 == 0 || value % 3 == 0)
			System.out.println("���ڴ� 2�� ����̰ų� 3�� ��� �Դϴ�.");
		else 
			System.out.println("2�� ���, 3�� ����� �ƴմϴ�.");
		
		if(value % 2 == 0 && value % 3 == 0)
			System.out.println("���ڴ� 2�� ����̰ų� 3�� ��� �Դϴ�.");
		else 
			System.out.println("2�� ���, 3�� ����� �ƴմϴ�.");
		
		//p.101
		//���� ������(����) : if���� �����ϰ�, ������ ���� ���ϴ�.
		int score = 88;
		
char grade = (score>=90)? 'A':(score>=80)? 'B':(score>=70)? 'C':(score>=60)? 'D':'F';
		System.out.println("���� ����� : " + grade);
				
	}

}
