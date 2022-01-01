package Array2;

public class ArraySample_5chapter {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};		
				
		scores[0] = 83;
		scores[1] = 90;
		scores[2] = 87;
		
		System.out.println("scores[0] = " + scores[0]);
		System.out.println("scores[1] = " + scores[1]);
		System.out.println("scores[2] = " + scores[2]);
				
		int sum = scores[0] + scores[1] + scores[2];
		System.out.println("scores[]ÇÕ°è : " + sum);//
		
		System.out.println("---------------------------------");
		
		int sum2 = 0;
		
		for(int i=0; i < scores.length; i++) {
			sum2+=scores[i];
		}
		System.out.println("ÃÑÇÕ: " + sum2); 
		double aver = (double)sum2 /3;
		System.out.println("Æò±Õ: " + aver); 
		System.out.printf("Æò±Õ: %5.2f", aver);

		//int[] scores;
		//scores = {83, 90, 87};//compiler error
		int[] scores2;
		scores2 = new int[] {83, 90, 87};
		int sum3 = scores2[0] + scores2[1] + scores2[2];
		System.out.println("scores2[]ÇÕ°è : " + sum3);// 260
		
		String[] names = null;
		names = new String[] {"È«±æµ¿", "°¨ÀÚ¹Ù", "ÀÌ½ºÇÁ¸µ"};
		
		for(int i=0; i < names.length; i++) {
			System.out.print(names[i] +  " ");//
		}
		
		int[] scores3 = new int[5];		
		System.out.println(scores3.length);// 5
		
		//main arguments
		
		String str1 = args[0];//a, 1
		String str2 = args[1];//b, 2
		String str3 = args[2];//c, 3
		
		String sum4 = str1 + str2 + str3;
		System.out.println(sum4);//abc, 123
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);
		
		int sum5 = num1 + num2 + num3;
		System.out.println(sum5);//6
		
		Adder(num1, num2, num3);		
		
	}

	private static void Adder(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println(sum); // 6
	}

}
