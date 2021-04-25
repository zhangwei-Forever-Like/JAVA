import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 53, 2, 542, 748, 14, 214 };
//		radixSort(arr);
		radixSort2(arr);
	}

	public static void radixSort(int[] arr) {
		int[][] bucket = new int[10][arr.length];
		int[] bucketElementCounts = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int digitOfElement = arr[i] % 10;
			bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
			bucketElementCounts[digitOfElement]++;
		}
		int index = 0;
		for (int k = 0; k < bucketElementCounts.length; k++) {
			if (bucketElementCounts[k] != 0) {
				for (int j = 0; j < bucketElementCounts[k]; j++) {
					arr[index++] = bucket[k][j];
				}
				bucketElementCounts[k] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			int digitOfElement = arr[i] / 10 % 10;
			bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
			bucketElementCounts[digitOfElement]++;
		}
		index = 0;
		for (int k = 0; k < bucketElementCounts.length; k++) {
			if (bucketElementCounts[k] != 0) {
				for (int j = 0; j < bucketElementCounts[k]; j++) {
					arr[index++] = bucket[k][j];
				}
				bucketElementCounts[k] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int digitOfElement = arr[i] /10/10 % 10;
			bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
			bucketElementCounts[digitOfElement]++;
		}
		index = 0;
		for (int k = 0; k < bucketElementCounts.length; k++) {
			if (bucketElementCounts[k] != 0) {
				for (int j = 0; j < bucketElementCounts[k]; j++) {
					arr[index++] = bucket[k][j];
				}
				bucketElementCounts[k] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	public static void radixSort2(int[] arr) {
		int[][] bucket = new int[10][arr.length];
		int[] bucketElementCounts = new int[10];
		int max=0;
		int index;
		int num=1;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
//		System.out.println(max);
//		max*=10;
		do{
			for (int i = 0; i < arr.length; i++) {
				int digitOfElement = arr[i] /num% 10;
				bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
				bucketElementCounts[digitOfElement]++;
			}
			index = 0;
			for (int k = 0; k < bucketElementCounts.length; k++) {
				if (bucketElementCounts[k] != 0) {
					for (int j = 0; j < bucketElementCounts[k]; j++) {
						arr[index++] = bucket[k][j];
					}
					bucketElementCounts[k] = 0;
				}
			}
			num*=10;
		}while((max=max/10)>0);
		System.out.println(Arrays.toString(arr));
	}
}
