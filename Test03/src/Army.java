
public class Army {
	private Weapon[] w;
	private int n = 0;

	public Army(int i) {
		this.w = new Weapon[i];
	}

	public void addWeapon(Weapon wa) {
		w[n] = wa;
		wa.nameAll();
		n++;
	}

	public void attackAll(Weapon w) {
		w.attackAll();
	}

	public void moveAll(Weapon w) {
		w.moveAll();
	}
}
