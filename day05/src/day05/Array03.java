package day05;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "2", "3", "532", "262", "6623" };
		String[] arr2 = new String[7];
		arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.fill(arr, 2, 3, "bb");
		for (String j : arr2) {
			System.out.println(j);
		}
		for (String i : arr) {
			System.out.println(i);
		}
	}

}
