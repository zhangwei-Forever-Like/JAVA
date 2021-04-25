package day05;

public class Resc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(Max(299,3));
   System.out.println(Max(5,24,664));
	}

	public static int Max(int a, int b) {
		return a > b ? a : b;
	}
	public static int Max(int a ,int b,int c) {
		return c>(a > b ? a : b)?c:a > b ? a : b;
	}
}
