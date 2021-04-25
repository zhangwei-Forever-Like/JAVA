package day12;

public class FinalTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class User{
	final int age=1;
	final double height;
	
	public User() {
		this.height=2.0;
	}
	public User(double d) {
		this.height=d;
	}
}