package day05;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,5,6,7};
		int[] arr2 = new int[6];
		arr2=Arrays.copyOfRange(arr1, 0, 3);
		for(int i:arr2) {
			System.out.println(i);
		}
	}

}
