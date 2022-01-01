package OOP;

import java.util.Scanner;

import A3Sample.A3;

//생성자 접근 제한자 테스트
public class OOPSample_6chapter25 {

	public static void main(String[] args) {
	
	A3 a1 = new A3(true);//[O]
	//a1.A3();
	
	A3 a2 = new A3(1);//[X]
	
	A3 a3 = new A3("문자열");//[X]
	}
	
}
