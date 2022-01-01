
import java.lang.*;

@SuppressWarnings("unused")
public class JavaExam2_1chapter {

	//single thread
	public static void main(String[] args) {
		// 1chapter
		/*
		 * byte code : 자바소스를 컴파일하면 바이트 코드를 생성합니다.
		 * sample> a.java => a.class
		 * 
		 * System.out.println("Hello~~~");
		 * 
		 * import : 패키지를 삽입해줍니다.
		 * 대부분의 import java.lang 패키지에 의해 이용됩니다.
		 * 그리고, 생략이 가능합니다.
		 * 
		 * public final class System extends Object
		 */
		System.out.println();//줄바꿈의 의미의 용도로 사용
		
		boolean result = true;		
		System.out.println(result);//true
		
		char c1 = 'h';
		char c2 = 'y';
		System.out.println(c1);//h
		System.out.println(c2);//y
		
		double d1 = 12345678.1234567;//실수형 8바이트
		System.out.println(d1);
		
		float f1 = 12345.23344f;//실수형 4바이트
		System.out.println(f1);
		
		long l1 = 32432432432L;//정수형 8바이트
		System.out.println(l1);
		
		System.out.println("Hello~~~");
		
		//실수형: 실수형의 확장형태가 바로 지수승입니다.
		//지수승: -, +, 가장큰값이거나 가장 작은값을 표현할 때 사용합니다.
	double d2 = 21313213454354354354354.3521321313243432432432432432E-9;
		System.out.println(d2);//? 2.1313213454354355E22
		double d3 = 2.1313213454354355E+22;
		System.out.println(d3);//수작업, 21313213454354355000000.0, 2백조...  
	
	double d4 = 24334324324e-20;
	System.out.println(d4);//? 0.0000000024334324324
		
		
		
	}

}
