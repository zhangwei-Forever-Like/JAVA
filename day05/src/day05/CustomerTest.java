package day05;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master m = new Master();
		Pet p=new Pet();
		Dog d = new Dog();
		Cat c = new Cat();
		YingWu y = new YingWu();
		m.feed(p);
		m.feed(d);
		m.feed(c);
		m.feed(y);
	}

}

class Master {
	public void feed(Pet p) {
		p.eat();
	}
}

class Pet {
	public void eat() {
		System.out.println("接下来我将给你们分配零食吃");
	}
}

class Dog extends Pet {
	public void eat() {
		System.out.println("小狗狗在吃东西");
	}
}

class Cat extends Pet {
	public void eat() {
		System.out.println("猫咪在吃东西");
	}
}

class YingWu extends Pet {
	public void eat() {
		System.out.println("鹦鹉在吃东西");
	}
}