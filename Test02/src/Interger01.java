
public class Interger01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x, y;
		x = 17;
		y = 25;
		System.out.println(x + y);
		AutoCar autoCar = new AutoCar("奔驰", 1.5f, 80);
		System.out.println(autoCar);
		AutoCar autoCar2 = new AutoCar("宝马", 2.0f, 90);
		System.out.println(autoCar2);
		Circle myCircle=new Circle();
		Circle c=new Circle();
//		c.setX(0);
//		c.setY(0);
//		AutoCar a=new AutoCar();
		moveCircle(c, 20, 30);
		
		moveCircle(myCircle,23,56);
		System.out.println(myCircle.getX());
		System.out.println(myCircle.getY());
		moveCircle(myCircle,23,56);
		System.out.println(myCircle.getX());
		System.out.println(myCircle.getY());
	}
	public static void moveCircle(Circle circle, int deltaX, int deltaY) {
		circle.setX(circle.getX() + deltaX);
		circle.setY(circle.getY() + deltaY);
		circle =new Circle(0,0);
	}
}

class AutoCar {
	private String brank;
	private float exhaust;
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int y;

	public String getBrank() {
		return brank;
	}

	public void setBrank(String brank) {
		this.brank = brank;
	}

	public float getExhaust() {
		return exhaust;
	}

	public void setExhaust(float exhaust) {
		this.exhaust = exhaust;
	}

	public AutoCar(String brank, float exhaust, int speed) {
		super();
		this.brank = brank;
		this.exhaust = exhaust;
		this.speed = speed;
	}

	public String toString() {
		return "汽车的品牌是：" + this.brank + "汽车的排气量为：" + this.exhaust + "汽车的车速为：" + this.speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	private int speed;


}