package day05;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikaqiu c = new Pikaqiu();
	}

}

class Animal {
	public Animal() {
		System.out.println("我是一个动物");
	}
}

class Pikaqiu extends Animal {
	public Pikaqiu() {
		super();
		System.out.println("我是一只猪");
	}
}