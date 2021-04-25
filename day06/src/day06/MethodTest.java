package day06;

public class MethodTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumInt(100, 200);
		sumInt(200, 19);
		sumInt(300,29);
		sumInt(20.0,30.0);
		sumInt("张","伟");
		sumInt(33.00,44.00);
		sumInt(true,false);
	}

	public static void sumInt(int a, int b) {
		int c = a + b;
		System.out.println(a+"+"+b+"="+c);
	}
	public static void sumInt(long a, long b) {
		long c = a + b;
		System.out.println(a+"+"+b+"="+c);
	}
	public static void sumInt(double a,double b) {
		double c = a + b;
		System.out.println(a+"+"+b+"="+c);
	}
	public static void sumInt(String a, String b) {
		String c = a + b;
		System.out.println(a+"+"+b+"="+c);
	}
	public static void sumInt(boolean a,boolean b) {
//		boolean c = a + b;
		System.out.println(a+"+"+b+"=");
	}
}
