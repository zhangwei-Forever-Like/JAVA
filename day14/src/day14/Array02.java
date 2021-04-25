package day14;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		printArray(a);
		System.out.println("=========================");
		printArray(new int[] { 1, 23, 3 });
		int[] a2 = new int[4];
		printArray(a2);
		System.out.println("=========================");
		printArray(new int[3]);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
