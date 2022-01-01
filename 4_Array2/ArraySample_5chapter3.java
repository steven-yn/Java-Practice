package Array2;

public class ArraySample_5chapter3 {

	public static void main(String[] args) {
		int[] oldArray = { 100, 200, 300 };
		int[] newArray = new int[5];

		// for(int i=0; i < oldArray.length; i++) {
		// newArray[i] = oldArray[i]; //배열 복사
		// }

		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		System.out.println("-----------------------------------");

		String[] oldArray2 = { "java", "jsp", "spring" };
		String[] newArray2 = new String[5];

		// System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);

		for (int i = 0; i < oldArray2.length; i++) {
			newArray2[i] = oldArray2[i]; // 배열 복사
		}

		for (int i = 0; i < newArray2.length; i++) {
			System.out.print(newArray2[i] + " ");
		}

	}

}
