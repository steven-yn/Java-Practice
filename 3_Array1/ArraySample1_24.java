package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * 문제3> 숫자 맞추기 게임
 * 컴퓨터가 난수를 발생하여 숫자를 생성합니다. 
 * - 데이터 범위 : 1 ~ 1000
 * 사용자가 숫자를 입력하여 난수로 생성된 숫자를 맟추는 게임 입니다.
 * 맞춘 횟수와 정답을 출력합니다.
 * 
 */
public class ArraySample1_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0, rcount=0;
		
		Random rand = new Random();
		int num = rand.nextInt(1000) + 1;// 1~1000
		System.out.println("난수 발생 데이터 : " + num); 
		
		do {
			count++;
			
			System.out.println("사용자 데이터를 입력해 주세요.");
			int userInput = sc.nextInt();

			System.out.println("컴퓨터가 발생한 난수 데이터 : " + num);
			if (userInput == num) {
				System.out.println("맞췄습니다.^^");
				System.out.println("맞춘횟수 : " + ++rcount);
			} else if (userInput > num) {
				System.out.println("입력한 숫자 " + userInput + "컴퓨터 난수보다 큽니다.");
				rcount++;
			} else {
				System.out.println("입력한 숫자 " + userInput + "컴퓨터 난수보다 작습니다.");
				rcount++;
			}
			if(count == 9999999) //전체 반복 횟수
				break;
		}while(true);
	} // main method end

} // class end
