package day15;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 87, 8 };
		int index = arraySearch(arr, 87);
		System.out.println(index == -1 ? "该元素不存在" : "该元素下标是:" + index);
	}

	public static int arraySearch(int[] arr, int b) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == b) {
				return i;
			}
		}
		return -1;
	}
}
