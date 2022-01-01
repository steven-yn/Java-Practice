package OOP;

/* 문제> 1~100사이의 합계를 구하는 프로그램을 작성하세요.
 * 
 */
public class OOPSample2 { // 1000번지
	/*
	private void Adder() {
		int sum = 0;
		for(int i=0; i <=100; i++) {
			sum+=i;
		}
		System.out.println(sum);//5050		
	}
*/
	private static void Adder() {
		int sum = 0;
		for(int i=0; i <=100; i++) {
			sum+=i;
		}
		System.out.println(sum);//5050			
	}
	
	public static void main(String[] args) {
		//OOPSample2 os2 = new OOPSample2();//1000번지
		//os2.Adder();//객체명.메소드명
		
		Adder();		
		
	}


}
