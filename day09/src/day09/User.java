package day09;

public class User {
	private int age;

	public void setAge(int a) {
		if(a<0||a>150) {
			System.out.println("对不起，你提供的年龄不合法");
			return ;
		}
		age = a;
	}

	public int getAge() {
		return age;
	}
}
