package day06;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Flycat();
		 a.fly();
	}

}

class Animal {
	public void move() {
		System.out.println("我是能跑的");
	}

	public void fly() {
		System.out.println("我是能飞的");
	}
}

class Flycat extends Animal {
	public void move() {
		System.out.println("我是能跑的");
	}

	public void fly() {
		System.out.println("我现在还不能飞");
	}
}