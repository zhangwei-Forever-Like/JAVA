package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> myList = new ArrayList<Animal>();
		Cat c = new Cat();
		Bird b=new Bird();
		myList.add(c);
		myList.add(b);
		Iterator<Animal> it=myList.iterator();
		while(it.hasNext()) {
			Animal a=it.next();
			a.move();
		}
	}

}

class Animal {
	public void move() {
		System.out.println("动物在移动");
	}
}

class Cat extends Animal {
	public void catchMouse() {
		System.out.println("猫吃老鼠");
	}
}

class Bird extends Animal {
	public void fly() {
		System.out.println("鸟儿在飞翔");
	}
}