package day12;

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(30);
		System.out.println(p.age);
		 new Person(350);
		System.out.println(p.age);
		final Person p1 = new Person(20);
		System.out.println(p1.age);
		
	}

}

class  Person{
	int age;

	public Person() {
		
	}

	public Person(int age) {
		this.age = age;
		
	}
}