package day05;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		if(x%2==0) {
			System.out.println(x+"为偶数");
		}else {
			System.out.println(x+"为奇数");
		}
	}

}
