package OOP;

/* ��ü���� ���α׷��� : ������������ ó���� ���Ͽ� ��ü������ ó���� ���� �� ȿ�����Դϴ�.
 * - (����Ʈ���� ���� = �ý��� �м� ����)
 * Ŭ���� : ��ü�� ���� �Ϸ��� ���� Ŭ�������� ������ �־�� �մϴ�.
 *  - Ŭ������ ���� ��ü�� �����Ǿ� ���˴ϴ�.
 * ��ü : ���� ���� = ��ü�� �ν��Ͻ� = ������ = �ּҰ� 
 *  - �Ӽ� : �� ���迡 �����ϴ� ���빰(Ư��, Ư¡) => Ŭ���� ����
 *  - ��� : ����, ���� ǥ�� => class method()
 * ���� : �����, ��ü, ���콺, Ű����, ������, ��, ����, ����.....
 */
public class OOPSample1 { // 300����
	private  String productNo;//null => coffee001
	private  String productName;//null => īǪġ��
	private  int productPrice;//0 => 2500

	public static void main(String[] args) {
		OOPSample1 os1 = new OOPSample1();//300����
		OOPSample1 os2 = new OOPSample1();//500����
		
		os1.productNo = "coffee001";//ǰ���ȣ
		os1.productName = "īǪġ��";//ǰ���
		os1.productPrice = 2500;//ǰ�񰡰�

		os2.productNo = "coffee002";//ǰ���ȣ
		os2.productName = "������";//ǰ���
		os2.productPrice = 3800;//ǰ�񰡰�
		
		// 								��ü��.Ŭ��������
		System.out.println("ǰ���ȣ : " + os1.productNo);//coffee001
		System.out.println("ǰ��� : " + os1.productName);//īǪġ��
		System.out.println("ǰ�񰡰� : " + os1.productPrice);//2500
		System.out.println("ǰ���ȣ : " + os2.productNo);//coffee001
		System.out.println("ǰ��� : " + os2.productName);//īǪġ��
		System.out.println("ǰ�񰡰� : " + os2.productPrice);//2500
		
		//						static		Ŭ������.Ŭ��������
		//System.out.println("ǰ���ȣ : " + OOPSample1.productNo);//coffee001
		//System.out.println("ǰ��� : " + OOPSample1.productName);//īǪġ��
		//System.out.println("ǰ�񰡰� : " + OOPSample1.productPrice);//2500
		
		System.out.println("------ ��ü ������ �ڵ� ------------");
		
		String pNo1 = "coffee001";
		String pName1 = "īǪġ��";
		int pPrice1 = 2500;
		
		String pNo2 = "coffee002";
		String pName2 = "������";
		int pPrice2 = 3800;
		
		System.out.println("ǰ���ȣ : " + pNo1);//coffee001
		System.out.println("ǰ��� : " + pName1);//īǪġ��
		System.out.println("ǰ�񰡰� : " + pPrice1);//2500
		System.out.println("ǰ���ȣ : " + pNo2);//coffee002
		System.out.println("ǰ��� : " + pName2);//������
		System.out.println("ǰ�񰡰� : " + pPrice2);//3800
	}

}
