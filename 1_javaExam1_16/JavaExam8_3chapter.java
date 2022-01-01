import java.util.Scanner;

// ~(비트 반전 연산자): 틸드 연산자, method 개념
public class JavaExam8_3chapter {
//field area
		
		// 00000000000000000000000000001010
		// 11111111111111111111111111110110
		// --------------------------------
		// 00000000000000000000000000000000

		private static String toBinaryString(int v1) { //매개변수값, 10
			String str = Integer.toBinaryString(v1); 
			
			while(str.length() < 32) {  //0 ~ 31
				str = "0" + str;
			}
			return str;
		}	
		
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;//양수 => 음수 변환, ~ :양수에서 음수로 +1, 음수에서 양수변환: -1, -11기억
		int v3 = ~v1 + 1;// -11 + 1 = -10
		System.out.println(v1);//10
		System.out.println(v2);// -11
		System.out.println(v3);// -10

		System.out.println(toBinaryString(v1)); //전달인자값, 10, 부호화 절대값
		System.out.println(toBinaryString(v2)); // -11, 1의 보수
		System.out.println(toBinaryString(v3)); // -10, 2의 보수
		
		//산술 연산자: +, -, *, /, %
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연산 1번째 숫자를 입력하세요.");
		double v4 = sc.nextDouble();
		System.out.println("산술연산 2번째 숫자를 입력하세요.");
		double v5 = sc.nextDouble();
		
		double result1 =  v4 + v5;
		double result2 =  v4 - v5;
		int result3 = (int) (v4 * v5);//강제적 형변환(casting)
		int result4 = (int) (v4 / v5);
		int result5 = (int) (v4 % v5);
		System.out.println("=======================");
		System.out.println("덧셈 결과는 : " + result1);
		System.out.println("뺄셈 결과는 : " + result2);
		System.out.println("곱셈 결과는 : " + result3);
		System.out.println("나눗셈(몫) 결과는 : " + result4);
		System.out.println("나눗셈(나머지) 결과는 : " + result5); 
		System.out.println("=======================");
		
		// char : A = 97, a = 122
		char c1 = 'A' + 1;// 97+1=98, B
		char c2 = 'A';// 97 = A
		char c3 = (char) (c2 + 1);// compile error, 98 = B 
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3); 
		
		//Overflow 방지 및 처리
		int x = 1000000;//백만
		int y = 1000000;
		
		// int : 2^32, ~2147483648 ~ + 2147483647
		int z = x * y;//overflow발생, 자료형의 데이터 저장 범위를 벗어남.
		System.out.println(z);// -727379968
		
		// long : 2^64
		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2 * y2;
		System.out.println(z2);//1000000000000
		
		//NaN, Infinity: 실수형 일때 표현.
		int c = 2;
		int a = 5;
		
		if(c == 0) {
			c = 3;
		}else {
			int x3 = a / c;// c => 0[X], 5 / 2
			System.out.println(x3);// ? , / by zero, 2
		}
		
		double k = 5 / 3.0;
		double m = 5 % 3.0;
		
		System.out.println(k);// Infinity
		System.out.println(m);// NaN
		
		//문자 + 숫자 => 문자
		
		String sum = "hello" + 34;
		String val = "NaN"; 
		double currentBalence = 10000.0;
		String sum2 = val + currentBalence;
		System.out.println(sum);//hello34
		System.out.println(sum2);//NaN
		
		//valueOf(), parseInt()
		
		Scanner sc2 = new Scanner(System.in);
		String x3 = sc2.next();// 555.456 => "555.456"
		String y3 = sc2.next();// 555.456 => "555.456"
		
		//의미적으로 같은 동작을 합니다.  
		double xx3 = Double.valueOf(x3);
		double yy3 = Double.parseDouble(y3);
		double sum4 = xx3 + yy3;
		
		System.out.println(xx3);
		System.out.println(yy3);
		System.out.println(sum4);//
		
		String str = "JDK";
		int i = 3;
		double k2 = 3.0;
		
		String str3 = str + i + k2;// 문자 + 숫자 = 문자 + 숫자 = 문자
		System.out.println(str3);// JDK33.0
		
		String str4 = i + k2 + str;// 숫자 + 숫자 = 숫자 + 문자 = 문자
		System.out.println(str4);// 6.0JDK
		
		char cc1 = 'A';//ascii code => 65
		char cc2 = 'B';// 66
		
		boolean cc3 = cc1 < cc2;//true
		boolean cc4 = cc1 > cc2;//false
		boolean cc5 = cc1 <= cc2;// true
		boolean cc6 = cc1 >= cc2;// false
		boolean cc7 = (cc1 == cc2);// false
		boolean cc8 = (cc1 != cc2);// true
		System.out.println(cc3);// true
		
		char cc9 = '가';
		char cc10 = '하';
		
		boolean lessthen = cc9 < cc10;//true
		boolean greaterthen = cc9 > cc10;//false
		boolean lessthenequal = cc9 <= cc10;// true
		boolean greaterthenequal = cc9 >= cc10;// false
		boolean equaltwo = (cc9 == cc10);// false
		boolean notequal = (cc9 != cc10);// true
		System.out.println(lessthen);// true
		
		
		//p.90
		/* 메모리 영역 구분
		 * ----------------
		 * static area : 전역변수 = 클래스변수
		 * heap area : 객체
		 * stack area : 지역변수, 메소드의 매개변수
		 * 
		 * 개체의 내용이 같으면 번지수도 같습니다.
		 * new 연산자를 사용하면 번지수는 달라 집니다.
		 */
		String ddd = new String();
		System.out.println(ddd);//
		String strValue1 = "신용권";//500번지
		String strValue2 = "신용권2";//700번지
		String strValue3 = new String("신용권3");//1000번지
		
		System.out.println(strValue1);
		System.out.println(strValue2);
		System.out.println(strValue3);
		
		//두 객체의 번지가 같은가? 같지 않은가?를 판단하는 문장 ( == )
		if(strValue1 == strValue2) // 번지가 같습니까???? 
			System.out.println("번지가 같습니다.");//번지가 같습니다.
		else {
			System.out.println("번지가 같지 않습니다.");
		}
		
		if(strValue1 == strValue3) // 번지가 같습니까???? 
			System.out.println("번지가 같습니다.");
		else {
			System.out.println("번지가 같지 않습니다.");// 번지가 같지 않습니다.
		}
		
		// equals() : 내용을 비교하여 같은지, 아닌지 판별
		if(strValue1.equals(strValue2)) {
			System.out.println("내용이 같습니다.");	//	내용이 다릅니다.
			
		}else {
			System.out.println("내용이 다릅니다.");
		}
		
		if(strValue1.equals(strValue3)) {
			System.out.println("내용이 같습니다.");	//	내용이 다릅니다.
		}else {
			System.out.println("내용이 다릅니다.");
		}
		
		
		JavaExam8_3chapter je3 = new JavaExam8_3chapter();
		System.out.println(je3);// 75bd9247
	}
	
}
