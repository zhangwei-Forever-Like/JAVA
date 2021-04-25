package day06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(100);
		B b = new B(a);
		Scanner s = new Scanner(System.in);
		while (true) {
			int g = s.nextInt();
			b.guess(g);
		}
	}

}

class A {
	private int v;

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public A() {
		super();
	}

	public A(int v) {
		super();
		this.v = v;
	}

}

class B {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B() {
		super();
	}

	public B(A a) {
		super();
		this.a = a;
	}

	public void guess(int g) {
		int shijizhi = g;
		if (shijizhi == a.getV()) {
			System.out.println("猜测成功");
		} else if (shijizhi > a.getV()) {
			System.out.println("猜大了");
		} else if (shijizhi < a.getV()) {
			System.out.println("猜小了");
		}
	}
}