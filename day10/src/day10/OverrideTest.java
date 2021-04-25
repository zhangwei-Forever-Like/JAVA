package day10;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.move();
		Cat c = new Cat();
		c.move();
		Bird b = new Bird();
		b.move();
		b.pao();
		Yinyu y= new Yinyu();
		y.move();
	}

}
