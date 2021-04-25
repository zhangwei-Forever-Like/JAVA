package day16;

public class Tank extends Weapon implements Moveable, Shootable {
	public void move() {
		System.out.println("坦克移动");
	}

	public void shoot() {
		System.out.println("坦克开炮");
	}
}
