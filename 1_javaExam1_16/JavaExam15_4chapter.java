import java.io.IOException;

//while
public class JavaExam15_4chapter {

	public static void main(String[] args) throws IOException {  
		boolean result = true;
		int keycode = 0;
		int speed = 0;

		while (result) { // 무한반복 실행
			if (keycode != 13 && keycode != 10) {
				System.out.println("---Menu----");
				System.out.println("1. 증속");// 1 => 49
				System.out.println("2. 감속");// 2 => 50
				System.out.println("3. 중지");// 3 => 51
				System.out.println("-----------");
				System.out.println("selected : ");
			}

			keycode = System.in.read();

			if (keycode == 49) { // menu 번호가 1번을 선택했으면,
				speed += 10;
				System.out.println("현재 속도는 : " + speed);
			} else if (keycode == 50) { // menu 번호가 2번을 선택했으면,
				speed -= 10;
			}else if (keycode == 51){
				System.out.println("Program Ending!!!");	// menu 번호가 3번을 선택했으면,
				//break;
				result = false;
			}
			
		}
		// 여기로 탈출 부분.			
	}

}
