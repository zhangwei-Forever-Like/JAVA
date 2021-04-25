package day15;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = new int[5];
		int[] array= {2,5,7,34,68};
		int t;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					t = array[i];
					array[i] = array[j];
					array[j] = t;
				}
			}
		}
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}

}
