package day11;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.move();

		Cat c1 = new Cat();
		c1.move();

		Bird b1 = new Bird();
		b1.move();

		Animal a2 = new Cat();// 子类转成父类
		a2.move();
//		a2.catchMouse();
		Cat c2 = (Cat) a2;//父类转成子类
		c2.catchMouse();
		Animal a3 = new Bird();
//		Cat c3 = (Cat)a3;
		if (a3 instanceof Cat) {
			Cat c3 = (Cat) a3;
			c3.catchMouse();
		} else if (a3 instanceof Bird) {
			Bird b2 = (Bird) a3;
			b2.fly();
		}
	}

}
