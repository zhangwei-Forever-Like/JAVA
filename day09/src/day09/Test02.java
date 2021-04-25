package day09;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User03 u = new User03(20);
		add(u);
		System.out.println("main-->" + u.age);
	}

	public static void add(User03 u) {
		u.age++;
		System.out.println("add-->" + u.age);
	}
}

class User03 {
	int age;

	public User03(int i) {
		age = i;
	}
}