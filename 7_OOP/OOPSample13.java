package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.AnnotationTypeMismatchException;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 실수형 입니다.
 * - 반복문 사용
 * - 데이터 중에서 3개 과목의 총점과 평균 구하여 출력합니다.
 * - - BufferedReader class, Exception => readLine() => try ~ catch
 */
public class OOPSample13 {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private void sungjuk() {
		int su = 0;
		System.out.println("입력 인원수는 ?");
		try {
			su = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfee) {
			System.out.println("반드시 숫자를 입력해 주세요..");
			sungjuk();
		} catch (IOException e) {
			e.printStackTrace();// 스택에 있는 오류 메시지를 출력해 주는 역할
		} 	
		
		int number[] = new int[su];// 클래스 배열
		int java=0, jsp=0, spring=0, sum=0;
		double aver  = 0.0;
		
		int[] javaArray = new int[3];
		int[] jspArray = new int[3];
		int[] springArray = new int[3];
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("number 배열에 3과목을 데이터를 입력 하시오.");			
			
			try {
				 java = Integer.parseInt(br.readLine());
				 jsp = Integer.parseInt(br.readLine());
				 spring = Integer.parseInt(br.readLine());
				
			} catch (NumberFormatException nfee) {
				System.out.println("반드시 숫자를 입력해 주세요..");
				sungjuk();
			} catch (IOException e) {
				e.printStackTrace();// 스택에 있는 오류 메시지를 출력해 주는 역할
			} 			
			
			javaArray[i] = java;
			jspArray[i] = jsp;
			springArray[i] = spring;
		}

		for (int i = 0; i < number.length; i++) {			
				sum = javaArray[i] + jspArray[i] + springArray[i];
				aver = sum / 3;
				System.out.println((i+1) + "컴퓨터 과목의 합은 " + sum + "이고, 평균은 " + aver + "입니다.");
			}		
	}

	public static void main(String[] args) {
		OOPSample13 oop13 = new OOPSample13();
		oop13.sungjuk();
	}

}
