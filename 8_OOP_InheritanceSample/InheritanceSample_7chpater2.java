package OOP_InheritanceSample;

import java.util.Scanner;

interface Parent5 { // Parent Class
	 public abstract void Adder();
	 public abstract void Suber(int x, int y);
	 public abstract int Muler();
	 public abstract double Divi1(double a, double b);
	 public abstract void Divi2(double a2, double b2);
}

public class InheritanceSample_7chpater2 implements Parent5 {  // Child Class

	@Override
	public void Adder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ ������ 2���� �Է��� �ּ���.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("����: " + (x + y));// 		
	}
	
	@Override
	public void Suber(int x, int y) {
		int sum = x - y;
		System.out.println("����: " + sum); //
	}

	@Override
	public int Muler() {
		System.out.println("���� ������ ������ 2���� �Է��� �ּ���.");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		return x*y;
	}

	@Override
	public double Divi1(double a, double b) {
		double sum = a / b;
		return sum;
	}

	@Override
	public void Divi2(double a2, double b2) {
		double sum = a2 % b2;
		System.out.println("������ ���2: " + sum ); 
	}		
	
	public static void main(String[] args) {
		InheritanceSample_7chpater2 i7 = new InheritanceSample_7chpater2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ ������ 2���� �Է��� �ּ���.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("�Ǽ��� ������ 2��(��)�� �Է��� �ּ���.");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("�Ǽ��� ������ 2��(������)�� �Է��� �ּ���.");
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();		
		
		i7.Adder();
		i7.Suber(x, y);
		int sum = i7.Muler();
		System.out.println("����: " + sum); 
		
		double aa = i7.Divi1(a, b);
		System.out.println("������ ���1: " + aa); 
		i7.Divi2(a2, b2);
		
		
		
	}

}
