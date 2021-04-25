package day05;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 364, 4, 4447, 758, 34, 67, 845 };
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min < arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
