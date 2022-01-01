//자료형: 기본 자료형, 참조형
public class JavaExam6_2chapter {

	public static void main(String[] args) {
		// 수의 체계
		/* 2^0 = 1
		 * 2^4 = 16
		 * 2^6 = 64
		 * 2^7 = 128
		 * 2^8 = 256
		 * 
		 * 10   9    8   7    6   5   4   3   2   1   0
		 * ---------------------------------------------
		 * 1024 512 256 128  64  32  16  8   4   2   1
		 * 
		 */
		int value = 300;//0 ~ 31
		
	//값을 표현 : 양수(+), 음수(-)
	// 				56, -56
	// 부호화 절대값: 00111000    00111000
	// 1의 보수:				  11000111
	// 2의 보수:				  +      1 => 음수
	//						  ---------
	//						  11001000 (-56)
	int plus = 56;
	int minus = -56;
	int sum = plus + minus;
	System.out.println(sum);//0
	
	// 00111000
	// 11001000
	// 00000000 (0)
		
	byte var1 = 125;//-128~127 : overflow인 경우에는 
	int var2 = 125;
	
	//반복문: 특정 조건을 반복하여 처리할 때 사용합니다.
	//   초기값   조건식 증감식
	for(int i=0; i<5; i++) { //0 => 1 => 2 => 3 => 4 => 5
		//       5<5
		var1++;// +1 => 125 + 1 = 126 + 1=127+1=128+1=129+1=130
		var2++;//125 + 1 = 126+1=127+1=128+1=129+1=130
		System.out.println("var1: " + var1 +"\t" + "var2: " + var2); 
		//126	126
		//127 	127		
		// -128 	128
		// -127 	129
		// -126		130		
	}
	
	//증감 연산자 테스트 : 연산후 대입, 대입후 연산 적용
	int var3 = 100;
	var3++;//대입후 연산 적용
	System.out.println(var3);//101
	
	int var4 = 100;
	int assign = var4++;//대입후 연산 적용, 101기억
	System.out.println(var4);//
	System.out.println(assign);//100
	
	int var5 = 100;
	++var5;//연산후 대입, 101
	System.out.println(var5);//101
	
	int var6 = 100;
	int assign2 = ++var6;//연산후 대입, 101
	System.out.println(var6);//101
	System.out.println(assign2);//101
	
	// -- : 빼기, 감소
	int var7 = 100;
	int assign3 = --var7;//연산후 대입, assign3 = --(var7) 
	System.out.println(var7);//99
	System.out.println(assign3);//99
	
	int var8 = 100;
	int assign4 = var8--;//대입후 연산, 99기억
	System.out.println(var8);//99
	System.out.println(assign4);//100
	
	char var9 = 'A';
	char var10 = '\u0041';
	char var11 = '가';
	char var12 = '\uAC00';
	char var13 = '\uAC15';
	System.out.println(var9);
	System.out.println(var10);
	System.out.println(var11);
	System.out.println(var12); 
	System.out.println(var13);
	
	String name = "홍길동";
	String str = null;// ""
	char c = ' ';
	
	long ss = 123L;
	float sss = 123F;
	
	//실수형은 정밀도가 높습니다. 
	double dd = 1231323.23123E+16;//1231323231230.0
	int ff = 12345;
	double sum2 =  dd + ff;
	//1.23132323123E22 =>12313232312300000.0
	System.out.println(sum2);//실수형 = 실수형 + 정수형, 묵시적 형변환(자동형변환)
	
	// (byte)byte + byte = int + int = int
	
	System.out.println(Byte.MAX_VALUE + " ~ " + Byte.MIN_VALUE);
	
	int x = 10;
	int y = 20;
	int sum3 = x + y;
	System.out.println(sum3);//30
	
	//복합대입연산자 = 단축 연산자 = 산술 + 대입 결합된 형태
	int x2 = 500;
	//int x3 = x2 + 100;
	
	x2+=100; // x2 = x2 + 100 => 600
	System.out.println(x2);
	x2*=3;//600*3= 1800
	System.out.println(x2);
	x2-=50;//1800-50=1750
	System.out.println(x2);
	x2*=3;//1750*3=5250
	System.out.println(x2);
	x2/=2;//5250/2=2625
	System.out.println(x2);
	x2%=2;//2625%2=1
	System.out.println(x2);//1
	
	int c2 = 25, sum4=0, sum5;
	c2++;
	System.out.println(c2);//26
	sum4 = --c2;
	System.out.println(sum4);//25
	
	//     27   +  25(24 기억), 27 + 24 = 51 => sum5
	sum5 = ++c2 + sum4--; //sum5=25 => 51 
	System.out.println(sum5);//51
	
	System.out.println(sum4);//24
	
	JavaExam6_2chapter je6 = new JavaExam6_2chapter();
	//Object instance = Object = class의 오브젝트는 instance 
	
	if(je6 instanceof  JavaExam6_2chapter) {
		System.out.println("je6는 JavaExam6_2chapter의 Object 입니다.");
	}else {
		System.out.println("je6는 JavaExam6_2chapter의 Object 가 아닙니다.");
	}
	
	
	}

}
