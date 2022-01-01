package OOP;

/* 객체지향 프로그래밍 : 절차지향적인 처리에 비하여 객체지향적 처리는 보다 더 효율적입니다.
 * - (소프트웨어 공학 = 시스템 분석 설계)
 * 클래스 : 객체를 구현 하려면 먼저 클래스에서 선언해 주어야 합니다.
 *  - 클래스로 부터 객체가 생성되어 사용됩니다.
 * 객체 : 참조 변수 = 객체의 인스턴스 = 포인터 = 주소값 
 *  - 속성 : 실 세계에 존재하는 내용물(특성, 특징) => 클래스 변수
 *  - 기능 : 행위, 동작 표현 => class method()
 * 종류 : 모니터, 본체, 마우스, 키보드, 주전자, 물, 바위, 동물.....
 */
public class OOPSample1 { // 300번지
	private  String productNo;//null => coffee001
	private  String productName;//null => 카푸치노
	private  int productPrice;//0 => 2500

	public static void main(String[] args) {
		OOPSample1 os1 = new OOPSample1();//300번지
		OOPSample1 os2 = new OOPSample1();//500번지
		
		os1.productNo = "coffee001";//품목번호
		os1.productName = "카푸치노";//품목명
		os1.productPrice = 2500;//품목가격

		os2.productNo = "coffee002";//품목번호
		os2.productName = "고구마라떼";//품목명
		os2.productPrice = 3800;//품목가격
		
		// 								객체명.클래스변수
		System.out.println("품목번호 : " + os1.productNo);//coffee001
		System.out.println("품목명 : " + os1.productName);//카푸치노
		System.out.println("품목가격 : " + os1.productPrice);//2500
		System.out.println("품목번호 : " + os2.productNo);//coffee001
		System.out.println("품목명 : " + os2.productName);//카푸치노
		System.out.println("품목가격 : " + os2.productPrice);//2500
		
		//						static		클래스명.클래스변수
		//System.out.println("품목번호 : " + OOPSample1.productNo);//coffee001
		//System.out.println("품목명 : " + OOPSample1.productName);//카푸치노
		//System.out.println("품목가격 : " + OOPSample1.productPrice);//2500
		
		System.out.println("------ 비객체 지향적 코드 ------------");
		
		String pNo1 = "coffee001";
		String pName1 = "카푸치노";
		int pPrice1 = 2500;
		
		String pNo2 = "coffee002";
		String pName2 = "고구마라떼";
		int pPrice2 = 3800;
		
		System.out.println("품목번호 : " + pNo1);//coffee001
		System.out.println("품목명 : " + pName1);//카푸치노
		System.out.println("품목가격 : " + pPrice1);//2500
		System.out.println("품목번호 : " + pNo2);//coffee002
		System.out.println("품목명 : " + pName2);//고구마라떼
		System.out.println("품목가격 : " + pPrice2);//3800
	}

}
