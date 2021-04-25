
package day15;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 3, 5, 6, 7, 11, 23, 43, 54, 64, 89 };
		int index = arraySearch(array, 54);
		int[] arr = {2,5,6,7,34,32,12,34,56,2};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(index == -1 ? "该元素不存在！" : "该元素下标是：" + index);
	}

	public static int arraySearch(int[] array, int b) {
		int begin = 0;
		int end = array.length - 1;
	while(begin<=end) {
		int mid = (begin + end) / 2;
		if (array[mid] == b) {
			return mid;
		} else if (array[mid] < b) {
			begin = mid + 1;
		} else {
			end = mid - 1;
		}
	}
		return -1;
	}
}
