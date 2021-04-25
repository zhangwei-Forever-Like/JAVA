package day07;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		U.p(10);
		U.p(false);
		U.p("abc");
		U.p(3.0);
		U.p("Hello World");
	}

}

class U {
	public static void p(byte b) {
		System.out.println(b);
	}

	public static void p(short b) {
		System.out.println(b);
	}

	public static void p(int b) {
		System.out.println(b);
	}

	public static void p(long b) {
		System.out.println(b);
	}

	public static void p(float b) {
		System.out.println(b);
	}

	public static void p(double b) {
		System.out.println(b);
	}

	public static void p(boolean b) {
		System.out.println(b);
	}

	public static void p(String b) {
		System.out.println(b);
	}
}