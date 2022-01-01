package Array2;

import java.util.Calendar;

public class ArraySample_5chapter4 {
	// 열거형 상수값
	public enum Week {
		MONDAY,  // 0  
		TUESDAY, // 1
		WENDUSDAY, // 2
		THURSDAY, // 3
		FRIDAY,  // 4 
		SATURDAY,  // 5
		SUNDAY	// 6
	}	
	
	public static void main(String[] args) {
		int[] scores = { 100, 200, 300, 400, 500, 600 };
		int sum = 0;
		
		for(int i=0; i < scores.length; i++) {
			sum+=scores[i];	
		}
		System.out.println(sum);// 2100
		
		 sum =0;
		
		for (int score : scores) {
			sum+=score;			
		}
		System.out.print(sum);// 2100
		
		System.out.println("-----------------------------------");

		//열거형 처리
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
			
		System.out.println("오늘은" + year +"년 " + month + "월" + day + "일 입니다.");
		System.out.println("현재 시간은 " + hour + "시" + minute + "분" + second + "초 입니다.");
		
		Week today = Week.TUESDAY;
			String name = today.name();
			System.out.println(name);//
			
		int ordinal = today.ordinal();
		System.out.println(ordinal);//
			
		//compareTo()메소드
		//valueOf()
		Week weekDay = Week.valueOf("SATURDAY");
			System.out.println(weekDay);//
			
			int value = 34;
			String value2 = "34.4566";
			double ss = Double.valueOf(value);
			double ss2 = Double.valueOf(value2);
			System.out.println(ss);// 
			System.out.println(ss2);//34.4566
			
			double ss3 = ss2 + 100;
			System.out.println(ss3);// 134.4566
			
		// int[] array = new int[5];
		Week[] days = Week.values();//days는 참조 변수라고 부릅니다.	
			
		for(Week dayday : days) {
			System.out.println(dayday);//
		}
			
			
	}

}
