package day15;

import java.util.Scanner;

public class Sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		int[] array = { 9, 8, 10, 7, 6, 0, 11, 3, 5, 7, 9, 34, 6 };
//		Scanner s=new Scanner(System.in);
//		int[] array=new int[10];
//		for(int j=0;j<array.length;j++) {
//			array[j]=s.nextInt();
//		}
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
