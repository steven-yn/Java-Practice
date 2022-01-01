package tc;

public class NumberPrinter {
	int k;
	
	static void showInt (int i) {
		System.out.println(i);
	}
	
	void showDouble (double j) {
		System.out.println(j);
	}
	
	void setMyNumber (int k) {
		this.k = k;
	}
	
	void showMyNumber () {
		System.out.println(k);
	}
	
}
