package OOP;

import java.util.Scanner;

public class OOPSample_6chapter13 {
			
	private static void String$Method(String str) {
		System.out.println(str); 		
	}	
		
	private static void String_Method(String str, int num) {
		for(int i=0; i < num; i++) {
			System.out.println(str); 
		}
	}
	
	private static String StringMethod(String str1, String str2) {
		String str = str1 + str2;
		return str; 		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력 하세요.");
		String str1 = sc.next();
		String str2 = sc.next();
		
		for(int i=0; i < 5; i++) {  
			String$Method(str1);		
		}
		System.out.println("------------");
				
			String_Method(str1, 5);// stringMethod();
			
		System.out.println("------------"); 
		
			String str = StringMethod(str1, str2); 
			System.out.println("문자열의 결합 " + str); 
	}

	

	

}
