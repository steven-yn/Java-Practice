package OOP;

import java.util.Scanner;

import A3Sample.A3;
import A4Sample.A4;

//생성자 접근 제한자 테스트
public class OOPSample_6chapter26 {

	public OOPSample_6chapter26() {
		
	A4 a = new A4();
	
	//field area의 클래스 변수에 대한 접근
	a.field1 = 100;//[O]
	a.field2 = 200;//[X]
	a.field3 = 300;//[X]
	
	//field area의 클래스 메소드에 대한 접근
	a.method1();//[O]
	a.method2();//[x]
	a.method3();//[x]
	
	}
	
}
