package Array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*  
 * ����7> N���� �̸��� ��ȭ��ȣ�� �Է��Ͽ� �迭�� �����ϰ�, ����� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ---------------------------
 *   ��üȸ����: 3 ��
 * ---------------------------
 * �� �� 		�� ȭ �� ȣ
 * ---------------------------
 * ȫ�浿		010-3311-4531
 * �̱浿		02-456-3771
 * �ڱ浿		010-5678-1234
 * --------------------------- 
 */
public class ArraySample1_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ȸ�� ���� �迭 ũ�⸦ �Է��� �ּ���.");
		int n = sc.nextInt();// 5

		String[] name = new String[n];// �̸� �迭

		String[] tel = new String[n];// ��ȭ��ȣ �迭

		System.out.println("===== �̸��� ��ȭ��ȣ ������ �Է� ======");
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "��° �̸��� �Է��� �ּ���.");
			name[i] = sc.next();

			System.out.println((i + 1) + "��° ��ȭ��ȣ�� �Է��� �ּ���.");
			tel[i] = sc.next();
		}

		System.out.println("---------------------------");
		System.out.println("  ��üȸ����: " + n + "��");
		System.out.println("---------------------------");
		System.out.println(" ��ȣ\t�� ��\t�� ȭ �� ȣ");
		System.out.println("---------------------------");

		for (int i = 0; i < n; i++) {
			System.out.println(" " + (i + 1) + "\t" + name[i] + "\t" + tel[i]);
		}
		System.out.println("---------------------------");
	} // main method end

} // class end

