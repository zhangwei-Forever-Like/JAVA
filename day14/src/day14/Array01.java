package day14;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		int[] x = { 2, 3, 4, 5, 6 };
		printArray(x);
		printArray(array);
		String[] s=new String[10];
		String[] string= {"abc","bfc","adw"};
		printArray(string);
		printArray(s);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void printArray(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}
}
