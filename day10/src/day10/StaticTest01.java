package day10;

public class StaticTest01 {
	static {
		System.out.println("类加载-->1");
	}
	static {
		System.out.println("类加载-->2");
	}
	static {
		System.out.println("类加载-->3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begin");
	}

}
