package day06;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.SetSpeed(60);
		v.setSize(100);
		System.out.println("车速为："+v.getSpeed());
		System.out.println("车的体积为："+v.getSize());
		v.speedUp(20);
		v.speedDown(10);
		System.out.println("车速为："+v.getSpeed());
	}

}
