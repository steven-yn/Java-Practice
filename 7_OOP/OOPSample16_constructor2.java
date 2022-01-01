package OOP;

import java.util.Scanner;

/* 생성자 메소드 : 클래스에서 전송한 데이터를 수신하기 위하여 사용합니다.
 * - 생성자는 상속을 허용하지 않습니다.
 * - 생성자는 클래스 이름과 반드시 같아야 합니다. = 파일 이름과 같습니다.  
 * - 접근제한자는 public 이거나 생략 가능합니다.
 * - 일반적인 메소드와는 달리 반환타입이 없습니다. 그러므로 return문이 없습니다.
 * - 생성자메소드는 오버로딩이 가능합니다.
 * - 프로그래머가 생성자 메소드를 작성하지 않으면 JVM이 자동으로 만들어 줍니다.
 * - 생성자 메소드가 하나라도 없으면 그때 만들어 줍니다.
 * - 디폴트 생성자 : public className() {  }
 * - 클래스에서 전달되는 값을 클래스 변수에 초기화 시킬 목적으로 주로 사용됩니다.
 * - this는 클래스변수명과 이름이 같으면 생략이 가능합니다.
 */
public class OOPSample16_constructor2 {
	private int su1;//0 => 1
	private int su2;//0 => 2
	private int su3;//0 => 3
	private String str1;//null => hello
	private String str2;//null => nice
	private String str3;//null => "120"
	private int su4;//0 => 24	
	
	// 생성자 오버로딩
	public OOPSample16_constructor2(int su1, int su2, int su3) {
		this.su1 = su1;// this.su1 => su1 클래스 변수, su1 => 매개변수 값
		this.su2 = su2;
		this.su3 = su3;		
	}
	// 생성자 오버로딩
	public OOPSample16_constructor2(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}
	// 생성자 오버로딩
	public OOPSample16_constructor2(String str3, int su4) {
		this.str3 = str3;
		this.su4 = su4;		
	}

	private void Adder() {
		System.out.println("합계 : " + (this.su1 + this.su2 + this.su3)); // 6
	}
	
	private String StringCon(){
		String str3 = str1 + str2;		
		return str3;
	}
	
	private void mix() {
		int x = Integer.parseInt(str3);
		int sum = x + su4; 
		System.out.println("문자열 숫자 + 숫자 : " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수형 숫자 3개를 입력해 주세요.");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		int su3 = sc.nextInt();
		OOPSample16_constructor2 oop16_1 = new OOPSample16_constructor2(su1, su2, su3); 		
		oop16_1.Adder();		
		
		System.out.println("문자열 2개를 입력해 주세요.");
		String str1 = sc.next();//
		String str2 = sc.next();//
		OOPSample16_constructor2 oop16_2 = new OOPSample16_constructor2(str1, str2); 
		String str4 = oop16_2.StringCon();
		System.out.println("문자열의 연결 : " + str4); 
		
		System.out.println("문자열 2개를 입력(10진수 형태로)해 주세요.");
		String str3 = sc.next();//
		int su4 = sc.nextInt();//		
		OOPSample16_constructor2 oop16_3 = new OOPSample16_constructor2(str3, su4); 
		oop16_3.mix();
	}

}
