package day05;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int m = factorial(n);
		System.out.println(m);
	
	}

	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		int f=n;
		f=f*(n-1);
	
		return 	n*factorial(n-1);
	}
}
