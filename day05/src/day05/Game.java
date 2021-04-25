package day05;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.out.println("请你随便输入一个0~1000的数：");
			Scanner s = new Scanner(System.in);
			int c = s.nextInt();
			int n=0;
			while(c>=1000) {
            	   n++;
            	   System.out.printf("我再给你%d次重新赋值的机会：\t",n);
            	   c=s.nextInt();
			}
			System.out.println("如果我没猜错的话您刚才输入的数是："+Search(c));

	}

	public static int Search(int c) {
		int max = 1000;
		int min = 0;
		while (min <= max) {
			int middle = (max + min) / 2;
			if (c == middle) {
				return middle;
			} else if (middle < c) {
				min = middle + 1;
			} else {
				max = middle - 1;
			}
		}
		return 0;
	}
}
