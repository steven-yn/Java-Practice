package Array1;

import java.util.Scanner;

/* �迭�̶�? �ϳ��� �̸����� �������� ���� ������ �������� �����ϴ� ������ ������ �ڷᱸ��.
 * - ũ�Ⱑ ����, ���� ������ ó���� �ʿ��� ��쿡
 * 1����: ��� ���� ���Ͻ��մϴ�. ���� ����, [], int A[] = new int[5];
 * 2����: ��� ���� �����Ͽ� ���, ���� ����. [][], int B[][] = new int[][];
 * 3����: ���� �������� ��� ���� ���, ���� ����, [][][], int C[][][] = new int[][][];
 * - index�� �������� ó���մϴ�. ������ �׻� 0������
 * 
 * ��ȣ, �̸�, �ڹ�, JSP, Spring, ����, ��� ���Ͽ� ����ϼ���. 
 * int, String, double, double, double, double, double
 * 
 * //������ 1���� �迭 ���� 
		int arr[] = new int[5]; //n-1
		arr[0] = 10;//arr�迭�� ù��° �������
		arr[1] = 20;//arr�迭�� �ι�° �������
		arr[2] = 30;//arr�迭�� ����° �������
		arr[3] = 40;//arr�迭�� �׹�° �������
		arr[4] = 50;//arr�迭�� �ټ���° �������
		
		//1.������ ���
		System.out.println(arr[0]);//10
		System.out.println(arr[1]);//20
		System.out.println(arr[2]);//30
		System.out.println(arr[3]);//40
		System.out.println(arr[4]);//50
		System.out.println("-----------------------");
		
		//1.5 ������ ���
			int datalength = arr.length;
			System.out.println("datalength : " + datalength);//5
		System.out.println("-----------------------");
		
		//2.������ ���  5 < 5   i=0,1,2,3,4, 5
		for(int i=0; i < arr.length; i++){
			System.out.println((i+1)+":" + arr[i]);
			//[0]=10, [1]=20,[2]=30,[3]=40,[4]=50
		}
		System.out.println("-----------------------");
		
		//3.������ ���: ����for���̳� Ȯ�� for��
		int sum=0;
		
		for(int s:arr){
			System.out.println(s);//
			sum+=s;
		}
		System.out.println("�հ�:" + sum);//	
		System.out.println("-----------------------");
 * 
 * 
 * //4.�迭 ����
		int data[] = new int[5];
//			data[0] = arr[0];
//			data[1] = arr[1];
//			data[2] = arr[2];
//			data[3] = arr[3];
//			data[4] = arr[4];
//		
		for(int i=0; i < data.length; i++){
			data[i] = arr[i];//������ ����
		}
		
		int sum2 =0;
		for(int i=0; i < data.length; i++){
			System.out.println(sum2+=data[i]);//����� ������ ���
		}	
		
		}catch(ArrayIndexOutOfBoundsException e){
			//e.printStackTrace();
			System.out.println("�迭 �ε����� ���õ� ����(���ܻ�Ȳ)�� �߻��Ͽ����ϴ�.");
		}
	}
 * 
 * 
 */
public class ArraySample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ó�� �ο����� �Է����ּ���.");
		int inwon = sc.nextInt();// 3

		int bunho[] = new int[inwon];// bunho[] �迭�� �����͸� ����
		String name[] = new String[inwon];
		double java[] = new double[inwon];
		double jsp[] = new double[inwon];
		double spring[] = new double[inwon];
		double total[] = new double[inwon];
		double aver[] = new double[inwon];

		for (int i = 0; i < inwon; i++) {
			System.out.println("��ȣ �迭�� ������ �����͸� �Է� �Ͻÿ�.");
			bunho[i] = sc.nextInt();// bunho[] �迭�� �����͸� ����

			System.out.println("�̸� �迭�� ���ڿ� �����͸� �Է� �Ͻÿ�.");
			name[i] = sc.next();

			for (int j = 0; j < 1; j++) {
				System.out.println("Java �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
				double javajumsu = sc.nextDouble();

				if (javajumsu >= 0 && javajumsu <= 100)
					java[i] = javajumsu;
				else {
					System.out.println("������ ������ 0�̻� 100�����Դϴ�.");
					j--;
					continue;
				}

				System.out.println("JSP �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
				double jspjumsu = sc.nextDouble();
				
				if(jspjumsu >=0 && jspjumsu <=100)
					jsp[i] = jspjumsu;
				else {
					System.out.println("������ ������ 0�̻� 100�����Դϴ�.");
					j--;
					continue;					
				}
				
				System.out.println("Spring �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
				double springjumsu = sc.nextDouble();
				
				if(springjumsu >=0 && springjumsu<=100) 
					spring[i] = springjumsu;				
				else {
					System.out.println("������ ������ 0�̻� 100�����Դϴ�.");
					j--;
					continue;					
				}
							
			}

			total[i] = java[i] + jsp[i] + spring[i];
			aver[i] = total[i] / 3.0;// inwon
		}

		System.out.println("======================== �� �� ó �� =======================");
		System.out.println("��ȣ\t�̸�\tJava\tJSP\tSpring\ttotal\taver");//
		System.out.println("----------------------------------------------------------");//
		for (int i = 0; i < inwon; i++) {
			System.out.print(bunho[i] + "\t" + name[i] + "\t" + java[i] + "\t" + jsp[i] + "\t" + spring[i] + "\t");
			System.out.printf("%5.2f \t %5.2f \n", total[i], aver[i]);
		}
		System.out.println("===============================================================");
	}

}
