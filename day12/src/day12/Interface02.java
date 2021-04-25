package day12;

public class Interface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		D1 d = new D1();
//		d.m1();
		A1 a=new D1();
		B1 b=new D1();
		C1 c=new D1();
		D1 b1=(D1)a;
		b1.m2();
	}

}

interface A1 {
	void m1();

//	void m2();
}

interface B1 {
	void m2();
}

interface C1 {
	void m3();
}

class D1 implements A1, B1, C1 {
	public void m1() {
//		this.m2();
		System.out.println("你是一个");
//		this.m3();
	}

	public void m2() {
		System.out.println("卧槽，牛逼啊");
//		this.m3();
	}

	public void m3() {
		System.out.println("啥");
//		this.m1();
	}
}
