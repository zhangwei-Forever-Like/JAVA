import java.util.Arrays;

public class InserSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 101, 34, 119, 1 };
	for (int i = 0; i < arr.length-1; i++) {
		int insertVal = arr[i+1];
		int insertIndex = i;
		while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
			arr[insertIndex + 1] = arr[insertIndex];
			insertIndex--;
		}
		arr[insertIndex + 1] = insertVal;
	}
		System.out.println(Arrays.toString(arr));
	}

}
