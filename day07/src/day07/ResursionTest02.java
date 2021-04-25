package day07;

public class ResursionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = mul(5);
		System.out.println(a);
		int b = add(500);
		System.out.println(b);
	}

	public static int mul(int n) {
		if (n == 1) {
			return 1;
		}
		return n * mul(n - 1);
	}

	public static int add(int n) {
		if (n == 1) {
			return 1;
		}
		return n + add(n - 1);
	}

}
