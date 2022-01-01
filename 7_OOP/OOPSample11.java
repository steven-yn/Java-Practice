package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* ����> �����͸� n�� �Է� �޾Ƽ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * - �����ʹ� �Ǽ��� �Դϴ�.
 * - �ݺ��� ���
 * - ������ �߿��� 3�� ����� �Ǵ� ������ �հ�� ������ ���Ͽ� ����մϴ�.
 * - BufferedReader class, Exception => readLine() => throws
 */
public class OOPSample11 {
	
	private  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int sum, count;
	
	public void baesu() throws IOException { 
		String su;		   
		 
		 System.out.println("�Է¹޾Ƽ� ó���� �������� ������ ?");
		 su = br.readLine();// "10"
		 
		 int n = Integer.parseInt(su);// 10
		 
		 double number[] = new double[n];//Ŭ���� �迭
	
		 for (int i = 0; i < number.length; i++) {
				System.out.println("number �迭�� �Ǽ��� �����͸� �Է� �Ͻÿ�.");
				 String x = br.readLine();
				 number[i] = Double.parseDouble(x);
			}
		
		 for (int i = 0; i < number.length; i++) {
				if (number[i] % 3 == 0) {
					sum += number[i];
					count++;
				}			
			}	
		 
		 System.out.println("3�ǹ�� ���� " + sum + "�̰�, ������ " + count + "�Դϴ�.");		
	}

	public static void main(String[] args) throws IOException { 
		OOPSample11 oop10 = new OOPSample11();
		oop10.baesu();		
	}

}
