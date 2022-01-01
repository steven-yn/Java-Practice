package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * 문제2> 원하는 데이터 찾기
 * 임의의 수를 입력 받아서, 찾고자 하는 데이터의 위치가 어디인지를 찾아서 그 index값을 출력하세요.
 * 
 */
public class ArraySample1_23 {
	private static int n;
	private static int SearchDataTest[];
	private static Scanner sc = new Scanner(System.in);

	private static void SearchDataResultIndex() {
		System.out.println("찾을 데이터를 입력해 주세요.");
		int searchNumber = sc.nextInt();
		
		for(int i=0; i < SearchDataTest.length; i++) {
			if(SearchDataTest[i] == searchNumber)
				System.out.println(SearchDataTest[i] + "는 " + i);//index
		else 
			System.out.println("찾는 데이터가 아닙니다.");
		}
	}

	private static void SearchDataInput() {
		for (int i = 0; i < SearchDataTest.length; i++) {
			SearchDataTest[i] = sc.nextInt();
			
		for(int k=0; k < SearchDataTest.length; k++) {
			System.out.print(SearchDataTest[k] + " ");
		}		
		System.out.println();
		}
	}
		
	private static void SearchDataSuInput() {
		System.out.println("lotto배열에 저장할 데이터 갯수를 입력해 주세요.");
		n = sc.nextInt();//6개

		SearchDataTest = new int[n];		
	}
	
	public static void main(String[] args) {
		// 검색할 배열에 입력할 데이터 수 입력
		SearchDataSuInput();
		// 찾을 데이터 입력
		SearchDataInput();
		// 사용자 복권번호 입력
		SearchDataResultIndex(); 
		
	} // main method end

} //class end


