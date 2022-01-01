package OOP;

import java.util.Scanner;

import A2Sample.A2;
import A2Sample.B2;

//method 접근 제한자 테스트
public class OOPSample_6chapter24 {

	public static void main(String[] args) {

		//A2 a;//[X]
		A2 a = new A2();//[O]
		a.Adder();
		
		B2 b = new B2();//[O]
		b.Adder(); 
	}

}
