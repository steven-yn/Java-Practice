package tc_2;

public class MultiForPrint {
	static String result;
	static String star = "*";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printButterfly(5);
	    System.out.println("---------------");
	    printDiamond(5);
	}

	static void printButterfly (int a) {
		for(int i=0; i<a; i++) { // 01234 5번실행
			
			int rej = 0; // j의 for 변수 초기화
			int rek = 2; // k의 for 변수 초기화
			
			for(int j=0; j<=rej ; j++) {	
										// 1번은 무조건 실행됨
				switch (i) {			// i 값에 따라 "*"를 rej 값 + 1회 반복
				case 0:
					rej=8;
					break;
				case 1:
					rej=4;
					break;
				case 2:
					rej=0;
					break;
				case 3:
					rej=2;
					break;
				case 4:
					rej=6;
					break;
				default :
					break;
				}
				System.out.print(star);
	        }
			System.out.println();
			
			for(int k=1; k<(rek+2) ; k++) {	
				
				switch (i) {
				case 0:
					rek=6;
					break;
				case 1:
					rek=2;
					break;
				case 2:
					rek=0;
					break;
				case 3:
					rek=4;
					break;
				case 4:
					rek=8;
					break;
				default :
					break;
				}
				System.out.print(star);
	        }
			System.out.println();
		}
	}
	
	static void printDiamond (int a) {
		for(int i=0; i<a; i++) {
			
			int aj = 0;
			int ak = 2;
			
			for(int j=0; j<=aj ; j++) {	
			
				switch (i) {
				case 0:
					aj=8;
					break;
				case 1:
					aj=4;
					break;
				case 2:
					aj=0;
					break;
				case 3:
					aj=2;
					break;
				case 4:
					aj=6;
					break;
				default :
					break;
				}
				System.out.print(star);
	        }
			System.out.println();
			
			for(int k=1; k<(ak+2) ; k++) {	
				
				switch (i) {
				case 0:
					ak=6;
					break;
				case 1:
					ak=2;
					break;
				case 2:
					ak=0;
					break;
				case 3:
					ak=4;
					break;
				case 4:
					ak=8;
					break;
				default :
					break;
				}
				System.out.print(star);
	        }
			System.out.println();
		}
	}
}