import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
//		shellSort(arr);
//		System.out.println(Arrays.toString(arr));
		shellSort02(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void shellSort(int[] arr) {
		int temp = 0;
		for (int gap = arr.length / 2; gap >= 1; gap = gap / 2) {
			for (int i = gap; i < arr.length; i++) {
				for (int j = i - gap; j >= 0; j -= gap) {
					if (arr[j] > arr[j + gap]) {
						temp = arr[j];
						arr[j] = arr[j + gap];
						arr[j + gap] = temp;
					}
				}
			}
		}
	}

	public static void shellSort02(int[] arr) {
		for (int gap = arr.length / 2; gap >= 1; gap = gap / 2) {
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				if (arr[j] < arr[j - gap]) {
					while (j - gap >= 0&&temp<arr[j-gap]) {
                        arr[j]=arr[j-gap];
                        j=j-gap;
					}
					arr[j]=temp;
				}
			}
		}
	}
}
