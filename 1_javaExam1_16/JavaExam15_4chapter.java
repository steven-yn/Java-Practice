import java.io.IOException;

//while
public class JavaExam15_4chapter {

	public static void main(String[] args) throws IOException {  
		boolean result = true;
		int keycode = 0;
		int speed = 0;

		while (result) { // ���ѹݺ� ����
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
			
		}
		// ����� Ż�� �κ�.			
	}

}
