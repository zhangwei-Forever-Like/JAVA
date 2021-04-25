package day06;

public class Vehicle {
	private int speed;
	private int size;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void move() {

	}

	public void SetSpeed(int speed) {
        this.speed=speed;
	}


	public Vehicle() {
		super();
	}
	public Vehicle(int speed, int size) {
		super();
		this.speed = speed;
		this.size = size;
	}

	public void speedUp(int speed) {
         setSpeed(getSpeed()+speed);
	}

	public void speedDown(int speed) {
         setSpeed(getSpeed()-speed);
	}
}
