package day12;

public class Abstract01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Bird();
		a.move();
		Animal a1 = new Cat();
		a1.move();
	}

}

abstract class Animal {
	public abstract void move();
}

class Bird extends Animal {
	public void move() {
		System.out.println("鸟儿在飞翔");
	}
}

class Cat extends Animal {
	public void move() {
		System.out.println("猫在走猫步");
	}
}