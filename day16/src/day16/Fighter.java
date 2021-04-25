package day16;

public class Fighter extends Weapon implements Moveable ,Shootable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("战斗机起飞");
	}

	public void shoot() {
		System.out.println("战斗机开炮");
	}
}
