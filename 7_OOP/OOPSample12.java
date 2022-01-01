package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.AnnotationTypeMismatchException;

/* 문제> 데이터를 n개 입력 받아서 저장하고 출력하는 프로그램을 작성하세요.
 * - 데이터는 실수형 입니다.
 * - 반복문 사용
 * - 데이터 중에서 3의 배수가 되는 숫자의 합계와 갯수를 구하여 출력합니다.
 * - - BufferedReader class, Exception => readLine() => try ~ catch
 */
public class OOPSample12 {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int sum, count;

	private void baesu() {
		int su = 0;
		System.out.println("입력받아서 처리할 데이터의 갯수는 ?");
		try {
			su = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfee) {
			System.out.println("반드시 숫자를 입력해 주세요..");
			baesu();
		} catch (IOException e) {
			e.printStackTrace();// 스택에 있는 오류 메시지를 출력해 주는 역할
		} 
	
		
		double number[] = new double[su];// 클래스 배열

		for (int i = 0; i < number.length; i++) {
			System.out.println("number 배열에 실수형 데이터를 입력 하시오.");
			double x = 0;
			
			try {
				x = Double.parseDouble(br.readLine());
			} catch (NumberFormatException nfee) {
				System.out.println("반드시 숫자를 입력해 주세요..");
				baesu();
			} catch (IOException e) {
				e.printStackTrace();// 스택에 있는 오류 메시지를 출력해 주는 역할
			} 
			
			number[i] = x; 
		}

		for (int i = 0; i < number.length; i++) {
			if (number[i] % 3 == 0) {
				sum += number[i];
				count++;
			}
		}

		System.out.println("3의배수 합은 " + sum + "이고, 갯수는 " + count + "입니다.");
	}

	public static void main(String[] args) {
		OOPSample12 oop10 = new OOPSample12();
		oop10.baesu();
	}

}
