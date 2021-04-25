package day06;

public class MethodTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
		m1();
		System.out.println("main over");
	}

	public static void m1() {
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}

	public static void m2() {
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 over");
	}

	public static void m3() {
		System.out.println("m3 begin");
		System.out.println("m3 over");
	}
}
