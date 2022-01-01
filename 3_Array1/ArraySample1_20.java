package Array1;

import java.util.Arrays;
import java.util.Scanner;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 정수형 입니다.
 * - 반복문 사용, method()적용: 기준 선택은 마음대로...생각해서 결정합니다.
 * - Arrays.sort() 사용
 * - 변경전 데이터> 110 20 130 40 150 260 270 380 90 100
 * - 변경후 데이터 : 오름차순> 20 40 90 100 110 130 150 260 270 380
 * - 변경후 데이터 : 내림차순> 380 270 260 150 130 110 100 90 40 20
 * 
 * 객체지향적 관점에서 응용하여 사용하는 방법(call by Reference)
 */
public class ArraySample1_20 {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		ArraySample1_19 as19 = new ArraySample1_19();
				
		//ArraySample1_20 as20 = new ArraySample1_20();
		
		// 변경전 데이터 수 입력
		as19.sortDataSuInput();

		// 변경전 데이터 입력
		as19.sortDataInput();

		/* 접근제한자: 4가지 종류
		 * public : 모든 클래스에게 접근을 허용합니다.
		 * 생략: 디폴트 : 관련된 클래스에게만 접근을 허용합니다. => object(as19)
		 * private : 자신이 속한 클래스에게만 접근이 허용됩니다.
		 * protected : 같은 패키지와 다른 패키지를 포함하여 자신의 클래스와 연관된 클래스에게, 상속 관계에 있는 클래스에게 접근을 허용합니다.
		 */
		//classname.methodname(   )
		Arrays.sort(ArraySample1_19.sortTest);
		 
		// ascending(오름차순)
		as19.dataAscending(ArraySample1_19.sortTest);

		// descending(내림차순)
		as19.datadescending(ArraySample1_19.sortTest);

	}	
}

