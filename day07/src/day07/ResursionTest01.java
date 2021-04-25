package day07;

public class ResursionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dosome();
		System.out.println("main over");
	}

	public static void dosome() {
		System.out.println("doSome begin");
		dosome1();
		System.out.println("doSome over");
	}
	public static void dosome1() {
		System.out.println("doSome begin");
	}
}
