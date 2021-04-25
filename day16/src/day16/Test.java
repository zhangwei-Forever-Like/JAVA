package day16;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army army = new Army(4);
		Fighter fighter = new Fighter();
		Fighter fighter2 = new Fighter();
		Tank tank = new Tank();
		WuZiFeiJi wuZiFeiJi = new WuZiFeiJi();
		GaoShePao gaoShePao = new GaoShePao();

		try {
			army.addWeapon(fighter);
			army.addWeapon(tank);
			army.addWeapon(wuZiFeiJi);
			army.addWeapon(gaoShePao);
			army.addWeapon(fighter2);
		} catch (WeaponIndexOutOfBoundException e) {
			System.out.println(e.getMessage());
		}
		army.moveAll();
		army.attackAll();
	}

}
