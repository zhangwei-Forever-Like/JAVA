
public class ArmyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a = new Army(5);
		Weapon t=new Tank();
		Weapon p=new Plane();
		Weapon c=new Cannon();
		System.out.println("所有武器已进入准备状态，随时听候命令");
		a.addWeapon(t);
		a.addWeapon(p);
		a.addWeapon(c);
		a.attackAll(t);
		a.attackAll(p);
		a.attackAll(c);
		a.moveAll(t);
		a.moveAll(p);
		a.moveAll(c);
	}

}
