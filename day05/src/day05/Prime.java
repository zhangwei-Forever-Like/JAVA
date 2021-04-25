package day05;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		min(n);
	}

	public static void min(int n) {
		while (true) {
			n++;
			boolean flag = prime(n);
			if (flag) {
				System.out.println(n);
				break;
			}
		}
	}

	public static boolean prime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
