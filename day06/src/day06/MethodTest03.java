package day06;

public class MethodTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(4, 3));
		System.out.println(divide(10, 3));
		int i = divide(100, 9);
		System.out.println(i);
	}

	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}
}
