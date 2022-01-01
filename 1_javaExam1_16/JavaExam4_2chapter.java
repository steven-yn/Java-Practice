
public class JavaExam4_2chapter {

	public static void main(String[] args) {
		//2장 변수와 자료형
		//데이터 : 메모리에 저장(변수 형태)
		// 자료형   변수  대입연산자    실제데이터
		    int   sum     =         1000;// 자료형 = 변수 = 메모리(주소)
		System.out.println(sum);//1000

		int age = 34;
		String name = "현대빈";
		System.out.println("나이는 " + age + "이고, 이름은 " + name + "입니다.");
		
		// + : 덧셈(부호), 연결연산자(문자의 연결)
		
		//int 3_$x, 456_$y, 234_$z;
		
		int _$x = 500;
		
		System.out.println(_$x);  
		
		@SuppressWarnings("unused")
		int maxspeed;
		
		int maxSpeed;
		int max_speed;
		
		int MaxSpeed;
		
		int ages;
		
		//byte, short => 정수형인 경우에는 일반적으로 int로 취급합니다. 
		
		// byte(1byte = 8bits) : 00000000 ~ 11111111(0 ~ 255) : -128 ~ +127
		byte b1 = 100;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);// 1byte + 1byte = 2byte, 메모리 절약 효과
		int b4 = b1 + b2;//일반적인 처리, 4byte + 4byte = 4byte, 메모리 낭비
		System.out.println(b3);
		System.out.println(b4);
		
		
		// byte< short< int< long< float< double : 기본 자료형
		//  1      2     4    8      4      8
		
		//short : 2byte 메모리 사용, 데이터 범위 : 0 ~ 65535(-32768 ~ +32767)
		short s1 = -32000;
		short s2 = 10;
		short s3 = (short) (s1 + s2);
		int s4 = s1 + s2; 
		System.out.println(s3);
		System.out.println(s4);
		
		//프로그램 테스트 기준: 메모리 공간, 처리 시간
		
		
		
	}

}
