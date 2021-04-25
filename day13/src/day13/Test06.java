package day13;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<1000000;i++) {
			Person p = new Person();
			p = null;
		}
	}

}

class Person {
	protected void finalize() throws Throwable {
		System.out.println("即将被销毁");
	}
}