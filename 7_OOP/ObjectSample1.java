package OOP;

public class ObjectSample1 {

	private void adder() {
		int a = 100, b = 200;
		int c = a + b;
		System.out.println(c);// 300
	}

	private void suber() {
		int a = 100, b = 200;
		int c = a - b;
		System.out.println(c);// -200
	}

	private void multi() {
		int a = 100, b = 200;
		int c = a * b;
		System.out.println(c);// 20000
	}

	public static void main(String[] args) {
		//�⺻�ڷ���: call by value
		int age = 25;
		double price = 100.5;
		
		//������: call by reference
		String name = "�ſ��";//address(100����)
		String hobby = "����";//address(200����)
		System.out.println(name);//
		System.out.println(hobby);//
		
		String kkk = new String("kim");
		System.out.println(kkk);//value => kim
		
		//call by reference
		ObjectSample1 os1 = new ObjectSample1();
		System.out.println(os1);//address => 2d363fb3
		os1.adder();
				
		ObjectSample1 os2 = new ObjectSample1();
		os2.suber();
		
		ObjectSample1 os3 = new ObjectSample1();
		os3.multi();
	
		//p.143
		ObjectSample1 refVar1 = new ObjectSample1();//100����
		ObjectSample1 refVar2 = new ObjectSample1();//200����
		System.out.println(refVar1);//
		System.out.println(refVar2);//
		
		 boolean x, y, z;
		 x = refVar1 == refVar2; // == ������ ���Ͽ� �Ǻ��մϴ�.
			System.out.println(x);
		 
		 y = refVar1 != refVar2; 
			System.out.println(y);
		
		 z = os1 == os2;
		 	System.out.println(z);
		
		//null, NullpointerException
		 	//refVar1 == null;//false
		 	//refVar1 != null;//true
		
		//int[] intArray = null;
		 //int[] intArray = 0;
		 	int[] intArray = new int[5]; 
		intArray[0] = 10;// java.lang.NullPointerException
		System.out.println(intArray[0]);// 10
		
		//String str = null;
		String[] str = new String[5];
		System.out.println(str.length);//java.lang.NullPointerException		
		
	}

}
