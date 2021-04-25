package day06;

public class MethodTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m();
		A1.m01();
		System.out.println("我在这儿等着你回来 ");
	}

	public static void m() {
		System.out.println("m method execute!");
		m2();
	}
	public static void m2() {
		System.out.println("m2 execute");
	}
}
class A1
{
	public static void m01() {
		System.out.println("A's deOther method in");
	}
}
