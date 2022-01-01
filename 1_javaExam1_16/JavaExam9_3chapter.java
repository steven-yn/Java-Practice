//조건문 : 특정 조건을 처리하시오.
// 조건은 여러개 나올 수 있습니다.
public class JavaExam9_3chapter {

	public static void main(String[] args) {
		int charCode = 'A';// 65, a = 97
		int charCode2 = 'a';// 97
		int charCode3 = '0';// 48
		
		//         true              true
		//     65 >= 65          65 <= 90
		if((charCode >= 65) && (charCode<=90)) {
			System.out.println("대문자 이군요.~");
		}
		
		//        false                true
		//소문자, 65 >= 97           65 <= 122
		if((charCode2 >= 97) && (charCode2<= 122)) {
			System.out.println("소문자 이군요.~");
		}

		//숫자,  48 < 48           48 > 57
		if(!(charCode3 < 48) && !(charCode3 > 57)) {
			System.out.println("0~9사이의 숫자 이군요.~");
		}
		
		//배수 : 어떤 수를 3으로 나누었을 때, 0이 나오면 3의 배수가 됩니다.
		int value = 9;
		
		if(value % 2 == 0)
			System.out.println("숫자는 2의 배수 입니다.");
		else 
			System.out.println("2의 배수가 아닙니다.");

		//2의배수 또는 3의 배수
		if(value % 2 == 0 || value % 3 == 0)
			System.out.println("숫자는 2의 배수이거나 3의 배수 입니다.");
		else 
			System.out.println("2의 배수, 3의 배수가 아닙니다.");
		
		if(value % 2 == 0 && value % 3 == 0)
			System.out.println("숫자는 2의 배수이거나 3의 배수 입니다.");
		else 
			System.out.println("2의 배수, 3의 배수가 아닙니다.");
		
		//p.101
		//조건 연산자(삼항) : if문을 간결하게, 가족성 좋아 집니다.
		int score = 88;
		
char grade = (score>=90)? 'A':(score>=80)? 'B':(score>=70)? 'C':(score>=60)? 'D':'F';
		System.out.println("학점 결과는 : " + grade);
				
	}

}
