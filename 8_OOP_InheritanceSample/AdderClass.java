package OOP_InheritanceSample;

import java.util.Scanner;

public class AdderClass {

	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("?????? ???? x?? ?Է??ϼ???.");
		int x = sc.nextInt();
		System.out.println("?????? ???? y?? ?Է??ϼ???.");
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("ADD() : " + sum); 
	}
}
