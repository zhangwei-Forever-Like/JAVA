package day11;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Owner zhangsan = new Owner();
		Cat02 tom = new Cat02();
		zhangsan.feed(tom);
		Dog d = new Dog();
		d.eat();
		Snake xiaohua = new Snake();
		zhangsan.feed(xiaohua);
	}

}
