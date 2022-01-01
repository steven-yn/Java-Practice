package OOP_InheritanceSample;

import java.util.Scanner;

/* 문제> 커피 제품번호, 커피 제품명, 커피 색상, 커피 수량, 커피 가격
 * 등을 입력하여 총 판매량(수량 * 가격)을 계산하여 출력하세요.
 * - 상속을 이용하여 처리
 * - 배열 버전으로 구현 
 * 
 * 4)public class A implements B, C, D... { .... }
 *   A는 class이고, B, C, D는 모두 인터페이스인 경우 사용
 */

interface Coffee_Serial6  {
	public abstract String[] str1(int n);	
}

public class Coffee_InheritanceSample5_array implements Coffee_Serial6 {
	private static Scanner sc = new Scanner(System.in);
	private static String str1[] = {"제품 번호 ", "제품 이름 ", "제품 색상 ", "제품 수량 ", "제품 단가 "};
	private static String[] str2;
	private static String[] strArray1;
	private static int unitprice;
	private static int surang;
	private static int totalSales;
	private static int scount;   
	
	@Override
	public String[] str1(int n) {
		String str2[] = new String[n];
		for(int i=0; i < str1.length; i++) {
			System.out.println(str1[i] + "데이터 입력>> "); 
			str2[i] = sc.next();
		}
		return str2; 		
	}
	
	private static void totalsales() {
		int surang = Integer.parseInt(strArray1[3]); 
		int unitprice = Integer.parseInt(strArray1[4]); 
		totalSales = surang * unitprice;
	}
	
	private static void ProductResult() {
		System.out.println("---------------------------");
		System.out.println(" 제품번호(code) : " + strArray1[0]);
		System.out.println(" 제품이름(name) : " + strArray1[1]);
		System.out.println(" 제품색상(color) : " + strArray1[2]);
		System.out.println(" 제품수량(su) : " + strArray1[3]);
		System.out.println(" 제품가격(price) : " + strArray1[4]);
		System.out.println("---------------------------");
		System.out.println(" 제품판매액 : " + totalSales + " 원");
		System.out.println("---------------------------");
	}

	
	public static void main(String[] args) {
		Coffee_InheritanceSample5_array cis_array = new Coffee_InheritanceSample5_array();

		int n=0, count=5, socunt=0;
			
		while(scount <= count) {
			scount++;
		System.out.println("제품 정보를 입력할 갯수를 입력해 주세요.");
		n = sc.nextInt();// 5
		
		strArray1 = cis_array.str1(n);
		
		totalsales();
		
		ProductResult();
		System.out.println("제품정보 입력 횟수는 : " + scount); 
		}
	}

		
}
