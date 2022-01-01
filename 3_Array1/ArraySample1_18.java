package Array1;

import java.util.Scanner;

/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� ������ �Դϴ�.
 * - �ݺ��� ���, method()����: ���� ������ �������...�����ؼ� �����մϴ�.
 * - ������ ������> 10 20 30 40 50 60 70 80 90 100
 * - ������ ������> 20 10 40 30 60 50 80 70 100 90
 */
public class ArraySample1_18 {
	private static int n;
	private static int test[];
	private static Scanner sc = new Scanner(System.in);

	private static void sortDataSuInput() {
		System.out.println("�Է¹��� ������ ������ �Է��� �ּ���.");
		n = sc.nextInt();
		test = new int[n];
	}
		
	private static void sortDataInput() {
		for(int i = 0; i < test.length; i++) {
			test[i] = sc.nextInt();
			// System.out.print(test[i] + " ");
		}
		System.out.println();
	}

	private static void dataExchange() {
		int temp;
		//             2 < 10
		for(int i = 0; i < test.length; i+=2) { //0, 2, 4(index�󿡼�) => 1, 3, 5(element�󿡼�)
			
			temp = test[i];//test[0]=10, test[2]=30
			test[i] = test[i+1]; //test[0] = test[1] => 20, test[2] = test[3] => 40
			test[i+1] = temp;//test[1]=10, test[3] = 30
			
		}
		System.out.println();
	}

	private static void sortedData() {
		for(int i = 0; i < test.length; i++) {
			System.out.print("[������ ������] : " + test[i] + " ");
		}
	}

	public static void main(String[] args) {

		// ������ ������ �� �Է�
		sortDataSuInput();

		// ������ ������ �Է�
		sortDataInput();

		// ������ �Ϻ� ��ġ ���� ��ƾ �ۼ�
		dataExchange();

		// ������ ������ ���
		sortedData();

	}
}

/*
 * import java.util.Scanner;
 * 
 * public class Main {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in); int a=sc.nextInt(); int b=0; int[] arr =
 * new int[a]; for(int i=0;i<=arr.length-1;i++) {arr[i]=sc.nextInt(); } for(int
 * i=0;i<arr.length-1;i++) {System.out.print(arr[i]+" ");}
 * 
 * for(int i=0;i<=arr.length-1;i=i+2) { b=arr[i+1]; arr[i+1]=arr[i]; arr[i]=b; }
 * 
 * for(int i=0;i<=arr.length-1;i++) {System.out.print(arr[i]+" ");}
 * 
 * }
 * 
 * 
 * }
 */
