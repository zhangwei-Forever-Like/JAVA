import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 5, 3, 4, 2, 1, 7, 6 };
		for (int i = 0; i < arr.length-1 ; i++) {
			int minIndex = i;
			int min = arr[i];
			for (int j = i + 1; j < arr.length ; j++) {
				if (min > arr[j]) {
					minIndex = j;
					min = arr[j];
				}
			}
			arr[minIndex] = arr[i];
			arr[i] =min;
		}
		System.out.println(Arrays.toString(arr));
	}

}
