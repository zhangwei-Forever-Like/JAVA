package day15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
//		int num1 = random.nextInt(3);
//		System.out.println(num1);
		int I;
		Scanner s=new Scanner(System.in);
		I = s.nextInt();
		int[] array = new int[I];
        
		for (int j = 0; j < array.length; j++) {
			array[j]=-1;
		}
		boolean T;
		array[0] = random.nextInt(I);
		for (int i = 1; i < array.length; i++) {
//			array[i] = random.nextInt(5);
		
			do {
				array[i]=random.nextInt(I);
//				System.out.printf("array[%d]=%d", i, array[i]);
//				System.out.println();
				T=(array[i]!=array[0]);
//				System.out.print(T);
				for (int j2 = 0; j2 < i; j2++) {
					T=T&(array[i]!=array[j2]);
				}
//				System.out.println(T);
			}while(!T);
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf("array[%d]=%d", i, array[i]);
			System.out.println();
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("array[%d]=%d", i, array[i]);
			System.out.println();
		}
		System.out.println(array.length);
	
	}

}
